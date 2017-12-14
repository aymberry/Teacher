package P0706;
public class Test02 {
	public static void main(String[] args) {
		//	1.	레퍼런스의 변수를 사용한다.
//		Grand02	g = new Son02();
//		System.out.println("누구꺼 = " + g.a);
		//	레퍼런스가 Grand 이므로 Grand의 a를 사용한다.
//		System.out.println("누구꺼 = " + g.b);
		//	Grand에 b 변수가 없기 때문에 사용을 하지 못한다.
		
		
		//	2.	멤버 함수에서 사용하면 실제 함수가 존재하는 클래스의
		//		변수를 사용한다.
//		g.abc();
		//	실제 실행되는 abc는 Father가 가지고 있는 함수이므로
		//	Father 클래스의 변수를 사용한다.
		
		Son02	s = new Son02();
		s.xyz();
	}
}

class Grand02 {
	int		a = 100;
	int		c = 700000;
	void abc() {
		System.out.println("할아버지 = " + a);
	}
}
class Father02 extends Grand02 {
	int		a = 1000;
	int		b = 5000;
	void abc() {
		System.out.println("아버지 = " + a);
	}
}
class Son02 extends Father02 {
	int		a = 10000;
	int		b = 50000;
//	void abc() {
//		System.out.println("아버지 = " + a);
//	}
	void xyz() {
		System.out.println("아들 = " + c);
	}
	//	결론	c 변수는 상속 받았고 오버쉐도우 시키지 않았으므로
	///			Son에도 존재한다.
}




