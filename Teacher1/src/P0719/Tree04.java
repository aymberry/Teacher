package P0719;
/*
 * 	문제	친구이름 10사람을 TreeSet에 입력한 후
 * 			특정이름부터 특정이름까지의 친구만 따로 뽑아서 TreeSet을 만드세요.
 */
import		java.util.*;
public class Tree04 {
	public static void main(String[] args) {
		TreeSet		set = new TreeSet();
		set.add("한혜진");
		set.add("황신애");
		set.add("장동건");
		set.add("송강호");
		set.add("이병헌");
		set.add("아이유");
		set.add("송혜교");
		set.add("송중기");
		set.add("김혜수");
		set.add("송승헌");
	
		//	나는 박~장씨 사이의 사람만 따로 관리하고자 한다.
		TreeSet	temp = (TreeSet) set.subSet("박", "장");
		//	참고	
		//		상위 클래스로 나온 결과는 하위 클래스로 받기 위해서는
		//		반드시 형변환해서 받으세요.
		
		//	참고
		//		이 기능은 오직 TreeSet에만 있는 기능으로
		//		TreeSet은 데이터를 기준으로해서 정렬이 되었으므로....
		//		?? ~ ?? 사이의 개념이 존재할 수 있다.
		
		Iterator iter = temp.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

