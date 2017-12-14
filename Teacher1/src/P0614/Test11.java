package P0614;

public class Test11 {

	public static void main(String[] args) {
		int		a = 10;
		int		b = -a;
		//	b에는 a의 데이터가 부호가 바뀌어 기억되므로
		//	-10이 기억된다.
		System.out.println("B = " + b);

	}

}
