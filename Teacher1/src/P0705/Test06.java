package P0705;
public class Test06 {
	public static void main(String[] args) {
	}
}

class Father06 {
	protected void abc() {
		
	}
}
class Son06 extends Father06 {
	//	나는 Father를 상속 받았는데... 다른건 다 맘에드는데...
	//	abc가 원하는 기능이 아니다.
	//	오버라이드라 한다.
//	void abc() {
//		이것은 아버지 클래스의 함수보다 접근 지정이 좁아졌기 때문에
//		에러가 난다.
//	}
	public void abc() {
		//	접근지정의 범위를 넓이는 경우는 상관이 없다.
	}
}


