package P0721;

import		java.util.*;
public class Test02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("�̹���");
		set.add("������");
		set.add("��Ƽ��");
		set.add("�����");
		set.add("�迵��");
		
//		ArrayList list = new ArrayList(set);
		//	�÷����� ���¸� �ٲٴ� ���� ���ʸ��� ������� �ʴ´�.
		ArrayList<String> list = new ArrayList<String>(set);
		//	���ʸ��� ����ϰ� ������ �ٽ� ���ʸ� ������ ���־�� �Ѵ�.
		Collections.sort(list);
		
		int	size = list.size();
		for(int i = 0; i < size; i++) {
			String name = list.get(i);
			System.out.println(name);
		}
	}
}



