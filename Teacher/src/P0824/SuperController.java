package P0824;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 	이 클래스는 모든 컨트롤러 클래스의 상위 역활을 할 클래스이다.
 */
public abstract class SuperController {
	//	이 클래스는 계층 추적을 가능하도록 하기 위해서
	//	각각의 컨트롤러 클래스의 함수를 가지고 있어야 한다.
	public abstract String action(HttpServletRequest req, HttpServletResponse resp);
		//	이 함수는 하는일은 없고
		//	다만 계층 추적을 하기 위해서 상위 클래스에 그 함수가
		//	있어야 한다... 조건을 만족시키기 위해서....
}





