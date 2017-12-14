package P0619;
/*
 * 	문제
 * 		1~100사이의 숫자중에서 홀수의 합만 계산하세요
 * 
 * 		힌트
 * 			1~100까지 반복하면서 홀수만 더하만 된다.
 */
public class Test06 {

	public static void main(String[] args) {
		int		odd = 0;
//		int		even = 0;
		for(int i = 1; i <= 100; i++) {
			//	홀수일 경우에만 더하면 된다.
			if(i % 2 == 1) {
				odd = odd + i;
			}
//			else {
//				even = even + i;
//			}
		}
		
		System.out.println("홀수 결과 = " + odd);
//		System.out.println("짝수 결과 = " + even);
	}
}
