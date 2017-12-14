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
		//	�� ������ �����ͺ��̽��� ó���ϴ� ����� �Ѵ�.
		//	�׷��Ƿ� �����ͺ��̽� ó���� ���� �⺻ �۾��� �׻� �غ�Ǿ�
		//	�ִ°��� ���ڴ�.
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
		//	1.	�Ѿ�� �Ķ���� �ް�
		String		id = request.getParameter("id");
		String		pw = request.getParameter("pw");
		
		//	2.	�����ͺ��̽����� �� ȸ���� �ִ��� Ȯ���ϰ�
		//		�����ͺ��̽��� ���� ����� ������ ����.
		ResultSet	rs = null;
		try {
			//	������ DAO�� �̿��ؼ� ó���ϴ� ���� �Ϲ����̴�.
			//	���⼭�� Servlet  ���丸 �����ϸ� �ǹǷ� �ܼ�ȭ �Ͽ� ó���ϰڴ�.
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				//	ȸ���̴�.
				//	������ ȸ���� ��쿡�� ���ǿ� �� ȸ���� �г��Ӹ� ������ ����.
				
				//	���ǵ� ���� ����ؾ� �Ѵ�.
				HttpSession session = request.getSession();
				session.setAttribute("NICK", rs.getString("m_Nick"));
				
				//	�α��ο� �����ϸ� Ȩ���� ������
				response.sendRedirect("../index.jsp");
			}
			else {
				//	ȸ���� �ƴϴ�.
				//	�α��ο� �����ϸ� �α��� ������ ������.
				response.sendRedirect("../Login/LoginForm.kim");
				
				//	���� �� ������
				//	http://localhost:8080/SunWeb/Login/LoginProc.kim
				
				//	Ȩ���� ������
				//	http://localhost:8080/SunWeb/index.jsp
				
				//	�α��� ������ ������
				//	http://localhost:8080/SunWeb/Login/LoginForm.kim
				
			}
		}
		catch(Exception e) {
			System.out.println("�α��� ó�� ���� = " + e);
		}
		finally {
			db.close(rs);
		}
		
		
		
		//	3.	������ ������ �ο�����.
		
		//	4.	������ ������ ������ ȣ������.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
