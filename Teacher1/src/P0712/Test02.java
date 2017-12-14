package P0712;
public class Test02 {
	public static void main(String[] args) {
		int		a = 10;
		int		b = 0;
		int		c;
		try {
			System.out.println("발생전");
			c = a / b;		//	이 부분이 예외 발생 소지가 존재한다.
			System.out.println("발생후");

		}
		catch(Exception e) {
			c = a / 1;
		}
	
		
		System.out.println("결과 = " + c);
		
		System.out.println("프로그램 종료");

	}
}
