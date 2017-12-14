package SAM;
import		java.sql.*;
public class Test {

	public Test() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection	con = DriverManager.getConnection("Test");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws Exception{
		new Test();
	}
}
