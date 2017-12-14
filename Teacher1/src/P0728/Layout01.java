package P0728;
/*
 * 	단추 3개를 나열해 보자.
 */
import		javax.swing.*;
import		java.awt.*;	//	배치전략 클래스 사용을 위해서
public class Layout01 {
	public Layout01() {
		//	1.	컨테이너를 만든다.
		JFrame	f = new JFrame("배치전략 연습");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	2.	필요한 도구 만든다.
		JButton b1 = new JButton("1번 단추");
		JButton b2 = new JButton("2번 단추");
		JButton b3 = new JButton("3번 단추");
		
		//	3.	배치전략을 세운다.
		FlowLayout	lay = new FlowLayout(FlowLayout.CENTER, 20, 20);
		f.setLayout(lay);
		
		//	4.	컨테이너에 도구를 넣는다.
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		//	5.	화면에는 컨테이너를 출력한다.
		f.setSize(500,  500);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Layout01();
	}
}


