package P0619;
/*
 * 	����
 * 		7�� �������� ����ϼ���
 * 
 * 		7 * 1
 * 		7 * 2
 * 		7 * 3
 * 		...
 * 		7 * 9			���ϱ� �۾��� 9�� �ݺ��ȴ�.
 */
public class Test04 {

	public static void main(String[] args) {

		for(int num = 1; num < 10; num++) {
			//	num = 1
			//	num = 2
			//	...
			//	num = 9
			int		dap = 7 * num;
			System.out.println("7 * " + num + " = " + dap);
		}
	}
}
