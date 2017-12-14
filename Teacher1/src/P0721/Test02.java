package P0721;

import		java.util.*;
public class Test02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("이미자");
		set.add("하춘하");
		set.add("패티김");
		set.add("사미자");
		set.add("김영춘");
		
//		ArrayList list = new ArrayList(set);
		//	컬렉션의 형태를 바꾸는 순간 제너릭은 따라오지 않는다.
		ArrayList<String> list = new ArrayList<String>(set);
		//	제너릭도 사용하고 싶으면 다시 제너릭 선언을 해주어야 한다.
		Collections.sort(list);
		
		int	size = list.size();
		for(int i = 0; i < size; i++) {
			String name = list.get(i);
			System.out.println(name);
		}
	}
}



