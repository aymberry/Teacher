package P0719;
import		java.util.*;
public class Hash01 {

	public static void main(String[] args) {
		HashSet	set = new HashSet();
		set.add("ȫ�浿");
		set.add("�ھ���");
		set.add("�嵶��");
		set.add("�̱���");
		set.add("������");
		set.add("ȫ�浿");
		
		//	Set �迭�� �����ʹ� ���ϴ� �����͸� ���� �� ����.
		//	�ݵ�� ���������� ���� ��Ų ��
		Iterator	iter = set.iterator();
		//	�������� ������� �ϳ��� ������ �Ѵ�.
		
		//	��� ������ �� ������ �𸣹Ƿ�.....
		while(iter.hasNext()) {
			//	������ �ǹ�	���� �����Ͱ� ���ҳ���?
			//			��			�ݺ��ϰ�
			//			�ƴϿ�		�ݺ��� �����Ѵ�.
			String	name = (String) iter.next();
			System.out.println(name);
		}
		//	......
		System.out.println("�ٽ� ����Ѵ�.");
		//	�������͸��� �ִ� �����ʹ� �ѹ� ����ϸ� �����ǹǷ�
		//	���� �� ����� ���ϸ�........
		//	�ٽ� ������� ������Ű�� �۾����� �ٽ��ؾ� �Ѵ�.
		iter = set.iterator();
		while(iter.hasNext()) {
			//	������ �ǹ�	���� �����Ͱ� ���ҳ���?
			//			��			�ݺ��ϰ�
			//			�ƴϿ�		�ݺ��� �����Ѵ�.
			String	name = (String) iter.next();
			System.out.println(name);
		}
	}

}


