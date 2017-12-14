package P0801;
/*
 * 	문제
 * 		컨테이너 안에 패널을 두개 배치하고
 * 
 * 		각각의 패널에 마우스 포인터가 들어가고 나감에 따라 색상을
 * 		바꾸도록 하고싶다.
 */
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class Mouth01 {

	public Mouth01() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(1, 2));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		MouthEvent01		evt = new MouthEvent01();
		p1.addMouseListener(evt);
		p2.addMouseListener(evt);
		
		f.add(p1);
		f.add(p2);
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Mouth01();
	}
//	class MouthEvent01 implements MouseListener {
	class MouthEvent01 extends MouseAdapter {
//		public void	mouseClicked(MouseEvent e) {}
		//	마우스 포인터가 도구에 들어가면 실행하는 함수
		public void	mouseEntered(MouseEvent e) {
			//	할일
			//		이벤트가 발생한 도구를 알아낸다.
			JPanel		target = (JPanel) e.getSource();
			//		그 패널의 색상을 변경하자.
			target.setBackground(Color.red);
		}
		//	마우스 포인터가 도구에 나가면 실행하는 함수
		public void	mouseExited(MouseEvent e) {
			JPanel	target = (JPanel) e.getSource();
			target.setBackground(Color.green);
		}
//		public void	mousePressed(MouseEvent e) {}
//		public void	mouseReleased(MouseEvent e) {}
	}
	
	
	
	
}







