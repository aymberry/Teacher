package P0724;

public class Test02 {
	public static void main(String[] args) {
		//	�� ���α׷��� ���μ��� ���α׷��̴�.
		//	�ݵ�� ���μ��� ���α׷��� �Ѱ� �����ؾ� �Ѵ�.
		//	�׷��� �޸� �Ҵ��� ���� �� �ֱ� �����̴�.

		//	1.	�ϴ� ���μ��� ���α׷��� ���۵� �� �����带 ���� �� �ִ�.
		//	2.	�ʿ��� �������� ������ ���α׷��� �⵿�Ѵ�.
		MyThread021	temp1 = new MyThread021();
		MyThread022	temp2 = new MyThread022();
		//		������ ������ ��ȭ�� ����.
		//		�׳� �Ϲ������� � Ŭ���� �ϳ��� new ��Ų ȿ���ۿ� ����.
		//	Thread Ŭ������ new ��Ű�鼭 1)�� ����� �־��־�� �Ѵ�.
		
		Thread		t1 = new Thread(temp1);
		Thread		t2 = new Thread(temp2);
		//	����� t1, t2 ���α׷��� New Born ���·� �����ȴ�.
		
		//	���� �����尡 �����ؾ��� ������ �Ǹ� Runnable ���·� �����Ѵ�.
		t1.start();
		t2.start();
		//	���� CPU�� �� ���α׷��� ������ ���� ������ �ϰ� �ȴ�.
	}
}

//	������ ������� �����ų ���α׷��� ������.
class MyThread021 implements Runnable {
	public void run() {
		//	�� �Լ��� �ſ� �߿��� �Լ��ν�
		//	������ ���α׷��� ���� �Լ��� �ȴ�.
		//	��, ������ ���α׷��� �ݵ�� run() ���� �����ϵ��� ��ӵǾ� �ִ�.

		//	���� �����忡�� �ʿ��� �۾��� �����Ѵ�.
		for(int i = 0; i < 1000; i++) {
			System.out.println("���谡 ������ �Ѵ� " + i);
		}
	}
}

class MyThread022 implements Runnable {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("\t\t���̰� ���� �Ѵ� " + i);
		}
	}
}








