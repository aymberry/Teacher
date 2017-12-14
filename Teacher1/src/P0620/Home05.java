package P0620;

public class Home05 {

	public static void main(String[] args) {
//		int		hap = 0;
//		int		sign = 1;		//	홀짝을 처리할 임시 변수
//		for(int i = 1; i <= 100; i++) {
//			hap = hap + (i * sign);
//			sign = -sign;
//		}
//		System.out.println("결과 = " + hap);

		int		hap = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {	//	짝수니?	
				hap = hap - i;
			}
			else {				//	홀수니?
				hap = hap + i;
			}
		}
		System.out.println("결과 = " + hap);
	}
}



