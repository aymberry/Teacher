package P0619;
/*
 * 	����
 * 		1~100������ �����߿��� Ȧ���� �ո� ����ϼ���
 * 
 * 		��Ʈ
 * 			1~100���� �ݺ��ϸ鼭 Ȧ���� ���ϸ� �ȴ�.
 */
public class Test06 {

	public static void main(String[] args) {
		int		odd = 0;
//		int		even = 0;
		for(int i = 1; i <= 100; i++) {
			//	Ȧ���� ��쿡�� ���ϸ� �ȴ�.
			if(i % 2 == 1) {
				odd = odd + i;
			}
//			else {
//				even = even + i;
//			}
		}
		
		System.out.println("Ȧ�� ��� = " + odd);
//		System.out.println("¦�� ��� = " + even);
	}
}
