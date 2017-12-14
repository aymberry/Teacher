package P0719;
import		java.util.*;
public class Tree03 {
	public static void main(String[] args) {
		TreeSet	set = new TreeSet();
		
		set.add(new Circle03(7));
		set.add(new Circle03(6));
		set.add(new Circle03(2));
		set.add(new Circle03(8));
		set.add(new Circle03(4));
		
		ArrayList	list = new ArrayList(set);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

class Circle03 implements Comparable {
	int			radius;
	float		ground;
	float		area;
	public Circle03() {}
	public Circle03(int r) {
		radius = r;
		ground = (float)(r * 2 * Math.PI);
		area = (float)(r * r* Math.PI);
	}
	//	누군가가  이 클래스의 주소를 출력하면...	HashCode이 출력되므로..
	//	불필요할것 같다.
	//	나는 내가 원하는 정보를 알려주고 싶다.
	
	public String toString() {
		return "반지름 = " + radius + " 둘레 = " + ground + " 면적 = " + area; 
	}
	
	public int compareTo(Object o) {
		//	this		비교할 첫번째 데이터가 들어오고
		//	o			비교할 두번째 데이터가 들어오고
		System.out.println(" 나 자동 실행되니 정말로 진짜로");
		Circle03	temp = (Circle03) o;
		
		int	result = this.radius - temp.radius;
		
		return -result;
	}
}








