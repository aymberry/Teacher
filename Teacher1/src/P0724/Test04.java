package P0724;
public class Test04 {
	public static void main(String[] args) {
		MyThread041 temp1 = new MyThread041();
		MyThread042 temp2 = new MyThread042();
		//	아직 스레드가 아니다.
		Thread		t1 = new Thread(temp1);
		Thread		t2 = new Thread(temp2);
		//	드뎌 New Born 상태가 된다.
		
		t1.start();
		t2.start();
	}
}

class MyThread041 implements Runnable {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("먹쇠가 밥을 먹는다.");
			//	원래는 이 과정이 시분할 시스템에 의해서 여러번
			//	출력될 수 있다.
			//	나는 한번 출력했으면..... 다른 프로그램에게 실행을
			//	양보하고자 한다.
			Thread.yield();
		}
	}
}

class MyThread042 implements Runnable {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("\t\t영희가 물을 긷는다.");
			Thread.yield();
		}
	}
}