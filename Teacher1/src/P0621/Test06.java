package P0621;
//	������ �ϴ� ����� ������ ���� �Է��� �־�� �ϹǷ�...
import		java.util.*;
/*
 * 	����
 * 		��ǻ�Ϳ��� 1~100������ ������ ����ϵ��� �ϰ�
 * 		�������� �� ���ڸ� ���ߴ� ������ ���弼��.
 * 
 * 		���� ������� ������ ��������� ����ϼ���.
 * 
 * 		��	������ �ƴ� ���		���� ū ������
 * 									���� ���� ���������� ��Ʈ�� �ֵ��� �ϼ���
 */
public class Test06 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		//	��ǻ�Ͱ� ������ ����ϵ��� �Ѵ�.
		int			computer = (int)(Math.random() * (100 - 1 + 1) + 1);
		int			count = 0;		//	�õ��� Ƚ���� ����� ����
		
		//	�ּ��� �ѹ��� �õ��ؾ� �ϹǷ� do~while�� ����ϵ��� �Ѵ�.	
		do {
			//	���� ���ڸ� �Է��Ѵ�.
			count = count + 1;	//	 count++;
			System.out.print("����� ������ ���� �Է��ϼ��� ");
			int		user = sc.nextInt();
			if(computer == user) {
				//	���̻� �� ������ �ݺ��� �ʿ䰡 ����.
				break;
			}
			//	�� �κ��� ����ȴٴ� �ǹ̴� break ������ �ʾҴٴ� �ǹ��̴�.
			//	�� ���� ������ ������ ���ߴٴ� �ǹ��̴�.
			if(computer > user) {
				System.out.println("���� ū ���� �Է��ϼ���");
			}
			else {
				System.out.println("���� ���� ���� �Է��ϼ���");
			}
			//	�������� �ݺ����� �𸣰�
			//	������ �Ǹ� do~while�� �����ϵ��� �� �������Ƿ�...
		} while(true);

		System.out.println(count + " �� ���� ������ �������ϴ�.");
	}
}


