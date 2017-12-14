package P0725;

public class Test01 {
	int		num;
	void abc() {
		
	}
	public Test01() {
		//	일반적으로 생성자 함수에서 일을 처리하는 것이 보통이다.
		//	왜냐하면 생성자 함수는 일반 함수이므로
		//	모든 멤버를 자유롭게 사용할 수 있기 때문이다.
		
		System.out.println("나는 생성자이다.");
		
		//	이제는 이 안에서 뭔가를 처리하면 좀더 다양한 프로그램을
		//	만들 수 있을 것이다.
		num = 10;
		abc();
	}
	public static void main(String[] args) {
		//	보통 main 함수에서 뭔가를 처리하는 경우는 매우 드문 경우이다.
		//	왜냐하면 main 함수는 static 함수이므로 static 멤버만 사용할 수
		//	있는 제약적인 문제가 있다.
		//	일반적으로 main 함수에서는 뭔가를 처리하지 않고
		//	생성자 함수부터 실행하도록 하는것이 일반적이다.

		//	문제는 	JVM은 main를 실행할 수 있다.
		//				생성자 함수는 실행할 수 없다.
		
		//	해결방법	main에서 생성자 함수를 강제로 호출하면
		//				JVM은 main 을 실행하지만.
		//				여러분이 생성자 함수를 호출했으므로
		//				생성자 함수도 같이 실행될 것이다.
		System.out.println("나는 메인입니다.");
		new Test01();
	}

}
