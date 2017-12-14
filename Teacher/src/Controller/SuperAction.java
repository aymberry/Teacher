package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 	이 파일은 모든 컨트롤러의 상위 클래스 역활을 할 클래스이다.
 * 	컨트롤러를 다형성 구현을 통해서 처리할 목적이다.
 */
public abstract class SuperAction {
	//	상위 클래스는 하위 클래스를 함수를 가지고 있어야 다형성 구현이 되므로...
	public abstract String action(HttpServletRequest req, HttpServletResponse resp);
}




