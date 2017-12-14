package P0614;

public class Test15 {
	public static void main(String[] args) {
		int		a = 10;
		int		b = 20;
		int		c = 30;
		boolean	result = a > b && a > c;
		//		&&	에 사용되는 항은
		//			a > b		false
		//			a > c		false		&&	는 false가 된다.
		System.out.println("결과 = " + result);

	}

}
