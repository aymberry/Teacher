package P0621;
/*
 * 	문제
 * 		1~100까지 합을 계산하라
 * 
 * 		이것은 100번을 반드시 반복해야 결과가 나온다는 보장이 있다.
 * 		이런 유형의 문제는 do~while로도 처리할 수 있다.
 */
public class Test05 {

	public static void main(String[] args) {
		int	hap = 0;		//	결과를 기억할 변수
		int	num = 0;		//	더할 숫자를 기억할 변수
		
		do {
			num = num + 1;	//	더할 숫자를 하나씩 증가하면서
			hap = hap + num;	//	1~100까지 합한다.
		} while(num < 100);
		
		System.out.println("결과 = " + hap);
	}
}
