package P0728;
/*
 * 	화면에 윈도우를 하나 출력해보자.
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


