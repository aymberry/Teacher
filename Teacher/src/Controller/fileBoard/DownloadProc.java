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
		//	할일
		//		디비에서 다운로드할 파일의 정보를 꺼낸다.
		FileBoardDAO	dao = new FileBoardDAO();
		FileBoardVO 	vo = dao.getFileInfo(fno);
		dao.close();
		
		//		그 파일을 클라이언트쪽으로 스트림방식을 이용해서 전송한다.
		//		==>		우리는 스트림방식으로 전송작업을 처리할 유틸리티 클래스를
		//				만들어서 처리할 예정이다.
		
		FileUtil.fileDownload(resp, vo.oriName, vo.saveName, vo.path);
		
		req.setAttribute("NOWPAGE", nowPage);
		return "";
	}
}
