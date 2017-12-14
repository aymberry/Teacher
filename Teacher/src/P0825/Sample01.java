package P0825;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;

public class Sample01 extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("�� ����Ǵ�");
		//	��Ʈ�ѷ����� ������ ó���� �Ŀ� �信�� ���(������)��
		//	�˷��� �ʿ䰡 �ִ�.		�̰��� �츮�� Model�̶�� �Ѵ�.
		
		//	1.	�����Ͱ� �Ѱ��̸� �׳� �� �����͸� �˷��ָ� �ȴ�.
		String		name = "�ھ���";
		req.setAttribute("UNAME", name);
		
		//	2.	�ٸ� ������ �����Ͱ� ������ VO�� ��� �˷��ش�.
		TestVO	vo = new TestVO();
		vo.name = "�ں�����츮����";
		vo.title = "���� �����Դϴ�.";
		vo.hit = 100;
		
		req.setAttribute("DATA", vo);
		
		//	3.	���� ������ �����Ͱ� ������ �����ϴ� ���
		//		�÷������� ��� �˷��ش�.
		
		ArrayList	list = new ArrayList();
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		list.add("���¿�");
		
		req.setAttribute("LIST", list);
		
		//	���������� �����Ͱ� �ٽ� ������ �ִ� ��쿡��
		//	���������� �����͸� VO�� ����
		//	�װ��� �÷������� ��� �˷��ش�.
		TestVO	vo1 = new TestVO();
		vo1.name = "�ڳ���";
		vo1.title = "���� �����Դϴ�.1";
		vo1.hit = 100;
		
		TestVO	vo2 = new TestVO();
		vo2.name = "�峪��";
		vo2.title = "���� �����Դϴ�.2";
		vo2.hit = 100;
		
		ArrayList	tempList = new ArrayList();
		tempList.add(vo1);
		tempList.add(vo2);
		
		req.setAttribute("MULTI", tempList);
		
		return "../P0825/Imsi01.jsp";
	}
}




