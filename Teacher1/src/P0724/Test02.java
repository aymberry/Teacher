package P0724;

public class Test02 {
	public static void main(String[] args) {
		//	이 프로그램은 프로세서 프로그램이다.
		//	반드시 프로세서 프로그램은 한개 존재해야 한다.
		//	그래야 메모리 할당을 받을 수 있기 때문이다.

		//	1.	일단 프로세서 프로그램이 시작된 후 스레드를 만들 수 있다.
		//	2.	필요한 시점에서 스레드 프로그램을 기동한다.
		MyThread021	temp1 = new MyThread021();
		MyThread022	temp2 = new MyThread022();
		//		아직은 스레드 변화가 없다.
		//		그냥 일반적으로 어떤 클래스 하나를 new 시킨 효과밖에 없다.
		//	Thread 클래스를 new 시키면서 1)의 결과를 넣어주어야 한다.
		
		Thread		t1 = new Thread(temp1);
		Thread		t2 = new Thread(temp2);
		//	드디어에서 t1, t2 프로그램이 New Born 상태로 전위된다.
		
		//	이제 스레드가 동작해야할 시점이 되면 Runnable 상태로 전위한다.
		t1.start();
		t2.start();
		//	이제 CPU가 이 프로그램을 가지고 가서 실행을 하게 된다.
	}
}

//	스레드 방식으로 실행시킬 프로그램을 만들자.
class MyThread021 implements Runnable {
	public void run() {
		//	이 함수는 매우 중요한 함수로써
		//	스레드 프로그램의 시작 함수가 된다.
		//	즉, 스레드 프로그램은 반드시 run() 부터 시작하도록 약속되어 있다.

		//	이제 스레드에서 필요한 작업을 수행한다.
		for(int i = 0; i < 1000; i++) {
			System.out.println("돌쇠가 나무를 한다 " + i);
		}
	}
}

class MyThread022 implements Runnable {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("\t\t순이가 밥을 한다 " + i);
		}
	}
}








