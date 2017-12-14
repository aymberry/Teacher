package P0619;
/*
 * 	문제
 * 		7단 구구단을 출력하세요
 * 
 * 		7 * 1
 * 		7 * 2
 * 		7 * 3
 * 		...
 * 		7 * 9			곱하기 작업이 9번 반복된다.
 */
public class Test04 {

	public static void main(String[] args) {

		for(int num = 1; num < 10; num++) {
			//	num = 1
			//	num = 2
			//	...
			//	num = 9
			int		dap = 7 * num;
			System.out.println("7 * " + num + " = " + dap);
		}
	}
}
