package Question;

public class Test071002 {

	public static void main(String[] args) {
		exam10 e = new exam10();	
		e.abc();
		MyInter10.xyz();	// 오버라이딩 하지 않은 static 함수 에러
		e.lmn();	// 오버라이딩 하지 않은 default 함수는 정상
	}

}
interface MyInter10 {
	public abstract void abc(); // 자동적으로 public, abstract 함수가 된다.
				    // 추상함수 이므로 { } 없이 선언해야 한다. 
	static void xyz() {
		System.out.println("xyz 출력");
	}	// static 함수도 포함할 수 있다.
	
	default void lmn() {
		System.out.println("lmn 출력");
	}	// 일반함수도 포함할 수 있지만..
		// default 라고 명명해 주어야 한다. 
}

class exam10 implements MyInter10 {
	public void abc() {	// 상속한 후 추상함수를 오버라이드 해야 한다.
		System.out.println("abc 출력");
	}
}