package Controller.fileBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;

public class WriteForm extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		//	할일
		//	글쓰기 폼을 보여주는 작업이므로 할일은 없고 폼만 보여주면 되는데....
		//	가끔 권한 검사가 필요할 경우가 있을것이다.
		
		//	예>		로그인을 하지 않으면 글쓰기를 못하게 한다던지....
		//			이 작업은 ReBoard게시판의 WriteForm.java 파일을
		//			참고로 해서 권한 검사 처리를 해주기 바란다.
		
		//	우리는 곧장 뷰만 불러주자.
		return "../view/FileBoard/WriteForm.jsp";
	}
}






