package P0822;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 	이처럼 컨트롤러는 일반 클래스로 제작하면 된다.
 * 
 * 	이 클래스는 스스로 실행되지 못하고
 * 	디스페치 서블릿에서 강제로 실행해야 하는 클래스이다.
 * 	==>		main()도 필요없다.
 * 
 * 	다만 누군가가 이 클래스를 실행해야 하므로 함수를 호출해야 한다.
 * 	==>		이 클래스 안에는 디스패치 서블릿이 호출할 함수가 만들어 져야한다.
 * 
 * 		이 함수는 웹 답게 사용하기 위해서는
 * 		웹의 기본인 	요청							request
 * 						응답처리를 하기 위해서		response를 필요로 한다.
 * 		(반드시 받으라는 말은 아니고 필요할것 같아서)
 * 
 * 	이후에는 일반 클래스를 만드는 기법으로 해결하면 된다.
 */
public class Imsi01 {

	public void action
		(HttpServletRequest request, HttpServletResponse response) {
		//	이 안에서 클라이언트가 요청한 내용을 처리하는
		//	비지니스 로직을 실행하면 된다.
		System.out.println("Test01요청에 의한 컨트롤러이다.");
	}
	
}








