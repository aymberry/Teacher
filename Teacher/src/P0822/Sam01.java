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
 * 	이제 이 서블릿 클래스는 확장자가 kim만 되면 무조건 실행하는 
 * 	클래스가 되었다.
 * 
 * 	그러므로 원래는 웹 서버가 요청을 분석해야 하는데...
 * 	이젠 이런 서블릿 클래스를 하나 만들어 놓음으로써......
 * 	확장자가 kim이면 웹 서버는 요청을 분석하지 않고 이 클래스를 실행한다.
 * 
 * 
 * 	결론
 * 		이처럼 웹 서버가 분석을 하지 않고 대신 실행하는 
 * 		이런 형식의 서블릿을 Displatch 서블릿이라고 한다.
 * 
 * 		즉, 한마디로 말해서 웹 서버가 나 대신에 분석좀 해달라고 부탁하는
 * 		서블릿이 된 것이다.
 */
@WebServlet("*.kim")
public class Sam01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException {
	}
	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//	이 서블릿이 해야할 첫번째 일은 요청을 알아내는 것이다.
		
		//	이제 누군가가 요청을 하면 이 서비스 함수가 실행될텐데.....
		//	이 서블릿을 만든 목적이 요청을 대신 분석하기 위해서 만들었다.
		//	요청분석이란?
		//	http://localhost:8080/SunWeb/Guest/GuestList.kim로 요청하면
		//		/Guest/GuestList.kim을 알아내는 것이다.
		
		//	1.	도메인 부분을 알아낸다.
		String domain = request.getContextPath();
		//	결과		/SunWeb
		System.out.println(domain);
		//	2.	전체 경로를 알아낸다.
		String	fullR = request.getRequestURI();
		//	결과		/SunWeb/Guest/GuestList.kim
		System.out.println(fullR);
		//	3.	전체 경로 중에서 도메인을 뺀 뒷 부분을 알아낸다.
		String	userR = fullR.substring(domain.length());
		//	결과		/Guest/GuestList.kim
		System.out.println(userR);
		//	==================		요청 내용을 분석하는 장면이다.
		
		//	요청의 내용에 따라서 그 요청을 해결할 컨트롤러를 선택하는 일이다.
		if(userR.equals("/P0822/Test01.kim")) {
			Imsi01	im = new Imsi01();
			//	드디어 비지니스 로직을 담당할 분산 처리가 완성되었다.
			im.action(request, response);
		}
		else if(userR.equals("/P0822/Test02.kim")) {
			Imsi02 im = new Imsi02();
			im.execute(request, response);
		}
		
		//	컨트롤러가 실행되었다는 말은 비지니스 로직이 끝났다는 말이다.
		//	그러므로 화면을 만들어 주어야 한다.
		//	원래는 이 서블릿 클래스가 화면을 만들어 주어야 한다.
		//	서블릿 클래스에서 화면을 화면을 만들기는 매우 어렵다.
		//	그래서 다른 JSP 문서를 이용해서 대신 응답하기로 한다.
		//	다른 JSP 문서가 뷰이다.
		if(userR.equals("/P0822/Test01.kim")) {
			RequestDispatcher rd = 
					request.getRequestDispatcher("../P0822/Sam01.jsp");
			
			//	현재 요청
			//	http://localhost:8080/SunWeb/P0822/Test01.kim
			
			//	뷰 문서를 직접 호출할 경우에는
			//	http://localhost:8080/SunWeb/P0822/Sam01.jsp
			
			//	팁
			//		상대위치 찾는 가장 간단한 방법
			//		현재 위치는 자바적인 내용인지,  
			//		JSP 내용인지에 따라 달라진다.
			//		결론	도메인 부분은 언제나 공통이다.
			//				항상 도메인까지 찾아간 후 다음 내용을 기술하면 된다.
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
