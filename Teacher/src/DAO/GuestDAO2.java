package DAO;

import java.sql.*;
import java.util.*;

import SQL.*;
import Util.*;
import VO.*;

public class GuestDAO2 {
	PoolUtil					pool;
	Connection				con;
	Statement				stmt;
	PreparedStatement	pstmt;
	
	public GuestDAO2() {
		pool = new PoolUtil();
		con = pool.getCON();
	}
	public ArrayList getGuestList() {
		String sql = GuestSQL.getSQL(GuestSQL.SELECT_BOARD);
		stmt = pool.getSTMT(con);
		ResultSet		rs = null;
		ArrayList		list = new ArrayList();
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				GuestVO2		vo = new GuestVO2();
				vo.no = rs.getInt("NO");
				vo.title = rs.getString("TITLE");
				vo.body = rs.getString("BODY");
				
				list.add(vo);
			}
		}
		catch(Exception e) {
			System.out.println("Get List Guest Error " + e);
		}
		finally {
			pool.close(rs);
		}
		return list;
	}
	
	public void insertGuest(String title, String body) {
		String sql = GuestSQL.getSQL(GuestSQL.INSERT_BOARD);
		pstmt = pool.getSTMT(con, sql);
		try {
			pstmt.setString(1,  title);
			pstmt.setString(2,  body);
			pstmt.execute();
		}
		catch(Exception e) {
			System.out.println("Write Guest Error " + e);
		}
	}
	public void close() {
		pool.close(pstmt);
		pool.close(stmt);
		pool.close(con);
	}
}
