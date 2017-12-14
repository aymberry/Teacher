package P0704;
public class Test08 {
	public static void main(String[] args) {
		Son08 s = new Son08();
		
	}
}

class Father08 {
	//	디폴트는 안만들고 int 가 있는 생성자를 만들었다.
	Father08(int a) {
		System.out.println("나는 아버지");
	}
}

class Son08 extends Father08 {
	Son08() {	
		super(5);
		//	실행순서
		//	누군가가 new Son08()을 해서 이 생성자를 호출하면
		//	이때 강제로 아버지 클래스의 int를 받는 생성자를 호출한다.
		System.out.println("나는 아들");
	}
	Son08(int a) {
		super(5);
	}
	//	이렇게 하면 Father08이 만들어 져야하고
	//	이때 Default만 사용하는데 Father08에는 디폴트가 없으므로
	//	문제 생겼다.
	//	해결책
	//		그러면 디폴트가 아닌 아버지의 다른 생성자 함수를 강제로
	//		호출 할 수 있으면 해결되겠네....
	
}






