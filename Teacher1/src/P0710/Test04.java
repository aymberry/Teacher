package P0710;
public class Test04 {
	public static void main(String[] args) {
	}
}

interface MyInter04 {
	void abc();		//	묵시적 추상 함수
	//	1.8 버전에서 추가된 내용
	static void xyz() {
		//	static 함수도 포함할 수 있고
	}
	default void lmn() {
		//	일반 함수도 포함할 수 있는데...
		//	이때는 반드시 default 라고 명시해 주어야 한다.
	}
}

//	인터페이스 사용은
class MyClass04 implements MyInter04 {
	//	아직은 추상 함수가 오버라이드 되기 않아서 에러가 난다.
	public void abc() {
		
	}
	//	static, default는 필요하면 오버라이드하고 필요하지 않으면
	//	안해도 상관이 없다.
//	public void lmn() {
//		
//	}
}





