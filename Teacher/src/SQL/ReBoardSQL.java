package SQL;
/*
 * 	데이터베이스 작업에서 가장 중요한 부분은 질의 명령이다.
 * 	근데.. 지금까지는 이 질의 명령이 DAO 클래스의 여기 저기에 
 * 	흩어져 있었다.
 * 
 *  	나중에 데이터베이스 변경이나 테이블 변경이 있으면
 *  	질의 명령을 수정해야 하는데...
 *  	질의 명령이 여기 저기 흩어져 있므로 관리하기가 까다로왔다.
 *  
 *  이 클래스는 질의 명령만 관리하고 있다가
 *	DAO가 질의 명령이 필요하면 그 질의 명령을 제공하는 역활을 하는
 *	클래스로 만들고 싶다.
 *
 *  	장점	질의 명령만 따로 관리하므로
 *  			나중에 질의 명령이 바뀌면 편하게 유지보수 할 수 있게 된다.
 */
public class ReBoardSQL {
	//	가독성을 높이기 위해서 각각의 코드에 이름을 부여하자.
	//	코드에 이름을 부여한다는 말은 변수로 만들어서 사용하자.
	public static final int 	INSERT_BOARD 		= 1; 
	public static final int 	SELECT_BOARD 		= 2;
	public static final int	TOTAL_COUNT 		= 3;
	public static final int	BOARD_VIEW 		= 4;
	public static final int 	INSERT_REPLY		= 5;
	public static final int	REPLY_LIST			= 6;
	public static final int 	UPDATE_HIT			= 7;
	public	static	final int	UPDATE_BOARD		= 8;
	public	static	final int	UPDATE_REPLY		= 9;
	//	누군가가 필요한 질의 명령을 달라고 하면
	//	그 질의 명령을 제공할 함수를 제작한다.
	
	public static String getSQL(int code) {
		//	파라메터의 의미는	각각의 질의명령마다 번호를 붙이고
		//							그 번호를 이용해서 질의 명령을 제공하기
		//							위해서이다.
		//		약속	1번 질의명령은 게시판 등록 질의 명령이다.
		StringBuffer	buff = new StringBuffer();
		switch(code) {
			case 1:	//	게시물 등록 질의
				//	조심할 것 : 각 줄의 마지막은 반드시 한칸 공백을 두어야 한다.
				//		왜냐하면 이 여러줄이 나중에 합쳐질때 공백이 필요하므로..
				buff.append("INSERT ");
				buff.append("INTO ");
				buff.append("		ReBoard ");
				buff.append("VALUES ");
				buff.append("		( (SELECT NVL(MAX(b_NO), 0) + 1 FROM ReBoard), ");
				buff.append("		?, ?, ?, SYSDATE, 0, ?) ");
				break;
			case	2:	//	목록 검색 질의
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
				buff.append("			WHEN RANK() OVER (ORDER BY r_Good DESC) <= 3 THEN '베스트' ");
				buff.append("			ELSE '일반' ");
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






