package Test;
import		java.util.*;
public class Test {
//	m03-244-892
	public static void main(String[] args) {
		//	Calendar Ŭ������ �����Ѵ�.
		Calendar	car = Calendar.getInstance();
		//	���ϴ� ���� 1���� ������ �����Ѵ�.
		//	����	���� 1���� 0���� �ϹǷ� 7���� ���ϸ� 6����
		//			�Է��ؾ� �Ѵ�.
		car.set(2017,  11, 1);
		//	�׳�(1��)�� ������ ���Ѵ�.
		int	week = car.get(Calendar.DAY_OF_WEEK);
		//	�״��� ������ ���� ���Ѵ�.
		int	last = car.getMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("  ��  ��  ȭ  ��  ��  ��  �� ");
		System.out.println("==============================");
		//	���ȸ���� ������ ����
		int		printcount = 0;
		//	���ۿ��ϸ�ŭ(7���̸� ������̹Ƿ�) �ݿ��ϱ���
		//	�������� ����Ѵ�.
		for(int i = 0; i < week - 1; i++) {
			System.out.print("    ");
			//	�ѹ� ����Ҷ����� ���ȸ���� �����Ѵ�.
			printcount++;
		}
		//	���������� �޷��� ����Ѵ�.
		for(int i = 1; i <= last; i++) {
			//	7�� ����ϸ� ������ ���� �ٲ۴�.
			if(printcount % 7 == 0) {
				System.out.println();
			}
			//	�޷� ����Ѵ�.
			System.out.printf("  %2d", i);
			printcount++;
		}
	}

}
