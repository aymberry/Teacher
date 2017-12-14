package P0704;
public class Test07 {
	public static void main(String[] args) {
	}
}

class Father07 {
	void abc() {		//	일반 함수
		
	}
	final void xyz() {		//	final 함수
		
	}
}

class Son07 extends Father07 {
	void abc() {		//	일반 함수는 얼마든지 오버라이드가 가능하다.
		
	}
//	void xyz() {		//	final 함수는 오버라이드가 절대로 불가능하다.
//		
//	}
}





