package Controller.reBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.SuperAction;
import DAO.ReBoardDAO;
import VO.ReBoardVO;

public class BoardView extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	1.	파라메터 받는다.
		//		보고싶은 글의 번호가 오기로 했으므로..... 받자
		String		strNo = req.getParameter("oriNo");
		int			oriNo = Integer.parseInt(strNo);
		String		nowPage = req.getParameter("nowPage");
		
		//	세션을 이용해야 할 필요가 있으므로 일단 세션을 받아놓자
		HttpSession	session = req.getSession();
		
		//	약속
		//		이 클라이언트가 본 게시물은 ArrayList에 보관해 놓기로 하고
		//		이 ArrayList를 세션에 "HITS" 라는 키값으로 등록해 놓기로 하자.
		
		//	2.	원하는 작업 한다.
		//		원글의 상세 내용을 꺼내 주어야 한다.
		//		상세내용을 꺼낼라면 디비 처리를 해야하고 질의 명령이 필요하다.
		ReBoardDAO	dao = new ReBoardDAO();
		
		//	조회수 증가 방지 기법	시작	=================
		//	1.	세션에 등록된 이미본 글 번호를 꺼내자.
		ArrayList	hitList = (ArrayList) session.getAttribute("HITS");
		boolean	isHit = false;		//	조회수 증가 할지 말지를 결정하는 변수
										//	참이면 증가시키고 거짓이면 증가시키지 않는다.
		if(hitList == null) {
			//	이 사람은 아직 한번도 글을 본적이 없어서
			//	세션에 그 데이터가 남아있지 않은 경우이다.
			
			//	그러므로 이 클라이언트는 조회수를 증가시켜 주어야 하고
			isHit = true;
			//	수첩에 처음으로 본 글번호를 등록해 놓는다.
			ArrayList	tempList = new ArrayList();
			tempList.add(oriNo);
			session.setAttribute("HITS", tempList);
		}
		else {
			//	이 클라이언트는 이미 본 글들이 있다는 말이다.
			//	수첩에 지금 보고싶은 글 번호가 이미 등록되었는지 확인한다.
			if(hitList.contains(oriNo)) {
				//	있어요
				isHit = false;
			}
			else {
				//	없어요
				isHit = true;
				hitList.add(oriNo);
			}
		}
		//	조회수 증가 방지 기법	끝	=================
		
		//	먼저 조회수를 증가시킨 후 꺼내자
		if(isHit == true) {
			dao.updateHit(oriNo);
		}
		
		ReBoardVO vo = dao.getBoardView(oriNo);
 
		//		댓글의 내용을 꺼내 주어야 한다.
		//		디비에서 꺼내야한다.
		ArrayList	list = dao.getReply(oriNo);
		
		dao.close();
		
		//	3.	모델 생산한다.
		req.setAttribute("VIEW", vo);
		req.setAttribute("RLIST", list);
		req.setAttribute("NOWPAGE", nowPage);
		//	4.	뷰 호출한다.
		return "../view/ReBoard/BoardView.jsp";
	}
}




