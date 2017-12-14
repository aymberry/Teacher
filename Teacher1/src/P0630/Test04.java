package P0630;
public class Test04 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		System.out.println("주소 변수 만들기");
		Sam04		s;
		System.out.println("Instance 만들기");
		s = new Sam04();
		System.out.println("프로그램 끝");
	}
}

class Sam04 {
	Sam04() {
		System.out.println("나는 생성자 함수이다. 1");
	}
	Sam04(int a) {
		System.out.println("나는 생성자 함수이다. 2");
	}
}

