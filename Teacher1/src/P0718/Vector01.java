package P0718;
import		java.util.*;
public class Vector01 {

	public static void main(String[] args) {
		Vector		v = new Vector();
		//	데이터 11개 집어넣고
		for(int i = 0; i < 161; i++) {
			v.add(i);
		}
		//	10개로 시작했다가 부족하면 현재방 * 2로 늘인다.
		int		size = v.capacity();
		System.out.println(size);
	}

}
