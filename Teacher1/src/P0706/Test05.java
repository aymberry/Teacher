package P0706;
/*
 * 	문제	랜덤한 숫자 만들고 그 숫자가 짝수이면 첫째 아들을 출력하고
 * 			홀수이면 둘째 아들을 출력하라.
 */
public class Test05 {
	public static void main(String[] args) {
		int		temp = (int)(Math.random() * 100);
		
		Father05	f;
		
		if(temp % 2 == 0) {
			f = new Son051();
		}
		else {
			f = new Son052();
		}
		
		f.abc();
		
		
	}
}

class Father05 {
	void abc() {
		System.out.println("나는 아버지");
	}
}
class Son051 extends Father05 {
	void abc() {
		System.out.println("나는 첫째 아들");
	}
}
class Son052 extends Father05 {
	void abc() {
		System.out.println("나는 둘째 아들");
	}
}
