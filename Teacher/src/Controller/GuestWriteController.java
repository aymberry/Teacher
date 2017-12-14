package Controller;

import javax.servlet.http.*;

import DAO.GuestDAO2;

public class GuestWriteController  implements DolSuper {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		String	title = req.getParameter("title");
		String body = req.getParameter("body");
		
		GuestDAO2	dao = new GuestDAO2();
		dao.insertGuest(title, body);
		dao.close();
		
		return "../view/Guest/GuestWrite.jsp";
	}
}
