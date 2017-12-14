package P0627;
/*
 * 		5학생의 3과목 점수를 랜덤하게 입력한 후 총점과 평균을 구하세요.
 */
public class Test01 {
	public static void main(String[] args) {
		//	각 학생의 점수와 총점을 기억할 배열 변수를 준비한다.
		int[][]		score = new int[5][3 + 1];
		//	평균을 기억할 배열 변수를 따로 준비한다.
		//	배열의 특징은 같은 형태의 데이터만 관리할 수 있기 때문이다.
		float[]		avg = new float[5];
		
		//	각 학생의 점수를 입력하자.
		//		score[0][0]
		//		score[0][1]
		//		score[0][2]
		//		score[1][0]
		//		score[1][1]
		//		score[1][2]
		//		...
		//		score[4][0]
		//		score[4][1]
		//		score[4][2]
		//	큼지막하게 5번 반복하는구나
		for(int i = 0; i < 5; i++) {
			//	입력할 데이터의 위치가 처음에는 0, 
			//								다음에는 1이러라
			//	이때 i 변수도 0, 1, 2, 3, 4로 변화더라.
			
			//	작은 반복은 한번에 3번씩 반복을 한다.
			for(int j = 0; j < 3; j++) {
				//	j = 1, 2, 3으로 변화되는데.....
				//	입력할 위치는 0, 1, 2로 사용되는 구나
				score[i][j] = (int)(Math.random() * (100 - 0 + 1) + 0);
			}
		}
		
		//	총점을 구하자
		//		score[0][3] =score[0][3] + score[0][0]
		//		score[0][3] =score[0][3] + score[0][1]
		//		score[0][3] =score[0][3] + score[0][2]
		//		score[1][3] =score[1][3] + score[1][0]
		//		score[1][3] =score[1][3] + score[1][1]
		//		score[1][3] =score[1][3] + score[1][2]
		//		....
		//		score[4][3] =score[4][3] + score[4][0]
		//		score[4][3] =score[4][3] + score[4][1]
		//		score[4][3] =score[4][3] + score[4][2]
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				score[i][3] = score[i][3] + score[i][j]; 
			}
		}
		//	평균을 구해보자.
		//	avg[0] = score[0][3] / 3.0;
		//	avg[1] = score[1][3] / 3.0;
		//	....
		//	avg[4] = score[4][3] / 3.0;
		for(int i = 0; i < 5; i++) {
			//	i = 0, 1, 2, 3, 4...
			avg[i] = score[i][3] / 3.0F;
		}
		
		//	출력을 해보자.
		//		출력은 점수와 총점을 출력해야 한다.
		//		그리고 다음에 평균을 출력한다.
		//	5학생 분량을 출력하자.
		for(int i = 0; i < 5; i++) {
			//	점수와 총점은 한 학생당 4번 반복해야 출력된다.
			for(int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "     ");
				//	s[0][0]
				//	s[0][1]
				//	s[0][2]
				//	s[0][3]
				//	s[1][0]
				//	s[1][1]
				//	s[1][2]
				//	s[1][3]
				//	....
				//	s[4][0]
				//	s[4][1]
				//	s[4][2]
				//	s[4][3]
			}
			//	한 학생의 점수와 총점이 출력되고...
			System.out.println(avg[i]);
		}
	}
}






