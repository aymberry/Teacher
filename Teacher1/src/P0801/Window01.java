package P0801;
/*
 * 	문제
 * 		컨테이너를 하나 만들고
 * 		x 단추를 누르면 프로그램이 종료되도록 해보자.
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
		//	x단추를 누르는 순간 실행되는 이벤트 함수이다.
		public void	windowClosing(WindowEvent e) {
			System.exit(0);
		}
		public void	windowDeactivated(WindowEvent e) {}
		public void	windowDeiconified(WindowEvent e) {}
		public void	windowIconified(WindowEvent e) {}
		public void	windowOpened(WindowEvent e) {}
	}
	
}








