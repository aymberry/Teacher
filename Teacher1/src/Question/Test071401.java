package Question;
import		java.util.*;
public class Test071401 {

	public static void main(String[] args) {
		//	1.	Object의 equals 함수는 두 객체의 내용을 비교하는 함수이다.
		//		단점
		//			배열은 비교를 할 수 없다.
		//	이 단점을 해결하기 위해서 나온 함수가 deepEquals()함수이다.
		int		a = 10;
		int		b = 10;
//		int[]	a = {10};
//		int[]	b = {10};
		if(Objects.deepEquals(a, b)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}

	}

}
