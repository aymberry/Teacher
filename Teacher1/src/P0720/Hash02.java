package P0720;
/*
 * 	5���� ������ �����͸� �Է��� �� Ű���� ã�Ƽ� 
 * 	�����͸� ã�ƺ���
 */
import		java.util.*;
public class Hash02 {
	public static void main(String[] args) {
		HashMap	map = new HashMap();
		map.put("�̸�", "�ھ���");
		map.put("����", "24");
		map.put("��ȭ��ȣ", "010-5555-6666");
		map.put("�����ּ�", "nasundol@daum.net");
		map.put("���ּ�", "����� ���α� �ſ���");
		
		//	1.	Ű���� ���� ��Ƽ� Set���� ������.
		Set		keySet = map.keySet();
		//		keySet.add("�̸�");
		//		keySet.add("����");
		//		keySet.add("��ȭ��ȣ");
		//		keySet.add("�����ּ�");
		//		keySet.add("���ּ�");
		
		//	2.	Set�� ���� �� �����Ƿ�... Iterator�� ���� ������ �Ѵ�.
		Iterator	iter = keySet.iterator();
		while(iter.hasNext()) {
			//	Set�� Ű���� ����Ǿ� �����Ƿ�...
			//	�ϳ��� Ű���� �˾Ƴ���.
			String key = (String) iter.next();
			//	�˾Ƴ� Ű���� �̿��ؼ� �����͸� �ٽ� ������.
			String	data = (String) map.get(key);
			System.out.println(key + "     " + data);
		}
	}
}


