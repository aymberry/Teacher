package Controller.reBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;
import Util.PageUtil;

/*
 * 	이 클래스를 컨트롤러가 되기 위해서는
 * 	1.	상위 클래스를 상속 받아야 한다.
 * 	2.	함수를 오버라이드 해야 한다.
 * 
 */
public class BoardList extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	목록보기 요청이 왔으니 거기에 합당한 작업을 하도록 하자.
		//	모든 컨트롤러에서 가장 먼저할 일은 파라메터를 받는 일이다.
		//	(물론 없으면 생략해도 되지만)
		String	strPage = req.getParameter("nowPage");
		//	개발자가 반드시 고민해야 할 내용
		//	파라메터가 없으면 어떻게 할지를 반드시 고민해야 한다.
		//	예를 들어서 에러 페이지를 강제로 보여준다던지......
		//	(목적에 따라서 조금씩 그 방식이 달라진다.)
		
		//	여기서는 페이지가 없으면 강제로 1페이지를 보여주고 싶다.
		int		nowPage = 0;
		if(strPage == null || strPage.length() == 0) {
			//	파라메터가 없는 경우
			nowPage = 1;
		}
		else {
			//	파라메터가 있는 경우
			nowPage = Integer.parseInt(strPage);
		}
		
		//	페이지 이동 기능을 작성하기 위해서는 7가지 정보를 만들어서
		//	뷰에게 제공해야겠다.
		//	그중에서 2가지 정보는 반드시 알려주도록 약속했다.
		//		nowPage, totalCount
		//	이중 totalCount는 데이터베이스를 이용해야만 알 수 있다.
		ReBoardDAO	dao = new ReBoardDAO();
		int	totalCount = dao.getTotalCount(); 
		PageUtil	pInfo = new PageUtil(nowPage, totalCount);
		
		//	두번째로 할 일이 목적에 따라서 원하는 처리를 해주는 일이다.
		//	이것은 목적에 따라서 매번 달라진다.
		//	여기서는 데이터베이스에서 목록을 꺼내와서 보여주면 된다.
		//	(하지만 아직 디비에 데이터가 없으므로 잠시후에 하도록 하자.)
		ArrayList		list = dao.getBoardList();
		//	지금 목록 꺼내기 질의 명령은 전체 목록을 다 꺼낸것이다.
		//	근데...	화면에서 한 페이지당 10만 보여주어야 한다.
		//	전체 목록 중에서 현재 화면에 보여줄 데이터만 다시 뽑아서
		//	뷰에게 알려주어여 한다.
		//	1페이지		0 ~ 9만 알려주어야 하고
		//	2페이지		10 ~ 19만 ..
		//	3페이지		20 ~ 29만....
		
		//	필요한 데이터만 꺼낼 시작위치와 마지막 위치를 알아내고
		int		start = (nowPage - 1) * pInfo.listCount;
		int		end = start + pInfo.listCount - 1;
		//	마지막 위치가 데이터 개수보다 크면 데이터 개수로
		//	조절해 놓는다.
		//	근데...	0부터 시작하므로 -1을 해 주어야 한다.
		if(end >= list.size()) {
			end = list.size() - 1;
		}
		//	필요한 것만 뽑아서 다시 기억할 컬렉션을 준비한 후
		ArrayList rList = new ArrayList();
		for(int i = start; i <= end; i++) {
			rList.add(list.get(i));
		}
		dao.close();
		
		//	마지막으로 할 일
		//	뷰에게 알려줄 데이터를 4가지 방식중 한가지 이상을 이용해서
		//	모델을 만들어서 넘기고
		req.setAttribute("BLIST", rList);
		req.setAttribute("PINFO", pInfo);
		//	뷰를 선택한다.
		return "../view/ReBoard/BoardList.jsp";
	}
	//	노파심
	//		이 컨트롤러는 
	//		http://localhost:8080/SunWeb/ReBoard/BoardList.sun로 실행된다.
	//		뷰를 직접 부른다.
	//		http://localhost:8080/SubWeb/view/ReBoard/BoardList.jsp로 호출한다.
}
