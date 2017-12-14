package P0725;

public class Test02 {
	public static void main(String[] args) {
		Sam021	s = new Sam021();
		s.abc();
	}
}
//	이 두 클래스가 서로 상대방을 참조할 수 있도록 해보자. 
class Sam021 {
	Sam022		s2;		//	Sam022를 사용할 수 있도록 주소를
							//	기억할 변수
	void abc() {
		//	여기서 아래쪽의 클래스를 사용하기 위해서 new 시킨다.
		s2 = new Sam022();
		s2.abc();
	}
}

class Sam022 {
	Sam021		s1;		//	Sam021을 사용할 수 있도록 주소를
							//	기억할 변수
	void abc() {
		s1 = new Sam021();
		//	이건 잘못된 만남
	}
}
