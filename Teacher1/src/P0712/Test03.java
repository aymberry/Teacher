package P0712;
public class Test03 {
	public static void main(String[] args) {
		int		a = 10;
		int		b = 0;
		int		c;
		try {
			c = a / b;	//	예외가 발생하면 JVM은 ArithmeticException를 만들어서(new 시켜서)
						//	catch에게 던져주게 된다.
		}
		catch(/* ? */Exception e) {
			//	?에 JVM 이 던져주는 예외 클래스를 받을 준비를 해야 한다.
			//	참고
			//		누군가가 알려주는 클래스를 받는 다는 말은
			//		알려주는 클래스를 기억할 변수를 준비한다는 의미이다.
			//		e의 의미는 던져주는 클래스 주소를 기억할 변수의 의미다.
			c = a / 1;
		}

	}

}
