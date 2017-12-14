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
//	이부분은 어떤 요청이 왔을때 이 서블릿 클래스가 실행될지를 
//	선언하는 부분이다.

//	원래는 JSP 문서를 요청하면 그 JSP가 클래스로 변환되어서 실행되어야 하는데
//	JSP 문서가 없으므로 클라이언트는 무슨 문서를 요청할 지 모른다.
//	편법
//		강제로 클라이언트가 어떻게 요청하면 이 클래스가 실행되어야 할지를
//		서버에게 등록해서
//		클라이언트가 그렇게 요청하면 이 클래스 실행되도록 약속하는 부분이다.
@WebServlet("/P0821/Test01")
//	http://localhost:8080/SubWeb/P0821/Test01	로 요청하면 이 클래스가
//														실행되도록 약속한 부분이다.
//	주의
//		우리가 만든 여러개의 서블릿 클래스의 요청 내용이 중복되면 안된다.

//	서블릿 클래스가 되기 위해서는 HttpServlet 클래스를 상속 받아야 한다.
public class Test01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see Servlet#init(ServletConfig)
	 * 
	 * 	생성자 역활을 할 init 생존주기 함수이다.
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//	이 클래스가 처음 new 되는 순간 하고싶은 일이 있다면 
		//	만들어주면 된다.
		//	예>		데이터베이스 작업이 필요하면...
		//			드라이버 로딩, 컨넥션. Statement 생성은 필수이므로
		//			한번만 하도록 이곳에서 코딩하면 된다.
		
		System.out.println("나는 init 함수입니다.");
	}

	/**
	 * @see Servlet#destroy()
	 * 
	 * 	소멸자에 해당하는 함수
	 * 	
	 * 	이 함수는 이 서블릿 클래스가 메모리에서 제거되는 순간 실행되는 함수이다.
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		//	이 서블릿 클래스가 사용했던 자원을 닫아주는 작업이 필요하면
		//	이 부분에서 하면 될 것이다.
	}

	/*
	 * 	아래쪽에 있는 함수 2개가 서비스 함수이다.
	 * 
	 * 	요청 방식에 따라 둘 중 하나의 함수가 실행되어진다.
	 */
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	이제부터 필요한 작업(JSP) 작업은 이 함수 안에서 만들면 된다.
		System.out.println("나는 서비스 함수입니다.");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	혹시 POST 방식으로 요청하더라도 GET 함수를 처리하도록
		//	강제로 호출하는 부분이다.
		doGet(request, response);
	}

}
