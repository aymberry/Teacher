package P0620;

public class Home06 {

	public static void main(String[] args) {
//		int		hap = 0;
//		for(int i = 1; i <= 100; i++) {
//			hap = hap + i;
//			if(i % 10 == 0) {
//				System.out.println("1 ~ " + i + "�� �� = " + hap);
//			}
//		}
		int	hap = 0;
		for(int j = 10; j <= 100; j = j + 10) {
			hap = 0;
			//	�̰��� �ʿ��� ����
			//	�Ʒ� �ݺ��� j = 10���� �ѹ��ϸ� 1~10������ ���� ���ȴ�.
			//	�ٽ� j = 20�϶� �ѹ��ϸ� 1~20������ ���� ���ȴ�.
			//	���� ���� ������ ������ 10������ ����� ���ؼ�
			///	�ٽ� 1~20������ ���� ���Ǿ�����.
			
			//	�׷��Ƿ� ���ο� ����� �ϱ� ���ؼ��� ���� ����� �������Ѵ�
			for(int i = 1; i <= j; i++) {
				hap = hap + i;
			}
			System.out.println("1 ~ " + j + "�� �� = " + hap);
		}
	}
}


