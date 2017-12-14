package DAO;
/*
 * 	이 클래스는 오직 데이터베이스 처리만 담당할 전용 클래스
 */
import		JDBC.*;
import		java.sql.*;
import		VO.*;
public class MemberDAO {
	//	나는 로그인 처리를 담당할 함수를 하나 만들겠다.
	public MemberVO loginCheck(String id, String pw) {
		//	누군가가 이 함수에게 자신의 id와 비밀번호를 알려주면
		//	그회원 존재 여부를 파악해서 응답하는 함수이다.
		//	할일
		JDBCUtil				db 		= null;
		Connection			con 	= null;
		PreparedStatement	pstmt 	= null;
		ResultSet				rs 		= null;
		//	회원정보를 기억할 VO 클래스 준비를 하고
		MemberVO				mVO 	= null;
		try {
			db = new JDBCUtil();
			con = db.getCON();
			String sql = "SELECT * FROM Member WHERE m_id=? AND m_password=?";
			pstmt = db.getPSTMT(con, sql);
			//	실행하면 되는데... ?를 채운후 실행해야 하므로....
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			//	실행이 된 결과를 분석해 봐야 한다.
			
			if(rs.next()) {
				System.out.println("111");
				//	rs.next()	작업 포인터를 아래로 이동시키세요.
				//	회원입니다.
				
				//	회원의 정보를 알려주어야겠고....
				//	근데 회원의 정보를 여러가지 종류가 있다.....
				//	회원 정보를 기억할 VO클래스를 생성하고
				mVO = new MemberVO();
				//	이 클래스의 변수에 데이터를 입력하자.
				mVO.setId(rs.getString("m_id"));
				mVO.setPw(rs.getString("m_Password"));
				mVO.setNick(rs.getString("m_Nick"));
			}
			else {
				System.out.println("222");
				//	회원이 아닙니다.
				//	아무 정보도 알려줄 수 없다......
			}
		}
		catch(Exception e) {
			System.out.println("로그인 에러 = " + e);
		}
		finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return mVO;
	}
}





