package P0801;
import		javax.swing.*;
public class Panel01 {

	public Panel01() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	배치전략은 BorderLayout으로 하고자 한다.
		//	JFrame은 자동 배치전략이 BorderLayout이다.
		
		JButton	b1 = new JButton("1번 단추");
		JButton	b2 = new JButton("2번 단추");
		
		//	하나의 영역에 여러개의 도구를 넣기 위해서는
		//	여러개의 도구를 묶어서 하나의 도구처럼 만들어야 한다.
		//	이처럼 여러개의 도구를 하나로 묶는 기능을 담당하는 것이
		//	바로 JPanel이다.
		
		JPanel	p = new JPanel();
		p.add(b1);
		p.add(b2);
		
		f.add("South", p);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Panel01();
	}
}
