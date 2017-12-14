package P0705;
/*
 * 	키보드를 이용해서 숫자 하나를 입력 받으세요.
 */
//	import		java.util.*;
public class Test01 {

	public static void main(String[] args) {
		//	import 하지 않고도
		//	클래스 사용 시점에서 패키지 경로를 써주면 된다.
		//	주의
		//		모든 클래스 이름앞에 매번 써주어야 한다.
		java.util.Scanner		sc = new java.util.Scanner(System.in);
		
		int		num = sc.nextInt();
		
		System.out.println("입력한 수 = " + num);

	}

}
