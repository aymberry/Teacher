package P0704;
public class Test04 {
	public static void main(String[] args) {
		Son04	s = new Son04();
		
		s.abc();
		s.xyz(5);
		s.lmn();
	}
}

class Father04 {
	void abc() {
		System.out.println("나는 아버지의 abc 이다.");
	}
	
	int xyz(int a) {
		System.out.println("나는 아버지의 xyz 이다.");
		return 5;
	}
}

class Son04 extends Father04 {
	//	추가적으로 필요한 기능을 더하면 된다.
	void lmn() {
		System.out.println("나는 아들의 lmn 이다.");
	}
	
	//	여기에 xyz함수가 존재하고 있어요......
	
	
	//	만약 아버지 클래스가 가진 xyz()가 마음에 들지 않으면.....
	//	Over Ride 를 이용하면 기능을 바꿀 수 있다.
	int xyz(int a) {
		System.out.println("나는 아들의 xyz 이다.");
		return 10;
	}
	//	내가 다시 만들었기 때문에
	//	복사된 함수가 감춰진것 뿐이다.
}
