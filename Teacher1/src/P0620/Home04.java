package P0620;

public class Home04 {

	public static void main(String[] args) {
		for(int num = 3; num <= 100; num++) {
		//	시작하기 전에 변수에 특정한 값을 기억한다.
			boolean	test = false;			//	솟수이다.
			for(int i = 2; i <= num - 1; i++) {
				int	temp = num % i;
				if(temp == 0) {
					//	이 수는 솟수가 아니다.
					test = true;		//	솟수가 아니다.
					break;
				}
			}
			if(test == true) {
				//	솟수가 아니다.
			//	System.out.println(num + "은 솟수가 아니다.");
			}
			else {
				//	소수이다.
				System.out.println(num + "은 솟수이다.");
			}
		}
	}

}
