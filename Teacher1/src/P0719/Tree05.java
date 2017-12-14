package P0719;
/*
 * 	10����� ������ �Է��� ��
 * 	���߿��� ??~??���� ������ �л����� ��������� �˾Ƴ���.
 * 
 */
import		java.util.*;
public class Tree05 {
	public static void main(String[] args) {
		TreeSet	set = new TreeSet();
		set.add(new Student05("������", 40));
		set.add(new Student05("Ȳ�ž�", 70));
		set.add(new Student05("�嵿��", 50));
		set.add(new Student05("�۰�ȣ", 30));
		set.add(new Student05("�̺���", 10));
		set.add(new Student05("������", 90));
		set.add(new Student05("������", 60));
		set.add(new Student05("���߱�", 48));
		set.add(new Student05("������", 29));
		set.add(new Student05("�۽���", 55));

		//	���� 10��� �߿��� ������ 40~70������ �л����� �˰�ʹ�.
		//	����
		//		���ϴ� ������ �л��� ���� �̾Ƽ� Set�� �����.
		TreeSet	temp = (TreeSet) 
			set.subSet(new Student05("", 40), new Student05("", 70));
		//	�ڡڡ�
		//	����	SubSet�� ����� ��쿡��
		//			���� Set�� �Էµ� ������ ���¿� �����ؾ� �Ѵ�.
		//	����	������ ������ �ݵ�� ���� ���ذ� �����ؾ� �Ѵ�.
		//	����	���۹����� ���Եǰ�, ��������� ���ܵȴ�.
		//			40 <= ?? < 70		�� �ǹ̰� �ȴ�.
		
		//		�� Set�� ������ �˸� �� ���̴�.
		int		size = temp.size();
		System.out.println(size);
		
		
		
		
	}
}

class Student05  implements Comparable {
	String	name;
	int		total;
	Student05() {}
	Student05(String n, int t) {
		name = n;
		total = t;
	}
	public String toString() {
		return "�̸� = " + name + " �̰� ���� = " + total;
	}
	public int compareTo(Object o) {
		Student05	temp = (Student05) o;
		
		int		result = 0;
		result = this.total - temp.total;
		return result;
	}
}