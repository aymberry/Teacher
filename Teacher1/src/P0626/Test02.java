package P0626;
/*
 * 		5사람의 3과목 점수를 입력한 후
 * 		그대로 출력해보자.
 * 
 * 		한사람의 3과목 점수를 입력하기 위해서는 3개의 공간이 필요하다.
 * 		이 공간이 다시 5줄이 필요하다.
 */
public class Test02 {

	public static void main(String[] args) {
		int[][]	score;
		score = new int[5][];

		for(int i = 0; i < 5; i++) {
			score[i] = new int[3];
		}
//			score[0] = new int[3];
//			score[1] = new int[3];
//			score[2] = new int[3];	
//			score[3] = new int[3];
//			score[4] =	new int[3];
			
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				//	0.0		0.1		0.2
				//	1.0		1.1		1.2
				score[i][j] = (int)(Math.random() * (100 - 0 + 1) + 0); 
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(score[i][j] + "      ");
			}
			System.out.println();
		}
	}
}






