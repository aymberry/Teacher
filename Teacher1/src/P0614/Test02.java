package P0614;

public class Test02 {

	public static void main(String[] args) {
		float	a = 3.6F;
		float	b = 4.7F;
		
//		int	c = a + b;
		//	에러가 난 이유?
		//		float + float = float가 되므로 int에 기억될 수 없다.
		int	c = (int)(a + b);
		System.out.println(c);		//	8이 된다.
		int	d = (int) a + (int) b;
		System.out.println(d);	//	7이 된다.
	}
}
