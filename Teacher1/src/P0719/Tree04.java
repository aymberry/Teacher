package P0719;
/*
 * 	����	ģ���̸� 10����� TreeSet�� �Է��� ��
 * 			Ư���̸����� Ư���̸������� ģ���� ���� �̾Ƽ� TreeSet�� ���弼��.
 */
import		java.util.*;
public class Tree04 {
	public static void main(String[] args) {
		TreeSet		set = new TreeSet();
		set.add("������");
		set.add("Ȳ�ž�");
		set.add("�嵿��");
		set.add("�۰�ȣ");
		set.add("�̺���");
		set.add("������");
		set.add("������");
		set.add("���߱�");
		set.add("������");
		set.add("�۽���");
	
		//	���� ��~�徾 ������ ����� ���� �����ϰ��� �Ѵ�.
		TreeSet	temp = (TreeSet) set.subSet("��", "��");
		//	����	
		//		���� Ŭ������ ���� ����� ���� Ŭ������ �ޱ� ���ؼ���
		//		�ݵ�� ����ȯ�ؼ� ��������.
		
		//	����
		//		�� ����� ���� TreeSet���� �ִ� �������
		//		TreeSet�� �����͸� ���������ؼ� ������ �Ǿ����Ƿ�....
		//		?? ~ ?? ������ ������ ������ �� �ִ�.
		
		Iterator iter = temp.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

