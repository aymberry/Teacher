package P0821;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JDBC.JDBCUtil;

/**
 * Servlet implementation class LoginProc
 */
@WebServlet("/Login/LoginProc.kim")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginProc() {
        super();
        // TODO Auto-generated constructor stub
    }
    JDBCUtil					db;
    Connection				con;
    PreparedStatement		pstmt;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//	이 서블릿은 데이터베이스를 처리하는 기능을 한다.
		//	그러므로 데이터베이스 처리를 위한 기본 작업은 항상 준비되어
		//	있는것이 좋겠다.
		db = new JDBCUtil();
		con = db.getCON();
		String	sql = 
		"SELECT * FROM Member WHERE m_ID=? AND m_Password=?";
		pstmt = db.getPSTMT(con, sql);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	1.	넘어온 파라메터 받고
		String		id = request.getParameter("id");
		String		pw = request.getParameter("pw");
		
		//	2.	데이터베이스에서 그 회원이 있는지 확인하고
		//		데이터베이스에 질의 명령을 실행해 보자.
		ResultSet	rs = null;
		try {
			//	원래는 DAO를 이용해서 처리하는 것이 일반적이다.
			//	여기서는 Servlet  개념만 이해하면 되므로 단순화 하여 처리하겠다.
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				//	회원이다.
				//	오늘은 회원인 경우에는 세션에 그 회원의 닉네임만 저장해 보자.
				
				//	세션도 만들어서 사용해야 한다.
				HttpSession session = request.getSession();
				session.setAttribute("NICK", rs.getString("m_Nick"));
				
				//	로그인에 성공하면 홈으로 보내고
				response.sendRedirect("../index.jsp");
			}
			else {
				//	회원이 아니다.
				//	로그인에 실패하면 로그인 폼으로 보내자.
				response.sendRedirect("../Login/LoginForm.kim");
				
				//	지금 이 서블릿은
				//	http://localhost:8080/SunWeb/Login/LoginProc.kim
				
				//	홈으로 가려면
				//	http://localhost:8080/SunWeb/index.jsp
				
				//	로그인 폼으로 가려면
				//	http://localhost:8080/SunWeb/Login/LoginForm.kim
				
			}
		}
		catch(Exception e) {
			System.out.println("로그인 처리 에러 = " + e);
		}
		finally {
			db.close(rs);
		}
		
		
		
		//	3.	있으면 세션을 부여하자.
		
		//	4.	적당한 문서를 강제로 호출하자.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
