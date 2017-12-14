package P0721;

public class Test10 {
	public static void main(String[] args) {
		MyClass10		my = new MyClass10();
		my.abc();
		my.xyz();
	}
}

abstract class MyAbsClass10 {
	abstract void abc();
}
//	이 클래스를 사용하기 위해서는 일반 클래스에 상속을 받아서
//	추상 함수를 오버라이드한 후 사용한다.

class MyClass10 extends MyAbsClass10 {
	//	나는 이 함수를 오버라이드 하려고 만들었는데...
	//	실수로 함수 원형을 지키지 못했다.
	//	이 함수는 오버라이드가 아니고 오버로드가 되어서 에러가 안난다.	

	//	바로 이처럼 어떤 함수는 특별한 형식입니다. 라고 알려주어야 
	//	하는 경우가 발생하며
	//	여기서는 이 함수는 오버라이드 형식입니다. 라고 알려주어야 한다.
	
	//	이렇게 어노테이션을 사용하게 되면 JVM은 이 함수의 형식을
	//	알게되고 검사를 진행해 주게 된다.
	@Override
	void abc() {
		
	}
	@Deprecated
	void xyz() {
		
	}
}










