package P0801;
/*
 * 	����
 * 		�����̳ʸ� �ϳ� �����
 * 		x ���߸� ������ ���α׷��� ����ǵ��� �غ���.
 */
import		javax.swing.*;
import		java.awt.event.*;
public class Window01 {
	public Window01() {
		JFrame	f = new JFrame();
		f.addWindowListener(new WindowEvent01());
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Window01();
	}
	class WindowEvent01 implements WindowListener {
		public void	windowActivated(WindowEvent e) {}
		public void	windowClosed(WindowEvent e) {}
		//	x���߸� ������ ���� ����Ǵ� �̺�Ʈ �Լ��̴�.
		public void	windowClosing(WindowEvent e) {
			System.exit(0);
		}
		public void	windowDeactivated(WindowEvent e) {}
		public void	windowDeiconified(WindowEvent e) {}
		public void	windowIconified(WindowEvent e) {}
		public void	windowOpened(WindowEvent e) {}
	}
	
}








