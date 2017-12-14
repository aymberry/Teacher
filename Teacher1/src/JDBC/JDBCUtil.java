package JDBC;
/*
 * 	�ڹٴ� �ʿ��� ����� ������ ��ǰ���� ���� ����ϸ�ȴ�.
 * 
 * 	��� �� Ŭ������ JDBC�� ����� �� ������ �ְ��� 
 * 	�ʿ��� ����� ��� ���ִ� ��ǰ�� ����� ������ �Ѵ�.
 */
import		java.sql.*;
public class JDBCUtil {
	
	/*
	 * 	������ �� ��ǰ�� ����Ϸ��� new�� ��Ű��
	 * 	�ڵ������� ����̹��� �ε��ϴ� �۾��� �����ϰ��� �Ѵ�.
	 */
	public JDBCUtil() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * �������� ������ ���ϸ� ��� ������ ��Ű�� �Լ��� ����� ����.
	 */
	public Connection getCON() {
		Connection	con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	/*
	 * 	�������� Statemt�� �����ϱ⸦ ���ϴ� ��� �����ϴ� �Լ��� ����� ����.
	 */
	public Statement getSTMT(Connection con) {
		Statement		stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return stmt;
	}
	
	/*
	 * 	�ڿ��� �ݴ� �۾��� �ϱ⸦ ���ϸ� ��� �ݾ��ִ� �Լ��� ����� ����.
	 */
	public void close(Object target) {
		//	Object target	
		//		�ݰ� ���� �ڿ��� �˷��ָ� �� �ڿ��� �ݾ��ִ� �Լ���
		//		����� �ʹ�.
		//		�ٵ�...	�ݰ� ���� �ڿ��� �������� ������ �ִ�.
		//		�������� �ڿ��� �� ���� �� �ֵ��� ���� Ŭ������ �̿��ؼ� �޴´�.
		try {
			if(target instanceof ResultSet) {
				ResultSet	temp = (ResultSet) target;
				temp.close();
			}
			else if(target instanceof Statement) {
				Statement temp = (Statement) target;
				temp.close();
			}
			else if(target instanceof Connection) {
				Connection	temp = (Connection) target;
				temp.close();
			}
		}
		catch(Exception e) {}
	}
}








