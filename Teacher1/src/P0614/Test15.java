package P0614;

public class Test15 {
	public static void main(String[] args) {
		int		a = 10;
		int		b = 20;
		int		c = 30;
		boolean	result = a > b && a > c;
		//		&&	�� ���Ǵ� ����
		//			a > b		false
		//			a > c		false		&&	�� false�� �ȴ�.
		System.out.println("��� = " + result);

	}

}
