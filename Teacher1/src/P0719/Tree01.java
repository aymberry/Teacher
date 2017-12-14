package P0719;
import		java.util.*;
public class Tree01 {
	public static void main(String[] args) {
		TreeSet	set = new TreeSet();
		set.add("홍길동");
		set.add("박아지");
		set.add("장독대");
		set.add("이기자");
		set.add("정말로");

		Iterator	iter = set.iterator();
		while(iter.hasNext()) {
			String name = (String) iter.next();
			System.out.println(name);
		}
		
		
		
		
	}

}
