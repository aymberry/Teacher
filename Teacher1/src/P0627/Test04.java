package P0627;
/*
 * 	10명학생의 3과목 점수를 입력한 후
 * 	총점을 구하고.....
 * 
 * 	총점이 높은 순서대로 정렬하여 출력하라.
 */
public class Test04 {
	public static void main(String[] args) {
		int[][] score = new int[10][4];
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 3; j++) {
				score[i][j] = (int)(Math.random() * 101);
			}
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 3; j++) {
				score[i][3] = score[i][3] + score[i][j];
			}
		}
		
		//	정렬을 시도한다.
		//	라운드 수는 9라운드이다.
		for(int i = 0; i < 9; i++) {
			//	각 라운드는 다음수부터 마지막까지 비교한다.
			for(int j = i + 1; j < 10; j++) {
				if(score[i][3] < score[j][3]) {
					//	두 사람을 바꾸어야 한다.
					
//					int	temp = score[i][3];
//					score[i][3] = score[j][3];
//					score[j][3] = temp;
//					//	아하 점수가 안바뀌므로 문제가 있구나
//					//	점수도 바꿔야한다.
//					temp = score[i][0];
//					score[i][0] = score[j][0];
//					score[j][0] = temp;
//					
//					temp = score[i][1];
//					score[i][1] = score[j][1];
//					score[j][1] = temp;
//					
//					temp = score[i][2];
//					score[i][2] = score[j][2];
//					score[j][2] = temp;
					
					//	1차 배열의 주소의 위치를 바꾸면
					//	출력 순서도 바뀔것이다.
					//	score[0];		300		
					//	score[1];		500	
					int[] temp = score[i];
					//	주소를 기억할 경우에는 반드시
					//	그 주소의 Heap Type 과 동일한 변수에만 기억할 수
					//	있다.
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "    ");
			}
			System.out.println();
		}
		
		

	}

}
