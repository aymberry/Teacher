package P0728;
/*
 * 	ȭ�鿡 �����츦 �ϳ� ����غ���.
 */
import		javax.swing.*;
public class Window01 {

	public Window01() {
		JFrame	frame = new JFrame();
		JWindow	window = new JWindow(frame);
		
		window.setSize(300, 300);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new Window01();
	}
}


