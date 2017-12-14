package Controller.reBoard;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;

public class ModifyProc extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	파라메터 받고
		String	strNo = req.getParameter("oriNo");
		int		oriNo = Integer.parseInt(strNo);
		String	nowPage = req.getParameter("nowPage");
		String	title = req.getParameter("title");
		String	body = req.getParameter("body");
		String	password = req.getParameter("password");
		
		//	원하는 작업 처리하고
		//		디비에서 수정해야 한다.
		ReBoardDAO	dao = new ReBoardDAO();
		dao.updateBoard(oriNo, title, body, password);
		dao.close();
		
		req.setAttribute("NOWPAGE", nowPage);
		req.setAttribute("ORINO", oriNo);
		return "../view/ReBoard/ModifyProc.jsp";
	}
}
