package P0630;

public class Test02 {
	//	�������� �Լ��� �̿��ؼ� �ʿ��� �����͸� �հ踦 ���ϴ�
	//	�Լ��� ����� ����.
	static int hap(int ... num) {
		//	�̶� num�� �ڵ� �迭 ������ �ȴ�.
		//	��, �� �Լ��� �̿��ϴ� �������� �˷��� �������� ������ŭ
		//	����� �� �ִ� �迭 ������ �� ���̴�.
		//	��>		hap(5, 6, 7, 8, 9);
		//			int[] num = {5, 6, 7, 8, 9}			�� �Ǵ� ���̴�.
		//	��>		hap(5, 6, 7, 8, 9, 10, 12);
		//			int[] num = {5, 6, 7, 8, 9, 10, 12}	�� �Ǵ� ���̴�.
		
		int	hap = 0;
		for(int i = 0; i < num.length; i++) {
			hap = hap + num[i];
		}
		return hap;
	}
	public static void main(String[] args) {
		//	������ ���� �Լ��� �̿��� ����.
		
//		int	result1 = hap(1, 2, 3);
//		System.out.println(result1);

//		int	result1 = hap(1, 2, 3, 4, 5);
//		System.out.println(result1);

		int	result1 = hap(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(result1);
	}

}



