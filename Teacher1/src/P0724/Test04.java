package P0724;
public class Test04 {
	public static void main(String[] args) {
		MyThread041 temp1 = new MyThread041();
		MyThread042 temp2 = new MyThread042();
		//	���� �����尡 �ƴϴ�.
		Thread		t1 = new Thread(temp1);
		Thread		t2 = new Thread(temp2);
		//	�嵮 New Born ���°� �ȴ�.
		
		t1.start();
		t2.start();
	}
}

class MyThread041 implements Runnable {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("�Լ谡 ���� �Դ´�.");
			//	������ �� ������ �ú��� �ý��ۿ� ���ؼ� ������
			//	��µ� �� �ִ�.
			//	���� �ѹ� ���������..... �ٸ� ���α׷����� ������
			//	�纸�ϰ��� �Ѵ�.
			Thread.yield();
		}
	}
}

class MyThread042 implements Runnable {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("\t\t���� ���� ��´�.");
			Thread.yield();
		}
	}
}