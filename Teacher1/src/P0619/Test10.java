package P0619;
/*
 * 	주사위 2개를 던져서 눈의 합이 8이 되는 경우를 모두 구하세요.
 * 
 * 	원리
 * 		주사위 한개는 1	~ 6까지 나올 수 있고
 * 		다른 주사위도 1	~ 6까지 나올 수 있고
 * 		이 모든 경우를 일일이 대입해서 해결하면 된다.
 */
public class Test10 {
	public static void main(String[] args) {
		for(int one = 1; one <= 6; one++) {
			//	첫번째 주사위가 나올 수 있는 경우의 수
			for(int two = 1; two <= 6; two++) {
				//	두번째 주사위가 나올 수 있는 경우의 수
				//	이 부분은
				//	one	 = 1, two =1, 2, 3, 4, 5, 6
				//	one = 2, two =1, 2, 3, 4, 5, 6
				//	...
				//	one = 6, two =1, 2, 3, 4, 5, 6
				
				int	hap = one + two;
				//	노킹
				if(hap == 8) {
					System.out.println("1번 = " + one + "  2번 = " + two);
				}
			}
		}
	}
}
