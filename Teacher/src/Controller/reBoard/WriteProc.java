package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;
import Util.SessionUtil;

public class WriteProc extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	��Ʈ�ѷ��� �⺻ �۾�
		//	1.	�Ķ���� �޴´�.
		String	title = req.getParameter("title");
		String	body = req.getParameter("body");
		String	pw = req.getParameter("password");
		//		�ʿ��ϴٸ� �Ķ���Ͱ� ����� �Դ��� �����Ѵ�.
		
		//	2.	�ʿ��� �۾��Ѵ�.
		//		�����ͺ��̽��� �Խù��� ����ϴ� �۾��̴�.
		//		�����ͺ��̽� �۾��� �ַ� DAO  Ŭ������ �ϱ�� ��ӵǾ��ִ�.
		//		�츮�� DAO.ReBoardDAO.java�� ����
		//		�Խù��� ���õ� ��� �۾��� ���þ� �ϱ�� ����.
		
		//	�����ͺ��̽��� ������ ����ϱ� ���ؼ���
		//	�����ڰ� �ݵ�� ����� ������ �ִ�.
		//	�����ͺ��̽� ��Ͽ� �ʿ��� �����Ͱ� �غ�Ǿ��°�?
		//	��, ����� ������ ������ NullPointException�� �� ��
		//	�ֱ� �����̴�.
		//	���� ������ �����ζ� ��� �ؼ����� �������
		//	����� ���� �Ѵ�.
		
		//	�츮�� title, body, pw�� �غ�Ǿ� �ִµ�...
		//	�۾��̰� �������� �ʴ´�.
		//	�츮�� �۾��̴� ���ǿ��� �˾Ƴ��� �� ���̴�.
		//	���� Util �ȿ� �α����� ����� id�� �˷��ִ� �Լ��� �ϳ�
		//	����� �̰��� �̿��� ����.
		
		String	id = SessionUtil.getId(req);
		
		ReBoardDAO dao = new ReBoardDAO();
		dao.insertBoard(id, title, body, pw);
		dao.close();
		
		
		//	3.	�� �����Ѵ�.
		//	4.	�� ȣ���Ѵ�.
		return "../view/ReBoard/WriteProc.jsp";
	}
}



