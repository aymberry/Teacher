package P0703;
public class Test03 {
	public static void main(String[] args) {
	}
}

class Sam03 {
	//	생성자 함수이다.
	//		1.	반환값이 절대로 나오면 안되고(void도 나오면 안되고)
	//		2.	함수이름은 클래스이름과 동일해야 한다.
	Sam03() {
		
	}
	Sam03(int a) {
		this();		//	성공
		//	이 명령은 생성자 함수 안에서만 사용할 수 있기 때문이다.
	}
	Sam03(float a) {
		System.out.println("먼저 먼가를 실행하고");
		//	this();		//	에러
		//	이유
		//		이 명령은 생성자 함수 안에서 오직 첫문장으로만 사용
		//		해야 한다.
	}
	
	void abc() {
		//this();		//	에러이다.
		//	이유
		//		this() 는 오직 생성자 함수 안에서만 사용할 수 있으며
		//		다른 함수에서는 절대로 사용할 수 없다.
	}
	
	
	
}