package P0703;
public class Test08 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
	
		Sam08		s = new Sam08();
		System.out.println("객체 생성");
//		System.out.println(s.num);
	}
}

class Sam08 {
	int		num = 10;		//	실행순서		1번실행		num = 10을 기억했다.
	static int age;
	//	초기화 블럭
	{
		num = 100;		//					2번실행		num = 100으로 바뀌고
		age = 10;
	}
	
	static {
		age = 24;
//		num = 200;		//	static 초기화 영역에서는 일반 변수는
							//	초기화 할 수 없다.
	}
	
	Sam08() {
		num = 1000;		//					3번실행		num = 1000으로 다시 바뀐다.
	}
}


