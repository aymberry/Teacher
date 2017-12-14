package P0824;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class P0824Servlet
 * 
 * 	�� Ŭ������ �� ������ ���ؼ� ����Ǵ� Ŭ�����̹Ƿ� 
 * 	�ݵ�� ���� Ŭ������ ������ �Ѵ�.
 * 
 * 	Ȯ���ڰ� lee��� ���� ��û�� ������ �� ������ �� ���� Ŭ����
 * 	�����ϸ鼭 ���� �޶�� �䱸�ϰ� �ȴ�.
 */
@WebServlet("*.lee")
public class P0824Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//	��û�� �ش� ��Ʈ�ѷ� Ŭ������ �ѽ����� ����� ���� �÷���
	//	�� �غ��ϰ�
	public HashMap map = new HashMap();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public P0824Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		//	�� �Լ��� ó���� �ѹ��� ����Ǵ� �Լ��̹Ƿ�....
		//	ó�� ����Ǵ� ���� ��û�� ���� Ŭ������ map�� 
		//	����� ����.
		map.put("/P0824/Test01.lee", "P0824.Sam01");
		map.put("/P0824/Test02.lee", "P0824.Sam02");
		map.put("/P0824/Test03.lee", "P0824.Sam03");
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
		//	���� �Լ��ν� ��û�� ���ö� ���� �����ϴ� �Լ��̴�.
		//	�� ������ �ؾ��� �� �߿��� ��û�� �м��ϴ� ����
		//	�̰����� ó���ϵ��� ����.
		
		//	�м� ���
		//		Full ��θ� �˾Ƴ���.
		String	fullPath = request.getRequestURI();
		//	���	==>		/SunWeb/P0824/Test01.lee
		//		�������� �˾Ƴ���.
		String	domain = request.getContextPath();
		//	���	==>		/SunWeb
		//		���� �ΰ����� �̿��ؼ� ������ �κ��� �˾Ƴ���.
		String	realPath = fullPath.substring(domain.length());
		//	���	==>		/P0824/Test01.lee	
		//	���� Ŭ���̾�Ʈ�� ��û�� �˾Ƴ����Ƿ� �� ��û�� ó����
		//	��Ʈ�ѷ�(���� �ذ� Ŭ����)�� �����Ѵ�.
		//	������ ������ ��Ʈ�ѷ��� ������ ������ �̿��ؼ� ó���ϵ���
		//	�ϰ��� �Ѵ�.
		//		1.	������ ��Ʈ�ѷ��� ���� Ŭ������ �����Ѵ�.
		//		2.	���� ��Ʈ�ѷ��� ���� Ŭ������ ��� �޾Ƽ� �����Ѵ�.
		
		SuperController	controller = null;
		
		//	������	�˾Ƴ��� Ŭ������ �������� Ŭ���� �̸��� ���̴�.
		//	��, ������ �� �ִ� Ŭ������ �ƴմϴ�.
		//	�������� Ŭ�����̸��� �̿��ؼ� ���� ���� ������
		//	Ŭ����(��ü)�� ����� ���
		
		//	���� ����� Ŭ������ �˾ƺ���.
		String	className = (String) map.get(realPath);
		//		"P0824.Sam01"		
		Class	tempClass = null;
		try {

			//	1.	�������� �̸��� �̿��ؼ� ���� Ŭ������ �˾Ƴ���.
			tempClass = Class.forName(className);
			//		���࿡ �׷� �̸��� Ŭ������ �������� ������
			//		������ �߻��Ѵ�.
			//	2.	�̰��� ������ new ��Ų��.
			controller = (SuperController) tempClass.newInstance();
		}
		catch(Exception e) {}
		String view = controller.action(request, response);
		try {
			RequestDispatcher rd = 
					request.getRequestDispatcher(view);
			rd.forward(request, response);
		}
		catch(Exception e) {}
		
//		if(realPath.equals("/P0824/Test01.lee")) {
//			controller = new Sam01();
//			controller.action(request, response);
//		}
//		else if(realPath.equals("/P0824/Test02.lee")) {
//			controller = new Sam02();
//			controller.action(request, response);
//		}
//		else if(realPath.equals("/P0824/Test03.lee")) {
//			controller = new Sam03();
//			controller.action(request, response);
//		}
			
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
