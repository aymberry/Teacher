package P0721;
import		java.util.*;
public class Test03 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < 20; i++) {
			int	temp = (int)(Math.random() * 101);
			set.add(temp);
		}

		Iterator<Integer>	iter = set.iterator();
		//	��� ������ �����͸� ������ ���ؼ���
		//	�÷����� ���°� �޶������Ƿ� �ݵ�� ���ʸ� ������
		//	�ٽ� �ؾ� �Ѵ�.
		while(iter.hasNext()) {
			int		num = iter.next();
			System.out.println(num);
		}
	}
}
