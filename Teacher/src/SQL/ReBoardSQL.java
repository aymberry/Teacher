package SQL;
/*
 * 	�����ͺ��̽� �۾����� ���� �߿��� �κ��� ���� ����̴�.
 * 	�ٵ�.. ���ݱ����� �� ���� ����� DAO Ŭ������ ���� ���⿡ 
 * 	����� �־���.
 * 
 *  	���߿� �����ͺ��̽� �����̳� ���̺� ������ ������
 *  	���� ����� �����ؾ� �ϴµ�...
 *  	���� ����� ���� ���� ����� �ֹǷ� �����ϱⰡ ��ٷοԴ�.
 *  
 *  �� Ŭ������ ���� ��ɸ� �����ϰ� �ִٰ�
 *	DAO�� ���� ����� �ʿ��ϸ� �� ���� ����� �����ϴ� ��Ȱ�� �ϴ�
 *	Ŭ������ ����� �ʹ�.
 *
 *  	����	���� ��ɸ� ���� �����ϹǷ�
 *  			���߿� ���� ����� �ٲ�� ���ϰ� �������� �� �� �ְ� �ȴ�.
 */
public class ReBoardSQL {
	//	�������� ���̱� ���ؼ� ������ �ڵ忡 �̸��� �ο�����.
	//	�ڵ忡 �̸��� �ο��Ѵٴ� ���� ������ ���� �������.
	public static final int 	INSERT_BOARD 		= 1; 
	public static final int 	SELECT_BOARD 		= 2;
	public static final int	TOTAL_COUNT 		= 3;
	public static final int	BOARD_VIEW 		= 4;
	public static final int 	INSERT_REPLY		= 5;
	public static final int	REPLY_LIST			= 6;
	public static final int 	UPDATE_HIT			= 7;
	public	static	final int	UPDATE_BOARD		= 8;
	public	static	final int	UPDATE_REPLY		= 9;
	//	�������� �ʿ��� ���� ����� �޶�� �ϸ�
	//	�� ���� ����� ������ �Լ��� �����Ѵ�.
	
	public static String getSQL(int code) {
		//	�Ķ������ �ǹ̴�	������ ���Ǹ�ɸ��� ��ȣ�� ���̰�
		//							�� ��ȣ�� �̿��ؼ� ���� ����� �����ϱ�
		//							���ؼ��̴�.
		//		���	1�� ���Ǹ���� �Խ��� ��� ���� ����̴�.
		StringBuffer	buff = new StringBuffer();
		switch(code) {
			case 1:	//	�Խù� ��� ����
				//	������ �� : �� ���� �������� �ݵ�� ��ĭ ������ �ξ�� �Ѵ�.
				//		�ֳ��ϸ� �� �������� ���߿� �������� ������ �ʿ��ϹǷ�..
				buff.append("INSERT ");
				buff.append("INTO ");
				buff.append("		ReBoard ");
				buff.append("VALUES ");
				buff.append("		( (SELECT NVL(MAX(b_NO), 0) + 1 FROM ReBoard), ");
				buff.append("		?, ?, ?, SYSDATE, 0, ?) ");
				break;
			case	2:	//	��� �˻� ����
				buff.append("SELECT ");
				buff.append("		b_NO				AS NO, ");
				buff.append("		b_Writer			AS WRITER, ");
				buff.append("		b_Title				AS TITLE, ");
				buff.append("		b_Date				AS WDAY, ");
				buff.append("		b_Hit				AS HIT, ");
				buff.append("		NVL(b.CNT, 0)		AS CNT ");
				buff.append("FROM ");
				buff.append("		ReBoard a,  ");
				buff.append("		(SELECT ");
				buff.append("			r_OriNO, COUNT(*) as CNT ");
				buff.append("		FROM ");
				buff.append("			Reply ");
				buff.append("		GROUP BY ");
				buff.append("			r_OriNO ) b ");
				buff.append("WHERE ");
				buff.append("		a.b_NO = b.r_OriNO(+) ");
				buff.append("ORDER BY ");
				buff.append("		b_NO DESC ");
				break;
			case	3:
				buff.append("SELECT ");
				buff.append("		COUNT(*) AS CNT ");
				buff.append("FROM ");
				buff.append("		ReBoard ");
				break;
			case	4:
				buff.append("SELECT ");
				buff.append("		b_NO			AS NO, ");
				buff.append("		b_Writer		AS WRITER, ");
				buff.append("		b_Title			AS TITLE, ");
				buff.append("		b_Body			AS BODY, ");
				buff.append("		b_Date			AS WDAY, ");
				buff.append("		b_Hit			AS HIT ");
				buff.append("FROM ");
				buff.append("		ReBoard ");
				buff.append("WHERE ");
				buff.append("		b_NO = ? ");
				break;
			case	5:
				buff.append("INSERT ");
				buff.append("INTO ");
				buff.append("		Reply ");
				buff.append("VALUES ");
				buff.append("		( ( SELECT NVL(MAX(r_NO), 0) + 1 FROM Reply ), ");
				buff.append("		?, ?, ?, SYSDATE, ?, 0, 0)");
				break;
			case	6:
				buff.append("SELECT ");
				buff.append("		r_NO		AS NO, ");
				buff.append("		r_OriNO	AS ORINO, ");
				buff.append("		r_Writer	AS WRITER, ");
				buff.append("		r_Body		AS BODY, ");
				buff.append("		r_Date		AS WDAY, ");
				buff.append("		r_Good		AS GOOD, ");
				buff.append("		r_Bad		AS BAD, ");
				buff.append("		CASE  ");
				buff.append("			WHEN RANK() OVER (ORDER BY r_Good DESC) <= 3 THEN '����Ʈ' ");
				buff.append("			ELSE '�Ϲ�' ");
				buff.append("		END		AS BEST ");
				buff.append("FROM ");
				buff.append("		Reply ");
				buff.append("WHERE ");
				buff.append("		r_OriNO = ? ");
				buff.append("ORDER BY ");
				buff.append("		r_Good DESC, r_NO DESC ");
				break;
			case	7:
				buff.append("UPDATE  ");
				buff.append("		ReBoard ");
				buff.append("SET ");
				buff.append("		b_Hit = b_Hit + 1 ");
				buff.append("WHERE ");
				buff.append("		b_NO = ? ");
				break;
			case	8:
				buff.append("UPDATE ");
				buff.append("		ReBoard ");
				buff.append("SET ");
				buff.append("		b_Title = ?, ");
				buff.append("		b_Body = ?, ");
				buff.append("		b_Password = ? ");
				buff.append("WHERE ");
				buff.append("		b_NO = ? ");
				break;
			case	9:
				buff.append("UPDATE ");
				buff.append("		Reply ");
				buff.append("SET ");
				buff.append("		r_Body = ?, ");
				buff.append("		r_Password = ? ");
				buff.append("WHERE ");
				buff.append("		r_NO = ? ");
				break;
			case	10:
				buff.append("UPDATE ");
				buff.append("		Reply ");
				buff.append("SET");
				buff.append("		r_Good = r_Good + 1 ");
				buff.append("WHERE ");
				buff.append("		r_No = ? ");
				break;
			case	11:
				buff.append("UPDATE ");
				buff.append("		Reply ");
				buff.append("SET ");
				buff.append("		r_Bad = r_Bad + 1 ");
				buff.append("WHERE ");
				buff.append(" 	r_NO = ? ");
				break;
		}
		return buff.toString();
	}
	
	
	
}






