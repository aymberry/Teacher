package P0720;
/*
 * 	���ĺ� ���� A~J������ �����ϰ� 100�� �߻��� ��
 * 	������ ���ڰ� ��� ���Դ����� �˾ƺ���.
 * 
 * 	����
 * 		map.put("A", 10)		�� ������� ������ �����̴�.
 * 		��,
 * 			Ű���� �߻��� ���ڷ� �ϰ�, �����ʹ� �߻� ȸ���� �����ϵ��� �Ѵ�.
 */
import		java.util.*;
public class Map01 {
	public static void main(String[] args) {
		TreeMap	map = new TreeMap();
		//	���ĺ� ���ڸ� 100�� �ݺ��ϸ鼭 �߻�����.
		for(int i = 0; i < 100; i++) {
			char	ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			//	�߻��� ������ ȸ���� map�� �����ϸ� �ȴ�.
			//	����....
			if(map.containsKey(ch)) {
				//		�̹� �߻��� ���ڴ� �� ������ �߻� ȸ���� ����Ǿ� �ְ�
				//		�߻�ȸ���� �̹� ����Ǿ� �����Ƿ�
				//		���� �߻��� �ٽ� �����Ƿ� 1�� �������Ѿ� �Ѵ�.
				//	1.	���� ���� �߻� ȸ���� �˾Ƴ���.
				int		count = (int) map.get(ch);
				//	2.	ȸ���� 1 �����Ѵ�.
				count++;
				//	3.	�ٽ� �����Ѵ�.
				map.put(ch, count);
				//	���⼭ �߿����
				//		�ٽ� �����ϸ� ���� ����� ���� Ű���� �����ʹ�
				//		�����ȴ�.
			}
			else {
				//		���� ���� �߻��� ���ڰ� ó���̶��... ���� map�� 
				//		����Ǿ� ���� ���� ���̴�.
				map.put(ch, 1);
			}
		}
		//	�̹����� A : ??		B : ??�� ������� ����ϰ� �ʹ�.
		//	Ű���� �ʿ��ϰ� �����͵� �ʿ��ϴ�.
		
		Set		dataSet = map.entrySet();
		Iterator	iter = dataSet.iterator();
		while(iter.hasNext()) {
			Map.Entry	temp = (Map.Entry) iter.next();
			char	key = (char) temp.getKey();
			int		count = (int) temp.getValue();
			
			System.out.println(key + "  :  " + count);
		}
	}
}

