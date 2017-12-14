package P0801;
/*
 * 	컨테이너를 만들고 x 단추 누르면 프로그램이 종료되도록 하세요.
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
		//	필요한 함수만 오버라이드하면 된다.
		public  void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}





