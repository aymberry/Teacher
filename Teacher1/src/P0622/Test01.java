package P0622;
/*
 *	����
 *		20���� ������ ����� ������ �迭�� �����
 *		������ ������ ������ ����(0~100)�� ����� �� �״�� �������.
 */
public class Test01 {
	public static void main(String[] args) {
		// 	�迭�� ����� Heap ������ ��������Ƿ� �ּҸ� ����ؾ�
		//	����� �� �ִ�.
		//	�ּҸ� ����� ������ �غ��Ѵ�.
		int[]	num;
		//	�����Ͱ� �� ������ ���� ��
		//	�� ������ ���� �ּҸ� ������ ����ؼ� ��밡���ϵ��� �Ѵ�.
		num = 	new int[20];
		
		for(int i = 0; i < num.length; i++) {
			//	�̶� 5�� �ǹ̴� �غ�� �迭�� ������ 5�� �̹Ƿ�
			//	5��� �� ���̴�.
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 1);
		}
//		num[1] = (int)(Math.random() * (100 - 0 + 1) + 1);
//		num[2] = (int)(Math.random() * (100 - 0 + 1) + 1);
//		num[3] = (int)(Math.random() * (100 - 0 + 1) + 1);
//		num[4] = (int)(Math.random() * (100 - 0 + 1) + 1);
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
		
		
		
		
	}

}





