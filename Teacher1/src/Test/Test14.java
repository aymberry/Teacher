package Test;

public class Test14 {
	public static void main(String[] args) {
		boolean	a = false;
		boolean	b = false;
		boolean	c = ((a = true) | (b = true));
		//	����		=	�� ���Կ������̴�.
		//				a = true�� ��ȭ�ȴ�.
		//				b = true�� ��ȯ�ȴ�.
		//	a, b, c ��� true

	}

}
