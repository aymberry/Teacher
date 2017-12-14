package P0626;
/*
 * 	한 학생당 5과목 점수를 15학생 분량 입력한 후
 * 	각 학생의 총점을 계산하여 출력하라.
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		int[][] score = new int[15][6];
		//		[10]의 의미는 10줄의 의미이고
		//		[4]의 의미는 각 줄의 칸의 의미이다.
		
		//	이제 입력을 해보자
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length - 1; j++) {
				score[i][j] = (int)(Math.random() * (100 - 0 + 1) + 0);
			}
		}
		//	총점을 구해보자.
		//		0.3 = 0.3 + 0.0
		//		0.3 = 0.3 + 0.1
		//		0.3 = 0.3 + 0.2		한학생 총점
		//		1.3 = 1.3 + 1.0
		//		1.3 = 1.3 + 1.1
		//		1.3 = 1.3 + 1.2		한학생 총점
		
		//		이 과정이 5번 반복되면 모든 학생의 총점이 계산된다.
		
		//	5학생의 총점을 구해야 한다.
		for(int i = 0; i < score.length; i++) {
			//	한 학생당 3과목 점수를 더해야 한다.
			for(int j = 0; j < score[i].length - 1; j++) {
				score[i][score[i].length -1] = score[i][score[i].length - 1] + score[i][j];
			}
		}
		
		//	마지막으로 출력을 해보도록 하자.
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
