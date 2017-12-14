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
		//	파라메터 릴레이 용
		String	nowPage = req.getParameter("nowPage");
		
		//	할일
		//		글 수정을 위해서는 원글의 내용을 보여주어야 한다.
		//		디비에서 원글의 내용을 꺼내서 알려주어야 한다.
		ReBoardDAO	dao = new ReBoardDAO();
		ReBoardVO	vo = dao.getBoardView(oriNo);
		dao.close();
		
		//	모델 넘기고
		req.setAttribute("ORI", vo);
		req	.setAttribute("NOWPAGE", nowPage);
		return "../view/ReBoard/ModifyForm.jsp";
	}
}




