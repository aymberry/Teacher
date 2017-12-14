package P0728;
/*
 * 	GridLayout을 이용해서 단추 6개를 배치해보자.
 */
import		javax.swing.*;
import		java.awt.*;
public class Layout02 {
	public Layout02() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton[] b = new JButton[6];
		for(int i = 0; i < 6; i++) {
			b[i] = new JButton((i + 1) + "번 단추");
		}

		GridLayout lay = new GridLayout(3, 2, 20, 20);
		f.setLayout(lay);
		
		for(int i = 0; i < 6; i++) {
			f.add(b[i]);
		}
		
		f.setSize(400,  400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Layout02();
	}
}
