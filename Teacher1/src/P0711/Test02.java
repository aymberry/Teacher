package P0711;
public class Test02 {
	public static void main(String[] args) {
		//	Top Level 클래스처럼 생성할 수 없다.
//		Outer02.Inner02 in = new Outer02.Inner02();		에러
		//	반드시 바깥 클래스를 먼저 만들고
		//	(왜? 안쪽 클래스는 바깥 클래스의 멤버를 아무 제약없이
		//	사용할 수 있는 특징을 가진것이 전역 Inner 클래스이다.)
		Outer02	out = new Outer02();
		//	그 다음에 안쪽 클래스를 만들어야 한다.
//		Outer02.Inner02 in = new Outer02.Inner02();		에러
		//	이때 반드시 바깥 클래스의 주소를 이용해서 만들어야 한다.
		Outer02.Inner02 in = out.new Inner02();
		//	====================================================
		//	안쪽 클래스는 바깥 클래스의 모든 멤버를 아무런 제약
		//	조건 없이 사용할 수 있다.
		in.xyz();
	}
}

class Outer02 {
	int		a = 10;
	void abc() {
		System.out.println("나는 바깥 클래스 abc 이다");
	}
	//	전역 Inner 클래스라고 부른다.
	class Inner02 {

		void xyz() {
			//	안쪽 클래스에는 a 라는 변수가 존재하지 않는다.
			//	그런데 출력이된다.
			//	이것은 전역 Inner 클래스의 가장 강력한 특징인
			//	안쪽 클래스에서는 바깥 클래스의 멤버를
			//	아무 제약없이(new 시키지 않아도) 사용할 수 있다
			System.out.println(a);
			abc();
		}
	}
}




