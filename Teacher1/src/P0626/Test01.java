package P0626;
/*
 * 	���������� 2�� �迭�� ����� ����.
 */
public class Test01 {
	public static void main(String[] args) {
		//	1.	��ü �ּ�(�迭�� �迭�ּ�)�� ������ ������ �غ��Ѵ�.
		int[][]		num;
		//	2.	1�� �迭�� �ּҸ� ������ ������ �����.
		num = new int[3][];
		//	3.	������ �迭�� ���� �����Ͱ� �� ������ �����.
		num[0] = new int[5];
		num[1] = new int[3];
		num[2] = new int[4];
		
		System.out.println(num.length);
		//	==>		1�� �迭�� ����(�л���)
		System.out.println(num[0].length);
		//	==>		������ �迭�� ����(�����)
		
		//	Heap Type�� ���� ��� ���
		int[][] temp1 = num;
		//		==>		Heap Type�� �Ѵ� int[][]	�̱⶧���̴�.
		//	int[]	temp2 = num;
		//		==>		temp2�� Heap Type�� int[]�̰�
		//				num�� Heap Type�� int[][]�̹Ƿ� �����̴�.
	}
}
