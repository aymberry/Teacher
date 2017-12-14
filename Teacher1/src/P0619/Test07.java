package P0619;
/*
 * 	문제
 * 		1~100사이의 숫자중에서 홀수의 합만 계산하세요
 * 
 * 		힌트
 * 			
 */
public class Test07 {

	public static void main(String[] args) {
		int		odd = 0;
		
		for(int i = 1; i <= 100; i = i + 2) {
			//	이것이 100번 반복되는 이유는?
			//		카운터를 1씩 증가하기 때문이다.
			//	그러면 만약 카운터를 2씩 증가시키면 50번만 반복될 것이다.
			//	이 원리를 이용하면 다른 방법으로도 해결할 수 있지 않을까?
			//		i = 1;
			//		i = 3;
			//		...
			//		i = 99
			odd = odd + i;
		}
		System.out.println("결과 = " + odd);
	}

}


