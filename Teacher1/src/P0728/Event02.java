package P0728;
/*
 * 	문제
 * 		단추를 하나 만들고 단추를 누를때마다 단추의 색상을 변경하고 싶다.
 */
import		javax.swing.*;
import 	java.awt.*;
import		java.awt.event.*;

public class Event02 {
	JButton	b = new JButton("눌러봐");
	//	언제는 전역으로 만들고 언제는 지역으로 만드나요?
	//	답
	//		그 변수를 다른곳에서 사용할 필요가 있으면 전역으로 빼고
	//		다른 곳에서 사용하지 않으면 지역으로 만들면 된다.
	
	public Event02() {
		JFrame		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	4단계
		//		이벤트를 원하는 도구는 반드시 등록되어야 한다.
		b.addActionListener(new MyEvent02());
		
		//	배치전략이 생략되었으므로 BorderLayout이 되었고
		//	위치를 생략했으므로 Center로 들어간 것이다.
		
		f.add(b);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Event02();
	}
	//	실제로는 이벤트 클래스는 90%가 내부 클래스로 만드는것이
	//	좋다.
	class MyEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	이곳에서 색상을 바꾸고 싶다.
			
			//	색상을 지정한 후
			int		red = (int)(Math.random() * 256);
			int		green = (int)(Math.random() * 256);
			int		blue = (int)(Math.random() * 256);
			
			Color color = new Color(red, green, blue);
			
			b.setBackground(color);	
		}
	}
}













