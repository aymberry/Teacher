package P0718;
/*
 * 	LinkedList�� 10���� ģ�� �̸��� �Է��� ��
 * 	������ ������� �����ؼ� �������.
 */
import		java.util.*;
public class Linked01 {
	public static void main(String[] args) {
		LinkedList	list = new LinkedList();
		
		list.add("������");
		list.add("Ȳ�ž�");
		list.add("�嵿��");
		list.add("�۰�ȣ");
		list.add("�̺���");
		list.add("������");
		list.add("������");
		list.add("���߱�");
		list.add("������");
		list.add("�۽���");
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			String	name = (String) list.get(i);
			System.out.println(name);
		}
	}
}
