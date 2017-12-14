package P0725;

public class Test04 {
	//	상호 참조를 위해서 스레드 변수를 준비한다.
	public MyThread041		t1;
	public MyThread042		t2;

	//	이 함수는 앞으로 만들 두 스레드 클래스가 같이 사용할 함수이다.
	//	참고
	//		동기화란?
	//		두개 이상의 스레드가 같이 사용하는 자원에 대해서 설치하는 것이다.
	
	//	일반적인 함수는 두개의 스레드가 같이 실행될 위험이 있다.
	//	그러면 함수를 실행도중 데이터가 충돌날 위험이 있다.
	
	//	나는 한 스레드가 이 함수를 실행하기 시작하면
	//	다른 스레드는 이 함수를 실행하지 못하게 하고 싶다면.....
	public synchronized void abc() {
		
		System.out.println("abc 함수가 시작 되었어요");
		try {
			Thread.sleep(10000);
			//	3초  쉬었다가
		}
		catch(Exception e) {}
		System.out.println("abc 함수가 끝났어요");
	}
	public Test04() {
		//	먼저 실행되는 곳에서는 나중에 실행될 클래스를 그냥
		//	new 시키면서 자신의 this를 준다.
		t1 = new MyThread041(this);
		t2 = new MyThread042(this);
		
		//	스레드 클래스를 시작시키자
		//	스레드 클래스의 시작은 Runnable 상태로 전위시키면 된다.
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		new Test04();
	}
}

class MyThread041 extends Thread {
	//	이 스레드 클래스는 위쪽(main)이 가지고 있는 abc를 이용할 예정이다.
	//	즉 이 클래스는 main 클래스와 상호 참조가 되어야 한다.
	Test04		main;		//	상호 참조를 위한 상대 주소를 기억할 변수
	public MyThread041() {}
	public MyThread041(Test04 temp) {
		main = temp;
	}
	public void run() {
		main.abc();
	}
}
class MyThread042 extends Thread {
	//	이 클래스에서도 abc를 이용할 예정이다.
	//	그러므로 이 클래스도 상호 참조 되어야 한다.
	Test04		main;		//	상호 참조를 위한 변수
	public MyThread042() {}
	public MyThread042(Test04 temp) {
		main = temp;
	}
	public void run() {
		main.abc();
	}
}










