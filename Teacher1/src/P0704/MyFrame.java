package P0704;
import		java.awt.*;
import		java.awt.event.*;
public class MyFrame extends Frame {
	//	이 클래스는 지금 내가 만든 클래스이다.
	//	근데	이 안에는 아무런 내용도 코딩하지 않았다.
	
	//	이 클래스 안에는 나는 아무런 내용도 코딩하지 않았지만....
	//	이미 Frame 클래스가 가지고 있는 모든 기능이 복사되어 있다.
	public MyFrame() {
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
}





