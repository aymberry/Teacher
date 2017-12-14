package P0825;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;

public class Sample01 extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("나 실행되니");
		//	컨트롤러에서 뭔가를 처리한 후에 뷰에게 결과(데이터)를
		//	알려줄 필요가 있다.		이것을 우리은 Model이라고 한다.
		
		//	1.	데이터가 한개이면 그냥 그 데이터를 알려주면 된다.
		String		name = "박아지";
		req.setAttribute("UNAME", name);
		
		//	2.	다른 종류의 데이터가 있으면 VO로 묶어서 알려준다.
		TestVO	vo = new TestVO();
		vo.name = "박빛나라우리나라";
		vo.title = "나는 제목입니다.";
		vo.hit = 100;
		
		req.setAttribute("DATA", vo);
		
		//	3.	같은 종류의 데이터가 여러개 존재하는 경우
		//		컬렉션으로 묶어서 알려준다.
		
		ArrayList	list = new ArrayList();
		list.add("아이유");
		list.add("송혜교");
		list.add("김혜수");
		list.add("송지효");
		list.add("김태연");
		
		req.setAttribute("LIST", list);
		
		//	여러종류의 데이터가 다시 여러개 있는 경우에는
		//	여러종류의 데이터를 VO로 묶고
		//	그것을 컬렉션으로 묶어서 알려준다.
		TestVO	vo1 = new TestVO();
		vo1.name = "박나라";
		vo1.title = "나는 제목입니다.1";
		vo1.hit = 100;
		
		TestVO	vo2 = new TestVO();
		vo2.name = "장나라";
		vo2.title = "나는 제목입니다.2";
		vo2.hit = 100;
		
		ArrayList	tempList = new ArrayList();
		tempList.add(vo1);
		tempList.add(vo2);
		
		req.setAttribute("MULTI", tempList);
		
		return "../P0825/Imsi01.jsp";
	}
}




