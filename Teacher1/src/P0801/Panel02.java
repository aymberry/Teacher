package P0801;
import		javax.swing.*;
import		java.awt.*;
public class Panel02 extends JFrame {

	public Panel02() {
		//	나자신이 이미 Frame이다.
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		JButton	exitB = new JButton("나가기");
		JButton	sendB = new JButton("보내기");
		
		JTextArea	area = new JTextArea();
		//	텍스트 에리어에 스크롤바를 입힌다.
		JScrollPane	sp = new JScrollPane(area);
		
		JTextField field = new JTextField();
		
		//	아래쪽에 들어갈 두개의 도구를 포장한다.
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("Center", field);
		p1.add("East", sendB);
		
		//	위쪽에 들어갈 단추는 그냥 넣으면 가로 크기가 커지므로
		//	작게 포장해서 넣고 싶다.
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(exitB);
		
		
		
		this.add("North", p2);
		this.add("Center",  sp);
		this.add("South", p1);
		
		this.setSize(400, 600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Panel02();
	}
}
