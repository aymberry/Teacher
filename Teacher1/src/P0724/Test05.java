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
			System.out.println("�����̰� �尡�� ����.");
			//	���� �ѹ� ����� �� �� �����带 ������
			//	Block ���·� �������� �ʹ�.
			try {
				Thread.sleep(500);
				//	0.5�� ���� �ڵ����� Block ���¿� �ִٰ� �ڵ� �����ϰ� �ȴ�.
			}
			catch(Exception e) {
			}
		}
	}
}
class MyThread052 extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t�����̰� ������ ����.");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
			}
		}
	}
}