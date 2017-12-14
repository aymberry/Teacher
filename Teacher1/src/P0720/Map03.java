package P0720;
/*
 * 	Map�� Ű���� ������ �����ϰ� �ȴ�.
 *	
 *	���� �����͸� �̿��ؼ� �����ؾ��� �ʿ䰡 ������?
 *
 *	����		Collections.sort()�� �̿��ؼ� ó���ϸ� �ȴ�.
 *
 *		������ �� �Լ��� Map �� ����� �� ���� ������...	
 *		List �� ��ȯ�ؾ� �ϴµ�.....
 *		Map�� List�� �ٲ� �� ����.
 *
 *		���		Map -> Set -> List�� �ٲپ ����ؾ� �Ѵ�.
 *	
 *	����
 *		ģ���̸� 5����� �Է��ϰ� �̸� ������� �����ؼ� ����϶�.
 *
 */
import		java.util.*;
public class Map03 {
	public static void main(String[] args) {
		TreeMap	map = new TreeMap();
		map.put("ģ��", "������");
		map.put("����", "���߱�");
		map.put("����", "������");
		map.put("��ģ", "������");
		map.put("��ģ", "�۽���");
		//	���� ���� ����
//		Set		set = map.entrySet();
//		Iterator	iter = set.iterator();
//		while(iter.hasNext()) {
//			Map.Entry temp = (Map.Entry) iter.next();
//			String		key = (String) temp.getKey();
//			String		data = (String) temp.getValue();
//			
//			System.out.println(key + " : " + data);
//		}
		
		//	�����͸� �̿��ؼ� �����ϰ��� �ϸ� List�� ��ȯ�ؾ� �Ѵ�.
		//	���� ��ȯ�� �ȵǹǷ�... Set�� ���ļ� List�� �ٲپ�� �Ѵ�.
		Set		set = map.entrySet();
		//	set���� Map.Entry�� �����ͷ� ����.
		ArrayList	list = new ArrayList(set);
		//	�� �ȿ��� Map.Entry��� Ŭ������ ���� �����Ͱ� ����ȴ�.
		//	�̰��� �����Ϸ���....
		Collections.sort(list, new MySort03());
		//	������	list �ȿ� �ִ� �����ʹ� Map.Entry��� Ŭ�����̰�
		//	�� �ȿ��� 2���� �����Ͱ� �����ִ�.
		//	�׷��Ƿ� ��Ʈ�� ���� �ʴ´�?
		//	��?		���� ������ �̿��ؼ� ��Ʈ���� �𸣹Ƿ�....
		//			���		���ı����� ���ϴ� Ŭ������ ���� ����ض�.
		
		for(int i = 0; i < list.size(); i++) {
			Map.Entry temp = (Map.Entry) list.get(i);
			String	key = (String) temp.getKey();
			String	data = (String) temp.getValue();
			
			System.out.println(key + " : " + data);
		}
	}
}
//	���� ������ �̿��ؼ� �������� �𸣹Ƿ� ���� ������ ���ؾ� �Ѵ�.
class MySort03 implements Comparator {
	public int	compare(Object o1, Object o2) {
		//		o1�� o2���� �� ���(List�� ������)�� ���´�.
		//		�츮�� ����ϴ� List���� Map.Entry Ŭ������ ���Ǿ� �ִ�.
		Map.Entry	temp1 = (Map.Entry) o1;
		Map.Entry	temp2 = (Map.Entry) o2;
		
		String		data1 = (String) temp1.getValue();
		String		data2 = (String) temp2.getValue();
		
		int		result = data1.compareTo(data2);
		
		
		
		return result;
	}
}










