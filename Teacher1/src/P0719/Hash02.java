package P0719;
/*
 * 	5사람의 이름을 입력한 후 가나다 순서대로 출력하세요.
 */
import		java.util.*;
public class Hash02 {
	public static void main(String[] args) {
		HashSet	set = new HashSet();
		set.add("홍길동");
		set.add("박아지");
		set.add("장독대");
		set.add("이기자");
		set.add("정말로");
		
		//	어느 순간에 수집한 데이터를 사용할 시점이 되었는데...
		//	이것을 가나다 순서대로 정렬해서 사용하고 싶다.
		
		ArrayList	list = new ArrayList(set);
		//	이처럼 Set -> List는 서로 호환이 가능하다.
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			String	name = (String) list.get(i);
			System.out.println(name);
		}
	}
}
