package P0622;
/*
 * 	����
 * 		10���� ������ ������ ���ڸ� ä���
 * 		�װ��� �հ� ����� ���ؼ� ����ϼ���.
 */
public class Test02 {
	public static void main(String[] args) {
		int[] num = new int[10];
		//	num�� ��� ����� ������
		//	new �� �����Ƿ�... �� ������ Stack �� �����.
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		
//		hap = hap + num[0];
//		hap = hap + num[1];
//		....
//		hap = hap + num[9];
		int		hap = 0;
		for(int i = 0; i < num.length; i++) {
			hap = hap + num[i];
		}
		
		float	avg = 0.0F;
		avg = (float)hap / num.length;
		
		System.out.println("�� = " + hap);
		System.out.println("��� = " + avg);
	}

}
