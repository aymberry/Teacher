package P0720;
import		java.util.*;
public class Hash04 {
	public static void main(String[] args) {
		HashMap	map = new HashMap();
		map.put("������", "�ھ���");
		map.put("������", "ȫ�浿");
		map.put("����", "24");
		map.put("��ȭ��ȣ", "010-5555-6666");
		map.put("�����ּ�", "nasundol@daum.net");
		map.put("���ּ�", "����� ���α� �ſ���");
		
		//	���� Ű���� �𸣰ڰ� �����͸� �ʿ��ϴٸ�.......
		Collection		col = map.values();

		Iterator	iter = col.iterator();
		while(iter.hasNext()) {
			//	�����ϰ� �����͸� ��������Ƿ�
			String	data = (String) iter.next();
			
			System.out.println(data);
		}
	}
}


