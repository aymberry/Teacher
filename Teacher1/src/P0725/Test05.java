package P0725;
import		java.util.*;
public class Test05 {
	//	�� �����尡 ���� ����� �÷��� �ϳ��� �غ��Ѵ�.
	ArrayList		list = new ArrayList();
	//	���� ����� Ŭ���������� ������ ����� Ŭ������ 
	//	�׳� new ��Ű�鼭	�� �ݵ�� �ڽ��� �ּ�(this)�� �˷��ش�.
	MyThread051		t1;
	MyThread052		t2;
	public Test05() {
		t1 = new MyThread051(this);
		t2 = new MyThread052(this);
		
		t1.start();
		//	�Է� �����尡 �����ǰ� ���߿� ��� �����尡 ����ǵ��� ��������.
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
	//	���߿� ����� Ŭ������
	//	������ �Լ��� �̿��ؼ� �Ѿ���� �ּ�(this)�� ���� �غ� ����
	//	�غ�� ������ ����Ѵ�.
	Test05		main;		//	��ȣ ���� ����
	public MyThread051(){}
	public MyThread051(Test05 temp) {
		main = temp;
	}
	public void run() {
		//	ù��° ������ ������ �÷��ǿ� �����͸� �߰��ϴ� ��Ȱ��
		//	�ϵ��� �Ѵ�.
		//	���� �����͸� 20���� �߰��� ����.
		
		//	�Է°� ����� �����ϰ� �ϴٺ���
		//	�Է��� ���� �ʾҴµ� ����� �ϸ� �����Ͱ� ��� ������ ���Ƿ�....
		//	���� 20���� �����͸� �� ä�ﶧ���� �÷�����
		//	�ٸ� �����尡 ����� �� ������ �ϰ� �ʹ�.
		
		synchronized(main.list) {
			for(int i = 0; i < 20; i++) {
				//	�߰��� �����͸� �����ϰ� �߻�����.
				int		num = (int) (Math.random() * 101);
				
				main.list.add(num);
				System.out.println("���� " + num + "�� �Է��߾��");
				//	�ʹ� �ӵ��� �����Ƿ�... �����ϰ� �����ٰ� �ϵ��� ����.
				//	���� �ӵ��� �����ϰ� ������ ����.
				int		sleep = (int)(Math.random() * (3000 - 500 + 1) + 500);
				//	���� 0.5~3�� ������ �����ϰ� ������ �ϰ�ʹ�.
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
		//	�ι�° ������ ������ �÷����� �����͸� ������ ����ϴ�
		//	��Ȱ�� �ϵ��� �Ѵ�.
		
		//	���� 20�� �����͸� ������ �Ѵ�.
		synchronized(main.list) {
			for(int i = 0; i < 20; i++) {
				int		num = (int) main.list.get(0);
				//	����� �����ʹ� ������.
				main.list.remove(0);
				System.out.println("���� " + num + " �� ������ ����߾��");
				//	���� ���������� �ӵ��� �����Ƿ� ������ ����.
				int		sleep = (int)(Math.random() * (3000 - 500 + 1) + 500);
				//	���� 0.5~3�� ������ �����ϰ� ������ �ϰ�ʹ�.
				try {
					Thread.sleep(sleep);
				}
				catch(Exception e) {}
			}
		}
	}
}




