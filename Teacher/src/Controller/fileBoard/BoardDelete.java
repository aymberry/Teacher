package Controller.fileBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.FileBoardDAO;

public class BoardDelete extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		String	strNo = req.getParameter("oriNo");
		int		oriNo = Integer.parseInt(strNo);
		String	pw = req.getParameter("pw");
		
		FileBoardDAO	dao = new FileBoardDAO();
		int		count = dao.deleteBoard(oriNo, pw);
		dao.close();
		req.setAttribute("CNT", count);
		req.setAttribute("oriNo", oriNo);
		return "../view/FileBoard/BoardDelete.jsp";
	}

}
