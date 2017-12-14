package P0616;
//	Scanner를 사용하기 위해서는 이 도구를 사용하겠다고
//	선언해 주어야 한다.
import		java.util.*;	

public class Test09 {

	public static void main(String[] args) {
		//	프로그램이 시작하면 도구를 생성해 놓아야 한다.
		Scanner	sc = new Scanner(System.in);
		
		int		a;
		//	........프로그램을 진행하다가.....
		//	키보드로 데이터를 입력 받고자 하면......
		System.out.println("문가를 실행하다가... 데이터가 필요하면");
		
		a = sc.nextInt();	//	키보드를 이용해서 입력 받을 수 있다.
		
		System.out.println("당신이 입력한 데이터 = " + a);
		
		
		
		
		

	}

}
