package P0721;

import		java.util.*;
public class Test01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//	��ó�� �÷����� ���鶧 �� �÷��ǿ� ����� ������ ���¸�
		//	�����ϴ� ������ ���ʸ� �̶�� �Ѵ�.

		list.add("ȫ�浿");	//	���ڴ� ����Ѵ�.
//		list.add(10);			//	�ٸ� ������ �������̹Ƿ� ������ �߻�
		list.add("�ھ���");
		list.add("�嵶��");
		list.add("��ġ��");
		list.add("�̱���");
		
		int	size = list.size();
		for(int i = 0; i < size; i++) {
//			String name = (String) list.get(i);
			String name = list.get(i);
			//	���ʸ� ������ �� �÷����� ������ ����ȯ���� �ʾƵ� �ȴ�.
			System.out.println(name);
		}
	}
}







