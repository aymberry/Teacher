package P0724;
public class Test01 {
	public static void main(String[] args) {
		//	�� ���α׷��� ���μ��� ���α׷��̴�.
		//	���� ���μ����� ����Ǹ�....
		//	�����嵵 ������ �� �ִ�.
		
		MyThread011 t1 = new MyThread011();
		MyThread012 t2 = new MyThread012();
		//	�츮�� �� ���� Runnable ������ �־��ָ� ���̴�.
		t1.start();
		t2.start();
		
	}
}

//	���� ������ ���α׷��� �ΰ� ���� ���� ó���ϰ� �ʹ�.
class MyThread011 extends Thread {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("�����̰� �尡�� ����.");
		}
	}
}

class MyThread012 extends Thread {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("\t\t�����̰� ������ ����.");
		}
	}
}
