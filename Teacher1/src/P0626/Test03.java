package P0626;
/*
 * 	�� �л��� 5���� ������ 15�л� �з� �Է��� ��
 * 	�� �л��� ������ ����Ͽ� ����϶�.
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		int[][] score = new int[15][6];
		//		[10]�� �ǹ̴� 10���� �ǹ��̰�
		//		[4]�� �ǹ̴� �� ���� ĭ�� �ǹ��̴�.
		
		//	���� �Է��� �غ���
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length - 1; j++) {
				score[i][j] = (int)(Math.random() * (100 - 0 + 1) + 0);
			}
		}
		//	������ ���غ���.
		//		0.3 = 0.3 + 0.0
		//		0.3 = 0.3 + 0.1
		//		0.3 = 0.3 + 0.2		���л� ����
		//		1.3 = 1.3 + 1.0
		//		1.3 = 1.3 + 1.1
		//		1.3 = 1.3 + 1.2		���л� ����
		
		//		�� ������ 5�� �ݺ��Ǹ� ��� �л��� ������ ���ȴ�.
		
		//	5�л��� ������ ���ؾ� �Ѵ�.
		for(int i = 0; i < score.length; i++) {
			//	�� �л��� 3���� ������ ���ؾ� �Ѵ�.
			for(int j = 0; j < score[i].length - 1; j++) {
				score[i][score[i].length -1] = score[i][score[i].length - 1] + score[i][j];
			}
		}
		
		//	���������� ����� �غ����� ����.
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
