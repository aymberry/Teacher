package P0824;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 	���� ��Ʈ�ѷ� Ŭ������ ������ ������ �ϱ�� ��������Ƿ�
 * 	�ݵ�� ���� Ŭ������ ��� �޾Ƽ� �����ϵ��� �Ѵ�.
 * 
 * 	���� Ŭ������ ���� �߻� �Լ��� �������̵� �� ���´�.
 */
public class Sam01 extends SuperController {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("1�� ��Ʈ�Ѷ�");
		
		//	�̰��� ��û�� ���� ���� ���� �ϴ� ��Ʈ�ѷ��̴�.
		//	�� ��Ʈ�ѷ��� ���� ��ģ�� �������.
		//	�� ������ ??? �Դϴ�. �� �˷��ֱ��....
		
		//	 �� ��Ʈ�ѷ��� ������ �����Ͱ� ���� "ȫ�浿" �̶��.....
		//	�̰��� �信�� �˷��ִ� �����....
		//	request ������ �־��ֱ⸸ �ϸ� �ȴ�.
		//	1.	�����͸� �����ϴ� ��� ó�� ���
		String	name = "ȫ�浿";
		//	Model�� request ������ �ֱ⸸ �ϸ�
		//	�信�� �������� ������ ����� �� �ְ� �ȴ�.
		req	.setAttribute("UNAME", name);
		

		//	2.	���� ������ �����Ͱ� �����ϴ� ��� ó�����
		ImsiVO		vo = new ImsiVO();
		vo.name = "ȫ�浿";
		vo.title = "���� �����̴�.";
		vo.hit = 100;
		
		req.setAttribute("BOARDVIEW", vo);
		
		//	3.	���� ������ �����Ͱ� ������ �����ϴ� ��� ó�����
		ArrayList	list = new ArrayList();
		list.add("�������� 1");
		list.add("�������� 2");
		list.add("�������� 3");
		list.add("�������� 4");
		list.add("�������� 5");
		
		req.setAttribute("NEWSLIST", list);
		
		//	4.	���� ������ �����Ͱ� ������ �����ϴ� ��� ó�����
		ArrayList		list1 = new ArrayList();
		for(int i = 0; i < 5; i++) {		//	�ʿ��� �ٸ�ŭ �ݺ��ؼ�
			ImsiVO vo1 = new ImsiVO();
			//	vo�� �ʿ��� ������ �Է��ϰ�(2�� ����)
			list1.add(vo1);
		}
		req.setAttribute("BOARDLIST", list1);
		
		
//		if(����) {
			return "../P0824/ImsiView01.jsp";
//		}
//		else {
//			return "../P0824/ImsiView007.jsp";
//		}
	}
}





