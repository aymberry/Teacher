package P0718;
import		java.util.*;
public class Sort02 {
	public static void main(String[] args) {
		LinkedList		list = new LinkedList();
		//	������ ������ �߻��� �����͸� �Է� �޾� ���Ҵ�.
		for(int i = 0; i < 10; i++) {
			int	temp = (int) (Math.random() * (101));
			list.add(temp);
		}
		//	���� �̰��� ���Ľ��Ѽ� ����ϰ��� �Ѵ�.
		//	���� �̰��� �������� �����ϰ��� �Ѵ�.
		Collections.sort(list, new IntComparator());
		
		for(int i = 0; i < list.size(); i++) {
			int	num = (int) list.get(i);
			System.out.println(num);
		}
	}
}
//	���� ����� �����ϰ��� �ϸ� ��ӿ� ����
//	Comparator�� �̿��ϼ���....
//	�ٵ�...	Comparator�� �������̽��̴�.
//	�����	�������� Ŭ������ ����� �ű⿡ ����� ������
//				�߻� �Լ��� �������̵��ؼ� ����ϼ���.
class IntComparator implements Comparator {
	public int	compare(Object o1, Object o2) {
		//	�������̽��� �߻� �Լ��� JVM�� ���ؼ� ȣ��Ǵ�
		//	�ڵ� ȣ�� �Լ�
		
		//	�̰��� �ܿ����Ѵ�.
		//	�� �Լ��� ������ �ϱ����ؼ� �����Ͱ� �񱳵Ǵ� ����
		//	�� �Լ��� ȣ��Ǿ� ����.
		
		//	�Ű������� ��Ȱ
		//		���� ������ 2���� �Էµȴ�.
		
		//	�츮�� ������
		//		���� �����͸� ���ؼ�
		//		�ٲٰ� ������ ���
		//		������ 0
		//		�ٲٱ� ������ ������ ��ȯ���ָ� �ȴ�.
		
		int		temp1 = (int) o1;
		int		temp2 = (int) o2;
		
		int		temp = temp1 - temp2;
		//		temp1�� ũ�� ���
		//		������ 0
		//		temp2�� ������ ����
		//		�� ����� �״�� �˷��ָ� ��������
			
		return -temp;
	}
}












