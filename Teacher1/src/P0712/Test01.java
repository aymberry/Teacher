package P0712;
public class Test01 {
	public static void main(String[] args) {
		int		a = 10;
		int		b = 0;
		int		c;
		//	예외 처리된 프로그램이다.
		if(b == 0) {
			c = a / 1;		
			//	프로그램에 목적에 맞도록 예외가 발생하는 요소를
			//	정상 처리되도록 조절해야 한다.
		}
		else {
			c = a / b;
		}
		
		System.out.println("결과 = " + c);
		
		System.out.println("프로그램 종료");

	}

}
