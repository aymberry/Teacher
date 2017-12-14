package P0707;

public class Test02 {
	public static void main(String[] args) {
		//	다형성
		//		변수 하나만 이용해서 여러 클래스를 사용할 수 있다.
		//		근데....
		//		다형성 구현의 원리를 보면
		//		상위 클래스가 하나 존재하고 상위 클래스를 변수에
		//		하위 클래스를 다양하게 입력함으로써 다형성이 구현된다.
		
		//	다형성을 구현하면 변수 하나만 이용해서 여러 클래스를
		//	사용할 수 있는 장점이 있다.
		
		//	아래에 있는 두개의 클래스도 다형성 구현을 할 수 있을 것이다.
		//	1.	반드시 상위 클래스가 존재해야 한다.
		//	2.	상위 클래스에 사용할 함수가 반드시 존재해야 한다.
		//		(그래야 계층 추적할 수 있다)
		Father02		f = new Son021();	//	new Son022();
		f.display();
	}
}

abstract class Father02 {
	//	이 함수는 기능이 필요해서 만든 함수가 아니고
	//	이 자리에 이 함수가 있어야 계층추적함으로 어쩔 수 없이 만든
	//	함수이다.
	abstract void display();
	//	추상 함수로 만들면 좋은점
	//		메모리를 차지하지 않는다.
}

class Son021 extends Father02 {
	String	name = "홍길동";
	void display() {
		System.out.println("형 이름은 " + name);
	}
}
class Son022 extends Father02 {
	String	name = "홍만복";
	void display() {
		System.out.println("동생 이름은 " + name);
	}
}