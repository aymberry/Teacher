package DAO;

import java.sql.*;
import java.util.ArrayList;

import JDBC.JDBCUtil;
import SQL.ReBoardSQL;
import VO.ReBoardVO;

/*
 * 	댓글형 게시판에 관련된 모든 디비 작업을 담당할 DAO 클래스이다.
 */
public class ReBoardDAO {
	JDBCUtil		db;
	Connection	con;
	Statement		stmt;
	PreparedStatement	pstmt;
	//	누군가가 이 DAO를 사용하기 위해서 new를 시키는 순간
	//	드라이버 로딩과 컨넥션 작업을 해 놓기로 하자.
	public ReBoardDAO() {
		db = new JDBCUtil();
		con = db.getCON();
	}
	//	누군가가 게시물에 입력해 달라고 요청하면 입력해줄 함수
	public void insertBoard(String id, String title, String body, String pw) {
		//	입력을 위한 질의 명령 만들고
		String	sql = ReBoardSQL.getSQL(1);
		//	그 명령을 수행할 스테이트먼트 만들고
		pstmt = db.getPSTMT(con, sql);
		try {
		//	? 채워서
			pstmt.setString(1,  id);
			pstmt.setString(2,  title);
			pstmt.setString(3,  body);
			pstmt.setString(4,  pw);
		//	질의 실행하면 끝...
			pstmt.execute();
		}
		catch(Exception e) {}
	}
	
	/*
	 * 	목록 꺼내기를 위한 함수
	 */
	public ArrayList getBoardList() {
		//	할일
		//	질의 명령 만들고
		String sql = ReBoardSQL.getSQL(ReBoardSQL.SELECT_BOARD);
		
		//	최종 결과를 기억할 컬렉션을 준비한다.
		ArrayList	list = new ArrayList();
		try {
		//	실행해서
			stmt = db.getSTMT(con);
			ResultSet	rs = stmt.executeQuery(sql);
			
			//	결과를 꺼내서
			while(rs.next()) {
				//	한줄의 데이터는 번호, ... 댓글개수까지가 있다.
				//	반복하면서 한줄씩 데이터를 기억해 보자.
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
		//	알려준다.
		return list;
	}
	
	//	총 데이터 개수를 알려주는 함수
	public int getTotalCount() {
		//	질의 명령 알아내고
		String	sql = ReBoardSQL.getSQL(ReBoardSQL.TOTAL_COUNT);
		//	질의 실행해서
		int		totalCount = 0;
		try {
		//	결과 알아내고
			stmt = db.getSTMT(con);
			ResultSet	rs = stmt.executeQuery(sql);
			rs.next();
			totalCount = rs.getInt("CNT");
		}
		catch(Exception e) {}
		//	알려준다.
		return totalCount;
	}
	
	//	상세보기를 꺼내는 함수를 제작
	public ReBoardVO getBoardView(int oriNo) {
		//	질의 명령 만들고
		String	sql = ReBoardSQL.getSQL(ReBoardSQL.BOARD_VIEW);
		//	스테이트먼트 만들고
		pstmt = db.getPSTMT(con, sql);
		
		ReBoardVO	vo = new ReBoardVO();
		try {
		//	실행
			pstmt.setInt(1, oriNo);
			ResultSet	rs = pstmt.executeQuery();
			//	이제 한줄의 데이터가 나왔을 것이다.
			rs.next();
		//	분석
			//	분석 결과는 여러종류의 데이터가 탄생한다.
			//	이데이터는 VO로 묶어서 처리하는것이 좋겠다.
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
		//	반환
		return vo;
	}
	
	//	댓글을 등록해주는 함수
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
	//	댓글을 검색하는 함수
	public ArrayList	getReply(int oriNo) {
		String	sql = ReBoardSQL.getSQL(6);
		pstmt = db.getPSTMT(con, sql);
		ArrayList	list = new ArrayList();
		try {
			pstmt.setInt(1, oriNo);
			ResultSet	rs = pstmt.executeQuery();
			
			//	데이터 분석
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
	
	//	조회수를 증가시켜주는 함수
	public void updateHit(int oriNo) {
		String	sql = ReBoardSQL.getSQL(ReBoardSQL.UPDATE_HIT);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, oriNo);
			pstmt.execute();
		}
		catch(Exception e) {}
	}
	//	게시물 수정 처리 함수
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
	
	//	댓글 수정 질의 처리 함수
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
	
	//	추천 질의 처리 함수
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

	//	닫아주는 함수
	public void close() {
		db.close(stmt);
		db.close(pstmt);
		db.close(con);
	}
	
}



