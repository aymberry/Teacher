package P0711;
/*
 * 	������ �ϳ� �����
 * 	x ���߸� ������ ���α׷��� ����ǵ��� �ϼ���.
 */
//	1	 �ʿ��� ��ǰ�� ����� �� �ֵ��� �����Ѵ�.
import		java.awt.*;
import		java.awt.event.*;
public class Test06 {
	public static void main(String[] args) {
		//	�ʿ��� ��ǰ�� new ��Ű��
		Frame	f = new Frame("���� ���� �ι�° â");
		
//		f.addWindowListener(new MyEvent06());
		//	������ �� �Լ��� WindowAdapter�� �Ű�������
		//	���� �Ѵ�.
		//	�׷��� windowClosing()�� ����� ����� �־�� ������
		//	����Ŭ������ ���� ����߾���.
		//	
		//	��ó�� Ư�� Ŭ������ �������̵尡 �ʿ��ؼ�
		//	��¿�� ���� Ŭ������ ������ �ϴ� ���
		//	����ϴ� ����� ���� Inner Ŭ�����̴�.,
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//	m05-543-043
		
		//	�Լ��� �̿��ؼ� �ʿ��� ������ �Ѵ�.
		f.setSize(500,  500);
		f.setVisible(true);
	}
}
//	���� x ���߸� ������ ���α׷��� ����ǵ��� �غ���.
//	�̶��� JVM�� windowClosing �̶�� �̺�Ʈ �Լ��� �ʿ��ϴ�.
//	�� �Լ��� WindowAdapter Ŭ������ �ִ� �Լ��̴�.
//class MyEvent06 extends WindowAdapter {
//	public void windowClosing(WindowEvent e) {
//		//	���� �� �Լ��� x ���� ������ ����Ǵ� �Լ��̴�.
//		//	����	���α׷� ����
//		System.exit(0);
//	}
//}
//






