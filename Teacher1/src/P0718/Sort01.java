package P0718;
/*
 * 	친구 이름을 10사람 입력한후
 * 	내림차순으로 정렬해서 출력하세요
 */
import		java.util.*;
public class Sort01 {
	public static void main(String[] args) {
		ArrayList	list = new ArrayList();
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

		Collections.sort(list, new MyComparator());
		//	참고	API에서는 List 를 넣어달라고 하는데....
		//			나는 왜  ArrayList를 넣고도 에러가 안날까?
		//		이유	List는 ArrayList의 상위이므로....
		for(int i = 0; i < list.size(); i++) {
			String	name = (String) list.get(i);
			System.out.println(name);
		}
	}
}
//	인터페이스는 사용하는 방법이 90%가 
//	하위 클래스를 만들고 추상함수를 오버라이드 한 후
//	그 하위 클래스를 사용하도록 한다.
class MyComparator implements Comparator {
	//	추상함수를 오버라이드 한다.
	public int compare(Object o1, Object o2) {
		//	인터페이스 소속함수는 자동 호출 함수이다.
		//	자동 호출함수이므로 함수가 존재해야 하고
		//	그 기능은 개발자에게 맡기는 것이 인터페이스이다.
		
		//	이 함수가 호출되는 시점
		//		정렬을 하기 위해서 데이터 2개를 비교하는
		//		순간마다 이 함수를 호출한다.
		//		(물론 내부적으로는 TreeSort라는 알고리즘을 이용해서)
		//	이때 매개변수에는 비교할 데이터 2개가 기억된다.

		//	이 함수는 비교할 데이터를 비교해서
		//	바꾸고 싶으면 양수(1 이상 숫자)
		//	같으면 0
		//	바꾸기 싫으면 음수(-1 이하의 숫자)를 반환함으로써....
		//	정렬 방식을 개발자가 정하는 것이다.
		
		String	temp1 = (String) o1;
		String	temp2 = (String) o2;
		
		int		temp = temp1.compareTo(temp2);
		//	결과는 앞의 문자가 크면 양수
		//			두 문자가 같으면 0
		//			뒤의 문자가 크면 음수
		//	고로 이것을 그대로 알려주면 오름 차순 정렬이 된다.
		
		return -temp;
	}
	//	원래 equals 함수도 오버라이드 해야 한다.
	//	하지만 이 클래스는 Object를 상속 받았기 때문에
	//	Object 클래스의 equals 가 이미 만들어져 있다.

}













