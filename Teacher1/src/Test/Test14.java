package Test;

public class Test14 {
	public static void main(String[] args) {
		boolean	a = false;
		boolean	b = false;
		boolean	c = ((a = true) | (b = true));
		//	함정		=	는 대입연산자이다.
		//				a = true로 변화된다.
		//				b = true로 변환된다.
		//	a, b, c 모두 true

	}

}
