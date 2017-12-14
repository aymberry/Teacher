package P0728;
/*
 * 	화면에 프레임 하나를 출력해 보자.
 */
import		javax.swing.*;
public class Frame01 {
	public Frame01() {
		//	프레임이 필요하면 부품을 new 시킨 후
		//	필요한 함수를 이용해서 작업을 하면 된다.
		JFrame	frame = new JFrame("내가 만든 프레임");
		//	참고
		//		JFrame은 x 단추를 눌러도 프로그램 종료되지 않고
		//		다만 화면에서 프레임을 안보이도록 할 뿐이다.
		//		x 단추 누르면 프로그램이 같이 종료되도록 하고자 한다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	1.	프레임의 크기를 지정한다.
		frame.setSize(500, 500);
		//	2.	프레임을 화면에 출력하도록 지시한다.
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Frame01();
	}
}
