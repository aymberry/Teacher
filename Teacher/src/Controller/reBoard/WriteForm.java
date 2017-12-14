package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import Util.SessionUtil;

public class WriteForm extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	파라메터 받고
		//	이번에는 없으므로 넘어가고.......
		
		//	원하는 작업을 수행한 후
		//	로그인을 한 사람만 글을 쓸 수 있도록 해 놓았다.
		//	근데 로그인을 하지 않은 사람이 요청하면?
		//	1.	아예 폼을 보여줄 때 로그인을 한 사람만 그 기능을
		//		이용할 수 있도록 조치하는 방법
		//	2.	요청을 일단 받고(컨트롤러를 실행하고)
		//		컨트롤러에서 로그인 검사를 해서 처리하는 방법
		
		//	실무에서는 두가지 모두다 사용하는 것을 원칙으로 한다.
		//	왜냐하면 주소를 치고 들어오는 경우가 발생하기 때문이다.
		
		//	이처럼 컨트롤러에서 특정 조건을 만족하는지 검사한 후
		//	내용을 제공하도록 하는 것을 "권한설정 검사" 라고 부른다.
		//	이작업은 빈번히 일어나는 작업이므로....
		
		//	아예 이 작업만 담당하는 기능을 따로 하나 만들고
		//	그 기능을 재 사용하도록 해보자.
		//	하나의 Util 클래스를 제작해서 사용해보자.
		
		//	로그인 했는지 권한 검사 하는 장면.....
		boolean	isLogin = SessionUtil.isLogin(req);
		if(isLogin == false) {
			//	로그인을 하지 않은 사람에게는 다른 뷰를 보여주도록 하자.
			return "../view/ReBoard/ImsiView.jsp";
		}
		
		//	모델을 생산하고
		//		여기서는 아무런 할 일이 없으므로 모델은 없고
		//	뷰를 선택한다.
		return "../view/ReBoard/WriteForm.jsp";
	}
}







