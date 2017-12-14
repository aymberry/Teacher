package DAO;
/*
 * 	�� Ŭ������ ����Ÿ���̽� �۾��� ������ Ŭ�����̴�.
 */
import		java.sql.*;
import java.util.ArrayList;

import JDBC.POOLUtil;
import SQL.FileBoardSQL;
import VO.FileBoardVO;
public class FileBoardDAO {
	Connection			con;
	Statement				stmt;
	PreparedStatement	pstmt;
	POOLUtil				db;
	//	�������� �� Ŭ������ �����ϴ� ���� ���ؼ� Ǯ�� �̿��ϵ��� ��ġ
	public FileBoardDAO() {
		db = new POOLUtil();
		con = db.getCON();
	}
	//	���� ���� �۾����� �ʿ��� �Լ��� ���� ����ϵ��� ����.
	//	1.	�� �����Ͱ��� ���ϱ� �۾�
	public int getTotal() {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.GET_TOTAL);
		stmt = db.getSTMT(con);
		//	�� ������ ����� ����
		int		total = 0;
		try {
			ResultSet	rs = stmt.executeQuery(sql);
			rs.next();
			total = rs.getInt("CNT");
		}
		catch(Exception e) {
			System.out.println("�� �����Ͱ��� ���ϱ� ���� = " + e);
		}
		return total;
	}
	
	//	��Ϻ��� ���� ���� �Լ�
	public ArrayList getBoardList() {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.GET_BOARDLIST);
		stmt = db.getSTMT(con);
		ArrayList	list = new ArrayList();
		try {
			ResultSet	rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//	������ �����ʹ� VO�� ���
				FileBoardVO	vo = new FileBoardVO();
				vo.no = rs.getInt("NO");
				vo.writer = rs.getString("WRITER");
				vo.title = rs.getString("TITLE");
				vo.wDate = rs.getDate("WDAY");
				vo.wTime = rs.getTime("WDAY");
				vo.hit = rs.getInt("HIT");
				vo.fileCount = rs.getInt("CNT");
				//	�÷��ǿ� ��´�.
				list.add(vo);
			}
		}
		catch(Exception e) {
			System.out.println("��� ���ϱ� ���� = " + e);
		}
		return list;
	}
	
	//	�Ϸù�ȣ �˾Ƴ� �Լ�
	public int getNowNO() {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.GET_NOWNO);
		stmt = db.getSTMT(con);
		int		cnt = 0;
		try {
			ResultSet	rs = stmt.executeQuery(sql);
			rs.next();
			cnt = rs.getInt("CNT");
		}
		catch(Exception e) {
			
		}
		return cnt;
	}
	//	�Խù� ��� ���� ���� �Լ�
	public void insertBoard(int no, String writer, String title, String body, String pw) {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.INSERT_BOARD);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1,  no);
			pstmt.setString(2,  writer);
			pstmt.setString(3,  title);
			pstmt.setString(4,  body);
			pstmt.setString(5,  pw);
			
			pstmt.execute();
			
		}
		catch(Exception e) {
			
		}
	}
	//	����������� ���� ���� �Լ�
	public void insertFileInfo(int oriNo, String oriName, String saveName, long size, String path) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.INSERT_FILEINFO);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, oriNo);
			pstmt.setString(2, oriName);
			pstmt.setString(3, saveName);
			pstmt.setLong(4,  size);
			pstmt.setString(5, path);
			
			pstmt.execute();
		}
		catch(Exception e) {}
	}
	//	�󼼺��� ���� ���� �Լ�
	public FileBoardVO getBoardView(int oriNo) {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.GET_BOARDVIEW);
		pstmt = db.getPSTMT(con, sql);
		FileBoardVO vo = new FileBoardVO();
		try {
			pstmt.setInt(1, oriNo);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			vo.no 		= rs.getInt("NO");
			vo.writer 	= rs.getString("WRITER");
			vo.title 	= rs.getString("TITLE");
			vo.body 	= rs.getString("BODY");
			vo.wDate 	= rs.getDate("WDAY");
			vo.hit 		= rs.getInt("HIT");
		}
		catch(Exception e) {
		}
		return vo;
	}

	//	÷������ ��� �˻� ���� ���� �Լ�
	public ArrayList getFileList(int oriNo) {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.GET_FILELIST);
		pstmt = db.getPSTMT(con, sql);
		ArrayList	list = new ArrayList();
		try {
			pstmt.setInt(1, oriNo);
			ResultSet	rs = pstmt.executeQuery();
			while(rs.next()) {
				FileBoardVO vo = new FileBoardVO();
				vo.fno 			= rs.getInt("FNO");
				vo.oriNo 		= rs.getInt("ORINO");
				vo.oriName 	= rs.getString("ORINAME");
				vo.saveName 	= rs.getString("SAVENAME");
				vo.length 		= rs.getLong("LENGTH");
				vo.path 		= rs.getString("PATH");

				list.add(vo);
			}
		}
		catch(Exception e) {
		}
		return list;
	}
	/*
	 * 	�ٿ�ε� ���� ���� �˻� ���� ���� �Լ�
	 */
	public FileBoardVO getFileInfo(int fno) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.GET_FILEINFO);
		pstmt = db.getPSTMT(con, sql);
		FileBoardVO vo = new FileBoardVO();
		try {
			pstmt.setInt(1, fno);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			vo.fno 			= rs.getInt("FNO");
			vo.oriNo 		= rs.getInt("ORINO");
			vo.oriName 	= rs.getString("ORINAME");
			vo.saveName 	= rs.getString("SAVENAME");
			vo.length 		= rs.getLong("LENGTH");
			vo.path 		= rs.getString("PATH");
		}
		catch(Exception e) {
		}
		return vo;
	}

	/**
	 * 	��ȸ�� ���� ���� ��� ���� �Լ�
	 * 
	 * 	�ۼ���		ȫ�浿
	 * 	�ۼ���		2017�� 9�� 6��
	 *
	 *	����		????�� ??�� ??�� 	�ھ���		???���� ����
	 *				????�� ??�� ??�� 	�嵶��		???���� ����
	 *
	 * 	�Ķ����	oriNo : ��ȸ�� ������ ���� �Խù� ��ȣ
	 * 	��ȯ��		???? ������
	 */
	public void updateHit(int oriNo) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.UPDATE_HIT);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, oriNo);
			pstmt.execute();
		}
		catch(Exception e) {
			System.out.println("��ȸ�� ���� ���� ���� ���� = " + e);
			e.printStackTrace();
		}
	}
	
	/**
	 * 	�˻� ������ ���� ���ϱ� ���� ���� �Լ�
	 */
	public int getSearchCount(String kind, String body) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.GET_SEARCHTOTAL);
		//	�̶� �� ���� ��� �ȿ��� ������ !@#$�� ���ԵǾ� �ִ�.
		//	���� �̿ϼ� ���� ����̴�.
		//	!@#$ �κ��� �ٸ� ���� ���� ������� ġȯ�ؼ�
		//	�ϼ��� ���� ����� ������־�� �Ѵ�.
		if(kind.equals("writer")) {
			sql.replaceAll("!@#$", "f_Writer LIKE ?");
		}
		else if(kind.equals("title")) {
			sql.replaceAll("!@#$", "f_Title	LIKE ?");
		}
		else if(kind.equals("body")) {
			sql.replaceAll("!@#$", "f_Body LIKE ?");
		}
		else if(kind.equals("date")) {
			sql.replaceAll("!@#$", "TO_CHAR(f_Date, 'YYYY-MM-DD') = ?");
		}
		pstmt = db.getPSTMT(con, sql);
		int		count = 0;
		try {
			//	?�� ä��� �����
			//	3���� LIKE�� ä�����ϰ� 1���� =�� ä���� �Ѵ�.
			if(kind.equals("date")) {
				pstmt.setString(1, body);
			}
			else {
				body = "%" + body + "%";
				pstmt.setString(1, body);
			}
			ResultSet	rs = pstmt.executeQuery();
			rs.next();
			count = rs.getInt("CNT");
		}
		catch(Exception e) {
		}
		return count;
	}
	
	/**
	 * 	�˻� ��� ���ϱ� ���� ���� �Լ�	
	 */
	public ArrayList	getSearchList(String kind, String body) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.GET_SEARCHLIST);
		//	�� ����� ���� �̿ϼ��̴�.
		//	�տ����� ���������� kind �� ���� �ϼ��� ���� �����
		//	�ͱ۾� �־�� �Ѵ�.
		if(kind.equals("writer")) {
			sql.replaceAll("!@#$", "f_Writer LIKE ?");
		}
		else if(kind.equals("title")) {
			sql.replaceAll("!@#$", "f_Title	LIKE ?");
		}
		else if(kind.equals("body")) {
			sql.replaceAll("!@#$", "f_Body LIKE ?");
		}
		else if(kind.equals("date")) {
			sql.replaceAll("!@#$", "TO_CHAR(f_Date, 'YYYY-MM-DD') = ?");
		}
		pstmt = db.getPSTMT(con, sql);
		ArrayList	list = new ArrayList();
		try {
			if(kind.equals("date")) {
				pstmt.setString(1, body);
			}
			else {
				body = "%" + body + "%";
				pstmt.setString(1, body);
			}
			ResultSet	rs = pstmt.executeQuery();
			//	������ ���ð��̹Ƿ� ������.
			while(rs.next()) {
				//	������ �����ʹ� VO�� ���
				FileBoardVO	vo = new FileBoardVO();
				vo.no = rs.getInt("NO");
				vo.writer = rs.getString("WRITER");
				vo.title = rs.getString("TITLE");
				vo.wDate = rs.getDate("WDAY");
				vo.wTime = rs.getTime("WDAY");
				vo.hit = rs.getInt("HIT");
				vo.fileCount = rs.getInt("CNT");
				//	�÷��ǿ� ��´�.
				list.add(vo);
			}
		}
		catch(Exception e) {
		}
		return list;
	}
	/**
	 * 	�Խù� ���� ���� ���� ���	
	 */
	public int deleteBoard(int oriNo, String pw) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.UPDATE_ISSHOW);
		pstmt = db.getPSTMT(con, sql);
		int		count = 0;
		try {
			pstmt.setInt(1, oriNo);
			pstmt.setString(2, pw);
			
			//	����
			//		���� ���� ���
			//		1.	execute()			���Ǹ� ������ �� ����
			//		2.	exectueQuery();	���Ǹ� ������ �� ��� ���� �ޱ�
			//		3.	executeUpdate()	���Ǹ� ������ �� ����� ������ ���� �ޱ�
			count = pstmt.executeUpdate();
		}
		catch(Exception e) {
			
		}
		//	��Ʈ�ѷ����� ����Ǿ�����, �ȵǾ������� �����
		//	�������� ������ �˷������� �˼� �ֵ��� ��ġ�Ѵ�.
		return count;
	}
	//	����� �ڿ��� �ݾ�����.
	public void close() {
		db.close(stmt);
		db.close(pstmt);
		db.close(con);
		//	close�� �ݴ� ���������....
		//	���ؼ� Ǯ�� ����ϴ� ��쿡�� ���� �ʰ� ���ؼ� Ǯ��
		//	���ؼ��� �����ִ� ����� �����ȴ�.
	}
}
