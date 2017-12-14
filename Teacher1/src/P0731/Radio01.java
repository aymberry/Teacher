package P0731;
/*
 * 	라디오 단추 3개 만들고
 * 	선택한 라디오 단추의 색상으로 화면을 칠하세요.
 */
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class Radio01 extends JFrame {
	public Radio01() {
		//	이미 이 클래스는 JFrame의 역활을 한다.
		//	참고
		//		IS a 관계		상속 받은 상태를 말하는 것
		//						현재 상태가 IS 관계이다.
		//						즉,  Radio01 Is a JFrame
		//		HAS a관계		변수로 가지고 있는 상태를 말하는 것
		//						JFrame	f = new JFrame(); 인 경우를 말하며
		//						Radio01 Has a JFrame으로 표현한다. 
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JRadioButton	redB = new JRadioButton("RED");
		JRadioButton	greenB = new JRadioButton("GREEN");
		JRadioButton	blueB = new JRadioButton("BLUE");
		
		redB.addItemListener(new MyEvent041());
		greenB.addItemListener(new MyEvent042());
		blueB.addItemListener(new MyEvent043());
		
		//	라디오 단추는 반드시 그룹화 되어야 한다.
		ButtonGroup group = new ButtonGroup();
		group.add(redB);
		group.add(greenB);
		group.add(blueB);
		
		this.add(redB);
		this.add(greenB);
		this.add(blueB);
		
		this.setSize(400,  400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Radio01();
	}
	//	3개의 라디오 단추마다 이벤트 처리를 해야 함으러.....
	
	//		빨간단추 이벤트 처리
	class MyEvent041 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Radio01.this.getContentPane().setBackground(Color.red);
		}
	}
	//	초록단추 이벤트 처리
	class MyEvent042 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Radio01.this.getContentPane().setBackground(Color.green);
		}
	}
	//	파란 단추 이벤트 처리
	class MyEvent043 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Radio01.this.getContentPane().setBackground(Color.blue);
		}
	}
	
	
	
	
	
	
}
