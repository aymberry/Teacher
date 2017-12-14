package P0724;
/*
 * 	문제
 * 		메인과 스레드가 동시에 실행되는 상태에서...
 * 
 * 		메인이 끝나면 스레드도 같이 끝나도록 하고 싶다.
 */
public class Test06 {
	public static void main(String[] args) {
		MyThread061	t1 = new MyThread061();
		t1.start();		//	스레드 프로그램이 실행된다.
		
		for(int i = 0; i < 100; i++) {
			System.out.println("나는 메인입니다.");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}

		t1.isStart = false;
		//	제어 변수를 false로 만들어 주어서
		//	자연스럽게 스레드가 끝나도록 유도해 주어야 한다.
		
//		t1.stop();
		//	이제 메인에서 원하는 작업이 끝나면 프로그램이 
		//	끝나도록 하고 싶다.
		//	그때 까지는 스레드도 같이 실행되기를 원한다.
	}
}

class MyThread061 extends Thread {
	//	1.	종료를 제어할 변수를 준비한다.
	public boolean	isStart = true;

	public void run() {
		//	isStart 변수에는 true가 기억되어 있으므러...
		//	이 반복은 역시 무한루프가 된다.
		
		//	변수란?		값을 바꿀 수 있다는 말이므로
		//					isStrat의 값이 바꿀 수 있다는 말이고...
		//					이것이 false가 되면 이 반복은 종료될 것이다.
		while(isStart) {
			System.out.println("나는 스레드 프로그램입니다.");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
		
		//	while이 종료되면 run()가 끝나므로...
		//	이 스레드를 종료되게 된다.
		
		//	결론		우리는  stop() 대신에
		//				isStart 라는 변수에 false를 입력해 줌으로....
		//				자연스럽게 run()이 끝나도록
		//				그래서 스레드가 끝나도록 해주어야 한다.
	}
}
//	결론
/*
 * 	1.	스레드 클래스에 스레드 반복을 제어할 변수를 준비한다.
 * 	
 * 			예>		public boolean	isStart = true;
 * 
 * 	2.	제어명령을 이용해서 run() 가 반복 되도록 조치한다.
 * 
 * 			예>		public void run() {
 * 						while(isStart) {
 * 							????
 * 						}
 * 					}
 * 
 * 	3.	스레드가 종료될 시점이 되면 isStart 변수를 false로 변경함으로써
 * 		while이 종료되고 그로 인해서 run() 이 종료되며
 * 		그로 인해서 스레드도 같이 자연스럽게 종료되도록 한다.
 * 
 * 			예>		t1.isStart = false;
 * 
 */











