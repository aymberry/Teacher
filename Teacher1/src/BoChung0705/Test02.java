package BoChung0705;

public class Test02 {
	static void swap(int[] a) {		//	int[] a = a; 
		//	�̹����� �Ű������� �ּҸ� �ް� �ִ�.
		//	Call  By Reference �� �ϰ� �ִ�.
		
		//	Ư¡
		//		Call By Reference �� �ּҸ� �޴´ٴ� ���̴�.
		//		�� �ǹ̴� ����ϴ� ���� ������ ������ ���ٴ� �ǹ��̴�.
		//		���ʿ��� �ٲٸ� �ٸ� �������� �ٲ��.
		
		System.out.println("�Լ��ȿ��� ��ȯ	��");
		System.out.println("A = " + a[0] + ", B = " + a[1]);
		
		int		temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		System.out.println("�Լ��ȿ��� ��ȯ��");
		System.out.println("A = " + a[0] + ", B = " + a[1]);
	}
	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 10;
		a[1] = 20;
		System.out.println("main�ȿ��� ��ȯ��");
		System.out.println("A = " + a[0] + ", B = " + a[1]);
		
		swap(a);
		
		System.out.println("main�ȿ��� ��ȯ��");
		System.out.println("A = " + a[0] + ", B = " + a[1]);
	}

}
