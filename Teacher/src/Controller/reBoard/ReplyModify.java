package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;

public class ReplyModify extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		//	�Ķ���� �ް�
		String		oriNo = req.getParameter("oriNo");
		String		strNo = req.getParameter("reNo");
		int			reNo = Integer.parseInt(strNo);
		String		body = req.getParameter("body");
		String		pw = req.getParameter("pw");
		
		//	���ϴ� ó���ϰ�
		ReBoardDAO	dao = new ReBoardDAO();
		dao.updateReply(reNo, body, pw);
		dao.close();

		//	�� ����
		//	������ �ʿ��� �Ķ���� ������ ���Ѿ� �Ѵ�.
		req.setAttribute("ORINO", oriNo);
		//	�� ȣ��
		return "../view/ReBoard/ReplyModify.jsp";
	}
}
