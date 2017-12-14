package P0725;
/*
 * 	�÷��ǿ� �����͸� �Է��ϰ� ����ϴ� �����带 �����.
 * 
 * 	�Ʊ�� �÷��ǿ� �����Ͱ� �Ϸ�� �Ŀ� ����� ����������.....
 *	������ �Է°� ����� ���ÿ� �����ϵ��� �� �����̴�.
 *
 * 	�Ʊ�ó�� ������ ���� �ʰ� �����ϰ� ����ǵ��� �� �����̴�.
 * 
 * 	�츮������ ���
 *		5���� �����͸� ������ ���̻� ���� ���ϰ� ����. 		
 */
import		java.util.*;
public class Test06 {
	ArrayList		list = new ArrayList();
	//	�����͸� �����ϰ� ������ �÷���
	
	public synchronized void producer() {
		//	������ ������ ����� �Լ�
		//	�������� �� �Լ��� ȣ���ϸ� �����͸� �����ؾ� �Ѵ�.
		//	�ٵ�........
		//	�츮�� ��ӿ� ���ؼ�
		//		5���ǵ���Ÿ�� �̹� ������ ������ �����ؾ��Ѵ�.
		if(list.size() == 5) {
			//	�̹� â�� ������ �����Ƿ� ���̻� ������ �ؼ���
			//	�ȵȴ�.
			//	��� �� �Լ��� �����ϴ� ������� ������ ���� ���� 
			//	���ϵ��� Block ���·� ���� ���Ѿ� �Ѵ�.
			System.out.println("�����ڰ� ���ͷ� ����.");
			try {
				wait();
			}
			catch(Exception e) {}
		}
		
		//	���� ���������� ���� ����.
		char		ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		list.add(ch);
		System.out.println(ch + "�� �����߾��  ���� â���� ���� = " + list.size());
		
		//	������ �����ؼ� â��(�÷��ǿ� �־���.)
		
		//	���� â�� ������ �Ѱ��̻� �����ϹǷ�...
		//	���� �ִ� �Һ��ڰ� ���� �� �� �ִ� ȯ���� �Ǿ���.
		//	��� ���� �ִ� �Һ��ڸ� ������ ���� �ϵ��� �ؾ߰ڴ�.
		
		notifyAll();
		//	�� �Լ��� Block�� �����尡 �ִ� ���� �׳� ����� �Լ��̴�.
	
	}
	public synchronized void cuosumer() {
		//	������ �Һ� ����� �Լ�
		//	�������� �Һ� �Ϸ� �Դµ�... �����Ͱ� ������ �Һ�
		//	�� �� ����.
		//	�׷��� �� ������� �����ΰ� ���� �Ǿ�� �Ѵ�.
		if(list.size() == 0) {
			System.out.println("�Һ��ڰ� ���ͷ� ����.");
			try {
				wait();
			}
			catch(Exception e) {}
		}
		
		//	���������� �Һ�����.
		char	ch = (char) list.get(0);
		list.remove(0);
		System.out.println(ch + "�� �Һ��߾��  ���� â���� ���� = " + list.size());

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
		//	20�� ������ �ϵ��� �Ѵ�.
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
		//	20�� �����͸� ���� �������.
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





