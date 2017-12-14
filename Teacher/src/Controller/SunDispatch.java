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
//	이 부분은 프로젝트의 설계도에 따라 어떤 확장자로 처리할 지 결정하고
//	그 부분을 등록한다.
//	여기서는 ????.sun 으로 하기로 한다.
@WebServlet("*.sun")
public class SunDispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//	요청과 사용 컨트롤러를 관리할 Map을 준비한다.
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
		//	이 함수는 가장 처음 요청했을때 딱 한번만 실행되는 함수이다.
		//	주로 초기화 작업이 필요할 때 사용하는 함수이다.
		//	나는 이 함수에서 파일에서 내용을 읽어서 Map으로 만들어 놓을 생각이다.
		//	파일에서 직접 Map으로 만드는 기능을 가진 클래스가
		//		Properties라는 클래스이다.
		Properties		prop = new Properties();
		//		파일에서 읽기 위해서는 파일로 연결된 스트림이 필요하다.
		FileInputStream	fin = null;
		try {
			fin = new FileInputStream("D:\\WebSource\\eclipse\\Teacher\\src\\Controller\\RequestMap.properties");
			prop.load(fin);
			//	이미 파일의 내용을 읽어서 Map으로 만들어 놓았다.
			//	이 안에 있는 클래스는 문자적인 클래스 이름일 뿐이고
			//	실행가능한 클래스가 아니다.
		}
		catch(Exception e) {}
		finally {
			try {
				fin.close();
			}
			catch(Exception e){}
		}
		
		//	실행 불가능한 클래스 이름을 이용해서 실행 가능한 
		//	클래스로 만들어서 다시 맵에 저장해 놓자.
		//	실행할때 마다 클래스를 만들 필요가 없다.
		
		//	prop에 있는 모든 클래스를 다 실행 가능한 클래스로 만들어야 한다.
		//	prop에 있는 키값과 데이터를 꺼내봐야 한다.
		//	1.	키값만 꺼내보자.
		Enumeration en = prop.keys();
		while(en.hasMoreElements()) {
			//	첫번째 키값을 알아내자.
			String	key = (String) en.nextElement();
			//		/P0824/Test01.lee
			//	Map은 키값을 알면 데이터를 꺼낼 수 있다.
			String	data = (String) prop.get(key);
			//		P0824.Sam01
			try {
				//	문자적인 이름을 이용해서 실제 클래스를 찾자
				Class tempClass = Class.forName(data);
				//	이 클래스를 실행 가능하도록 강제로 new 시키자.
				SuperAction	realClass = (SuperAction) tempClass.newInstance();
				//	이것을 다시 Map에 저장하자.
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
		//	누군가가 요청을 하면
		//	요청을 분석해서
		String	fullName = request.getRequestURI();
		String	domain = request.getContextPath();
		String	req = fullName.substring(domain.length());
		//	실행할 컨트롤러를 Map에서 꺼내서
		SuperAction	controller = (SuperAction) map.get(req);
		System.out.println(controller);
		//	실행하고
		String	view = controller.action(request, response);
		
		//	뷰를 호출한다.
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
