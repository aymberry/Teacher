package P0728;
/*
 * 	화면에 패널을 2개 넣어보자.
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

		//	패널은 스스로 화면에 나오지 못한다.
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
