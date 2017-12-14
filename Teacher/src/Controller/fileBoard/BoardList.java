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
		//	파라메터 받고
		String	strPage = req.getParameter("nowPage");
		int		nowPage = 0;
		if(StringUtil.isNull(strPage)) {
			nowPage = 1;
		}
		else {
			nowPage = Integer.parseInt(strPage);
		}
		//	필요한 작업하고
		//		1.	페이지 나눔 기능
		//			총 데이터 개수를 알아야 한다.(디비를 이용해야 한다.)
		FileBoardDAO	dao = new FileBoardDAO();
		int		total = dao.getTotal();
		PageUtil	pInfo = new PageUtil(nowPage, total);
		
		//		2.	목록 꺼내오고
		ArrayList	list = dao.getBoardList();
		
		//	참고
		//		지금은 모든 게시물의 목록을 다 꺼내서 그 중
		//		그 페이지에 필요한 게시물만 따로 뽑아서 뷰에게 전달할 예정이다.
		//		장점		질의 명령이 간단하다
		//		단점		게시물의 개수가 많으면 메모리가 매우 비효율적이다.

		//		우리가 스프링에 들어가면 그 페이지에서 필요한 게시물만
		//		꺼내는 방식에 대해서 공부할 예정이다.
		//		단점		질의 명령이 매우 복잡하다.
		//		장점		게시물의 개수가 많아도 그 페이지에서 필요한 것만 꺼내므로 메모리가 매우 효율적이다.
		
		//		실무에서도 데이터 개수를 중심으로 해서
		//		두가지 방식을 병행해서 사용한다.
		
		//	그 페이지에 필요한 데이터만 꺼내는 방법
		//		ArrayList(전체 게시물) 중에서 그 페이지에 필요한 게시물의
		//		시작 위치를 알아낸다.
		//		예>
		//			1페이지		0번부터 9번까지를 꺼내야 한다.
		//			2페이지		10번부터 19까지를 꺼내야 한다.
		int		start = (nowPage - 1) * pInfo.listCount;
		System.out.println(list.size());
		//		종료 위치를 알아낸다.
		//		일반적으로 종료위치는 시작위치 + (10 - 1)을 하면 된다.
		//		근데..	마지막은 10개가 되지 않을 수있다.
		//		(그러므로 마지막은 list가 가진 데이터개수가 종료위치가 된다.)
		//		그페이지에 필요한 게시물만 따로 기억할 변수
		ArrayList	rList = new ArrayList();		
		for(int i = start; i < 10 && i < list.size(); i++) {
			//		최종조건식이 10개이거나 목록의 개수보다 많으면
			//		중단하세요...
			rList.add(list.get(i));
		}
		dao.close();
		//	모델 생산해서
		req.setAttribute("PINFO", pInfo);
		req.setAttribute("FLIST", rList);
		
		//	뷰를 부른다.
		return "../view/FileBoard/BoardList.jsp";
	}
}





