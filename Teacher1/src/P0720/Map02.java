package P0720;
/*
 * 		�÷��� �ȿ��� ���� �����͵��� ����� �� �ִ�.
 * 		
 * 		�׷��Ƿ� �÷��� �ȿ� �ٽ� �÷����� ����� ���� �ִ�.
 * 
 * 		��>		ArrayList	list = new ArrayList();
 * 				....
 * 
 * 				HashSet	set = new HashSet();
 * 				set.add(list);
 * 
 * 		�� �̷��� �����ϴ� ���ν�
 * 		��ȭ��ȣ ���� ���α׷��� ������.
 * 		��		��ȭ��ȣ ������ �Ҷ� �׷� ������ �����ϵ��� ����.
 */
import		java.util.*;
public class Map02 {
	//	���ݺ��� ��� �Լ��� ���� �����̴�.
	//	��� �Լ����� �������� ����� �� �ִ� ������ �غ��Ѵ�.
	static	HashMap	map = new HashMap();
	//	��� �Լ��� ������.
	//		�ʿ��� �׷��� ����� �ִ� �Լ�
	static void makeGroup(String groupName) {
		//	���� ���� �̸��� �׷��� �����ϴ��� Ȯ���ϰ�
		//	������ ����� ������ ������ ������.
//		if(map.containsKey(groupName)) {
//			//	������ ������		�� �ൿ�� ����
//		}
//		else {
//			//	���弼��
//			map.put(groupName, new HashMap());
//		}
		if(! map.containsKey(groupName)) {
			map.put(groupName, new HashMap());
		}
	}
	//		ģ���� ����ϴ� �Լ�
	static void insertFriend(String group, String name, String tel) {
		//	����� ���Ǹ� ���ؼ�.....
		//	����ڰ� ��ó �׷��� ������� ģ����ϸ� �� ��츦 ����ؼ�...
		//	���� �׷��� ���鵵�� ��������.
		makeGroup(group);
		
		//	����
		//		ģ���� ����� �׷��� ����ϴ� Map�� ������.
		HashMap	groupMap = (HashMap) map.get(group);
		//		���� Map�� ģ���� �߰��ϸ� �ȴ�.
		groupMap.put(name, tel);
	}
	//		�׷��� �˷��ָ� �� �׷��� ģ�� ��ü�� ����� �Լ�
	static void displayGroup(String group) {
		//	����
		//		���� �׷��� ����ϴ� Map�� ������.
		HashMap	groupMap = (HashMap) map.get(group);
		
		//	���� �� �Լ��� �� �׷��� ��絥���͸� ������ ���ϹǷ�...
		Set		set = groupMap.entrySet();
		Iterator	iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry temp = (Map.Entry) iter.next();
			String	name = (String) temp.getKey();
			String tel = (String) temp.getValue();
			System.out.println(name + " : " + tel);
		}
	}

	//		��ü�� �� ����ϴ� �Լ�
	//		��Ʈ
	//			�׷��� �˾Ƴ��� Map(��ü)�� �̿��ؼ� �ݺ��ϸ鼭
	//				������ �׷��� ����ϴ� Map�� �ϳ��� ������
	//			�ٽ� ������ �׷��� ����ϴ� Map�� �ݺ��ؼ�
	///			�����͸� ������.(���� �Լ�)

	//		�׷�� ģ���̸��� �˷��ָ� �� ģ���� ��ȭ��ȣ�� ����ϴ� �Լ�
	//			1.	�׷��� ����� Map�� ������
	//			2.	�� Map �ȿ��� �� ����� ��ȭ��ȣ�� ������.
	public static void getFriend(String group, String name) {
		//	����
		//	1.	�� �׷��� Map�� ������.
		HashMap	groupMap = (HashMap)map.get(group);
		//	2.	��  Map���� ģ�� ��ȭ��ȣ�� ������.
		String tel = (String) groupMap.get(name);
		System.out.println(tel);
	}
	 
	
	
	
	public static void main(String[] args) {
		//	5����� �Է��غ���.
		insertFriend("ģ��", "ȫ�浿", "010-1111-2222");
		insertFriend("����", "�ھ���", "010-2222-2222");
		insertFriend("ģ��", "�嵶��", "010-3333-2222");
		insertFriend("ģ��", "�̱���", "010-4444-2222");
		insertFriend("����", "��ġ��", "010-5555-2222");
		
		//	���� ģ���� ������ �ʹ�.
//		displayGroup("����");
		getFriend("����", "�ھ���");
	}
}
