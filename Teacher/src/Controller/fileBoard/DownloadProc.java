package Controller.fileBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import DAO.FileBoardDAO;
import Util.FileUtil;
import VO.FileBoardVO;

public class DownloadProc extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		String	strNo = req.getParameter("fno");
		int		fno = Integer.parseInt(strNo);
		String	nowPage = req.getParameter("nowPage");
		//	����
		//		��񿡼� �ٿ�ε��� ������ ������ ������.
		FileBoardDAO	dao = new FileBoardDAO();
		FileBoardVO 	vo = dao.getFileInfo(fno);
		dao.close();
		
		//		�� ������ Ŭ���̾�Ʈ������ ��Ʈ������� �̿��ؼ� �����Ѵ�.
		//		==>		�츮�� ��Ʈ��������� �����۾��� ó���� ��ƿ��Ƽ Ŭ������
		//				���� ó���� �����̴�.
		
		FileUtil.fileDownload(resp, vo.oriName, vo.saveName, vo.path);
		
		req.setAttribute("NOWPAGE", nowPage);
		return "";
	}
}
