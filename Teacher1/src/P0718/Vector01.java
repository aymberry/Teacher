package P0718;
import		java.util.*;
public class Vector01 {

	public static void main(String[] args) {
		Vector		v = new Vector();
		//	������ 11�� ����ְ�
		for(int i = 0; i < 161; i++) {
			v.add(i);
		}
		//	10���� �����ߴٰ� �����ϸ� ����� * 2�� ���δ�.
		int		size = v.capacity();
		System.out.println(size);
	}

}
