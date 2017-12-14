package P0725;
import		java.util.*;
public class Test05 {
	//	두 스레드가 같이 사용할 컬렉션 하나를 준비한다.
	ArrayList		list = new ArrayList();
	//	먼저 실행될 클래스에서는 다음에 실행될 클래스를 
	//	그냥 new 시키면서	★ 반드시 자신의 주소(this)를 알려준다.
	MyThread051		t1;
	MyThread052		t2;
	public Test05() {
		t1 = new MyThread051(this);
		t2 = new MyThread052(this);
		
		t1.start();
		//	입력 스레드가 먼저되고 나중에 사용 스레드가 실행되도록 조절하자.
		try {
			Thread.sleep(500);
		}
		catch(Exception e){}
		t2.start();
	}
	public static void main(String[] args) {
		new Test05();
	}
}

class MyThread051 extends Thread {
	//	나중에 실행될 클래스는
	//	생성자 함수를 이용해서 넘어오는 주소(this)를 받을 준비를 한후
	//	준비된 변수에 기억한다.
	Test05		main;		//	상호 참조 변수
	public MyThread051(){}
	public MyThread051(Test05 temp) {
		main = temp;
	}
	public void run() {
		//	첫번째 스레드 에서는 컬렉션에 데이터를 추가하는 역활을
		//	하도록 한다.
		//	나는 데이터를 20개만 추가해 보자.
		
		//	입력과 출력을 랜덤하게 하다보니
		//	입력이 되지 않았는데 출력을 하면 데이터가 없어서 에러가 나므로....
		//	나는 20개의 데이터를 다 채울때까지 컬렉션을
		//	다른 스레드가 사용할 수 없도록 하고 싶다.
		
		synchronized(main.list) {
			for(int i = 0; i < 20; i++) {
				//	추가할 데이터를 랜덤하게 발생하자.
				int		num = (int) (Math.random() * 101);
				
				main.list.add(num);
				System.out.println("나는 " + num + "을 입력했어요");
				//	너무 속도가 빠르므로... 적당하게 쉬었다가 하도록 하자.
				//	쉬는 속도도 랜덤하게 쉬도록 하자.
				int		sleep = (int)(Math.random() * (3000 - 500 + 1) + 500);
				//	나는 0.5~3초 사이의 랜덤하게 쉬도록 하고싶다.
				try {
					Thread.sleep(sleep);
				}
				catch(Exception e) {}
			}
		}
	}
}

class MyThread052 extends Thread {
	Test05		main;
	public MyThread052() {}
	public MyThread052(Test05 temp) {
		main = temp;
	}
	public void run() {
		//	두번째 스레드 에서는 컬렉션의 데이터를 꺼내서 사용하는
		//	역활을 하도록 한다.
		
		//	역시 20번 데이터를 꺼내야 한다.
		synchronized(main.list) {
			for(int i = 0; i < 20; i++) {
				int		num = (int) main.list.get(0);
				//	사용한 데이터는 지우자.
				main.list.remove(0);
				System.out.println("나는 " + num + " 을 꺼내서 사용했어요");
				//	역시 마찬가지로 속도가 빠르므로 조절해 보자.
				int		sleep = (int)(Math.random() * (3000 - 500 + 1) + 500);
				//	나는 0.5~3초 사이의 랜덤하게 쉬도록 하고싶다.
				try {
					Thread.sleep(sleep);
				}
				catch(Exception e) {}
			}
		}
	}
}




