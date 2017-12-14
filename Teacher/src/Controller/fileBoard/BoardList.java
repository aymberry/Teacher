package Controller.fileBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.FileBoardDAO;
import Util.PageUtil;
import Util.StringUtil;

public class BoardList extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		//	�Ķ���� �ް�
		String	strPage = req.getParameter("nowPage");
		int		nowPage = 0;
		if(StringUtil.isNull(strPage)) {
			nowPage = 1;
		}
		else {
			nowPage = Integer.parseInt(strPage);
		}
		//	�ʿ��� �۾��ϰ�
		//		1.	������ ���� ���
		//			�� ������ ������ �˾ƾ� �Ѵ�.(��� �̿��ؾ� �Ѵ�.)
		FileBoardDAO	dao = new FileBoardDAO();
		int		total = dao.getTotal();
		PageUtil	pInfo = new PageUtil(nowPage, total);
		
		//		2.	��� ��������
		ArrayList	list = dao.getBoardList();
		
		//	����
		//		������ ��� �Խù��� ����� �� ������ �� ��
		//		�� �������� �ʿ��� �Խù��� ���� �̾Ƽ� �信�� ������ �����̴�.
		//		����		���� ����� �����ϴ�
		//		����		�Խù��� ������ ������ �޸𸮰� �ſ� ��ȿ�����̴�.

		//		�츮�� �������� ���� �� ���������� �ʿ��� �Խù���
		//		������ ��Ŀ� ���ؼ� ������ �����̴�.
		//		����		���� ����� �ſ� �����ϴ�.
		//		����		�Խù��� ������ ���Ƶ� �� ���������� �ʿ��� �͸� �����Ƿ� �޸𸮰� �ſ� ȿ�����̴�.
		
		//		�ǹ������� ������ ������ �߽����� �ؼ�
		//		�ΰ��� ����� �����ؼ� ����Ѵ�.
		
		//	�� �������� �ʿ��� �����͸� ������ ���
		//		ArrayList(��ü �Խù�) �߿��� �� �������� �ʿ��� �Խù���
		//		���� ��ġ�� �˾Ƴ���.
		//		��>
		//			1������		0������ 9�������� ������ �Ѵ�.
		//			2������		10������ 19������ ������ �Ѵ�.
		int		start = (nowPage - 1) * pInfo.listCount;
		System.out.println(list.size());
		//		���� ��ġ�� �˾Ƴ���.
		//		�Ϲ������� ������ġ�� ������ġ + (10 - 1)�� �ϸ� �ȴ�.
		//		�ٵ�..	�������� 10���� ���� ���� ���ִ�.
		//		(�׷��Ƿ� �������� list�� ���� �����Ͱ����� ������ġ�� �ȴ�.)
		//		���������� �ʿ��� �Խù��� ���� ����� ����
		ArrayList	rList = new ArrayList();		
		for(int i = start; i < 10 && i < list.size(); i++) {
			//		�������ǽ��� 10���̰ų� ����� �������� ������
			//		�ߴ��ϼ���...
			rList.add(list.get(i));
		}
		dao.close();
		//	�� �����ؼ�
		req.setAttribute("PINFO", pInfo);
		req.setAttribute("FLIST", rList);
		
		//	�並 �θ���.
		return "../view/FileBoard/BoardList.jsp";
	}
}





