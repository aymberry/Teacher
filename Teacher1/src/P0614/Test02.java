package P0614;

public class Test02 {

	public static void main(String[] args) {
		float	a = 3.6F;
		float	b = 4.7F;
		
//		int	c = a + b;
		//	������ �� ����?
		//		float + float = float�� �ǹǷ� int�� ���� �� ����.
		int	c = (int)(a + b);
		System.out.println(c);		//	8�� �ȴ�.
		int	d = (int) a + (int) b;
		System.out.println(d);	//	7�� �ȴ�.
	}
}
