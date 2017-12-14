package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;
import Util.SessionUtil;

public class WriteProc extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	컨트롤러의 기본 작업
		//	1.	파라메터 받는다.
		String	title = req.getParameter("title");
		String	body = req.getParameter("body");
		String	pw = req.getParameter("password");
		//		필요하다면 파라메터가 제대로 왔는지 점검한다.
		
		//	2.	필요한 작업한다.
		//		데이터베이스에 게시물을 등록하는 작업이다.
		//		데이터베이스 작업은 주로 DAO  클래스가 하기로 약속되어있다.
		//		우리는 DAO.ReBoardDAO.java를 만들어서
		//		게시물에 관련된 디비 작업을 도맡아 하기로 하자.
		
		//	데이터베이스에 뭔가를 기록하기 위해서는
		//	개발자가 반드시 고민할 사항이 있다.
		//	데이터베이스 기록에 필요한 데이터가 준비되었는가?
		//	즉, 기록한 정보가 없으면 NullPointException이 날 수
		//	있기 때문이다.
		//	만약 없으면 강제로라도 어떻게 해서든지 어거지라도
		//	만들어 내야 한다.
		
		//	우리는 title, body, pw는 준비되어 있는데...
		//	글쓴이가 존재하지 않는다.
		//	우리는 글쓴이는 세션에서 알아내면 될 것이다.
		//	세션 Util 안에 로그인한 사람의 id를 알려주는 함수를 하나
		//	만들고 이것을 이용해 보자.
		
		String	id = SessionUtil.getId(req);
		
		ReBoardDAO dao = new ReBoardDAO();
		dao.insertBoard(id, title, body, pw);
		dao.close();
		
		
		//	3.	모델 생산한다.
		//	4.	뷰 호출한다.
		return "../view/ReBoard/WriteProc.jsp";
	}
}



