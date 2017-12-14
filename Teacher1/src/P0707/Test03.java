package P0707;
public class Test03 {
	public static void main(String[] args) {
		Sam03		s;		//	여기 까지는 만들 수 있다.
//		s = new Sam03();	//	이러면 에러가 난다.
		
		s = new Son03();	//	하위를 이용해서 인스턴스 만들어서 사용한다.
	}
}

abstract class Sam03 {
	abstract void abc();
	abstract void xyz();
	void lmn() {
		
	}
}

class Son03 extends Sam03 {
	//	반드시 추상 클래스가 가지고 있는 모든 추상 함수를
	//	오버라이드하여 기능(몸체)를 만들어야 한다.
	void abc() {};
	void xyz() {};
	//	단점	기능을 다 만들어 주어야 한다.
}