package P0614;

public class Test03 {

	public static void main(String[] args) {
		byte	a = 10;
		byte	b = 20;
//		byte	c = a + b;
		//	byte + byte는 정수 + 정수이므로 결과는 int가 된다.
		byte	c = (byte)(a + b);
	}

}
