package P0724;

public class Test05 {

	public static void main(String[] args) {
		MyThread051 t1 = new MyThread051();
		MyThread052 t2 = new MyThread052();
		
		t1.start();
		t2.start();
	}
}


class MyThread051 extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("갑돌이가 장가를 간다.");
			//	나는 한번 출력한 후 이 스레드를 강제로
			//	Block 상태로 내보내고 싶다.
			try {
				Thread.sleep(500);
				//	0.5초 동안 자동으로 Block 상태에 있다가 자동 복귀하게 된다.
			}
			catch(Exception e) {
			}
		}
	}
}
class MyThread052 extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t갑순이가 시집을 간다.");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
			}
		}
	}
}