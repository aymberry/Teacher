package P0824;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 	�� Ŭ������ ��� ��Ʈ�ѷ� Ŭ������ ���� ��Ȱ�� �� Ŭ�����̴�.
 */
public abstract class SuperController {
	//	�� Ŭ������ ���� ������ �����ϵ��� �ϱ� ���ؼ�
	//	������ ��Ʈ�ѷ� Ŭ������ �Լ��� ������ �־�� �Ѵ�.
	public abstract String action(HttpServletRequest req, HttpServletResponse resp);
		//	�� �Լ��� �ϴ����� ����
		//	�ٸ� ���� ������ �ϱ� ���ؼ� ���� Ŭ������ �� �Լ���
		//	�־�� �Ѵ�... ������ ������Ű�� ���ؼ�....
}





