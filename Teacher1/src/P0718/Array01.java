package P0718;
import		java.util.*;
/*
 * 	5���� ������ ArrayList�� �ְ� ������ ����غ���.
 */
public class Array01 {
	public static void main(String[] args) {
		ArrayList	list = new ArrayList();
		//	�迭�� ������ 10���� �迭�� �����.
		
		//	���� ArrayList�� �ʿ��� �����͸� �Է�����.
		list.add(1);
		list.add("Hong");
		list.add(true);
		list.add(Calendar.getInstance());
		list.add(3.14F);
		
		list.add(3, "�ھ���");
		//	3�� ��ġ�� �ھ����� ������������.
		
		//	�÷����� Ư¡�� �ϳ��� �������� ������ �����͸�
		//	�ѹ��� ������ �� �ִٴ� ����̴�.
		//	�ֳ��ϸ� add �Լ��� Object�� �޵��� �߱� ������.....
		
		//	�ʿ��� �����͸� ��������.
		for(int i = 0; i < 6; i++) {
			System.out.println(list.get(i));
			//	List�� �Է��� ������� �����Ǿ� �ִ�.
		}
		
		//	���ϴ� �͸� ���� ���� �ִ�.
		String	name = (String) list.get(1);
		//		get()�� ��ȯ���� Object�̹Ƿ� �ݵ�� ���ϴ�
		//		������ ������ �� ��ȯ�ؼ� ����ϵ��� �Ѵ�.
		System.out.println(name);
	}
}
