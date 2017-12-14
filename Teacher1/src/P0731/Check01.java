package P0731;
/*
 * 	3개의 체크상자를 만들고
 * 	각각의 단추를 누르면 화면의 색상을 변경하도록 하자.
 */
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class Check01 {
	JFrame		frame;
	JCheckBox		box1, box2, box3;
	public Check01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	FlowLayout으로 하려고 한다.
		frame.setLayout(new FlowLayout());
		//	언제는 변수에 담고 언제는 그냥 new 시키나요?
		//	그 변수를 다시 사용할 필요가 있으면 변수에 담아놓고
		//	변수를 다시 사용할 필요가 없으면 그냥 new 시키면 된다.
		
		//	도구를 만들자.
		box1 = new JCheckBox("빨간색", true);
		box2 = new JCheckBox("초록색", true);
		box3 = new JCheckBox("파란색", true);
		//	아무리 이벤트 클래스를 잘 만들었어도
		//	자바는 등록되지 않은 이벤트는 사용할 수 없다.
		MyEvent01		evt = new MyEvent01();
		box1.addItemListener(evt);
		box2.addItemListener(evt);
		box3.addItemListener(evt);
		
		//	컨테이너에 넣자
		frame.add(box1);
		frame.add(box2);
		frame.add(box3);
		
		//	화면에 보일 필요가 있는 순간에
		//	화면에는 컨테이너를 보여준다.
		frame.setSize(400,  400);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Check01();
	}
	//	내부 클래스로 이벤트를 처리할 클래스를 만들자.
	//	왜? 내부 클래스로 만드냐?
	//		이벤트가 발생하면 그 폼에 대해서 작업을 해햐 하는 경우가
	//		많으므로...
	//		내부 클래스로 만들면 아무런 제약없이 바깥의 모든 멤버를
	//		자유롭게 사용할 수 있기 때문이다.
	class MyEvent01 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			//	이 함수 안에서 필요한 작업을 수행한다.
			//	할일
			//		3개의 체크상자의 선택 여부를 파악해서....
			boolean	red = box1.isSelected();
			boolean	green = box2.isSelected();
			boolean	blue = box3.isSelected();
			//		원하는 색상을 만들고
			int		redC = 0;
			int		greenC = 0;
			int		blueC = 0;	
			if(red == true) {
				redC = 255;
			}
			if(green == true) {
				greenC = 255;
			}
			if(blue == true) {
				blueC = 255;
			}
			Color c = new Color(redC, greenC, blueC);
			//	팁
			//		색상 지정하는 방법
			//		1.	이미 정해진 색상 이름 이용하는 방법
			//			예>		Color.WIHTE
			//		2.	원하는 색상을 만들어서 사용하는 방법
			//			이때는  RGB 색상으로 지정해서 사용한다.
			//			각각의 색상은 0~255사이의 숫자로 지정한다.
			//			예>		new Color(255, 0, 0);		//	 빨간색
			
			//		그 색상을 Frame에 칠한다.
			//		참고	AWT는 Frame에 색상을 칠할 수 있다.
			//				Swing은 칠할 수 없다.
			//			왜냐하면 Swing의 JFrame은 두겹으로 되어있기 때문이다.
			//		해결 방법
			//			Swing에서는 안쪽에 있는 Frame을 찾아서 거기에
			//			색상을 칠해야 한다.
			//			==>		함수 : getContentPane() 
			frame.getContentPane().setBackground(c);
		}
	}

}









