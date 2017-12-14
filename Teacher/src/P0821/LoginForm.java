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

		//	JSP�� �׳� HTML ���� ����� �ָ� ������ ������ HTML��
		//	���� �� ����.
		//	�׷��� HTML ���� ��Ʈ������ ���� ���� �־�� �Ѵ�.
		
		//	JSP���� ������ �ϱ����ؼ��� ���� ������ ���¸� �����ؾ� �ϰ�
		//	�ѱ� ���ڵ� ����� �����ؾ� �Ѵ�.
		//	������ JSP���� �����ڿ��� ���� ������ ó������ �ʰ� �ִ�.
		//	���� ���� ��İ� ���ڵ� ���¸� ������ �־�� �Ѵ�.
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		//	������ ���� ��ü�� ����.
		//	�ʿ��Ѱ��� ������ ���� ����ؾ� �Ѵ�.
		//	��, �ΰ��� �����Ѵ�.
		//		request, response�� ���� ����ϴ� ����̹Ƿ� �����Ѵ�.
		
		//	��Ʈ���� PrintWriter ��� Ŭ������ �̿��ؾ��ϴµ�....
		//	JSP������ out�̶�� ���尴ü�� �غ� �Ǿ� �ִµ�....
		//	���������� �������� �����Ƿ� ���� ����ؾ� �Ѵ�.
		PrintWriter		out = response.getWriter();
		//	���� 
		//		http://localhost:8080/SunWeb/Login/LoginForm.kim
		//	������� ��û
		//		http://localhost:8080/SunWeb/Login/LoginProc.kim
		
		
		out.print("<form method='POST' id='lfrm' action='./LoginProc.kim'>");
		out.print("<table width='500' align='center' border='1'>");
		out.print("<tr>");
		out.print("<td>���̵�</td>");
		out.print("<td><input type='text' name='id' id='id'></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>��й�ȣ</td>");
		out.print("<td><input type='password' name='pw' id='pw'></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td colspan='2' align='center'>");
		out.print("<input type='submit' value='�α���'>");
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
