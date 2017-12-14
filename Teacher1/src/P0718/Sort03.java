package P0718;
/*	
 * 	컬렉션에는 모든 데이터를 다 사용할 수 있다.
 * 	SaGak03을 5개 기억할 예정이다.
 * 
 */
import		java.util.*;
public class Sort03 {
	public static void main(String[] args) {
		Vector		v = new Vector();
		v.add(new SaGak03(5, 6));
		v.add(new SaGak03(6, 1));
		v.add(new SaGak03(7, 3));
		v.add(new SaGak03(4, 2));
		v.add(new SaGak03(7, 2));

		//	나는 면적을 기준으로 정렬해서 출력하고 싶다.
		Collections.sort(v, new SaGakSort());
		//	문제 발생
		//		SaGak03 클래스 안에는 여러개의 데이터가 있는데..
		//		무엇을 기준으로 정렬할지 모르기 때문에 문제가 발생한 것이다.
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
}

class SaGak03 {
	int		garo;
	int		sero;
	int		area;
	SaGak03() {}
	SaGak03(int g, int s) {
		garo = g;
		sero = s;
		area = garo * sero;
	}
	
	public String toString() {
		return "가로 = " + garo + " 세로 = " + sero + " 면적 = " + area;
	}
}

class SaGakSort implements Comparator {
	public int	compare(Object o1, Object o2) {
		//	이 안에서 바꿀지 말지를 결정하여 정렬 순서를
		//	정하면 된다.
		//	o1과 o2에는 컬렉션 안에 데이터가 두개씩 들어온다.
		SaGak03	temp1 = (SaGak03) o1;
		SaGak03	temp2 = (SaGak03) o2;
		//	m56-790-475
		int	temp = temp1.area - temp2.area;
		
		
		return -temp;
	}
}




