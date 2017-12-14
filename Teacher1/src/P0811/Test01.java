package P0811;
/*
 * 	문제
 * 		Test01에 5사람을 입력해 보자.
 * 
 * 		이문제는 INSERT INTO Test01 VALUES('???', '???')	의 질의를
 * 		5번 실행해야 하는 문제이다.
 */
import		java.sql.*;
import		JDBC.*;
public class Test01 {
	public Test01() {
		JDBCUtil		db = null;
		Connection	con = null;
		PreparedStatement	pstmt = null;
		try {
			//	드라이버 로딩하고
			db = new JDBCUtil();
			//	접속한 후
			con = db.getCON();
			//	Statement 만들기
			//	오늘은 PreparedStatement를 만들 예정이다.
			//	기억	PreparedStatement는 
			//			먼저(만들때) 질의 명령을 보내 주어야 한다.
			String	sql = "INSERT INTO Test01 VALUES(?, ?)";
			//	참고
			//		바뀌는 부분은 ?로 대신 기록하면 질의 명령을 만들어주면 된다.
			//		대신 질의를 실행하기전에는 반드시 ?를 대신할
			//		데이터를 알려주어야 한다.
			pstmt = con.prepareStatement(sql);
			//	매우 중요
			//		PreparedStatement는 만들때 질의 명령을 보낸다.
			
			String[] id = {"hong", "park", "jang", "lee", "kim"};
			String[] name = {"홍길동", "박아지", "장독대", "이기자", "김치국"};
			
			//	실행한다.
			for(int i = 0; i < 5; i++) {
				//	실행하기 전에 먼저 ?를 대신할 데이터를 보낸다.
				//		사용함수		setXXX(?의 위치, 보낼데이터);
				//						XXX는 데이터의 형태에 따라서 선택
				//						위치는 1번부터 카운트 한다.
				pstmt.setString(1, id[i]);
				pstmt.setString(2, name[i]);
				//	실행한다.
				pstmt.execute();
			}
			System.out.println("입력 끝");
		}
		catch(Exception e) {
		}
		finally {
			db.close(con);
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}




