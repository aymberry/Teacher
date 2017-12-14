package Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import VO.MemberVO;

/*
 * 	�� Ŭ������ ������ �̿��ؾ� �ϴ� ��� �۾��� ���ϰ� �����ֱ� ����
 * 	���� �Լ���� ������ Util Ŭ�����̴�.
 */
public class SessionUtil {
	//	�α����� �� ��������� �˻��ؼ� �˷��ִ� Util �Լ�
	//	����	�츮�� �α����� �� ����� ���ǿ� USER ��� Ű������
	//			�α����� ����� ������ ����� ����� ����ߴ�.
	public static boolean isLogin(HttpServletRequest req) {
		//	static �� ����					new ��Ű�� �Ⱦ
		//	��ȯ���� boolean�� ����		�α��� ����� �˷��ֱ� ���ؼ�
		//									true		�ѻ��
		//									false		���ѻ��
		//	�Ű������� req�� ����		������ ����� ���ؼ��� req�� �ʿ��ϹǷ�.
		
		HttpSession	session = req.getSession();
		if(session.getAttribute("USER") == null) {
			//	�α��� ���ѻ��
			return false;
		}
		else {
			//	�α��� �� ���
			return true;
		}
	}
	
	//	�α��� �� ����� id�� �˷��ִ� �Լ�
	public static String getId(HttpServletRequest req) {
		HttpSession session = req.getSession();
		MemberVO mVO = (MemberVO) session.getAttribute("USER");
		String		id = mVO.getId();
		
		return id;
	}
	
	//	�Ѹ���
	//		������Ʈ���� ����� ���� �� �ϳ���
	//		��ó�� ���ڰ� �۾��ϴ� ���� �α��� ������ �ʿ��� 
	//		��찡 �߻��� ���̴�.
	
	//		�׸��Ƿ�...
	//		�α����� �ϸ� � ������ ���ǿ� ������� ���ؾ� �ϰ�
	//		�̰��� � ������� ���������� ���ؾ� �ϰ�
	//		� Ű������ ���������� ���ؾ� �� ���̴�.
	
	//	��>			session.setAttribute("ID", "nasundol");
	//				session.setAttribute("NICK", "������");
	//	ó�� �ϳ��� ���� �����ϰڴ�....
	
	//	��>			MemberVO mVO = new MemberVO();
	//				mVO.id = "isundol";
	//				mVO.nick = "������";
	//				session.setAttribute("USER", mVO);
	//	ó�� �ϳ��� ���������� ��� �����ϰڴ�....
	
	/*
	 * 	������ �ʿ��ϸ� ������ ������� �Լ�
	 */
	public static HttpSession createSession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		return session;
	}
}







