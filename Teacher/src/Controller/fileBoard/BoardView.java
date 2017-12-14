package Controller.fileBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.SuperAction;
import DAO.FileBoardDAO;
import Util.SessionUtil;
import VO.FileBoardVO;

public class BoardView extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		String strNo = req.getParameter("oriNo");
		int		oriNo = Integer.parseInt(strNo);
		String	nowPage = req.getParameter("nowPage");
		
		//	��񿡼� �Խù� ������ ������.
		FileBoardDAO	dao = new FileBoardDAO();
		
		//	��ȸ�� ������ ��Ű��.
		//	���� �ѹ��� ���� ��ȸ�� ������ �����ϰ����Ѵ�.
		//	�̹����� ������ �̿��� ��ȸ�� ������ �����ϰ��� �Ѵ�.
		//	����
		//		�ѹ��� �� ��ȣ�� ���ǿ� ����� ���� ��
		//		���߿� ���ǿ� �ִ� �۹�ȣ�� �ٽ� ���ԵǸ� ��ȸ�� ������
		//		���� ���ϵ��� �����Ѵ�.
		boolean	isHit = false;		//	��ȸ�� ������ ���������� �����ϴ� ����
										//	true ������Ű��, false�̸� �������� ���ϰ� �Ѵ�.
		//	���	���ǿ� "FHIT" ��� Ű������ �̹� �� �۹�ȣ��
		//			����� ������ �������.
		HttpSession session = SessionUtil.createSession(req);
		ArrayList	hitList = (ArrayList) session.getAttribute("FHIT");
		
		if(hitList == null) {
			//	�� ����� �ѹ��� ���� ������ ����.
			//	���ݱ۵� �Ⱥôٴ� ���̴�.
			isHit = true;
			//	���� �� �۹�ȣ�� ���ǿ� ����� ����.
			ArrayList temp = new ArrayList();
			temp.add(oriNo);
			session.setAttribute("FHIT", temp);
		}
		else {
			//	���� ���� �þ��
			//	������ ���Ҵ��� Ȯ���Ѵ�.
			if(hitList.contains(oriNo)) {
				//	�̻���� �̱��� �ι�° ���°��̹Ƿ� ��ȸ�� �����ϸ� �ȵǿ�
				isHit = false;
			}
			else {
				//	�� ����� �ٸ����� ���Ҵµ� ���ݱ��� ó���̴�.
				isHit = true;
				hitList.add(oriNo);
			}
		}
		
		if(isHit == true) {
			dao.updateHit(oriNo);
		}
		
		FileBoardVO vo = dao.getBoardView(oriNo);
		ArrayList 	list = dao.getFileList(oriNo);
		dao.close();
		
		req.setAttribute("DATA", vo);
		req.setAttribute("FLIST", list);
		req.setAttribute("NOWPAGE", nowPage);
		return "../view/FileBoard/BoardView.jsp";
	}
}
