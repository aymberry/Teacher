package P0728;
/*
 * 	ȭ�鿡 �г��� 2�� �־��.
 */
import		java.awt.*;
import		javax.swing.*;
public class Panel01 {
	public Panel01() {
		JFrame	frame = new JFrame();
		frame.setLayout(new GridLayout(1, 2));
		
		JPanel	p1 = new JPanel();
		p1.setBackground(Color.red);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.blue);

		//	�г��� ������ ȭ�鿡 ������ ���Ѵ�.
//		p1.setSize(400, 400);
//		p1.setVisible(true);
		
		frame.add(p1);
		frame.add(p2);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Panel01();
	}
}
