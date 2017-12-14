package P0627;
/*
 * 	10명 학생의 3과목 점수를 입력한 후 총점을 구하고
 * 	석차를 구해서 출력하세요.
 * 
 * 	석차를 구하는 방법
 * 		0번 학생을 기준으로 하여 0 ~ 9학생까지 중에서 자신보다 높은 점수가 나오면 
 * 		카운트 한다.
 * 		==>		이 결과 + 1이 곧 자신의 석차이다.
 * 		1번 학생을 기준으로 하여 0 ~ 9학생까지 중에서 자신보다 높은 점수가 나오면
 * 		카운트 한다.
 * 		...
 * 		9번 학생을 기준으로 하여 0 ~ 9학생까지 중에서 자신보다 높은 점수가 나오면
 * 		카운트 한다.
 */
public class Test02 {
	public static void main(String[] args) {
		//	3과목의 점수와 총점, 석차를 기억할 배열을 준비한다.
		int[][]	score = new int[10][5];
		
		//	3과목의 점수를 입력하자.
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 3; j++) {
				score[i][j] = (int)(Math.random() * (100 - 0 + 1) + 0);
			}
		}
		//	총점을 계산하자.
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 3; j++) {
				score[i][3] = score[i][3] + score[i][j];
			}
		}
		//	석차를 계산한다.
		//	10명 학생의 석차를 구하는 과정을 반복해야 한다.
		for(int i = 0; i < 10; i++) {
			//	한 학생의 석차를 구하기 위해서는 10명 모두에게
			//	자신보다 큰 점수인지를 물어봐야 한다.
			//	질문 과정이 10번 반복된다.
			for(int j = 0; j < 10; j++) {
				//		score[0][3] < score[0][3]
				//		score[0][3] < score[1][3]
				//		score[0][3] < score[2][3]
				//		score[0][3] < score[3][3]
				//		score[0][3] < score[4][3]
				//		score[0][3] < score[5][3]
				//		score[0][3] < score[6][3]
				//		score[0][3] < score[7][3]
				//		score[0][3] < score[8][3]
				//		score[0][3] < score[9][3]
				
				//		score[1][3] < score[0][3]
				//		score[1][3] < score[1][3]
				//		score[1][3] < score[2][3]
				//		score[1][3] < score[3][3]
				//		score[1][3] < score[4][3]
				//		score[1][3] < score[5][3]
				//		score[1][3] < score[6][3]
				//		score[1][3] < score[7][3]
				//		score[1][3] < score[8][3]
				//		score[1][3] < score[9][3]
				if(score[i][3] < score[j][3]) {
					score[i][4]++;
				}
			}	//	한 학생의 석차가 구해지면
			//	강제로 1을 더해야 한다.
			score[i][4]++;
		}
		
		//	출력하자.
		//	10명 학생을 출력하는데....
		for(int i = 0; i < 10; i++) {
			//	한 학생은 3과목 + 총점 + 석차 => 5번 출력
			for(int j = 0; j < 5; j++) {
				System.out.print(score[i][j] + "     ");
			}
			System.out.println();
		}
	}
}
