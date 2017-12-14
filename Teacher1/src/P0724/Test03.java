package P0724;
/*
 * 	문제
 * 		스레드 프로그램은 한개당 한번만 실행할 수 있는것이 아니다.
 * 		프로그램은 한개만 만들고 여러번 실행할 수 있다.
 * 
 * 		문제점	두개의 프로그램이 구분이 되지 않는다는 문제점이 있다.
 * 		이 문제점을 해결하는 방법중의 하나로.....
 * 		스레드에 이름을 부여하는 방법이 있다.
 * 
 * 		이름을 부여하는 방법은 아버지 클래스인 Thread의 생성자 
 *		함수를 이용하면 이름을 부여할 수 있다.
 */
public class Test03 {
	public static void main(String[] args) {
		MyThread031	t1 = new MyThread031("박아지");
		//	t1이 New Born 상태가 된다.
		MyThread031	t2 = new MyThread031("장독대");

		t1.start();
		t2.start();
		//	에러는 안나지만 이것은 Runnable에 넣는것이 아니므로
		//	스레드로 동작하지 않는다.
		//	일반 함수를 호출한것 처럼... 먼저 t1.run() 다 실행되고
		//	그 다음에 t2.run()이 실행된다.
		//	즉 두 함수가 순차적으로 실행되는 일반 함수일 뿐이다.
//		t1.run();
//		t2.run();

	}

}

class MyThread031 extends Thread {
	//	1.	이 클래스는 new 시키는 순간 Thread도 만들어진다.
	//		이때 Thread의 생성자 함수는 무조건 기본 생성자만 이용한다.
	//	2.	이때 만약 Thread 클래스의 다른 생성자를 호출하기 위해서는?
	//		super() 를 이용하면 된다.
	//		사용규칙
	//		1.	반드시 생성자 안에서 사용한다.
	//		2.	그것도 반드시 첫 줄에서 사용한다.
	public MyThread031() {
		super("제목 아무거나");
	}
	//		앞으로도 우리가 어떤 클래스를 상속받았는데...
	//		그 클래스의 다른 생성자를 이용할 필요가 있으면......
	//		super()를 생각하기 바란다.
	public MyThread031(String t) {
		super(t);
		//	아들 생성자를 호출할때 제목을 넣어주면...
		//	이것을 이용해서 아버지 생성자를 호출하게되고
		//	new 시킬때 마다 제목이 바뀌게 된다.	
	}
	
	public void run() {
		for(int i = 0; i < 1000; i++) {
			//	지금 실행하는 스레드의 제목 알아내기
			//	1.	지금 실행하는 스레드 알아내기
			Thread		now = Thread.currentThread();
			//	2.	그 스레드의 이름 알아내기
			String		title = now.getName();
			System.out.println("나는 " + title + " 스레드 입니다. " + i);
		}
	}
}




