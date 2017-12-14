package P0728;
/*
 * 	화면에 단추 하나를 가진 Frame을 만들어 보자.
 */
import		javax.swing.*;
public class Button01 {
	public Button01() {
		//	먼저 컨테이너는 한개이상 존재해야 한다.
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	컨테이너 안에 담을 도구를 준비한다.
//		JButton	b = new JButton("눌러봐");
		ImageIcon	img = new ImageIcon("src/P0728/abc.jpg");
		JButton	b = new JButton(img);
		//	도구는 반드시 컨테이너 안에 담겨야 한다.
		f.add(b);
		
		//	화면에는 컨테이너가 나오도록 한다.
		f.setSize(300,  300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Button01();
	}
}
