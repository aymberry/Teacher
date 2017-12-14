package P0628;
/*m48-066-226
 * 		10개의 배열을 만들고 그 안에 데이터를 랜덤하게 입력한 후
 * 		총 합을 구하는 프로그램을 작성하세요
 * 
 * 		단	데이터 입력, 합계를 내는 부분, 출력은 함수를 이용하세요
 */
public class Test03 {
	static void Input(int[] a) {	//	int[] a = num;		700이 기억된다.
		for(int i = 0; i < 10; i++) {
			a[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
			//	함수에서 공간을 채우면 원본(main)에서도
			//	채워진 데이터를 사용할 수 있게 된다.
		}
	}
	
	static int Calc(int[] num) {		//	int[] num = num;
		int	hap = 0;
		for(int i = 0; i < 10; i++) {
			hap = hap + num[i];
		}
		
		return hap;
	}
	
	static void Display(int[] a, int sum) {	//	int[] a = num
												//	int sum = hap
		for(int i = 0; i < 10; i++) {
			System.out.print(a[i] + "     ");
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[]	num = new int[10];
		//	이제 함수를 하나 만들어서 이 배열에 데이터를 채워보자.
		//	어떻게 하면 함수에서 만들어진 배열의 공간을 알 수 있을까?
		//	참고
		//		배열은 주소를 이용해서 접근하는 개념이다.
		//		아하~~~~~~
		//		주소를 알려주면 배열 공간을 사용할 수 있겠구나
		Input(num);
		//	이제 합을 구하는 계산을 함수를 이용해서 해야한다.
		//	이때도 배열 공간의 데이터를 몽땅 알려주어야 합을 계산할 수 있다.
		//	어떻게 하면 배열 공간의 데이터를 한번에 알려줄 수있을까?
		//	결론	주소를 알려주면 배열 공간을 사용할 수 있으므로
		//			데이터를 몽땅 알려준 효과가 되지 않을까?
		int	hap = Calc(num);
		
		//	결과를 출력해보자.
		//	10개의 데이터와 합계를 같이 출력하고 싶어서...
		//	10개의 데이터를 알려주어야 한다.
		//	같은 개념으로 주소를 알려주면 그 공간을 사용할 수 있겠다.
		Display(num, hap);
	}
}




