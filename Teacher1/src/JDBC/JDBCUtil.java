package JDBC;
/*
 * 	자바는 필요한 기능이 있으면 부품으로 만들어서 사용하면된다.
 * 
 * 	고로 이 클래스는 JDBC를 사용할 때 도움을 주고자 
 * 	필요한 기능을 대신 해주는 부품을 만들어 보고자 한다.
 */
import		java.sql.*;
public class JDBCUtil {
	
	/*
	 * 	누군가 이 부품을 사용하려고 new를 시키면
	 * 	자동적으로 드라이버를 로딩하는 작업을 진행하고자 한다.
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
	 * 누군가가 접속을 원하면 대신 접속을 시키는 함수를 만들어 보자.
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
	 * 	누군가가 Statemt를 생성하기를 원하는 대신 생성하는 함수를 만들어 놓자.
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
	 * 	자원을 닫는 작업을 하기를 원하면 대신 닫아주는 함수를 만들어 보자.
	 */
	public void close(Object target) {
		//	Object target	
		//		닫고 싶은 자원을 알려주면 그 자원을 닫아주는 함수로
		//		만들고 싶다.
		//		근데...	닫고 싶은 자원이 여러가지 종류가 있다.
		//		여러가지 자원을 다 받을 수 있도록 상위 클래스를 이용해서 받는다.
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








