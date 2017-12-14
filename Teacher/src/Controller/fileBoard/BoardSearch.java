package Controller.fileBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.SuperAction;
import DAO.FileBoardDAO;
import Util.PageUtil;
import Util.SessionUtil;
import Util.StringUtil;

public class BoardSearch extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		//	����
		//		�Ķ���� �ް�
		//		������
		//			�˻�â���� ���߸� ������ ��� ����ڰ� �Է��� ������ 
		//			���޵Ǿ�����.
		//			������ �˻� ����� �������� ������ ���� ����� ������
		//			�̶��� ������ �����͸� �ѱ��� ���ϹǷ� �����Ͱ� �սǵ� �� �ִ�.
		//		�˻��� �ϱ� ���ؼ��� ���? �������� �˾ƾ� �ϴµ�...
		//		���
		//		1.	�Ķ���� ������ ������� ����ؼ� �˷��ִ� ���
		//			(���� : �Ķ���Ͱ� �������� ���ŷ��� �ȴ�.)
		//		2.	���ǿ� ����� �� ����ϴ� ���
		//			��, ó�� �˻��� ��(������ ����ö�) ��𼭿� ��������
		//			���ǿ� ����� ���� �� ������ �̵� ����� ������
		//			���ǿ� ����� ���� ������ �̿��ؼ� ó���ϴ� ���
		//			(���� : ������ ������ �޸𸮸� �����ϴ� �����̹Ƿ�
		//					������ �����Ͱ� �������� ������ �޸𸮰� ���� �Ҹ�ȴ�.)
		//	
		//	1.	���� ������ �����͸� �޾ƺ���.
		String	kind = req.getParameter("kind");
		String	body = req.getParameter("body");
		String	strPage = req.getParameter("nowPage");
		
		//	2.	������ �����͸� ���� �� ���� ��찡 �߻��Ѵ�.
		//		���� ������ �����͸� ���� �� ������ ���ǿ��� �޾Ƽ�
		//		����ϵ��� �Ѵ�.
		//	������ ���ؼ� ������ �غ��� ����.
		HttpSession	session = SessionUtil.createSession(req);
		if(StringUtil.isNull(kind)) {
			kind = (String) session.getAttribute("KIND");
			body = (String) session.getAttribute("BODY");
		}
		//	3.	�������� �ٽ� ���� ���� ����ؼ� ���ǿ� ������ ���´�.
		session.setAttribute("KIND", kind);
		session.setAttribute("BODY", body);

		//	������ �̵������ ���ؼ� nowPage�� �˾Ƴ���.
		int		nowPage = 0;
		if(StringUtil.isNull(strPage)) {
			nowPage = 1;
		}
		else {
			nowPage = Integer.parseInt(strPage);
		}
		
		//		ó���ϰ�(��Ϻ����ϰ� ���� ����)
		//		1.	������ �̵� ����� ����� ���� ���� ����.
		//			1) ���� ������, 2) �� ������ ����
		FileBoardDAO		dao = new FileBoardDAO();
		int		total = dao.getSearchCount(kind, body);
		PageUtil	pInfo = new PageUtil(nowPage, total);
	
		//		2.	�˻� ����� ������ ����� ����.
		ArrayList	list = dao.getSearchList(kind, body);
		//			�̰��� ��ü �˻� ����̹Ƿ�
		//			���� ���������� ������ �����͸� ���� �̾Ƽ� �˷��־�� �Ѵ�.

		int		start = (nowPage - 1) * pInfo.listCount;
		ArrayList	rList = new ArrayList();		
		for(int i = start; i < 10 && i < list.size(); i++) {
			rList.add(list.get(i));
		}
		dao.close();
		//		�� ����
		req.setAttribute("PINFO", pInfo);
		req.setAttribute("SLIST", rList);
		//		�並 �θ���.
		return "../view/FileBoard/BoardSearch.jsp";
	}
}
