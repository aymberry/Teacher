package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;
import Util.SessionUtil;

public class ReplyWrite extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	이번것은 정책상 로그인을 한 사람만 처리하도록 했으므로....
		//	지난번 배운 방식에 의해서 
		//	로그인 검사 하고
		//	로그인을 하지 않은 경우에는 적절한 조치를 한다.
		//	(WriteForm.java 를 참고)
		
		
		
		//	파라메터 받자
		String	strNo = req.getParameter("oriNo");
		int		oriNo = Integer.parseInt(strNo);
		String	body = req.getParameter("body");
		String	pw = req.getParameter("pw");

		//	글쓴이는 로그인을 한 경우 처리하기로 했으므로
		//	세션에서 받아서 사용하도록 한다.
		String	writer = SessionUtil.getId(req);
		
		//	해야할 일은 데이터베이스에 댓글을 등록한다.
		ReBoardDAO	dao = new ReBoardDAO();
		dao.insertReply(oriNo, writer, body, pw);
		dao.close();
		
		//	비록 생산한 데이터는 없지만
		//	혹시라도 뷰에서 필요한 데이터가 있다면.....
		//	그 데이터는 자동으로 가지 못하므로..
		//	강제로 알려주어야 한다.
		
		//	이런 작업을 우리는 "파라메터 릴레이" 라고 부른다.
		
		//	지금은 뷰에서 원글의 번호를 알아야 다음 작업을 할 수 
		//	있는 상태가 된다.
		//	이처럼 다음 작업에서 필요한 데이터가 있으면....
		//	반드시 알려주어야 한다.
		req.setAttribute("ORINO", oriNo);
		
		return "../view/ReBoard/ReplyWrite.jsp";
	}
}




