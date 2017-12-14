package P0620;

public class Home06 {

	public static void main(String[] args) {
//		int		hap = 0;
//		for(int i = 1; i <= 100; i++) {
//			hap = hap + i;
//			if(i % 10 == 0) {
//				System.out.println("1 ~ " + i + "의 합 = " + hap);
//			}
//		}
		int	hap = 0;
		for(int j = 10; j <= 100; j = j + 10) {
			hap = 0;
			//	이것이 필요한 이유
			//	아래 반복을 j = 10일이 한번하면 1~10까지의 합이 계산된다.
			//	다시 j = 20일때 한번하면 1~20까지의 합이 계산된다.
			//	만약 위의 문장이 없으면 10까지의 결과에 더해서
			///	다시 1~20까지의 합이 계산되어진다.
			
			//	그러므로 새로운 계산을 하기 위해서는 먼저 결과를 버려야한다
			for(int i = 1; i <= j; i++) {
				hap = hap + i;
			}
			System.out.println("1 ~ " + j + "의 합 = " + hap);
		}
	}
}


