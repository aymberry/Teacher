package Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SunDispatch
 */
//	�� �κ��� ������Ʈ�� ���赵�� ���� � Ȯ���ڷ� ó���� �� �����ϰ�
//	�� �κ��� ����Ѵ�.
//	���⼭�� ????.sun ���� �ϱ�� �Ѵ�.
@WebServlet("*.sun")
public class SunDispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//	��û�� ��� ��Ʈ�ѷ��� ������ Map�� �غ��Ѵ�.
	HashMap		map = new HashMap();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SunDispatch() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		//	�� �Լ��� ���� ó�� ��û������ �� �ѹ��� ����Ǵ� �Լ��̴�.
		//	�ַ� �ʱ�ȭ �۾��� �ʿ��� �� ����ϴ� �Լ��̴�.
		//	���� �� �Լ����� ���Ͽ��� ������ �о Map���� ����� ���� �����̴�.
		//	���Ͽ��� ���� Map���� ����� ����� ���� Ŭ������
		//		Properties��� Ŭ�����̴�.
		Properties		prop = new Properties();
		//		���Ͽ��� �б� ���ؼ��� ���Ϸ� ����� ��Ʈ���� �ʿ��ϴ�.
		FileInputStream	fin = null;
		try {
			fin = new FileInputStream("D:\\WebSource\\eclipse\\Teacher\\src\\Controller\\RequestMap.properties");
			prop.load(fin);
			//	�̹� ������ ������ �о Map���� ����� ���Ҵ�.
			//	�� �ȿ� �ִ� Ŭ������ �������� Ŭ���� �̸��� ���̰�
			//	���డ���� Ŭ������ �ƴϴ�.
		}
		catch(Exception e) {}
		finally {
			try {
				fin.close();
			}
			catch(Exception e){}
		}
		
		//	���� �Ұ����� Ŭ���� �̸��� �̿��ؼ� ���� ������ 
		//	Ŭ������ ���� �ٽ� �ʿ� ������ ����.
		//	�����Ҷ� ���� Ŭ������ ���� �ʿ䰡 ����.
		
		//	prop�� �ִ� ��� Ŭ������ �� ���� ������ Ŭ������ ������ �Ѵ�.
		//	prop�� �ִ� Ű���� �����͸� �������� �Ѵ�.
		//	1.	Ű���� ��������.
		Enumeration en = prop.keys();
		while(en.hasMoreElements()) {
			//	ù��° Ű���� �˾Ƴ���.
			String	key = (String) en.nextElement();
			//		/P0824/Test01.lee
			//	Map�� Ű���� �˸� �����͸� ���� �� �ִ�.
			String	data = (String) prop.get(key);
			//		P0824.Sam01
			try {
				//	�������� �̸��� �̿��ؼ� ���� Ŭ������ ã��
				Class tempClass = Class.forName(data);
				//	�� Ŭ������ ���� �����ϵ��� ������ new ��Ű��.
				SuperAction	realClass = (SuperAction) tempClass.newInstance();
				//	�̰��� �ٽ� Map�� ��������.
				map.put(key, realClass);
			}
			catch(Exception e) {}
		}
	}
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	�������� ��û�� �ϸ�
		//	��û�� �м��ؼ�
		String	fullName = request.getRequestURI();
		String	domain = request.getContextPath();
		String	req = fullName.substring(domain.length());
		//	������ ��Ʈ�ѷ��� Map���� ������
		SuperAction	controller = (SuperAction) map.get(req);
		System.out.println(controller);
		//	�����ϰ�
		String	view = controller.action(request, response);
		
		//	�並 ȣ���Ѵ�.
		try {
			RequestDispatcher ds = request.getRequestDispatcher(view);
			ds.forward(request, response);
		}
		catch(Exception e) {}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
