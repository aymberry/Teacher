package P0718;
/*
 * 	��� �÷����� ���������� �����͸� �ѹ��� ������ �� �ִٴ� 
 * 	Ư¡�� ������ �ִ�.
 * 
 * 	������ �ǹ������� �׷��� ���� �ʵ��� �����Ѵ�.
 * 	(��, �� �� ������ ���� ������ �����͸� �����ϵ��� �Ѵ�.)
 * 
 * 	�� �۾��� �����ϴ� ����� "���ʸ�"�̶�� ���̴�.
 * 
 * 	�� �ҽ������� ���� ������ �����͸� ������ �������� ������ �ҽ��̴�.
 */
import		java.util.*;
public class Array02 {
	public static void main(String[] args) {
		ArrayList	list = new ArrayList();
		
		list.add(1);
		list.add("Hong");
		list.add(true);
		list.add(3.14F);
		list.add('A');
		
//		for(int i = 0; i < 5; i++) {
			//	�Ʊ�� ������ ���� ����� �ߴ�.
			//	������ ��κ��� ���� ����� ����� ����ؼ� ����ϴ°���
			//	�Ϲ����̴�.
			
//			int		num = (int) list.get(0);
//			String	name = (String) list.get(1);
			//	.....
			//	�̰��� ���� �����Ͱ� �ִ��� �˰� ������ ������ ��쿡��.
			
//		}

		for(int i = 0; i < 5; i++) {
			//	� �������� �𸣹Ƿ�... Object�� ���� �� �ۿ� ����.
			Object		o = list.get(i);
			if(o instanceof Integer) {
				int	num = (int) o;
			}
			else if(o instanceof String) {
				String name = (String) o;
			}
			else if(o instanceof Boolean) {
				boolean	is = (boolean) o;
			}
			else if(o instanceof Float) {
				float fl = (float) o;
			}
			else if(o instanceof Character) {
				char	ch = (char) o;
			}
			//	��ó�� ������ ������ ������ ���ļ� ������ �ϴ�
			//	�ſ� ������ ���� �����.
		}
	}
}









