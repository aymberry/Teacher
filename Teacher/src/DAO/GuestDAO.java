package DAO;
/*
 * 	이 클래스는 데이터베이스 작업만 담당할 클래스이다.
 * 
 * 	이 클래스를 어떻게 만드는지는 규칙이 없고
 * 	다만 데이터베이스 작업만 좀 편하기 
 * 	잘 진행할 수 있도록 만들면 그것이 DAO가 된다.
 */
import		JDBC.*;
import		java.sql.*;
import		VO.*;
import		java.util.*;
public class GuestDAO {
	//	나는 작업 단위로 만들고자 한다.
	//	방명록 작업에서는
	//		1.	방명록 글쓰기
	public void GuestWriter(String who, String body) {
		//	이 함수는 방명록 글쓰기 작업을 처리할 함수이다.
		//	이 함수는 작업을 원할히 수행하기 위해서는 기록할 내용을
		//	알아야 한다.
		JDBCUtil	db = null;
		Connection	con = null;
		PreparedStatement pstmt = null;
		try {
			//	드라이버 로딩
			db = new JDBCUtil();
			//	접속하고
			con = db.getCON();
			//	Prepared 스테이트 만들고
			String sql = "INSERT INTO Guest VALUES( (SELECT NVL(MAX(g_NO), 0) + 1 FROM Guest), ?, ?, SYSDATE)";
			pstmt = db.getPSTMT(con, sql);
			//	질의 실행하면 된다.
			//		?를 채워야 한다.
			pstmt.setString(1, who);
			pstmt.setString(2, body);
			
			pstmt.execute();
		}
		catch(Exception e) {
			System.out.println("입력 에러 = " + e);
		}
		finally {
			db.close(pstmt);
			db.close(con);
		}
	}
	
	//		2.	방명록 목록보기
	//			데이터베이스가 가지고 있는 방명록 내용을 알아내는 기능
	public ArrayList getGuestList() {
		//	할일
		JDBCUtil		db = null;
		Connection	con = null;
		Statement		stmt = null;
		ResultSet		rs = null;
		//	여러줄의 데이터를 묶을 컬렉션을 준비하고...
		ArrayList		list = new ArrayList();
		try {
		//		드라이버로딩
			db = new JDBCUtil();
		//		접속
			con = db.getCON();
		//		스테이트먼트
			stmt = db.getSTMT(con);
		//		질의실행
			String sql = "SELECT g_NO AS NO, g_Writer AS WHO, g_Body AS Body, g_Date AS WDate FROM Guest Order BY g_No DESC";
			rs = stmt.executeQuery(sql);
		//		결과 분석

			while(rs.next()) {
				//	데이터를 하나씩 꺼내야 한다.
				//	근데 한줄에는 여러개의 데이터가 존재하고 이것이 다시 여러줄 나온다.
				//	이 모든 데이터를 한번에 기억하는 방법이 뭐가 있을까?
				
				//	결론	한줄의 데이터는 하나의 클래스로 묶어서 기억하고
				//			한줄의 데이터를 묶을 클래스를 VO 클래스라고 한다.
				//			여러줄의 데이터는 컬렉션을 이용해서 묶으면 될 것이다.
				
				//	한줄의 내용을 VO에 기억한다.
				GuestVO	vo = new GuestVO();
				vo.no = rs.getInt("NO");
				vo.who = rs.getString("WHO");
				vo.body = rs.getString("BODY");
				vo.date = rs.getDate("WDATE");
				
				//	이것이 반복되면서 여러줄 나올 수 있으므러...
				//	한줄의 데이터를 컬렉션으로 묶는다.
				list.add(vo);
			}
		}
		catch(Exception e) {
			System.out.println("목록 꺼내기 에러 = " + e);
		}
		finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		//	이 함수의 목적은 목록을 알아내는 것이므로....
		//	알아낸 컬렉션을 알려준다.
		return list;
	}
	
	
}






