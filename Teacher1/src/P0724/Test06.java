package P0724;
/*
 * 	����
 * 		���ΰ� �����尡 ���ÿ� ����Ǵ� ���¿���...
 * 
 * 		������ ������ �����嵵 ���� �������� �ϰ� �ʹ�.
 */
public class Test06 {
	public static void main(String[] args) {
		MyThread061	t1 = new MyThread061();
		t1.start();		//	������ ���α׷��� ����ȴ�.
		
		for(int i = 0; i < 100; i++) {
			System.out.println("���� �����Դϴ�.");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}

		t1.isStart = false;
		//	���� ������ false�� ����� �־
		//	�ڿ������� �����尡 �������� ������ �־�� �Ѵ�.
		
//		t1.stop();
		//	���� ���ο��� ���ϴ� �۾��� ������ ���α׷��� 
		//	�������� �ϰ� �ʹ�.
		//	�׶� ������ �����嵵 ���� ����Ǳ⸦ ���Ѵ�.
	}
}

class MyThread061 extends Thread {
	//	1.	���Ḧ ������ ������ �غ��Ѵ�.
	public boolean	isStart = true;

	public void run() {
		//	isStart �������� true�� ���Ǿ� �����Ƿ�...
		//	�� �ݺ��� ���� ���ѷ����� �ȴ�.
		
		//	������?		���� �ٲ� �� �ִٴ� ���̹Ƿ�
		//					isStrat�� ���� �ٲ� �� �ִٴ� ���̰�...
		//					�̰��� false�� �Ǹ� �� �ݺ��� ����� ���̴�.
		while(isStart) {
			System.out.println("���� ������ ���α׷��Դϴ�.");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
		
		//	while�� ����Ǹ� run()�� �����Ƿ�...
		//	�� �����带 ����ǰ� �ȴ�.
		
		//	���		�츮��  stop() ��ſ�
		//				isStart ��� ������ false�� �Է��� ������....
		//				�ڿ������� run()�� ��������
		//				�׷��� �����尡 �������� ���־�� �Ѵ�.
	}
}
//	���
/*
 * 	1.	������ Ŭ������ ������ �ݺ��� ������ ������ �غ��Ѵ�.
 * 	
 * 			��>		public boolean	isStart = true;
 * 
 * 	2.	�������� �̿��ؼ� run() �� �ݺ� �ǵ��� ��ġ�Ѵ�.
 * 
 * 			��>		public void run() {
 * 						while(isStart) {
 * 							????
 * 						}
 * 					}
 * 
 * 	3.	�����尡 ����� ������ �Ǹ� isStart ������ false�� ���������ν�
 * 		while�� ����ǰ� �׷� ���ؼ� run() �� ����Ǹ�
 * 		�׷� ���ؼ� �����嵵 ���� �ڿ������� ����ǵ��� �Ѵ�.
 * 
 * 			��>		t1.isStart = false;
 * 
 */











