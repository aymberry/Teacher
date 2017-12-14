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
		//	비록 목적이 데이터를 꺼내기 위해서라도
		//	컬렉션의 형태가 달라졌으므로 반드시 제너릭 선언을
		//	다시 해야 한다.
		while(iter.hasNext()) {
			int		num = iter.next();
			System.out.println(num);
		}
	}
}
