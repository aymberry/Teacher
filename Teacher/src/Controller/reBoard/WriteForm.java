package Controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import Util.SessionUtil;

public class WriteForm extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp){
		//	�Ķ���� �ް�
		//	�̹����� �����Ƿ� �Ѿ��.......
		
		//	���ϴ� �۾��� ������ ��
		//	�α����� �� ����� ���� �� �� �ֵ��� �� ���Ҵ�.
		//	�ٵ� �α����� ���� ���� ����� ��û�ϸ�?
		//	1.	�ƿ� ���� ������ �� �α����� �� ����� �� �����
		//		�̿��� �� �ֵ��� ��ġ�ϴ� ���
		//	2.	��û�� �ϴ� �ް�(��Ʈ�ѷ��� �����ϰ�)
		//		��Ʈ�ѷ����� �α��� �˻縦 �ؼ� ó���ϴ� ���
		
		//	�ǹ������� �ΰ��� ��δ� ����ϴ� ���� ��Ģ���� �Ѵ�.
		//	�ֳ��ϸ� �ּҸ� ġ�� ������ ��찡 �߻��ϱ� �����̴�.
		
		//	��ó�� ��Ʈ�ѷ����� Ư�� ������ �����ϴ��� �˻��� ��
		//	������ �����ϵ��� �ϴ� ���� "���Ѽ��� �˻�" ��� �θ���.
		//	���۾��� ����� �Ͼ�� �۾��̹Ƿ�....
		
		//	�ƿ� �� �۾��� ����ϴ� ����� ���� �ϳ� �����
		//	�� ����� �� ����ϵ��� �غ���.
		//	�ϳ��� Util Ŭ������ �����ؼ� ����غ���.
		
		//	�α��� �ߴ��� ���� �˻� �ϴ� ���.....
		boolean	isLogin = SessionUtil.isLogin(req);
		if(isLogin == false) {
			//	�α����� ���� ���� ������Դ� �ٸ� �並 �����ֵ��� ����.
			return "../view/ReBoard/ImsiView.jsp";
		}
		
		//	���� �����ϰ�
		//		���⼭�� �ƹ��� �� ���� �����Ƿ� ���� ����
		//	�並 �����Ѵ�.
		return "../view/ReBoard/WriteForm.jsp";
	}
}







