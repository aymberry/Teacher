package Util;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

public class PoolUtil {
	DataSource ds;
	public PoolUtil() {
		try {
			Context context  = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/iedu");
		}
		catch(Exception e) {
			System.out.println("Create Pool Error " + e);
		}
	}
	
	public Connection getCON() {
		Connection con = null;
		try {
			con = ds.getConnection();
		}
		catch(Exception e) {
			System.out.println("Create Connection Error " + e);
		}
		return con;
	}
	
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		}
		catch(Exception e) {
			System.out.println("Create Statement Error " + e);
		}
		return stmt;
	}
	
	public PreparedStatement getSTMT(Connection con, String sql) {
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(sql);
		}
		catch(Exception e) {
			System.out.println("Create Statement Error " + e);
		}
		return stmt;
	}

	public void close(Object obj) {
		try {
			if(obj instanceof Connection) {
				((Connection) obj).close();
			}
			else if(obj instanceof Statement) {
				((Statement) obj).close();
			}
			else if(obj instanceof PreparedStatement) {
				((PreparedStatement) obj).close();
			}
			else if(obj instanceof ResultSet) {
				((ResultSet) obj).close();
			}
		}
		catch(Exception e) {
			System.out.println("Close Error " + e);
		}
	}
}
