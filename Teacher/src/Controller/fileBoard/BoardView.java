package Controller.fileBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.SuperAction;
import DAO.FileBoardDAO;
import Util.SessionUtil;
import VO.FileBoardVO;

public class BoardView extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		String strNo = req.getParameter("oriNo");
		int		oriNo = Integer.parseInt(strNo);
		String	nowPage = req.getParameter("nowPage");
		
		//	디비에서 게시물 정보를 꺼낸다.
		FileBoardDAO	dao = new FileBoardDAO();
		
		//	조회수 증가를 시키자.
		//	나는 한번본 글은 조회수 증가를 금지하고자한다.
		//	이번에는 세션을 이용한 조회수 증가를 방지하고자 한다.
		//	원리
		//		한번본 글 번호를 세션에 기록해 놓은 후
		//		나중에 세션에 있는 글번호를 다시 보게되면 조회수 증가를
		//		하지 못하도록 방지한다.
		boolean	isHit = false;		//	조회수 증가를 할지말지를 결정하는 변수
										//	true 증가시키고, false이면 증가하지 못하게 한다.
		//	약속	세션에 "FHIT" 라는 키값으로 이미 본 글번호를
		//			기억해 놓도록 약속하자.
		HttpSession session = SessionUtil.createSession(req);
		ArrayList	hitList = (ArrayList) session.getAttribute("FHIT");
		
		if(hitList == null) {
			//	이 사람은 한번도 글을 본적이 없다.
			//	지금글도 안봤다는 말이다.
			isHit = true;
			//	이제 이 글번호를 세션에 기록해 놓자.
			ArrayList temp = new ArrayList();
			temp.add(oriNo);
			session.setAttribute("FHIT", temp);
		}
		else {
			//	뭔가 글을 봤어요
			//	지금은 보았는지 확인한다.
			if(hitList.contains(oriNo)) {
				//	이사람은 이글을 두번째 보는것이므로 조회수 증가하면 안되요
				isHit = false;
			}
			else {
				//	이 사람은 다른글은 보았는데 지금글은 처음이다.
				isHit = true;
				hitList.add(oriNo);
			}
		}
		
		if(isHit == true) {
			dao.updateHit(oriNo);
		}
		
		FileBoardVO vo = dao.getBoardView(oriNo);
		ArrayList 	list = dao.getFileList(oriNo);
		dao.close();
		
		req.setAttribute("DATA", vo);
		req.setAttribute("FLIST", list);
		req.setAttribute("NOWPAGE", nowPage);
		return "../view/FileBoard/BoardView.jsp";
	}
}
