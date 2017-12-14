package P0626;
/*
 * 	문제
 * 		[그림1]과 같은 2차 배열을 만들고
 * 		각각의 방에 랜덤한 숫자를 입력해서 출력하세요
 */
public class Test04 {
	public static void main(String[] args) {
		//	1.	2차 배열 주소를 기억할 변수를 준비한다.
		int[][]		num;
		//	2.	1차 배열의 주소를 기억할 공간을 3개 준비한다.
		num = new int[3][];
		//	3.	각각의 1차 배열을 준비한다.
		num[0] = new int[4];
		num[1] = new int[5];
		num[2] = new int[3];		//	여기까지는 통일된 규칙이 없으므로
									//	반복 명령을 사용할 수 없다.

		//	문제에 의해서 랜덤한 숫자를 각각의 장소에 기억하면 된다.
		
		//	1차 배열이 3개 있으므로 반복해보자.
		for(int i = 0; i < num.length; i++) {
			//	각각의 1차 배열에 데이터를 랜덤하게 입력한다.
			//	이때 	첫번째 반복할 때는 4번만 반복해야 하고
			//			두번째 반복할 때는 5번만 반복해야 하고
			//			세번째 반복할 때는 3번만 반복해야 한다.
			//	규칙을 찾아보니
			//		각각의 배열의 방의 개수와 동일하게 반복하더라.
			for(int j = 0; j < num[i].length; j++) {
				num[i][j] = (int)(Math.random() * (100 - 0 + 1) + 0);
			}
		}
		
		//	출력하자.
		for(int i = 0; i < num.length; i++) {
			//	각각의 줄은 역시 마찬가지로 	처음에는 4번
			//										두번째 5번
			//										세번째 3번	반복해서 출력한다.
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "    ");
			}
			System.out.println();
		}
	}
}






