package P0728;
/*
 * 	이번에는 Dialog를 만들어서 출력해보자.
 */
import		javax.swing.*;
public class Dialog01 {
	public Dialog01() {
		//	참고
		//		Dialog는 반드시 다른 컨테이너가 먼저 존재해야
		//		화면에 나타날 수 있다.
		//	먼저 다른 컨테이너가 존재해야 한다.
		JFrame	frame = new JFrame();
		JDialog		dialog = new JDialog(frame);
		
		//	나머지 작업은 동일하다.
		dialog.setSize(400,  400);
		dialog.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Dialog01();
	}
}
