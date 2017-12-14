package Controller.reBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.SuperAction;
import DAO.ReBoardDAO;
import VO.ReBoardVO;

public class BoardView extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	1.	�Ķ���� �޴´�.
		//		������� ���� ��ȣ�� ����� �����Ƿ�..... ����
		String		strNo = req.getParameter("oriNo");
		int			oriNo = Integer.parseInt(strNo);
		String		nowPage = req.getParameter("nowPage");
		
		//	������ �̿��ؾ� �� �ʿ䰡 �����Ƿ� �ϴ� ������ �޾Ƴ���
		HttpSession	session = req.getSession();
		
		//	���
		//		�� Ŭ���̾�Ʈ�� �� �Խù��� ArrayList�� ������ ����� �ϰ�
		//		�� ArrayList�� ���ǿ� "HITS" ��� Ű������ ����� ����� ����.
		
		//	2.	���ϴ� �۾� �Ѵ�.
		//		������ �� ������ ���� �־�� �Ѵ�.
		//		�󼼳����� ������� ��� ó���� �ؾ��ϰ� ���� ����� �ʿ��ϴ�.
		ReBoardDAO	dao = new ReBoardDAO();
		
		//	��ȸ�� ���� ���� ���	����	=================
		//	1.	���ǿ� ��ϵ� �̹̺� �� ��ȣ�� ������.
		ArrayList	hitList = (ArrayList) session.getAttribute("HITS");
		boolean	isHit = false;		//	��ȸ�� ���� ���� ������ �����ϴ� ����
										//	���̸� ������Ű�� �����̸� ������Ű�� �ʴ´�.
		if(hitList == null) {
			//	�� ����� ���� �ѹ��� ���� ������ ���
			//	���ǿ� �� �����Ͱ� �������� ���� ����̴�.
			
			//	�׷��Ƿ� �� Ŭ���̾�Ʈ�� ��ȸ���� �������� �־�� �ϰ�
			isHit = true;
			//	��ø�� ó������ �� �۹�ȣ�� ����� ���´�.
			ArrayList	tempList = new ArrayList();
			tempList.add(oriNo);
			session.setAttribute("HITS", tempList);
		}
		else {
			//	�� Ŭ���̾�Ʈ�� �̹� �� �۵��� �ִٴ� ���̴�.
			//	��ø�� ���� ������� �� ��ȣ�� �̹� ��ϵǾ����� Ȯ���Ѵ�.
			if(hitList.contains(oriNo)) {
				//	�־��
				isHit = false;
			}
			else {
				//	�����
				isHit = true;
				hitList.add(oriNo);
			}
		}
		//	��ȸ�� ���� ���� ���	��	=================
		
		//	���� ��ȸ���� ������Ų �� ������
		if(isHit == true) {
			dao.updateHit(oriNo);
		}
		
		ReBoardVO vo = dao.getBoardView(oriNo);
 
		//		����� ������ ���� �־�� �Ѵ�.
		//		��񿡼� �������Ѵ�.
		ArrayList	list = dao.getReply(oriNo);
		
		dao.close();
		
		//	3.	�� �����Ѵ�.
		req.setAttribute("VIEW", vo);
		req.setAttribute("RLIST", list);
		req.setAttribute("NOWPAGE", nowPage);
		//	4.	�� ȣ���Ѵ�.
		return "../view/ReBoard/BoardView.jsp";
	}
}




