package P0704;
public class Test02 {
	public static void main(String[] args) {
		Son02		s = new Son02(5);
	}
}

class Father02 {
//	Father02() {
//		System.out.println("나는 아버지 클래스 생성자");
//	}
	//	아버지의 Default 생성자가 없으면 이 클래스는
	//	다른 클래스에 원칙적으로는 상속이 불가능하다.
//	Father02(int a) {
//		System.out.println("나는 아버지 클래스 int 생성자");
//	}
	
}

class Son02 extends Father02 {
	Son02() {
		System.out.println("나는 아들 클래스 생성자");
	}
	Son02(int a) {
		System.out.println("나는 아들 클래스 int 생성자");
	}
}





