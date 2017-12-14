package P0811;
/*
 * 	����
 * 		Test01�� 5����� �Է��� ����.
 * 
 * 		�̹����� INSERT INTO Test01 VALUES('???', '???')	�� ���Ǹ�
 * 		5�� �����ؾ� �ϴ� �����̴�.
 */
import		java.sql.*;
import		JDBC.*;
public class Test01 {
	public Test01() {
		JDBCUtil		db = null;
		Connection	con = null;
		PreparedStatement	pstmt = null;
		try {
			//	����̹� �ε��ϰ�
			db = new JDBCUtil();
			//	������ ��
			con = db.getCON();
			//	Statement �����
			//	������ PreparedStatement�� ���� �����̴�.
			//	���	PreparedStatement�� 
			//			����(���鶧) ���� ����� ���� �־�� �Ѵ�.
			String	sql = "INSERT INTO Test01 VALUES(?, ?)";
			//	����
			//		�ٲ�� �κ��� ?�� ��� ����ϸ� ���� ����� ������ָ� �ȴ�.
			//		��� ���Ǹ� �����ϱ������� �ݵ�� ?�� �����
			//		�����͸� �˷��־�� �Ѵ�.
			pstmt = con.prepareStatement(sql);
			//	�ſ� �߿�
			//		PreparedStatement�� ���鶧 ���� ����� ������.
			
			String[] id = {"hong", "park", "jang", "lee", "kim"};
			String[] name = {"ȫ�浿", "�ھ���", "�嵶��", "�̱���", "��ġ��"};
			
			//	�����Ѵ�.
			for(int i = 0; i < 5; i++) {
				//	�����ϱ� ���� ���� ?�� ����� �����͸� ������.
				//		����Լ�		setXXX(?�� ��ġ, ����������);
				//						XXX�� �������� ���¿� ���� ����
				//						��ġ�� 1������ ī��Ʈ �Ѵ�.
				pstmt.setString(1, id[i]);
				pstmt.setString(2, name[i]);
				//	�����Ѵ�.
				pstmt.execute();
			}
			System.out.println("�Է� ��");
		}
		catch(Exception e) {
		}
		finally {
			db.close(con);
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}




