package P0621;
import		java.util.*;
public class Home03 {

	public static void main(String[] args) {
		//	�ѹ��� ������ �ϵ��� �Ѵ�.
		Scanner	sc = new Scanner(System.in);
		//	 �ʿ��� ������ ������
		int		win = 0;			//	��ǻ�Ͱ� �̱� ȸ���� ����� ����
		int		draw = 0;			//	��� ȸ���� ����� ����
		int		lost = 0;			//	��ǻ�Ͱ� �� ȸ���� ����� ����
		
		for(int i = 0; i < 10; i++) {
			//	��ǻ�Ͱ� ������ ������ �Ѵ�.
			int		com = (int)(Math.random() * (3 - 1 + 1) + 1);
			//	����ڰ� ������ ������ �Ѵ�.
			System.out.println("��� ������� ���� ");
			int		user = sc.nextInt();
			
			int		temp = com - user;
			
//			if(temp == 0) {
//				draw++;
//			}
//			else if(temp == -2 || temp == 1) {
//				lost++;
//			}
//			else {
//				win++;
//			}
			switch(temp) {
			case	0:
				draw++;
				break;
			case	-2:
			case	1:
				lost++;
				break;
			case	-1:
			case	2:
				win++;
				break;
			}
		}
		//	���� ����� �������.
		System.out.println("��ǻ�� = " + win + " �̱��");
		System.out.println("��ǻ�� = " + lost + " ����");
		System.out.println("��ǻ�� = " + draw + " ����.");
	}
}



