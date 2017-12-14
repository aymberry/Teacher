package P0712;

public class Test05 {

	static void div() {
		int		a = 10;
		int		b = 0;
		int		c;
		try {
			System.out.println("함수 처리 시작");
			c = a / b;
			//	이부분에 파일을 오픈하고.....
		}
		catch(Exception e) {
			System.out.println("에러 발생");
			return;
		}
		finally {
			System.out.println("난 finally");
			//	파일 닫기
		}
		//	이 부분에서 파일을 사용하도록 하는 문장이 있다고 가정하자.
		System.out.println("난 일반구문");
		//	사용이 끝난 파일의 닫아준다.
	}
	public static void main(String[] args) {
		div();
	}

}
