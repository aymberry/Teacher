package P0622;
/*
 * 	5���� �迭�� 1~10������ ������ ���ڸ� �߻��� ��
 * 	������ �迭�� ���� �����Ͱ�����ŭ #�� ����ϵ��� �Ѵ�.
 * 
 * 	��>		[0] : 5			#####
 * 			[1] : 7			#######
 * 			...
 * 			[4] : 4			####
 */
public class Test04 {

	public static void main(String[] args) {
		int[] num = new int[5];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (10 - 1 + 1) + 1);
		}
		
		//	5���� ����ؾ� �Ѵ�.
		for(int i = 0; i < num.length; i++) {
			//	�� ���� �������� ������ŭ �ݺ��ϸ鼭 ����ؾ� �Ѵ�.
			for(int j = 0; j < num[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}



