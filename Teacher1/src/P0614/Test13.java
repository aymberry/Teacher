package P0614;

public class Test13 {

	public static void main(String[] args) {
		char	a = 'A';
		//	a라는 변수에는 'A'가 기억되지 않고 숫자 65가 기억되어 있다.
		System.out.println((int) a);
		char	b = (char) (a + 1);
		//	그러면 b 안에는 66이 기억되어 있다.
		System.out.println((int) b);
		System.out.println(b);
	}

}
