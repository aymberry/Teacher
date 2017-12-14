package P0821;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/Login/LoginForm.kim")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
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

		//	JSP는 그냥 HTML 폼을 만들어 주면 되지만 서블릿은 HTML을
		//	만들 수 없다.
		//	그래서 HTML 폼을 스트림으로 만들어서 보여 주어야 한다.
		
		//	JSP에서 응답을 하기위해서는 응답 문서의 형태를 지정해야 하고
		//	한글 엔코딩 방식을 지정해야 한다.
		//	서블릿은 JSP에서 선언자에서 해준 내용을 처리하지 않고 있다.
		//	먼저 응답 방식과 엔코딩 형태를 지정해 주어야 한다.
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		//	서블릿은 내장 객체가 없다.
		//	필요한것이 있으면 만들어서 사용해야 한다.
		//	단, 두개는 제공한다.
		//		request, response는 자주 사용하는 기능이므로 제공한다.
		
		//	스트림은 PrintWriter 라는 클래스를 이용해야하는데....
		//	JSP에서는 out이라는 내장객체로 준비가 되어 있는데....
		//	서블릿에서는 제공하지 않으므로 만들어서 사용해야 한다.
		PrintWriter		out = response.getWriter();
		//	현재 
		//		http://localhost:8080/SunWeb/Login/LoginForm.kim
		//	가고싶은 요청
		//		http://localhost:8080/SunWeb/Login/LoginProc.kim
		
		
		out.print("<form method='POST' id='lfrm' action='./LoginProc.kim'>");
		out.print("<table width='500' align='center' border='1'>");
		out.print("<tr>");
		out.print("<td>아이디</td>");
		out.print("<td><input type='text' name='id' id='id'></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>비밀번호</td>");
		out.print("<td><input type='password' name='pw' id='pw'></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td colspan='2' align='center'>");
		out.print("<input type='submit' value='로그인'>");
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("</form>");
		
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
