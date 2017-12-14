package P0704;
public class Test05 {
	public static void main(String[] args) {
	}
}

class Father05 {
	void abc() {
		System.out.println("난 아버지");
	}
}

class Son05 extends Father05 {
	//	이 함수가 이미 존재하고 있다.
//	void abc() {
//		System.out.println("난 아들");
//	}
	//	이것은 존재하는 함수와 함수 원형이 동일하므로
	//	이것은 오버 라이드이다.
	void abc() {
		
	}
	//	이 함수는 매개변수의 개수를 다르게 해서 만든 함수이므로
	//	이 함수는 오버로드이다.
	void abc(int a) {
		System.out.println("난 아들");
	}
	//	이 함수는 존재하는 함수와 매개변수가 같으므로 오버로드도 아니고
	//	이 함수는 존재하는 함수와 함수 원형이 다르므로 오버라이드도 아니다.
	//	둘다 아니므로 에러가 난 것이다.
//	int	abc() {
//		return 10;
//	}
	
}









