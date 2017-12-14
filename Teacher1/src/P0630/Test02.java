package P0630;

public class Test02 {
	//	가변인자 함수를 이용해서 필요한 데이터를 합계를 구하는
	//	함수를 만들어 보자.
	static int hap(int ... num) {
		//	이때 num은 자동 배열 변수가 된다.
		//	즉, 이 함수를 이용하는 누군가가 알려준 데이터의 개수만큼
		//	기억할 수 있는 배열 변수가 된 것이다.
		//	예>		hap(5, 6, 7, 8, 9);
		//			int[] num = {5, 6, 7, 8, 9}			가 되는 것이다.
		//	예>		hap(5, 6, 7, 8, 9, 10, 12);
		//			int[] num = {5, 6, 7, 8, 9, 10, 12}	가 되는 것이다.
		
		int	hap = 0;
		for(int i = 0; i < num.length; i++) {
			hap = hap + num[i];
		}
		return hap;
	}
	public static void main(String[] args) {
		//	위에서 만든 함수를 이용해 보자.
		
//		int	result1 = hap(1, 2, 3);
//		System.out.println(result1);

//		int	result1 = hap(1, 2, 3, 4, 5);
//		System.out.println(result1);

		int	result1 = hap(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(result1);
	}

}



