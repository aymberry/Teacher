package Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import VO.MemberVO;

/*
 * 	이 클래스는 세션을 이용해야 하는 모든 작업을 편하게 도와주기 위한
 * 	각종 함수들로 구성된 Util 클래스이다.
 */
public class SessionUtil {
	//	로그인을 한 사람인지를 검사해서 알려주는 Util 함수
	//	참고	우리는 로그인을 한 사람은 세션에 USER 라는 키값으로
	//			로그인한 사람의 정보를 기록해 놓기로 약속했다.
	public static boolean isLogin(HttpServletRequest req) {
		//	static 인 이유					new 시키기 싫어서
		//	반환값이 boolean인 이유		로그인 결과를 알려주기 위해서
		//									true		한사람
		//									false		안한사람
		//	매개변수가 req인 이유		세션을 만들기 위해서는 req가 필요하므로.
		
		HttpSession	session = req.getSession();
		if(session.getAttribute("USER") == null) {
			//	로그인 안한사람
			return false;
		}
		else {
			//	로그인 한 사람
			return true;
		}
	}
	
	//	로그인 한 사람의 id를 알려주는 함수
	public static String getId(HttpServletRequest req) {
		HttpSession session = req.getSession();
		MemberVO mVO = (MemberVO) session.getAttribute("USER");
		String		id = mVO.getId();
		
		return id;
	}
	
	//	한말씀
	//		프로젝트에서 고민할 사항 중 하나가
	//		이처럼 각자가 작업하는 도중 로그인 정보가 필요한 
	//		경우가 발생할 것이다.
	
	//		그르므로...
	//		로그인을 하면 어떤 정보를 세션에 기록할지 정해야 하고
	//		이것을 어떤 방식으로 저장할지도 정해야 하고
	//		어떤 키값으로 저장할지도 정해야 할 것이다.
	
	//	예>			session.setAttribute("ID", "nasundol");
	//				session.setAttribute("NICK", "나선돌");
	//	처럼 하나씩 따로 저장하겠다....
	
	//	예>			MemberVO mVO = new MemberVO();
	//				mVO.id = "isundol";
	//				mVO.nick = "나선돌";
	//				session.setAttribute("USER", mVO);
	//	처럼 하나로 여러정보를 묶어서 저장하겠다....
	
	/*
	 * 	세션이 필요하면 세션을 만들어줄 함수
	 */
	public static HttpSession createSession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		return session;
	}
}







