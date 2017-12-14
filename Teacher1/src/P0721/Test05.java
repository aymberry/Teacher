package P0721;
import		java.util.*;
public class Test05 {
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<String>();
		list.add("홍길동");
		list.add("박아지");
		list.add("장독대");
		list.add("김치국");
		list.add("이기자");

		for(String temp : list) {
			System.out.println(temp);
		}
		 
	}

}
