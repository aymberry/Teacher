package P0712;
public class Test04 {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		int		b = 0;
		int		pos = 7;
		int		c;
		try {
			c = num[pos] / b;
		//	pos ������ 0~4�� �ƴϸ� ���ܰ� ����
		//	b ������ 0�� ���Ǹ� ���ܰ� ����.
		//	�׸��� Ȥ�� �� �ٸ� ���ܰ� �߻��� �� �ִ�.	
		}
		catch(ArithmeticException e) {
			//	�� �κ��� 0���� ���� ��쿡 ����Ǵ� �κ��̴�.
			System.out.println("���� 0���� ���� ���� ó�� �κ�");
			c = num[pos] / 1;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//	�� �κ��� �迭 ����� ����Ǵ� �κ��̴�.
			System.out.println("���� �迭�� ��� ���� ó�� �κ�");
			c = num[0] / b;
		}
		catch(Exception e) {
			System.out.println("���� ��Ÿ ���� ó�� �κ�");
		}
	}
}
