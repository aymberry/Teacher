package P0801;
/*
 * 	�����̳ʸ� ����� x ���� ������ ���α׷��� ����ǵ��� �ϼ���.
 */
import		javax.swing.*;
import		java.awt.event.*;
public class Window02 {
	public Window02() {
		JFrame	f = new JFrame();
		f.addWindowListener(new WindowEvent02());
		f.setSize(400, 400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Window02();
	}
	
	class WindowEvent02 extends WindowAdapter {
		//	�ʿ��� �Լ��� �������̵��ϸ� �ȴ�.
		public  void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}





