package P0822;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sam01
 */
/*
 * 	���� �� ���� Ŭ������ Ȯ���ڰ� kim�� �Ǹ� ������ �����ϴ� 
 * 	Ŭ������ �Ǿ���.
 * 
 * 	�׷��Ƿ� ������ �� ������ ��û�� �м��ؾ� �ϴµ�...
 * 	���� �̷� ���� Ŭ������ �ϳ� ����� �������ν�......
 * 	Ȯ���ڰ� kim�̸� �� ������ ��û�� �м����� �ʰ� �� Ŭ������ �����Ѵ�.
 * 
 * 
 * 	���
 * 		��ó�� �� ������ �м��� ���� �ʰ� ��� �����ϴ� 
 * 		�̷� ������ ������ Displatch �����̶�� �Ѵ�.
 * 
 * 		��, �Ѹ���� ���ؼ� �� ������ �� ��ſ� �м��� �ش޶�� ��Ź�ϴ�
 * 		������ �� ���̴�.
 */
@WebServlet("*.kim")
public class Sam01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException {
	}
	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//	�� ������ �ؾ��� ù��° ���� ��û�� �˾Ƴ��� ���̴�.
		
		//	���� �������� ��û�� �ϸ� �� ���� �Լ��� ������ٵ�.....
		//	�� ������ ���� ������ ��û�� ��� �м��ϱ� ���ؼ� �������.
		//	��û�м��̶�?
		//	http://localhost:8080/SunWeb/Guest/GuestList.kim�� ��û�ϸ�
		//		/Guest/GuestList.kim�� �˾Ƴ��� ���̴�.
		
		//	1.	������ �κ��� �˾Ƴ���.
		String domain = request.getContextPath();
		//	���		/SunWeb
		System.out.println(domain);
		//	2.	��ü ��θ� �˾Ƴ���.
		String	fullR = request.getRequestURI();
		//	���		/SunWeb/Guest/GuestList.kim
		System.out.println(fullR);
		//	3.	��ü ��� �߿��� �������� �� �� �κ��� �˾Ƴ���.
		String	userR = fullR.substring(domain.length());
		//	���		/Guest/GuestList.kim
		System.out.println(userR);
		//	==================		��û ������ �м��ϴ� ����̴�.
		
		//	��û�� ���뿡 ���� �� ��û�� �ذ��� ��Ʈ�ѷ��� �����ϴ� ���̴�.
		if(userR.equals("/P0822/Test01.kim")) {
			Imsi01	im = new Imsi01();
			//	���� �����Ͻ� ������ ����� �л� ó���� �ϼ��Ǿ���.
			im.action(request, response);
		}
		else if(userR.equals("/P0822/Test02.kim")) {
			Imsi02 im = new Imsi02();
			im.execute(request, response);
		}
		
		//	��Ʈ�ѷ��� ����Ǿ��ٴ� ���� �����Ͻ� ������ �����ٴ� ���̴�.
		//	�׷��Ƿ� ȭ���� ����� �־�� �Ѵ�.
		//	������ �� ���� Ŭ������ ȭ���� ����� �־�� �Ѵ�.
		//	���� Ŭ�������� ȭ���� ȭ���� ������ �ſ� ��ƴ�.
		//	�׷��� �ٸ� JSP ������ �̿��ؼ� ��� �����ϱ�� �Ѵ�.
		//	�ٸ� JSP ������ ���̴�.
		if(userR.equals("/P0822/Test01.kim")) {
			RequestDispatcher rd = 
					request.getRequestDispatcher("../P0822/Sam01.jsp");
			
			//	���� ��û
			//	http://localhost:8080/SunWeb/P0822/Test01.kim
			
			//	�� ������ ���� ȣ���� ��쿡��
			//	http://localhost:8080/SunWeb/P0822/Sam01.jsp
			
			//	��
			//		�����ġ ã�� ���� ������ ���
			//		���� ��ġ�� �ڹ����� ��������,  
			//		JSP ���������� ���� �޶�����.
			//		���	������ �κ��� ������ �����̴�.
			//				�׻� �����α��� ã�ư� �� ���� ������ ����ϸ� �ȴ�.
			rd.forward(request, response);
		}
		else if(userR.equals("/P0822/Test02.kim")) {
			RequestDispatcher rd = 
					request.getRequestDispatcher("../P0822/Sam02.jsp");
			rd.forward(request, response);
		}
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
