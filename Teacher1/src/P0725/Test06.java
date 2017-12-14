package P0725;
/*
 * 	컬렉션에 데이터를 입력하고 사용하는 스레드를 만든다.
 * 
 * 	아까는 컬렉션에 데이터가 완료된 후에 사용을 시작했지만.....
 *	지금은 입력과 사용을 동시에 진행하도록 할 예정이다.
 *
 * 	아까처럼 에러가 나지 않고 안전하게 진행되도록 할 예정이다.
 * 
 * 	우리끼리의 약속
 *		5개의 데이터를 받으면 더이상 받지 못하게 하자. 		
 */
import		java.util.*;
public class Test06 {
	ArrayList		list = new ArrayList();
	//	데이터를 저장하고 나눠줄 컬렉션
	
	public synchronized void producer() {
		//	데이터 생산을 담당할 함수
		//	누군가가 이 함수를 호출하면 데이터를 생산해야 한다.
		//	근데........
		//	우리의 약속에 의해서
		//		5개의데이타가 이미 있으면 생산을 중지해야한다.
		if(list.size() == 5) {
			//	이미 창고가 가득차 있으므로 더이상 생산을 해서는
			//	안된다.
			//	고로 이 함수를 실행하는 스레드는 스스로 일을 하지 
			//	못하도록 Block 상태로 전위 시켜야 한다.
			System.out.println("생산자가 쉼터로 간다.");
			try {
				wait();
			}
			catch(Exception e) {}
		}
		
		//	이제 정상적으로 일을 하자.
		char		ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		list.add(ch);
		System.out.println(ch + "를 생산했어요  현재 창고의 개수 = " + list.size());
		
		//	물건을 생산해서 창고(컬렉션에 넣었다.)
		
		//	이제 창고에 물건이 한개이상 존재하므로...
		//	쉬고 있던 소비자가 일을 할 수 있는 환경이 되었다.
		//	고로 쉬고 있던 소비자를 깨워서 일을 하도록 해야겠다.
		
		notifyAll();
		//	이 함수는 Block에 스레드가 있던 없던 그냥 깨우는 함수이다.
	
	}
	public synchronized void cuosumer() {
		//	데이터 소비를 담당할 함수
		//	누군가가 소비를 하러 왔는데... 데이터가 없으면 소비를
		//	할 수 없다.
		//	그러면 이 스레드는 스스로가 중지 되어야 한다.
		if(list.size() == 0) {
			System.out.println("소비자가 쉼터로 간다.");
			try {
				wait();
			}
			catch(Exception e) {}
		}
		
		//	정상적으로 소비하자.
		char	ch = (char) list.get(0);
		list.remove(0);
		System.out.println(ch + "를 소비했어요  현재 창고의 개수 = " + list.size());

		notifyAll();
		
	}
	
	Producer06	t1;
	Consumer06	t2;
	public Test06() {
		t1 = new Producer06(this);
		t2 = new Consumer06(this);

		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test06();
	}
}

class Producer06 extends Thread {
	Test06		main;
	public Producer06() {}
	public Producer06(Test06 temp) {
		main = temp;
	}
	public void run() {
		//	20번 생산을 하도록 한다.
		for(int i = 0; i < 30; i++) {
			main.producer();
			int		sleep = (int)(Math.random() * (2000 - 500 + 1) + 500);
			try {
				Thread.sleep(sleep);
			}
			catch(Exception e) {}
		}
	}
}

class Consumer06 extends Thread {
	Test06		main;
	public Consumer06(){}
	public Consumer06(Test06 temp) {
		main = temp;
	}
	public void run() {
		//	20번 데이터를 꺼내 사용하자.
		for(int i = 0; i < 20; i++) {
			main.cuosumer();
			int		sleep = (int)(Math.random() * (4000 - 500 + 1) + 500);
			try {
				Thread.sleep(sleep);
			}
			catch(Exception e) {}
		}
	}
}





