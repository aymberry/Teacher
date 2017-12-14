package P0622;
/*
 * 	문제
 * 		10개의 데이터를 랜덤하게 입력한 후
 * 		그 중 가장 큰값을 출력하라.
 * 
 * 		원리		첫번째 데이터를 가장 큰 데이터로 일단 가정한다.
 * 					다음 데이터부터 마지막 데이터까지 비교하면서
 * 					현재 데이터보다 크면 바꿔치기 한다.
 */
public class Test03 {
	public static void main(String[] args) {
		int[]	num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
			System.out.println(num[i]);
		}
		
		int		max = num[0];
		for(int i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		
		System.out.println("가장 큰 값 = " + max);

	}

}



