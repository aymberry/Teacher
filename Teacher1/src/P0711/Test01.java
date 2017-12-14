package P0711;
public class Test01 {
	public static void main(String[] args) {
		Outer01.Inner012		in = new Outer01.Inner012();
		in.abc();
		
		//	인터페이스는 그 자체를 new 시키지 못하고
		//	대신 하위 클래스를 new 시켜서 사용하세요.
		Son01		s = new Son01();
		s.abc();
	}
}

class Outer01 {
	int	a;
	float b;
	void abc() {
		System.out.println("나는 바깥의 abc이다.");
	}
	//	이 인터페이스는 Top Level 인터페이스가 된다.
	interface Inner011 {
		//	이 인터페이스는 바깥 클래스하고는 아무 관계가 없기 때문에
		//	마치 독립적으로 만든것 처럼 만들어 나가면 된다.
		int	a = 10;
		void abc();
	}
	//	이 클래스도 Top Level  클래스가 된다.
	static class Inner012 {
		int	a = 100;
		void abc() {
			System.out.println("나는 안쪽의 abc이다.");
		}
	}
}
//	인터페이스는 일반 하위클래스에 상속해서 사용하세요.
class Son01 implements Outer01.Inner011 {
	//	그 인터페이스가 가지고 있는 모든 추상 함수를 오버라이드 하세요.
	public void abc() {
		System.out.println("나는 인터페이스 추상 함수이다.");
	}
}














