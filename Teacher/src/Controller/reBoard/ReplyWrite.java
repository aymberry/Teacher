package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;
import Util.SessionUtil;

public class ReplyWrite extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	�̹����� ��å�� �α����� �� ����� ó���ϵ��� �����Ƿ�....
		//	������ ��� ��Ŀ� ���ؼ� 
		//	�α��� �˻� �ϰ�
		//	�α����� ���� ���� ��쿡�� ������ ��ġ�� �Ѵ�.
		//	(WriteForm.java �� ����)
		
		
		
		//	�Ķ���� ����
		String	strNo = req.getParameter("oriNo");
		int		oriNo = Integer.parseInt(strNo);
		String	body = req.getParameter("body");
		String	pw = req.getParameter("pw");

		//	�۾��̴� �α����� �� ��� ó���ϱ�� �����Ƿ�
		//	���ǿ��� �޾Ƽ� ����ϵ��� �Ѵ�.
		String	writer = SessionUtil.getId(req);
		
		//	�ؾ��� ���� �����ͺ��̽��� ����� ����Ѵ�.
		ReBoardDAO	dao = new ReBoardDAO();
		dao.insertReply(oriNo, writer, body, pw);
		dao.close();
		
		//	��� ������ �����ʹ� ������
		//	Ȥ�ö� �信�� �ʿ��� �����Ͱ� �ִٸ�.....
		//	�� �����ʹ� �ڵ����� ���� ���ϹǷ�..
		//	������ �˷��־�� �Ѵ�.
		
		//	�̷� �۾��� �츮�� "�Ķ���� ������" ��� �θ���.
		
		//	������ �信�� ������ ��ȣ�� �˾ƾ� ���� �۾��� �� �� 
		//	�ִ� ���°� �ȴ�.
		//	��ó�� ���� �۾����� �ʿ��� �����Ͱ� ������....
		//	�ݵ�� �˷��־�� �Ѵ�.
		req.setAttribute("ORINO", oriNo);
		
		return "../view/ReBoard/ReplyWrite.jsp";
	}
}




