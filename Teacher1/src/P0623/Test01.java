package P0623;
/*
 * 	����
 * 		1~10������ ���ڸ� ������� �迭 ������ �Է��� ��
 * 
 * 		�̰��� ������ �� ����ϵ��� �ϼ���.
 * 
 *  	����
 *  		������� �Է� �� ��
 *  		���� �� ��ġ�� ���ڸ� �ٲ۴�.
 *  		(�� ������ ������ �ݺ��ϸ� ������ �����ϰ� �ٲ� ���̴�.)
 */
public class Test01 {
	public static void main(String[] args) {
		//	�����͸� ������� �Է�����.
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
		System.out.println();
		
		//	���� �迭�� �����͸� ����.
		//	��� ����� ������ �� ��ġ�� �����͸� ��ȯ�ϸ� �ȴ�.
		//	��� ������ ������ �ݺ��ϸ� ��� �����Ͱ� ��ġ�� �ٲ���̴�.
		for(int i = 0; i < 1000; i++) {
			//	������ �� ��ġ�� �߻��Ѵ�.
			int	pos1 = (int)(Math.random() * (9 - 0 + 1) + 0);
			int	pos2 = (int)(Math.random() * (9 - 0 + 1) + 0);
			//	�� ��ġ�� �����͸� ��ȯ��Ű��.
			
			int	temp = num[pos1];		//	�ؾ������ ���� ���ǽ�Ų��.
			num[pos1] = num[pos2];
			num[pos2] = temp;
		}
		
		//	����� �������.
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "   ");
		}
		System.out.println();
	}
}








