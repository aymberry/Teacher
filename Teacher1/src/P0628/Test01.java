package P0628;
/*
 * 	문제
 * 		가로와 세로 길이를 랜덤하게 입력한 후
 * 		사각형의 면적을 구해서 출력하는 프로그램을 작성하세요
 * 
 * 		단.		입력, 계산, 출력은 함수로 만들어서 해결하세요.
 */
public class Test01 {
	
	//	데이터 입력 함수
	static int Input() {
		//	이 함수의 목적을 랜덤한 숫자 하나를 만들어서 알려주는것이다.
		int		temp = (int)(Math.random() * (100 - 10 + 1) + 10);
		return temp;
		//	참고	함수는 한가지 목적을 달성하기 위해서 만들어지는
		//			가장 작은 단위의 프로그램이다.
		//			그러므로 그 함수는 결과는 1개이던지 없던지(void)
		//			해야 한다.
		//			함수의 결과가 2개 이상 나올수는 없다.
	}
	//	계산 함수
	static int Calc(int garo, int sero) {
		//	이 함수의 목적은 사각형의 면적을 계산해서 그 결과를 만드는
		//	함수이다.
		int	temp = garo * sero;
		
		return temp;
		
	}
	//	출력함수
	static void Display(int area) {
		//	이 함수의 목적은 사각형의 면적을 출력하는것이다.
		System.out.println("면적 = " + area);
	}
	
	public static void main(String[] args) {
		//	main 함수는 진입점 함수로서 자동 실행되는 유일한 함수이다.
		//	그러므로 이곳에서 출발해서 원하는 목적을 달성하도록 하자.
		//	가로, 세로를 입력받아
		int		a = Input();
		int		b = Input();
		//	면적을 구하고
		int		mun = Calc(a, b);
		//	출력하라.
		Display(mun);
	}
}




