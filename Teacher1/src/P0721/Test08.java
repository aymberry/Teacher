package P0721;

enum Type {
	WALKING, RUNNING, TRACKING, HIKING
}
public class Test08 {
	public static void main(String[] args) {
		MyShoes08	my = new MyShoes08();
		my.maker = "나이키";
		my.size = 260;
		my.type = Type.RUNNING;
		//	개발자 눈에는 문자적으로 표현하므로 이해가 쉽고
		//	컴퓨터 입장에서는 숫자적으로 작업함으로 작업이 편하다.

		System.out.println("내 신발은 ");
		System.out.println("메이커 =  " + my.maker);
		System.out.println("크기 =  " + my.size);
		System.out.println("종류 =  " + my.type);
		
		//	참고
		//		enum 변수가 가진 실제 데이터(숫자)를 확인하는 방법
		//		ordinal()를 사용하면 된다.
		System.out.println("실제 데이터 = " + my.type.ordinal());
		
		
	
	}
}

class MyShoes08 {
	String	maker;
	int		size;
	//	이 신발의 종류를 기억하고 싶다.
	//	신발의 종류는 미리 설정된 숫자를 이용해야 할 필요가 생겼다.
	//	그래서 미리 신발의 종류를 문자적으로 표현한 enum 클래스를
	//	만들고	그 클래스의 변수로 사용하면 편하다.
	Type	type;		//	이 변수에는 신발의 종류가 기억된다.
}