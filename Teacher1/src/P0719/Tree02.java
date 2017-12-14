package P0719;
import		java.util.*;
public class Tree02 {
	public static void main(String[] args) {
		TreeSet	set = new TreeSet(new MySort02());
		//	나는 Student02 클래스가 이름 순서대로 정렬하도록 
		//	규칙을 정했는데.... 이번만큼은 성적순서대로 정렬하고 싶다.
		//	어제 배운 Comparator를 이용한 클래스를 만들고
		//	그 클래스를 알려주면 된다.
		
//		Student02.kind = 2;
		set.add(new Student02("홍길동", 200));
		set.add(new Student02("박아지", 210));
		set.add(new Student02("장독대", 198));
		set.add(new Student02("이기자", 222));
		set.add(new Student02("정말로", 201));
		//	TreeSet에 데이터를 입력하면 그 데이터를 데이터를 
		//	기준으로 해서 정렬한다.
		//	문제
		//	내가 만든 클래스는 무엇을 기준으로 정렬할지가 정해지 않았다.
		//	그래서 에러가 발생한 것이다.
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Student02	s = (Student02) iter.next();
			System.out.println(s);
		}
	
	}
}

class Student02 implements Comparable {
	String	name;
	int		total;
	//	필요한 순간마다 정렬 기준을 변경하고자 한다.
	//	정렬기준을 지정할 변수를 정해놓고
//	static int kind;		//	약속	1	이름, 2		점수
	Student02() {}
	Student02(String n, int t) {
		name = n;
		total = t;
	}
	
	public String toString() {
		return "이름 = " + name + " 이고 총점 = " + total;
	}
	
	public int compareTo(Object o) {
		//	이 함수는 데이터로 사용하는 클래스의 멤버 함수가 되었다.
		//	this	에 첫번째 데이터가 들어오고
		//	o		에 두번째 데이터가 들어온다.
		
		//	정렬 기준을 정하는 원칙은 어제와 동일하다.
		Student02	temp = (Student02) o;
		
		int		result = 0;
//		if(kind == 1) {
			result = this.name.compareTo(temp.name);
//		}
//		else if(kind == 2) {
//			result = this.total - temp.total;
//		}
		return result;
	}
}

class MySort02 implements Comparator {
	public int compare(Object o1, Object o2) {
		Student02	temp1 = (Student02) o1;
		Student02	temp2 = (Student02) o2;
		
		int		r = temp1.total - temp2.total;
		return r;
	}
}






