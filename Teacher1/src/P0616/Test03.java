package P0616;
/*
 * 	문제
 * 		1~100사이의 랜덤한 숫자 하나를 입력한 후
 * 		이 숫자가 짝수인지 홀수인지를 출력하도록 한다.
 */
public class Test03 {

	public static void main(String[] args) {
		int		num = (int)(Math.random() * (100 - 1 + 1) + 1);
		String	result;		//	결과(짝수, 홀수)를 기억할 변수

		if(num % 2 == 0) {
			result = "짝수";
		}
		else {
			result = "홀수";
		}
		
		System.out.println("발생한 수 = " + num);
		System.out.println("결과 = " + result);
	}
}



