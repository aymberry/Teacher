package P0620;

public class Home04 {

	public static void main(String[] args) {
		for(int num = 3; num <= 100; num++) {
		//	�����ϱ� ���� ������ Ư���� ���� ����Ѵ�.
			boolean	test = false;			//	�ڼ��̴�.
			for(int i = 2; i <= num - 1; i++) {
				int	temp = num % i;
				if(temp == 0) {
					//	�� ���� �ڼ��� �ƴϴ�.
					test = true;		//	�ڼ��� �ƴϴ�.
					break;
				}
			}
			if(test == true) {
				//	�ڼ��� �ƴϴ�.
			//	System.out.println(num + "�� �ڼ��� �ƴϴ�.");
			}
			else {
				//	�Ҽ��̴�.
				System.out.println(num + "�� �ڼ��̴�.");
			}
		}
	}

}
