package P0620;

public class Home05 {

	public static void main(String[] args) {
//		int		hap = 0;
//		int		sign = 1;		//	Ȧ¦�� ó���� �ӽ� ����
//		for(int i = 1; i <= 100; i++) {
//			hap = hap + (i * sign);
//			sign = -sign;
//		}
//		System.out.println("��� = " + hap);

		int		hap = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {	//	¦����?	
				hap = hap - i;
			}
			else {				//	Ȧ����?
				hap = hap + i;
			}
		}
		System.out.println("��� = " + hap);
	}
}



