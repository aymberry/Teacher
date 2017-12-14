package P0718;
import		java.util.*;
public class Sort02 {
	public static void main(String[] args) {
		LinkedList		list = new LinkedList();
		//	무작위 적으로 발생한 데이터를 입력 받아 놓았다.
		for(int i = 0; i < 10; i++) {
			int	temp = (int) (Math.random() * (101));
			list.add(temp);
		}
		//	나는 이것을 정렬시켜서 사용하고자 한다.
		//	나는 이것을 내림차순 정렬하고자 한다.
		Collections.sort(list, new IntComparator());
		
		for(int i = 0; i < list.size(); i++) {
			int	num = (int) list.get(i);
			System.out.println(num);
		}
	}
}
//	정렬 방식을 변경하고자 하면 약속에 따라서
//	Comparator를 이용하세요....
//	근데...	Comparator는 인터페이스이다.
//	사용방법	여러분의 클래스를 만들고 거기에 상속을 해준후
//				추상 함수를 오버라이드해서 사용하세요.
class IntComparator implements Comparator {
	public int	compare(Object o1, Object o2) {
		//	인터페이스의 추상 함수는 JVM에 의해서 호출되는
		//	자동 호출 함수
		
		//	이것은 외워야한다.
		//	이 함수는 정렬을 하기위해서 데이터가 비교되는 순간
		//	이 함수는 호출되어 진다.
		
		//	매개변수의 역활
		//		비교할 데이터 2개가 입력된다.
		
		//	우리가 할일은
		//		비교할 데이터를 비교해서
		//		바꾸고 싶으면 양수
		//		같으면 0
		//		바꾸기 싫으면 음수를 반환해주면 된다.
		
		int		temp1 = (int) o1;
		int		temp2 = (int) o2;
		
		int		temp = temp1 - temp2;
		//		temp1이 크면 양수
		//		같으면 0
		//		temp2이 작으면 음수
		//		이 결과를 그대로 알려주면 오름차순
			
		return -temp;
	}
}












