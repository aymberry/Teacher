package P0614;

public class Test16 {

	public static void main(String[] args) {
		int		a = 10;
		int		b = 20;
		int		c = 30;
//		boolean	result = ++a > ++b && ++a > ++c;
		//	�� ��쿡�� ���� ������ ���Ѵ�.
		//	��� ���� ����� false�̹Ƿ� ���̻� ������
		//	���� �ʴ´�.		a = 11
		boolean	result = ++a > ++b & ++a > ++c;
		//	�� ��쿡�� ���� ������ ���� �ʴ´�.
		//	��� ���� ����� false�� �������� ������ �������
		//	�� �����ϹǷ�			a = 12
		System.out.println("A = " + a);
	}
}
