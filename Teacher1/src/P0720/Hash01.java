package P0720;
/*
 * 	�⺻���� Map ����
 */
import		java.util.*;
public class Hash01 {
	public static void main(String[] args) {
		HashMap	map = new HashMap();
		
		map.put("�̸�", "ȫ�浿");
		map.put("����", 18);
		map.put("����", "010-7777-8888");
		//		..	�����͸� �� �����͸� ������ �� �ִ� Ű����
		//			�ѽ����� �Է��� �ؾ� �Ѵ�.
		
		//	���� ���̰� �ʿ��ϸ�
		int		nai = (int) map.get("����");
		System.out.println(nai);
	}
}
