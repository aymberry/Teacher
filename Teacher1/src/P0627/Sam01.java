package P0627;
/*
 * 	1~100까지 합을 계산하세요
 */
public class Sam01 {

	public static void main(String[] args) {
		int		hap = 0;
		
//			hap = hap + 1;
//			hap = hap + 2;
//			hap = hap + 3;
//			//	...
//			hap = hap + 100;
//		int		count = 0;
		for(int i = 0; i < 100; i++) {
			//	for 명령의 의미는 비슷한 작업을 여러번 반복해야 하는 경우
			//	단순히 반복을 시키기 위해서 하는 명령이다.
			//	i 변수는 반복 회수만 측정하는 변수이다.
			
			//	어짜피 i 변수가 0, 1, 2, 3,.... 변할텐데... 이것을 활용할 수
			//	없을까?
//			count = count + 1;
//			hap = hap + count;			
			hap = hap + (i + 1);
		}
		System.out.println("결과 = " + hap);
	}

}



