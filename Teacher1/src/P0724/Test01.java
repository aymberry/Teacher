package P0724;
public class Test01 {
	public static void main(String[] args) {
		//	이 프로그램은 프로세서 프로그램이다.
		//	이제 프로세서가 실행되면....
		//	스레드도 실행할 수 있다.
		
		MyThread011 t1 = new MyThread011();
		MyThread012 t2 = new MyThread012();
		//	우리가 할 일은 Runnable 까지만 넣어주면 끝이다.
		t1.start();
		t2.start();
		
	}
}

//	나는 스레드 프로그램을 두개 만들어서 병행 처리하고 싶다.
class MyThread011 extends Thread {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("갑돌이가 장가를 간다.");
		}
	}
}

class MyThread012 extends Thread {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("\t\t갑순이가 시집을 간다.");
		}
	}
}
