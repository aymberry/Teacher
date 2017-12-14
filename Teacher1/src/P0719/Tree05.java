package P0719;
/*
 * 	10사람의 성적을 입력한 후
 * 	그중에서 ??~??까지 점수의 학생수가 몇명인지를 알아내자.
 * 
 */
import		java.util.*;
public class Tree05 {
	public static void main(String[] args) {
		TreeSet	set = new TreeSet();
		set.add(new Student05("한혜진", 40));
		set.add(new Student05("황신애", 70));
		set.add(new Student05("장동건", 50));
		set.add(new Student05("송강호", 30));
		set.add(new Student05("이병헌", 10));
		set.add(new Student05("아이유", 90));
		set.add(new Student05("송혜교", 60));
		set.add(new Student05("송중기", 48));
		set.add(new Student05("김혜수", 29));
		set.add(new Student05("송승헌", 55));

		//	나는 10사람 중에서 점수가 40~70사이의 학생수를 알고싶다.
		//	원리
		//		원하는 범위의 학생을 따로 뽑아서 Set을 만든다.
		TreeSet	temp = (TreeSet) 
			set.subSet(new Student05("", 40), new Student05("", 70));
		//	★★★
		//	참고	SubSet를 사용할 경우에는
		//			원본 Set에 입력된 데이터 형태와 동일해야 한다.
		//	참고	꺼내는 범위는 반드시 정렬 기준과 동일해야 한다.
		//	참고	시작범위는 포함되고, 종료범위는 제외된다.
		//			40 <= ?? < 70		의 의미가 된다.
		
		//		그 Set에 갯수를 알면 될 것이다.
		int		size = temp.size();
		System.out.println(size);
		
		
		
		
	}
}

class Student05  implements Comparable {
	String	name;
	int		total;
	Student05() {}
	Student05(String n, int t) {
		name = n;
		total = t;
	}
	public String toString() {
		return "이름 = " + name + " 이고 총점 = " + total;
	}
	public int compareTo(Object o) {
		Student05	temp = (Student05) o;
		
		int		result = 0;
		result = this.total - temp.total;
		return result;
	}
}