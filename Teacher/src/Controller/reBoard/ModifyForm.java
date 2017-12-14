package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;
import VO.ReBoardVO;

public class ModifyForm extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		String	strNo = req.getParameter("oriNo");
		int		oriNo = Integer.parseInt(strNo);
		//	�Ķ���� ������ ��
		String	nowPage = req.getParameter("nowPage");
		
		//	����
		//		�� ������ ���ؼ��� ������ ������ �����־�� �Ѵ�.
		//		��񿡼� ������ ������ ������ �˷��־�� �Ѵ�.
		ReBoardDAO	dao = new ReBoardDAO();
		ReBoardVO	vo = dao.getBoardView(oriNo);
		dao.close();
		
		//	�� �ѱ��
		req.setAttribute("ORI", vo);
		req	.setAttribute("NOWPAGE", nowPage);
		return "../view/ReBoard/ModifyForm.jsp";
	}
}




