package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;

public class ReCommen extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		String	strNo = req.getParameter("reNo");
		int		reNo = Integer.parseInt(strNo);
		String	oriNo = req.getParameter("oriNo");
		String	kind = req.getParameter("kind");
		
		//	디비에 좋아요 나빠요를 처리한다.
		ReBoardDAO	dao = new ReBoardDAO();
		dao.reCommen(kind, reNo);
		dao.close();
		
		req.setAttribute("ORINO", oriNo);
		return "../view/ReBoard/ReCommen.jsp";
	}
}



