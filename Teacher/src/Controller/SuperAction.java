package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 	�� ������ ��� ��Ʈ�ѷ��� ���� Ŭ���� ��Ȱ�� �� Ŭ�����̴�.
 * 	��Ʈ�ѷ��� ������ ������ ���ؼ� ó���� �����̴�.
 */
public abstract class SuperAction {
	//	���� Ŭ������ ���� Ŭ������ �Լ��� ������ �־�� ������ ������ �ǹǷ�...
	public abstract String action(HttpServletRequest req, HttpServletResponse resp);
}




