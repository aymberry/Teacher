package P0801;
import		javax.swing.*;
import		java.awt.*;
public class Panel03 {
	public Panel03() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel	l1 = new JLabel("Name");
		JLabel	l2 = new JLabel("Mobile");
		JLabel	l3 = new JLabel("E-Mail");
		JLabel	l4 = new JLabel("Address");
		
		ImageIcon log = new ImageIcon("src/P0801/css1.png");
		JLabel logL = new JLabel(log);
		
		JTextField		f1 = new JTextField(6);
		JTextField		f2 = new JTextField(6);
		JTextField		f3 = new JTextField(6);
		JTextField		f4 = new JTextField(6);

		//	ù��° ���� �г�
		JPanel	p1 = new JPanel(new GridLayout(4, 1));
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		//	�ι�° ���� �г�
		JPanel	p2 = new JPanel(new GridLayout(4, 1));
		p2.add(f1);
		p2.add(f2);
		p2.add(f3);
		p2.add(f4);
		
		//	����� �г��� �����.
		JPanel	p3 = new JPanel(new BorderLayout());
		p3.add("West", p1);
		p3.add("Center", p2);
		
		//	�ʷϻ� �г��� �����.
		JPanel	p4 = new JPanel(new BorderLayout());
		p4.add("North", p3);
		p4.add("Center", logL);
		
		//	�ϼ��� �г��� Frame�� ���ʿ� ����
		f.add("West", p4);
		
		f.setSize(500,  400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Panel03();
	}
}
