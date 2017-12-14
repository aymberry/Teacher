package P0628;
/*
 * 	문제
 * 		랜덤하게 두수를 발생한 후
 * 		그 수중 가장 큰값을 알아내서 출력하는 프로그램을 작성하세요.
 * 
 * 		단,	데이터 입력, 큰값을 구하는 부분, 출력부분은 함수로 만드세요.
 * 
 * 		이때 	데이터 입력시 범위는 그때마다 달라진다.
 */
public class Test02 {
	static int Input(int small, int big) {
		//	목적은 랜덤한 숫자를 발생해서 알려주는 기능이다.
		//	랜덤한 숫자의 범위는 달라진다.
		
		int	temp = (int)(Math.random() * (big - small + 1) + small);
		return temp;
	}
	static int getMax(int num1, int num2) {
		//	목적은 두수중 큰수를 알려주는 기능이다.
		
		int	temp = (num1 > num2) ? num1 : num2;
		return temp;
	}
	static void Display(int max) {
		//	목적은 결과물(큰수)를 출력하는것이다.
		System.out.println("큰 수 = " + max);
	}
	//	자동 실행되는 유일한 함수이므로...
	public static void main(String[] args) {
		//	할일
		//		두수 입력 받는다.
		int	num1 = Input(10, 100);
		int	num2 = Input(10, 100);
		//		큰값 구한다.
		int	max = getMax(num1, num2);
		//		출력한다.
		Display(max);
	}

}








