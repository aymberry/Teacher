package P0621;
import		java.util.*;
public class Home02 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		int		computer = (int)(Math.random() * (100 - 1 + 1) + 1);
		int		count = 0;		//	�õ� ȸ���� ����� ���� 
		while(true) {
			//	�ϴ� �������� ���� ���ڸ� �Է� �޴´�.
			System.out.print("����� ������ �� = " );
			int		user = sc.nextInt();
			//	�ѹ� �õ��� �Ȱ��̴�.
			count++;
			//	1.	�����̴�?
			if(computer == user) {
				System.out.println(count + "�� ���� ������ �����.");
				break;
			}
			//	2.	�õ� ȸ���� 10���� �Ǿ���?
			if(count == 10) {
				System.out.println("10�� �õ��ص� ������ �ƴϹǷ� ������ �����Ѵ�.");
				break;
			}
			if(computer > user) {
				//	3.	���� ũ��?
				System.out.println("���� ������");
			}
			else {
			//	4.	���� �۴�?
				System.out.println("���� ���߼���");
			}
		}
	}
}
