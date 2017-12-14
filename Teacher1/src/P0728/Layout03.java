package P0728;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 	단추 5개를 BorderLayout에 배치하자.
 */
public class Layout03 {
	public Layout03() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton	b1 = new JButton("나보기가");
		JButton	b2 = new JButton("역겨워");
		JButton	b3 = new JButton("가실때에는");
		JButton	b4 = new JButton("말없이 고이");
		JButton	b5 = new JButton("보내드리우리다.");

		BorderLayout	lay = new BorderLayout();
		f.setLayout(lay);
		
//		f.add("North", b1);
//		f.add(b2, "South");
//		f.add(BorderLayout.EAST, b3);
		f.add(b4, BorderLayout.WEST);
//		f.add(b5);	//	Center
		//	만약 위치를 생략하면 자동으로 Center로 지정된다.
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Layout03();
	}
}




