package Controller.fileBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.SuperAction;
import DAO.FileBoardDAO;
import Util.PageUtil;
import Util.SessionUtil;
import Util.StringUtil;

public class BoardSearch extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		//	할일
		//		파라메터 받고
		//		문제점
		//			검색창에서 단추를 누르면 당근 사용자가 입력한 내용이 
		//			전달되어진다.
		//			하지만 검색 결과이 많아져서 페이지 나눔 기능이 있으면
		//			이때는 폼에서 데이터를 넘기지 못하므로 데이터가 손실될 수 있다.
		//		검색을 하기 위해서는 어디서? 무엇을을 알아야 하는데...
		//		방법
		//		1.	파라메터 릴레이 방식으로 계속해서 알려주는 방식
		//			(단점 : 파라메터가 많아지면 번거럽게 된다.)
		//		2.	세션에 등록한 후 사용하는 방법
		//			즉, 처음 검색할 때(폼에서 날라올때) 어디서와 무엇을을
		//			세션에 기록해 놓은 후 페이지 이동 기능이 있으면
		//			세션에 기록해 놓은 내용을 이용해서 처리하는 방법
		//			(단점 : 세션은 서버의 메모리를 차지하는 개념이므로
		//					세션의 데이터가 많아지면 서버의 메모리가 많이 소모된다.)
		//	
		//	1.	먼저 폼에서 데이터를 받아본다.
		String	kind = req.getParameter("kind");
		String	body = req.getParameter("body");
		String	strPage = req.getParameter("nowPage");
		
		//	2.	폼에서 데이터를 받을 수 없는 경우가 발생한다.
		//		만약 폼에서 데이터를 받을 수 없으면 세션에서 받아서
		//		사용하도록 한다.
		//	만약을 위해서 세션을 준비해 놓자.
		HttpSession	session = SessionUtil.createSession(req);
		if(StringUtil.isNull(kind)) {
			kind = (String) session.getAttribute("KIND");
			body = (String) session.getAttribute("BODY");
		}
		//	3.	다음번에 다시 원할 때를 대비해서 세션에 보관해 놓는다.
		session.setAttribute("KIND", kind);
		session.setAttribute("BODY", body);

		//	페이지 이동기능을 위해서 nowPage도 알아놓자.
		int		nowPage = 0;
		if(StringUtil.isNull(strPage)) {
			nowPage = 1;
		}
		else {
			nowPage = Integer.parseInt(strPage);
		}
		
		//		처리하고(목록보기하고 거의 동일)
		//		1.	페이지 이동 기능을 만들기 위한 정보 생산.
		//			1) 현재 페이지, 2) 총 데이터 개수
		FileBoardDAO		dao = new FileBoardDAO();
		int		total = dao.getSearchCount(kind, body);
		PageUtil	pInfo = new PageUtil(nowPage, total);
	
		//		2.	검색 결과를 보여줄 목록을 생산.
		ArrayList	list = dao.getSearchList(kind, body);
		//			이것은 전체 검색 결과이므로
		//			현재 페이지에서 보여줄 데이터만 따로 뽑아서 알려주어야 한다.

		int		start = (nowPage - 1) * pInfo.listCount;
		ArrayList	rList = new ArrayList();		
		for(int i = start; i < 10 && i < list.size(); i++) {
			rList.add(list.get(i));
		}
		dao.close();
		//		모델 생산
		req.setAttribute("PINFO", pInfo);
		req.setAttribute("SLIST", rList);
		//		뷰를 부른다.
		return "../view/FileBoard/BoardSearch.jsp";
	}
}
