package P0712;
public class Test04 {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		int		b = 0;
		int		pos = 7;
		int		c;
		try {
			c = num[pos] / b;
		//	pos 변수가 0~4가 아니면 예외가 나고
		//	b 변수에 0이 기억되면 예외가 난다.
		//	그리고 혹시 모를 다른 예외가 발생할 수 있다.	
		}
		catch(ArithmeticException e) {
			//	이 부분은 0으로 나눈 경우에 실행되는 부분이다.
			System.out.println("나는 0으로 나눈 에러 처리 부분");
			c = num[pos] / 1;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//	이 부분은 배열 벗어나면 실행되는 부분이다.
			System.out.println("나는 배열을 벗어난 에러 처리 부분");
			c = num[0] / b;
		}
		catch(Exception e) {
			System.out.println("나는 기타 에러 처리 부분");
		}
	}
}
