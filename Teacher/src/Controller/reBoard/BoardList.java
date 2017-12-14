package Controller.reBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.ReBoardDAO;
import Util.PageUtil;

/*
 * 	�� Ŭ������ ��Ʈ�ѷ��� �Ǳ� ���ؼ���
 * 	1.	���� Ŭ������ ��� �޾ƾ� �Ѵ�.
 * 	2.	�Լ��� �������̵� �ؾ� �Ѵ�.
 * 
 */
public class BoardList extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	��Ϻ��� ��û�� ������ �ű⿡ �մ��� �۾��� �ϵ��� ����.
		//	��� ��Ʈ�ѷ����� ���� ������ ���� �Ķ���͸� �޴� ���̴�.
		//	(���� ������ �����ص� ������)
		String	strPage = req.getParameter("nowPage");
		//	�����ڰ� �ݵ�� ����ؾ� �� ����
		//	�Ķ���Ͱ� ������ ��� ������ �ݵ�� ����ؾ� �Ѵ�.
		//	���� �� ���� �������� ������ �����شٴ���......
		//	(������ ���� ���ݾ� �� ����� �޶�����.)
		
		//	���⼭�� �������� ������ ������ 1�������� �����ְ� �ʹ�.
		int		nowPage = 0;
		if(strPage == null || strPage.length() == 0) {
			//	�Ķ���Ͱ� ���� ���
			nowPage = 1;
		}
		else {
			//	�Ķ���Ͱ� �ִ� ���
			nowPage = Integer.parseInt(strPage);
		}
		
		//	������ �̵� ����� �ۼ��ϱ� ���ؼ��� 7���� ������ ����
		//	�信�� �����ؾ߰ڴ�.
		//	���߿��� 2���� ������ �ݵ�� �˷��ֵ��� ����ߴ�.
		//		nowPage, totalCount
		//	���� totalCount�� �����ͺ��̽��� �̿��ؾ߸� �� �� �ִ�.
		ReBoardDAO	dao = new ReBoardDAO();
		int	totalCount = dao.getTotalCount(); 
		PageUtil	pInfo = new PageUtil(nowPage, totalCount);
		
		//	�ι�°�� �� ���� ������ ���� ���ϴ� ó���� ���ִ� ���̴�.
		//	�̰��� ������ ���� �Ź� �޶�����.
		//	���⼭�� �����ͺ��̽����� ����� �����ͼ� �����ָ� �ȴ�.
		//	(������ ���� ��� �����Ͱ� �����Ƿ� ����Ŀ� �ϵ��� ����.)
		ArrayList		list = dao.getBoardList();
		//	���� ��� ������ ���� ����� ��ü ����� �� �������̴�.
		//	�ٵ�...	ȭ�鿡�� �� �������� 10�� �����־�� �Ѵ�.
		//	��ü ��� �߿��� ���� ȭ�鿡 ������ �����͸� �ٽ� �̾Ƽ�
		//	�信�� �˷��־ �Ѵ�.
		//	1������		0 ~ 9�� �˷��־�� �ϰ�
		//	2������		10 ~ 19�� ..
		//	3������		20 ~ 29��....
		
		//	�ʿ��� �����͸� ���� ������ġ�� ������ ��ġ�� �˾Ƴ���
		int		start = (nowPage - 1) * pInfo.listCount;
		int		end = start + pInfo.listCount - 1;
		//	������ ��ġ�� ������ �������� ũ�� ������ ������
		//	������ ���´�.
		//	�ٵ�...	0���� �����ϹǷ� -1�� �� �־�� �Ѵ�.
		if(end >= list.size()) {
			end = list.size() - 1;
		}
		//	�ʿ��� �͸� �̾Ƽ� �ٽ� ����� �÷����� �غ��� ��
		ArrayList rList = new ArrayList();
		for(int i = start; i <= end; i++) {
			rList.add(list.get(i));
		}
		dao.close();
		
		//	���������� �� ��
		//	�信�� �˷��� �����͸� 4���� ����� �Ѱ��� �̻��� �̿��ؼ�
		//	���� ���� �ѱ��
		req.setAttribute("BLIST", rList);
		req.setAttribute("PINFO", pInfo);
		//	�並 �����Ѵ�.
		return "../view/ReBoard/BoardList.jsp";
	}
	//	���Ľ�
	//		�� ��Ʈ�ѷ��� 
	//		http://localhost:8080/SunWeb/ReBoard/BoardList.sun�� ����ȴ�.
	//		�並 ���� �θ���.
	//		http://localhost:8080/SubWeb/view/ReBoard/BoardList.jsp�� ȣ���Ѵ�.
}
