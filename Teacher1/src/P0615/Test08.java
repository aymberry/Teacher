package P0615;
/*
 * 	문제
 * 		숫자 하나를 입력하면 그 숫자의 절대값을 출력하세요.
 */
public class Test08 {
	public static void main(String[] args) {
		int		num = -10;		//	나증에 음수로 바꾸어서 테스트 한다.
		
		int		abs =	(num > 0)	? num : -num;
		//		num > 0가 참이면 num 만 실행하고
		//		num > 0가 거짓이면 -num을 실행하라.
		System.out.println(abs);
	}
}


