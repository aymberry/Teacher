package P0725;

public class Test04 {
	//	��ȣ ������ ���ؼ� ������ ������ �غ��Ѵ�.
	public MyThread041		t1;
	public MyThread042		t2;

	//	�� �Լ��� ������ ���� �� ������ Ŭ������ ���� ����� �Լ��̴�.
	//	����
	//		����ȭ��?
	//		�ΰ� �̻��� �����尡 ���� ����ϴ� �ڿ��� ���ؼ� ��ġ�ϴ� ���̴�.
	
	//	�Ϲ����� �Լ��� �ΰ��� �����尡 ���� ����� ������ �ִ�.
	//	�׷��� �Լ��� ���൵�� �����Ͱ� �浹�� ������ �ִ�.
	
	//	���� �� �����尡 �� �Լ��� �����ϱ� �����ϸ�
	//	�ٸ� ������� �� �Լ��� �������� ���ϰ� �ϰ� �ʹٸ�.....
	public synchronized void abc() {
		
		System.out.println("abc �Լ��� ���� �Ǿ����");
		try {
			Thread.sleep(10000);
			//	3��  �����ٰ�
		}
		catch(Exception e) {}
		System.out.println("abc �Լ��� �������");
	}
	public Test04() {
		//	���� ����Ǵ� �������� ���߿� ����� Ŭ������ �׳�
		//	new ��Ű�鼭 �ڽ��� this�� �ش�.
		t1 = new MyThread041(this);
		t2 = new MyThread042(this);
		
		//	������ Ŭ������ ���۽�Ű��
		//	������ Ŭ������ ������ Runnable ���·� ������Ű�� �ȴ�.
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		new Test04();
	}
}

class MyThread041 extends Thread {
	//	�� ������ Ŭ������ ����(main)�� ������ �ִ� abc�� �̿��� �����̴�.
	//	�� �� Ŭ������ main Ŭ������ ��ȣ ������ �Ǿ�� �Ѵ�.
	Test04		main;		//	��ȣ ������ ���� ��� �ּҸ� ����� ����
	public MyThread041() {}
	public MyThread041(Test04 temp) {
		main = temp;
	}
	public void run() {
		main.abc();
	}
}
class MyThread042 extends Thread {
	//	�� Ŭ���������� abc�� �̿��� �����̴�.
	//	�׷��Ƿ� �� Ŭ������ ��ȣ ���� �Ǿ�� �Ѵ�.
	Test04		main;		//	��ȣ ������ ���� ����
	public MyThread042() {}
	public MyThread042(Test04 temp) {
		main = temp;
	}
	public void run() {
		main.abc();
	}
}










