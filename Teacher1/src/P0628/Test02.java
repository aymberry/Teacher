package P0628;
/*
 * 	����
 * 		�����ϰ� �μ��� �߻��� ��
 * 		�� ���� ���� ū���� �˾Ƴ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * 		��,	������ �Է�, ū���� ���ϴ� �κ�, ��ºκ��� �Լ��� ���弼��.
 * 
 * 		�̶� 	������ �Է½� ������ �׶����� �޶�����.
 */
public class Test02 {
	static int Input(int small, int big) {
		//	������ ������ ���ڸ� �߻��ؼ� �˷��ִ� ����̴�.
		//	������ ������ ������ �޶�����.
		
		int	temp = (int)(Math.random() * (big - small + 1) + small);
		return temp;
	}
	static int getMax(int num1, int num2) {
		//	������ �μ��� ū���� �˷��ִ� ����̴�.
		
		int	temp = (num1 > num2) ? num1 : num2;
		return temp;
	}
	static void Display(int max) {
		//	������ �����(ū��)�� ����ϴ°��̴�.
		System.out.println("ū �� = " + max);
	}
	//	�ڵ� ����Ǵ� ������ �Լ��̹Ƿ�...
	public static void main(String[] args) {
		//	����
		//		�μ� �Է� �޴´�.
		int	num1 = Input(10, 100);
		int	num2 = Input(10, 100);
		//		ū�� ���Ѵ�.
		int	max = getMax(num1, num2);
		//		����Ѵ�.
		Display(max);
	}

}








