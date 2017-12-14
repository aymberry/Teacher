package P0711;
/*
 * 	윈폼을 하나 만들고
 * 	x 단추를 누르면 프로그램이 종료되도록 하세요.
 */
//	1	 필요한 부품을 사용할 수 있도록 선언한다.
import		java.awt.*;
import		java.awt.event.*;
public class Test06 {
	public static void main(String[] args) {
		//	필요한 부품을 new 시키고
		Frame	f = new Frame("내가 만든 두번째 창");
		
//		f.addWindowListener(new MyEvent06());
		//	원래는 이 함수에 WindowAdapter가 매개변수로
		//	들어가야 한다.
		//	그런데 windowClosing()의 기능을 만들어 주어야 함으로
		//	하위클래스를 만들어서 사용했었다.
		//	
		//	이처럼 특정 클래스의 오버라이드가 필요해서
		//	어쩔수 없이 클래스를 만들어야 하는 경우
		//	사용하는 방법이 무명 Inner 클래스이다.,
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//	m05-543-043
		
		//	함수를 이용해서 필요한 조작을 한다.
		f.setSize(500,  500);
		f.setVisible(true);
	}
}
//	이제 x 단추를 누르면 프로그램이 종료되도록 해보자.
//	이때는 JVM이 windowClosing 이라는 이벤트 함수가 필요하다.
//	이 함수는 WindowAdapter 클래스에 있는 함수이다.
//class MyEvent06 extends WindowAdapter {
//	public void windowClosing(WindowEvent e) {
//		//	이제 이 함수는 x 단추 누르면 실행되는 함수이다.
//		//	할일	프로그램 종료
//		System.exit(0);
//	}
//}
//






