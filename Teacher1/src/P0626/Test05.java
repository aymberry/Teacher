package P0626;
/*
 * 		7과목 점수를 10학생 분량으로 입력해서
 * 		총점을 계산하는 프로그램을 다시 제작하자.
 */
public class Test05 {
	public static void main(String[] args) {
//		int[][] score = new int[5][];
//		score[0] = new int[4];
//		score[1] = new int[4];
//		score[2] = new int[4];
//		score[3] = new int[4];
//		score[4] = new int[4];
		
		int[][] score = new int[10][7];		//	이렇게 만들어도
		//	메모리에는 지그제그 형태의 메모리 구조가 탄생된다.
		
		//	과목의 점수를 입력한다.
		for(int i = 0; i < score.length; i++) {
			//	필요한 과목수만큼 데이터를 입력한다.
			//	필요한 과목은 총점을 뺀 나머지 공간의 개수이더라.
			//	즉, 준비된 공간에서 한개를 뺀 공간의 개수가 되더라
			for(int j = 0; j < score[i].length - 1; j++) {
				score[i][j] = (int)(Math.random() * (100 - 0 + 1) + 0);
			}
		}
		
		//	총점을 계산하자.
		//	1번학생
//		0,3 = 0,3 + 0,1
//		0,3 = 0,3 + 0,2
//		0,3 = 0,3 + 0,3
		//	2번학생
//		1,3 = 1,3 + 1,1
//		1,3 = 1,3 + 1,2
//		1,3 = 1,3 + 1,3
		//	이때 총점이 기억되는 장소의 규칙을 봤더니
		//	뒤에가 3번이더라
		//		3번이 된 이유는 준비된 공간의 마지막 위치이기 때문이다.
		//		이 말을 바꾸면
		//		총점이 들어갈 방의 위치는 "공간 개수 - 1"이 이더라
		//	m97-311-954
		//	학생 수만큼 총점을 구해본다.
		for(int i = 0; i < score.length; i++) {
			//	한 학생을 계산하기 위해서는 3번 계산해야 한다.
			//	공간수 - 1만큼 계산하는 것이다.
			for(int j = 0; j < score[i].length - 1; j++) {
				score[i][score[i].length - 1] = score[i][score[i].length - 1] 
						+ score[i][j]; 
			}
		}
		
		//	출력하자.
		for(int i = 0; i < score.length; i++) {
			//	한 학생은 4번 출력해야 결과가 나온다.
			//	 이것은 준비된 공간 전체를 의미한다.
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "    ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}



