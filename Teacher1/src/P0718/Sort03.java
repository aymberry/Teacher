package P0718;
/*	
 * 	�÷��ǿ��� ��� �����͸� �� ����� �� �ִ�.
 * 	SaGak03�� 5�� ����� �����̴�.
 * 
 */
import		java.util.*;
public class Sort03 {
	public static void main(String[] args) {
		Vector		v = new Vector();
		v.add(new SaGak03(5, 6));
		v.add(new SaGak03(6, 1));
		v.add(new SaGak03(7, 3));
		v.add(new SaGak03(4, 2));
		v.add(new SaGak03(7, 2));

		//	���� ������ �������� �����ؼ� ����ϰ� �ʹ�.
		Collections.sort(v, new SaGakSort());
		//	���� �߻�
		//		SaGak03 Ŭ���� �ȿ��� �������� �����Ͱ� �ִµ�..
		//		������ �������� �������� �𸣱� ������ ������ �߻��� ���̴�.
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
}

class SaGak03 {
	int		garo;
	int		sero;
	int		area;
	SaGak03() {}
	SaGak03(int g, int s) {
		garo = g;
		sero = s;
		area = garo * sero;
	}
	
	public String toString() {
		return "���� = " + garo + " ���� = " + sero + " ���� = " + area;
	}
}

class SaGakSort implements Comparator {
	public int	compare(Object o1, Object o2) {
		//	�� �ȿ��� �ٲ��� ������ �����Ͽ� ���� ������
		//	���ϸ� �ȴ�.
		//	o1�� o2���� �÷��� �ȿ� �����Ͱ� �ΰ��� ���´�.
		SaGak03	temp1 = (SaGak03) o1;
		SaGak03	temp2 = (SaGak03) o2;
		//	m56-790-475
		int	temp = temp1.area - temp2.area;
		
		
		return -temp;
	}
}




