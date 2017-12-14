package P0718;
/*
 * 	ģ�� �̸��� 10��� �Է�����
 * 	������������ �����ؼ� ����ϼ���
 */
import		java.util.*;
public class Sort01 {
	public static void main(String[] args) {
		ArrayList	list = new ArrayList();
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

		Collections.sort(list, new MyComparator());
		//	����	API������ List �� �־�޶�� �ϴµ�....
		//			���� ��  ArrayList�� �ְ� ������ �ȳ���?
		//		����	List�� ArrayList�� �����̹Ƿ�....
		for(int i = 0; i < list.size(); i++) {
			String	name = (String) list.get(i);
			System.out.println(name);
		}
	}
}
//	�������̽��� ����ϴ� ����� 90%�� 
//	���� Ŭ������ ����� �߻��Լ��� �������̵� �� ��
//	�� ���� Ŭ������ ����ϵ��� �Ѵ�.
class MyComparator implements Comparator {
	//	�߻��Լ��� �������̵� �Ѵ�.
	public int compare(Object o1, Object o2) {
		//	�������̽� �Ҽ��Լ��� �ڵ� ȣ�� �Լ��̴�.
		//	�ڵ� ȣ���Լ��̹Ƿ� �Լ��� �����ؾ� �ϰ�
		//	�� ����� �����ڿ��� �ñ�� ���� �������̽��̴�.
		
		//	�� �Լ��� ȣ��Ǵ� ����
		//		������ �ϱ� ���ؼ� ������ 2���� ���ϴ�
		//		�������� �� �Լ��� ȣ���Ѵ�.
		//		(���� ���������δ� TreeSort��� �˰����� �̿��ؼ�)
		//	�̶� �Ű��������� ���� ������ 2���� ���ȴ�.

		//	�� �Լ��� ���� �����͸� ���ؼ�
		//	�ٲٰ� ������ ���(1 �̻� ����)
		//	������ 0
		//	�ٲٱ� ������ ����(-1 ������ ����)�� ��ȯ�����ν�....
		//	���� ����� �����ڰ� ���ϴ� ���̴�.
		
		String	temp1 = (String) o1;
		String	temp2 = (String) o2;
		
		int		temp = temp1.compareTo(temp2);
		//	����� ���� ���ڰ� ũ�� ���
		//			�� ���ڰ� ������ 0
		//			���� ���ڰ� ũ�� ����
		//	��� �̰��� �״�� �˷��ָ� ���� ���� ������ �ȴ�.
		
		return -temp;
	}
	//	���� equals �Լ��� �������̵� �ؾ� �Ѵ�.
	//	������ �� Ŭ������ Object�� ��� �޾ұ� ������
	//	Object Ŭ������ equals �� �̹� ������� �ִ�.

}













