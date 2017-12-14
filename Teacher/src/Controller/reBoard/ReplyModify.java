package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;

public class ReplyModify extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		//	파라메터 받고
		String		oriNo = req.getParameter("oriNo");
		String		strNo = req.getParameter("reNo");
		int			reNo = Integer.parseInt(strNo);
		String		body = req.getParameter("body");
		String		pw = req.getParameter("pw");
		
		//	원하는 처리하고
		ReBoardDAO	dao = new ReBoardDAO();
		dao.updateReply(reNo, body, pw);
		dao.close();

		//	모델 생산
		//	원래는 필요한 파라메터 릴레이 시켜야 한다.
		req.setAttribute("ORINO", oriNo);
		//	뷰 호출
		return "../view/ReBoard/ReplyModify.jsp";
	}
}
