package P0718;
/*
 * 	LinkedList에 10명의 친구 이름을 입력한 후
 * 	가나다 순서대로 정렬해서 출력하자.
 */
import		java.util.*;
public class Linked01 {
	public static void main(String[] args) {
		LinkedList	list = new LinkedList();
		
		list.add("한혜진");
		list.add("황신애");
		list.add("장동건");
		list.add("송강호");
		list.add("이병헌");
		list.add("아이유");
		list.add("송혜교");
		list.add("송중기");
		list.add("김혜수");
		list.add("송승헌");
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			String	name = (String) list.get(i);
			System.out.println(name);
		}
	}
}
