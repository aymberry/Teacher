package DAO;
/*
 * 	이 클래스는 데이타베이스 작업을 전담할 클래스이다.
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
	//	누군가가 이 클래스를 생성하는 순간 컨넥션 풀을 이용하도록 조치
	public FileBoardDAO() {
		db = new POOLUtil();
		con = db.getCON();
	}
	//	이제 각각 작업에서 필요한 함수를 만들어서 사용하도록 하자.
	//	1.	총 데이터개수 구하기 작업
	public int getTotal() {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.GET_TOTAL);
		stmt = db.getSTMT(con);
		//	총 개수를 기억할 변수
		int		total = 0;
		try {
			ResultSet	rs = stmt.executeQuery(sql);
			rs.next();
			total = rs.getInt("CNT");
		}
		catch(Exception e) {
			System.out.println("총 데이터개수 구하기 에러 = " + e);
		}
		return total;
	}
	
	//	목록보기 질의 실행 함수
	public ArrayList getBoardList() {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.GET_BOARDLIST);
		stmt = db.getSTMT(con);
		ArrayList	list = new ArrayList();
		try {
			ResultSet	rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//	한줄의 데이터는 VO로 묶어서
				FileBoardVO	vo = new FileBoardVO();
				vo.no = rs.getInt("NO");
				vo.writer = rs.getString("WRITER");
				vo.title = rs.getString("TITLE");
				vo.wDate = rs.getDate("WDAY");
				vo.wTime = rs.getTime("WDAY");
				vo.hit = rs.getInt("HIT");
				vo.fileCount = rs.getInt("CNT");
				//	컬렉션에 담는다.
				list.add(vo);
			}
		}
		catch(Exception e) {
			System.out.println("목록 구하기 에러 = " + e);
		}
		return list;
	}
	
	//	일련번호 알아낼 함수
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
	//	게시물 등록 질의 실행 함수
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
	//	파일정보기록 질의 실행 함수
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
	//	상세보기 질의 실행 함수
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

	//	첨부파일 목록 검색 질의 실행 함수
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
	 * 	다운로드 파일 정보 검색 질의 실행 함수
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
	 * 	조회수 증가 질의 명령 실행 함수
	 * 
	 * 	작성자		홍길동
	 * 	작성일		2017년 9월 6일
	 *
	 *	수정		????년 ??월 ??일 	박아지		???내용 수정
	 *				????년 ??월 ??일 	장독대		???내용 수정
	 *
	 * 	파라메터	oriNo : 조회수 증가를 위한 게시물 번호
	 * 	반환값		???? 데이터
	 */
	public void updateHit(int oriNo) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.UPDATE_HIT);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, oriNo);
			pstmt.execute();
		}
		catch(Exception e) {
			System.out.println("조회수 증가 질의 실행 에러 = " + e);
			e.printStackTrace();
		}
	}
	
	/**
	 * 	검색 데이터 개수 구하기 질의 실행 함수
	 */
	public int getSearchCount(String kind, String body) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.GET_SEARCHTOTAL);
		//	이때 이 질의 명령 안에는 아직은 !@#$가 포함되어 있다.
		//	아직 미완성 질의 명령이다.
		//	!@#$ 부분을 다른 정식 질의 명령으로 치환해서
		//	완성된 질의 명령을 만들어주어야 한다.
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
			//	?를 채우는 방법도
			//	3개는 LIKE로 채워야하고 1개는 =로 채워야 한다.
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
	 * 	검색 목록 구하기 질의 실행 함수	
	 */
	public ArrayList	getSearchList(String kind, String body) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.GET_SEARCHLIST);
		//	이 명령은 아직 미완성이다.
		//	앞에서와 마찬가지고 kind 에 따라서 완성된 질의 명령을
		//	맹글어 주어야 한다.
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
			//	여러줄 나올것이므로 돌리자.
			while(rs.next()) {
				//	한줄의 데이터는 VO로 묶어서
				FileBoardVO	vo = new FileBoardVO();
				vo.no = rs.getInt("NO");
				vo.writer = rs.getString("WRITER");
				vo.title = rs.getString("TITLE");
				vo.wDate = rs.getDate("WDAY");
				vo.wTime = rs.getTime("WDAY");
				vo.hit = rs.getInt("HIT");
				vo.fileCount = rs.getInt("CNT");
				//	컬렉션에 담는다.
				list.add(vo);
			}
		}
		catch(Exception e) {
		}
		return list;
	}
	/**
	 * 	게시물 삭제 질의 실행 명령	
	 */
	public int deleteBoard(int oriNo, String pw) {
		String	sql = FileBoardSQL.getSQL(FileBoardSQL.UPDATE_ISSHOW);
		pstmt = db.getPSTMT(con, sql);
		int		count = 0;
		try {
			pstmt.setInt(1, oriNo);
			pstmt.setString(2, pw);
			
			//	복습
			//		질의 실행 방법
			//		1.	execute()			질의를 실행한 후 종료
			//		2.	exectueQuery();	질의를 실행한 후 결과 문서 받기
			//		3.	executeUpdate()	질의를 실행한 후 변경된 데이터 개수 받기
			count = pstmt.executeUpdate();
		}
		catch(Exception e) {
			
		}
		//	컨트롤러에게 변경되었는지, 안되었는지를 변경된
		//	데이터의 개수를 알려줌으로 알수 있도록 조치한다.
		return count;
	}
	//	사용한 자원은 닫아주자.
	public void close() {
		db.close(stmt);
		db.close(pstmt);
		db.close(con);
		//	close는 닫는 기능이지만....
		//	컨넥션 풀을 사용하는 경우에는 닫지 않고 컨넥션 풀에
		//	컨넥션을 돌려주는 기능이 구현된다.
	}
}
