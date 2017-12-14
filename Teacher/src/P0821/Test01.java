package P0821;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test01
 */
//	�̺κ��� � ��û�� ������ �� ���� Ŭ������ ��������� 
//	�����ϴ� �κ��̴�.

//	������ JSP ������ ��û�ϸ� �� JSP�� Ŭ������ ��ȯ�Ǿ ����Ǿ�� �ϴµ�
//	JSP ������ �����Ƿ� Ŭ���̾�Ʈ�� ���� ������ ��û�� �� �𸥴�.
//	���
//		������ Ŭ���̾�Ʈ�� ��� ��û�ϸ� �� Ŭ������ ����Ǿ�� ������
//		�������� ����ؼ�
//		Ŭ���̾�Ʈ�� �׷��� ��û�ϸ� �� Ŭ���� ����ǵ��� ����ϴ� �κ��̴�.
@WebServlet("/P0821/Test01")
//	http://localhost:8080/SubWeb/P0821/Test01	�� ��û�ϸ� �� Ŭ������
//														����ǵ��� ����� �κ��̴�.
//	����
//		�츮�� ���� �������� ���� Ŭ������ ��û ������ �ߺ��Ǹ� �ȵȴ�.

//	���� Ŭ������ �Ǳ� ���ؼ��� HttpServlet Ŭ������ ��� �޾ƾ� �Ѵ�.
public class Test01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see Servlet#init(ServletConfig)
	 * 
	 * 	������ ��Ȱ�� �� init �����ֱ� �Լ��̴�.
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//	�� Ŭ������ ó�� new �Ǵ� ���� �ϰ���� ���� �ִٸ� 
		//	������ָ� �ȴ�.
		//	��>		�����ͺ��̽� �۾��� �ʿ��ϸ�...
		//			����̹� �ε�, ���ؼ�. Statement ������ �ʼ��̹Ƿ�
		//			�ѹ��� �ϵ��� �̰����� �ڵ��ϸ� �ȴ�.
		
		System.out.println("���� init �Լ��Դϴ�.");
	}

	/**
	 * @see Servlet#destroy()
	 * 
	 * 	�Ҹ��ڿ� �ش��ϴ� �Լ�
	 * 	
	 * 	�� �Լ��� �� ���� Ŭ������ �޸𸮿��� ���ŵǴ� ���� ����Ǵ� �Լ��̴�.
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		//	�� ���� Ŭ������ ����ߴ� �ڿ��� �ݾ��ִ� �۾��� �ʿ��ϸ�
		//	�� �κп��� �ϸ� �� ���̴�.
	}

	/*
	 * 	�Ʒ��ʿ� �ִ� �Լ� 2���� ���� �Լ��̴�.
	 * 
	 * 	��û ��Ŀ� ���� �� �� �ϳ��� �Լ��� ����Ǿ�����.
	 */
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	�������� �ʿ��� �۾�(JSP) �۾��� �� �Լ� �ȿ��� ����� �ȴ�.
		System.out.println("���� ���� �Լ��Դϴ�.");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	Ȥ�� POST ������� ��û�ϴ��� GET �Լ��� ó���ϵ���
		//	������ ȣ���ϴ� �κ��̴�.
		doGet(request, response);
	}

}
