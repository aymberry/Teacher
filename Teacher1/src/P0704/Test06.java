package P0704;

public class Test06 {
	public static void main(String[] args) {
		Sam06		s = new Sam06();
		
		s.num1 = 200;			//	일반 변수는 얼마든지 값을 변경할 수 있다.
//		s.num2 = 300;			//	final 변수는 값을 변경할 수 없다.
	}
}

class Sam06 {
	int		num1 = 10;		//	일반 변수이다.
	final	int num2 = 100;	//	final 변수이다.
	
}