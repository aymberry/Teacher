package BoChung0705;
/*	
 * Call By Value�� �Լ��� ȣ���� �� ���¸� ����.
 */
public class Test01 {

	static void swap(int a, int b) {	//	int a = a, int b = b
		//	�� �Լ��� �Ű������� Call By Value���·� �ް� �ִ�.
		//		a������ b ������ ���Ǵ� ������ ���� �������̴�.
		//	
		//	Ư¡
		//	Call By Value�� ���� �ٸ� �޸𸮿� ���縦 �ޱ� ������
		//	�Լ��ȿ��� �����Ͱ� �ٲ���� main�� �����ʹ�
		//	�ٲ��� �ʴ´�.
		
		//	�� �Լ��� �ΰ��� �������� ��ȯ�ϴ� ����� �ϴ� �Լ��̴�.
		System.out.println("�Լ��ȿ��� ��ȯ��");
		System.out.println("A = " + a + ", B = " + b);
		
		int		temp = a;
		a = b;
		b = temp;
		System.out.println("�Լ��ȿ��� ��ȯ��");
		System.out.println("A = " + a + ", B = " + b);
	}
	public static void main(String[] args) {
		int		a = 10, b = 20;
		System.out.println("main�ȿ��� ��ȯ��");
		System.out.println("A = " + a + ", B = " + b);
		
		swap(a, b);
		
		System.out.println("main�ȿ��� ��ȯ��");
		System.out.println("A = " + a + ", B = " + b);
	}
}







