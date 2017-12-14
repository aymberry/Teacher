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
 * 	이 클래스는 웹 서버에 의해서 실행되는 클래스이므로 
 * 	반드시 서블릿 클래스로 만들어야 한다.
 * 
 * 	확장자가 lee라고 붙은 요청이 들어오면 웹 서버는 이 서블릿 클래슬
 * 	실행하면서 도와 달라고 요구하게 된다.
 */
@WebServlet("*.lee")
public class P0824Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//	요청과 해당 컨트롤러 클래스를 한쌍으로 기억해 놓을 컬렉션
	//	을 준비하고
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
		//	이 함수는 처음에 한번만 실행되는 함수이므로....
		//	처음 실행되는 순간 요청과 실행 클래스를 map에 
		//	등록해 놓자.
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
		//	서비스 함수로써 요청을 들어올때 마다 실행하는 함수이다.
		//	웹 서버가 해야할 일 중에서 요청을 분석하는 일을
		//	이곳에서 처리하도록 하자.
		
		//	분석 방법
		//		Full 경로를 알아낸다.
		String	fullPath = request.getRequestURI();
		//	결과	==>		/SunWeb/P0824/Test01.lee
		//		도메인을 알아낸다.
		String	domain = request.getContextPath();
		//	결과	==>		/SunWeb
		//		위의 두가지를 이용해서 나머지 부분을 알아내자.
		String	realPath = fullPath.substring(domain.length());
		//	결과	==>		/P0824/Test01.lee	
		//	이제 클라이언트의 요청을 알아냈으므로 그 요청을 처리할
		//	컨트롤러(문제 해결 클래스)를 실행한다.
		//	오늘은 각각의 컨트롤러를 다형성 구현을 이용해서 처리하도록
		//	하고자 한다.
		//		1.	각각의 컨트롤러의 상위 클래스를 제작한다.
		//		2.	실제 컨트롤러는 상위 클래스를 상속 받아서 제작한다.
		
		SuperController	controller = null;
		
		//	문제점	알아내는 클래스는 문자적인 클래스 이름일 뿐이다.
		//	즉, 실행할 수 있는 클래스가 아닙니다.
		//	문자적인 클래스이름을 이용해서 실제 실행 가능한
		//	클래스(객체)로 만드는 방법
		
		//	실제 사용할 클래스를 알아보자.
		String	className = (String) map.get(realPath);
		//		"P0824.Sam01"		
		Class	tempClass = null;
		try {

			//	1.	문자적인 이름을 이용해서 실제 클래스를 알아낸다.
			tempClass = Class.forName(className);
			//		만약에 그런 이름의 클래스가 존재하지 않으면
			//		에러가 발생한다.
			//	2.	이것을 강제로 new 시킨다.
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
