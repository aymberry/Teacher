package P0719;
/*
 * 	5����� �̸��� �Է��� �� ������ ������� ����ϼ���.
 */
import		java.util.*;
public class Hash02 {
	public static void main(String[] args) {
		HashSet	set = new HashSet();
		set.add("ȫ�浿");
		set.add("�ھ���");
		set.add("�嵶��");
		set.add("�̱���");
		set.add("������");
		
		//	��� ������ ������ �����͸� ����� ������ �Ǿ��µ�...
		//	�̰��� ������ ������� �����ؼ� ����ϰ� �ʹ�.
		
		ArrayList	list = new ArrayList(set);
		//	��ó�� Set -> List�� ���� ȣȯ�� �����ϴ�.
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			String	name = (String) list.get(i);
			System.out.println(name);
		}
	}
}
