package P0623;
import	java.util.*;
/*
 * 	����
 * 		10���� �迭 ������ �����ϰ� ���ڸ� �Է��� ��
 * 
 * 		�̰��� ũ�� ������� ����ϼ���
 * 
 * 		���� �˰���
 * 		==>		 �������� ����
 * 
 *	����
 *		��ü���� ����?
 *		�����ڰ� �ʿ��� ����� ��ǰȭ ���Ѽ� ������ ��
 *		�����ڴ� �ʿ��� ��ǰ�� �ʿ��� ��ġ�� ��븸 �ϸ� �ذ�ǵ��� �ϴ� ����̴�. 
 */
public class Test02 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		//	���� ������ ����غ���.
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "   ");
		}
		System.out.println();
		//	������ �õ��Ѵ�.
		//	���� ȸ����ŭ �ݺ��� �Ѵ�.
		for(int i = 1; i <= 9; i++) {
			//	������ ����ϴ��� �ݺ��Ѵ�.
			//	�� ������ �ݺ� ȸ���� �����Ѵ�.
			//	1R		9��
			//	2R		8��
			for(int j = i; j <= 9; j++) {
				//	���ٿ� ����� ������ŭ �ݺ��Ѵ�.
				//	���� �� �����͸� ���Ѵ�.
				if(num[i -1] > num[j]) {
					//	�� �����͸� ��ȯ�ض�
					int	temp = num[i - 1];
					num[i - 1] = num[j];
					num[j] = temp;
				}
			}
		}

		//	�ٲ� ����� ����غ���.
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "   ");
		}
		System.out.println();
	}
}
