package BoChung0704;
/*
 * 	5������ �л� ������ �Է� �޾Ƽ� ������ ����� ���ؼ� 
 * 	����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * 	��,		�Է�, ���(����, ���), ����� �Լ��� �̿��ϼ���.
 */
public class Test03 {
	
	static int[] Input() {
		int[]	temp = new int[5];
		for(int i = 0; i < 5; i++) {
			temp[i] = (int)(Math.random() * 100);
		}
		return temp;
	}
	
	static int calcTotal(int[] temp) {
		int	hap = 0;	//	�հ踦 ���ϴ� ������ ���� �����
		for(int i = 0; i < 5; i++) {
			hap = hap + temp[i];
		}
		return hap;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
