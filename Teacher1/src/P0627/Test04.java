package P0627;
/*
 * 	10���л��� 3���� ������ �Է��� ��
 * 	������ ���ϰ�.....
 * 
 * 	������ ���� ������� �����Ͽ� ����϶�.
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
		
		//	������ �õ��Ѵ�.
		//	���� ���� 9�����̴�.
		for(int i = 0; i < 9; i++) {
			//	�� ����� ���������� ���������� ���Ѵ�.
			for(int j = i + 1; j < 10; j++) {
				if(score[i][3] < score[j][3]) {
					//	�� ����� �ٲپ�� �Ѵ�.
					
//					int	temp = score[i][3];
//					score[i][3] = score[j][3];
//					score[j][3] = temp;
//					//	���� ������ �ȹٲ�Ƿ� ������ �ֱ���
//					//	������ �ٲ���Ѵ�.
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
					
					//	1�� �迭�� �ּ��� ��ġ�� �ٲٸ�
					//	��� ������ �ٲ���̴�.
					//	score[0];		300		
					//	score[1];		500	
					int[] temp = score[i];
					//	�ּҸ� ����� ��쿡�� �ݵ��
					//	�� �ּ��� Heap Type �� ������ �������� ����� ��
					//	�ִ�.
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
