package P0616;
/*
 * 	����
 * 		�μ��� �Է��� �� �� �� �߿��� ū���� ����ϵ��� ����.
 * 
 * 		�� ���ڴ� 1~100������ ���ڷ� �Է��ϵ��� �Ѵ�.
 */
public class Test01 {

	public static void main(String[] args) {
		int		a = (int)(Math.random() * (100 - 1 + 1) + 1);
		int		b = (int)(Math.random() * (100 - 1 + 1) + 1);
		//	�ϴ� a�� ũ�ٰ� �����ϰ� a�� ����Ѵ�.
		int		max = a;
		//	Ȥ�� b�� Ŭ���� �����Ƿ�.....
		if(a < b) {
			//	b�� �� ũ�� b�� �ٲ�ġ�� �Ѵ�.
			max = b;
		}
		System.out.println("�μ� = " + a + "   " + b);
		System.out.println("ū�� = " + max);
	}

}




