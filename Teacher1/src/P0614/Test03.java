package P0614;

public class Test03 {

	public static void main(String[] args) {
		byte	a = 10;
		byte	b = 20;
//		byte	c = a + b;
		//	byte + byte�� ���� + �����̹Ƿ� ����� int�� �ȴ�.
		byte	c = (byte)(a + b);
	}

}
