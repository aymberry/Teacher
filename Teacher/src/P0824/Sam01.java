package P0824;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 	실제 컨트롤러 클래스는 다형성 구현을 하기로 약속했으므로
 * 	반드시 상위 클래스를 상속 받아서 제작하도록 한다.
 * 
 * 	상위 클래스가 가진 추상 함수를 오버라이드 해 놓는다.
 */
public class Sam01 extends SuperController {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("1번 컨트롤라");
		
		//	이것은 요청에 따라서 실제 일을 하는 컨트롤러이다.
		//	이 컨트롤러가 일을 마친후 약속하자.
		//	나 다음은 ??? 입니다. 를 알려주기로....
		
		//	 이 컨트롤러가 생산한 데이터가 만약 "홍길동" 이라면.....
		//	이것을 뷰에게 알려주는 방법은....
		//	request 영역에 넣어주기만 하면 된다.
		//	1.	데이터만 존재하는 경우 처리 방식
		String	name = "홍길동";
		//	Model은 request 영역에 넣기만 하면
		//	뷰에서 언제든지 꺼내서 사용할 수 있게 된다.
		req	.setAttribute("UNAME", name);
		

		//	2.	여러 종류의 데이터가 존재하는 경우 처리방식
		ImsiVO		vo = new ImsiVO();
		vo.name = "홍길동";
		vo.title = "나는 제목이다.";
		vo.hit = 100;
		
		req.setAttribute("BOARDVIEW", vo);
		
		//	3.	같은 종류의 데이터가 여러개 존재하는 경우 처리방식
		ArrayList	list = new ArrayList();
		list.add("뉴스제목 1");
		list.add("뉴스제목 2");
		list.add("뉴스제목 3");
		list.add("뉴스제목 4");
		list.add("뉴스제목 5");
		
		req.setAttribute("NEWSLIST", list);
		
		//	4.	여러 종류의 데이터가 여러줄 존재하는 경우 처리방식
		ArrayList		list1 = new ArrayList();
		for(int i = 0; i < 5; i++) {		//	필요한 줄만큼 반복해서
			ImsiVO vo1 = new ImsiVO();
			//	vo에 필요한 데이터 입력하고(2번 참고)
			list1.add(vo1);
		}
		req.setAttribute("BOARDLIST", list1);
		
		
//		if(조건) {
			return "../P0824/ImsiView01.jsp";
//		}
//		else {
//			return "../P0824/ImsiView007.jsp";
//		}
	}
}





