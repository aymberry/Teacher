package P0622;
/*
 * 	문제
 * 		10개의 공간에 랜덤한 숫자를 채우고
 * 		그것의 합과 평균을 구해서 출력하세요.
 */
public class Test02 {
	public static void main(String[] args) {
		int[] num = new int[10];
		//	num는 어디에 만들어 지나요
		//	new 가 없으므로... 이 변수는 Stack 에 생긴다.
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		
//		hap = hap + num[0];
//		hap = hap + num[1];
//		....
//		hap = hap + num[9];
		int		hap = 0;
		for(int i = 0; i < num.length; i++) {
			hap = hap + num[i];
		}
		
		float	avg = 0.0F;
		avg = (float)hap / num.length;
		
		System.out.println("합 = " + hap);
		System.out.println("평균 = " + avg);
	}

}
