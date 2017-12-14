package P0707;
import		java.util.*;
public class Test04 {
	public static void main(String[] args) {
		Calendar		car;
//		car = new Calendar();		//	에러
		car = Calendar.getInstance();
		
		int		year = car.get(Calendar.YEAR);		//	년도를 알아내는 것이다.
		int		month = car.get(Calendar.MONTH) + 1;	//	월을 알려준다.
		//	참고
		//	==>		월은 1월부터 시작하는데 자바는 0부터 계산하는 언어이므로
		//			1월을 0이라고 알려준다.
		//			그래서 조심할것 월은 반드시 +1을 해야만 정확한
		//			월이 나온다.
		System.out.println(year);
		System.out.println(month);
	}

}
