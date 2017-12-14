package DAO;

import java.sql.*;
import java.util.ArrayList;

import JDBC.JDBCUtil;
import SQL.ReBoardSQL;
import VO.ReBoardVO;

/*
 * 	����� �Խ��ǿ� ���õ� ��� ��� �۾��� ����� DAO Ŭ�����̴�.
 */
public class ReBoardDAO {
	JDBCUtil		db;
	Connection	con;
	Statement		stmt;
	PreparedStatement	pstmt;
	//	�������� �� DAO�� ����ϱ� ���ؼ� new�� ��Ű�� ����
	//	����̹� �ε��� ���ؼ� �۾��� �� ����� ����.
	public ReBoardDAO() {
		db = new JDBCUtil();
		con = db.getCON();
	}
	//	�������� �Խù��� �Է��� �޶�� ��û�ϸ� �Է����� �Լ�
	public void insertBoard(String id, String title, String body, String pw) {
		//	�Է��� ���� ���� ��� �����
		String	sql = ReBoardSQL.getSQL(1);
		//	�� ����� ������ ������Ʈ��Ʈ �����
		pstmt = db.getPSTMT(con, sql);
		try {
		//	? ä����
			pstmt.setString(1,  id);
			pstmt.setString(2,  title);
			pstmt.setString(3,  body);
			pstmt.setString(4,  pw);
		//	���� �����ϸ� ��...
			pstmt.execute();
		}
		catch(Exception e) {}
	}
	
	/*
	 * 	��� �����⸦ ���� �Լ�
	 */
	public ArrayList getBoardList() {
		//	����
		//	���� ��� �����
		String sql = ReBoardSQL.getSQL(ReBoardSQL.SELECT_BOARD);
		
		//	���� ����� ����� �÷����� �غ��Ѵ�.
		ArrayList	list = new ArrayList();
		try {
		//	�����ؼ�
			stmt = db.getSTMT(con);
			ResultSet	rs = stmt.executeQuery(sql);
			
			//	����� ������
			while(rs.next()) {
				//	������ �����ʹ� ��ȣ, ... ��۰��������� �ִ�.
				//	�ݺ��ϸ鼭 ���پ� �����͸� ����� ����.
				ReBoardVO	rVO = new ReBoardVO();
				rVO.no 		= rs.getInt("NO");
				rVO.writer 	= rs.getString("WRITER");
				rVO.title 		= rs.getString("TITLE");
				rVO.wday 		= rs.getDate("WDAY");
				rVO.hit 		= rs.getInt("HIT");
				rVO.replyCnt 	= rs.getInt("CNT");
				
				list.add(rVO);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//	�˷��ش�.
		return list;
	}
	
	//	�� ������ ������ �˷��ִ� �Լ�
	public int getTotalCount() {
		//	���� ��� �˾Ƴ���
		String	sql = ReBoardSQL.getSQL(ReBoardSQL.TOTAL_COUNT);
		//	���� �����ؼ�
		int		totalCount = 0;
		try {
		//	��� �˾Ƴ���
			stmt = db.getSTMT(con);
			ResultSet	rs = stmt.executeQuery(sql);
			rs.next();
			totalCount = rs.getInt("CNT");
		}
		catch(Exception e) {}
		//	�˷��ش�.
		return totalCount;
	}
	
	//	�󼼺��⸦ ������ �Լ��� ����
	public ReBoardVO getBoardView(int oriNo) {
		//	���� ��� �����
		String	sql = ReBoardSQL.getSQL(ReBoardSQL.BOARD_VIEW);
		//	������Ʈ��Ʈ �����
		pstmt = db.getPSTMT(con, sql);
		
		ReBoardVO	vo = new ReBoardVO();
		try {
		//	����
			pstmt.setInt(1, oriNo);
			ResultSet	rs = pstmt.executeQuery();
			//	���� ������ �����Ͱ� ������ ���̴�.
			rs.next();
		//	�м�
			//	�м� ����� ���������� �����Ͱ� ź���Ѵ�.
			//	�̵����ʹ� VO�� ��� ó���ϴ°��� ���ڴ�.
			vo.no = rs.getInt("NO");
			vo.writer = rs.getString("WRITER");
			vo.title = rs.getString("TITLE");
			vo.body = rs.getString("BODY");
			vo.wday = rs.getDate("WDAY");
			vo.hit = rs.getInt("HIT");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//	��ȯ
		return vo;
	}
	
	//	����� ������ִ� �Լ�
	public void insertReply(int oriNo, String id, String body, String pw) {
		String	sql = ReBoardSQL.getSQL(ReBoardSQL.INSERT_REPLY);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, oriNo);
			pstmt.setString(2, id);
			pstmt.setString(3, body);
			pstmt.setString(4, pw);
			
			pstmt.execute();
		}
		catch(Exception e) {}
	}
	//	����� �˻��ϴ� �Լ�
	public ArrayList	getReply(int oriNo) {
		String	sql = ReBoardSQL.getSQL(6);
		pstmt = db.getPSTMT(con, sql);
		ArrayList	list = new ArrayList();
		try {
			pstmt.setInt(1, oriNo);
			ResultSet	rs = pstmt.executeQuery();
			
			//	������ �м�
			while(rs.next()) {
				ReBoardVO	vo = new ReBoardVO();
				vo.no = rs.getInt("NO");
				vo.oriNo = rs.getInt("ORINO");
				vo.writer = rs.getString("WRITER");
				vo.body = rs.getString("BODY");
				vo.wday = rs.getDate("WDAY");
				vo.good = rs.getInt("GOOD");
				vo.bad = rs.getInt("BAD");
				vo.kind = rs.getString("BEST");
				
				list.add(vo);
			}
			
		}
		catch(Exception e) {
			
		}
		return list;
	}
	
	//	��ȸ���� ���������ִ� �Լ�
	public void updateHit(int oriNo) {
		String	sql = ReBoardSQL.getSQL(ReBoardSQL.UPDATE_HIT);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, oriNo);
			pstmt.execute();
		}
		catch(Exception e) {}
	}
	//	�Խù� ���� ó�� �Լ�
	public void updateBoard(int oriNo, String title, String body, String pw) {
		String	sql = ReBoardSQL.getSQL(ReBoardSQL.UPDATE_BOARD);
		pstmt = db.getPSTMT(con, sql);
		
		try {
			pstmt.setString(1, title);
			pstmt.setString(2, body);
			pstmt.setString(3, pw);
			pstmt.setInt(4,  oriNo);
			
			pstmt.execute();
		}
		catch(Exception e) {}
	}
	
	//	��� ���� ���� ó�� �Լ�
	public void updateReply(int reNo, String body, String pw) {
		String	sql = ReBoardSQL.getSQL(ReBoardSQL.UPDATE_REPLY);
		pstmt = db.getPSTMT(con, sql);
		
		try {
			pstmt.setString(1, body);
			pstmt.setString(2, pw);
			pstmt.setInt(3, reNo);
			
			pstmt.execute();
		}
		catch(Exception e) {
			
		}
	}
	
	//	��õ ���� ó�� �Լ�
	public void reCommen(String kind, int reNo) {
		String	sql = "";
		if(kind.equals("G")) {
			sql = ReBoardSQL.getSQL(10);
		}
		else {
			sql = ReBoardSQL.getSQL(11);
		}
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, reNo);
			pstmt.execute();
		}
		catch(Exception e) {
		}
	}

	//	�ݾ��ִ� �Լ�
	public void close() {
		db.close(stmt);
		db.close(pstmt);
		db.close(con);
	}
	
}



