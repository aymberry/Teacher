package P0721;
/*
 * 	����	10���� �迭�� ������ ���ڸ� �Է��� ��
 * 			��� ���ؼ� �������.
 */
public class Test04 {
	public static void main(String[] args) {
		int[]	nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101);
		}

		int	total = 0;
		for(int temp : nums) {
			System.out.print(temp + "  ");
			total = total + temp;
		}
		//	����	�迭 Ȥ�� �÷����� �����͸� �������� ����� �� �ִ�.
		//			������ ����� ������ ������ �Ұ����ϴ�.
		
		System.out.println("   ==>  " + total);
		
	}
}



	