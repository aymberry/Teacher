package P0706;
public class Test04 {
	public static void main(String[] args) {
		Son04	s = new Son04();
		s.abc(3.14F);
	}
}


class Father04 {
	void abc(float a) {
		System.out.println("나는 파더다");
	}
}
class Son04 extends Father04 {
	void abc(int a) {
		System.out.println("나는 션이다");
	}
}