package P0720;
/*
 * 	Map �� �����͸� 5�� �Է��� �� entrySet�� �̿��ؼ� �����͸�
 * 	��������.
 */
import		java.util.*;
public class Hash03 {
	public static void main(String[] args) {
		HashMap	map = new HashMap();
		map.put("�̸�", "�ھ���");
		map.put("����", "24");
		map.put("��ȭ��ȣ", "010-5555-6666");
		map.put("�����ּ�", "nasundol@daum.net");
		map.put("���ּ�", "����� ���α� �ſ���");

		Set		dataSet = map.entrySet();
		//	�� �ȿ���
		//		dataSet.add(new Map.Entry("�̸�", "�ھ���"));
		//		dataSet.add(new Map.Entry("����", "24"));
		//		dataSet.add(new Map.Entry("��ȭ��ȣ", "???"));
		//		dataSet.add(new Map.Entry("�����ּ�", "???"));
		//		dataSet.add(new Map.Entry("���ּ�", "???"));
		
		//	Set�� ���� ���� �� �����Ƿ�...
		Iterator iter = dataSet.iterator();
		while(iter.hasNext()) {
			//	���� ������ �����ּ���.
			Map.Entry	temp = (Map.Entry) iter.next();
			//	�� Ŭ���� �ȿ��� key, data�� �ѽ����� ���Ǿ� �����Ƿ�,,,
			//	Ű��
			String	key = (String) temp.getKey();
			String	data = (String) temp.getValue();
			
			System.out.println(key + "   :   " + data);
		}
		
		
		
		
	}

}



