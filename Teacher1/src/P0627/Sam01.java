package P0627;
/*
 * 	1~100���� ���� ����ϼ���
 */
public class Sam01 {

	public static void main(String[] args) {
		int		hap = 0;
		
//			hap = hap + 1;
//			hap = hap + 2;
//			hap = hap + 3;
//			//	...
//			hap = hap + 100;
//		int		count = 0;
		for(int i = 0; i < 100; i++) {
			//	for ����� �ǹ̴� ����� �۾��� ������ �ݺ��ؾ� �ϴ� ���
			//	�ܼ��� �ݺ��� ��Ű�� ���ؼ� �ϴ� ����̴�.
			//	i ������ �ݺ� ȸ���� �����ϴ� �����̴�.
			
			//	��¥�� i ������ 0, 1, 2, 3,.... �����ٵ�... �̰��� Ȱ���� ��
			//	������?
//			count = count + 1;
//			hap = hap + count;			
			hap = hap + (i + 1);
		}
		System.out.println("��� = " + hap);
	}

}



