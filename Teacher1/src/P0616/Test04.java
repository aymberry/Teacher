package P0616;
/*
 * 	문제
 * 		랜덤한 두 수를 입력한 후
 * 		반드시 크기 순서대로 출력하는 프로그램을 만드세요
 */
public class Test04 {
	public static void main(String[] args) {
		int		a = (int)(Math.random() * (100 - 1 + 1) + 1);
		int		b = (int)(Math.random() * (100 - 1 + 1) + 1);
		int		max, min;		//	큰수와 작은수를 구분해서 기억할 변수
		
		if(a > b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		
		System.out.println(max + "    " + min);
	}
}
