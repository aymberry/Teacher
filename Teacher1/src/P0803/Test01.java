package P0803;
import		java.awt.*;
import		java.awt.event.*;
import		javax.swing.*;
public class Test01 {
	JFrame		f;
	CardLayout	card;
	public Test01() {
		f = new JFrame();
		card = new CardLayout();
		f.setLayout(card);
		
		OnePanel		one = new OnePanel(this);
		TwoPanel		two = new TwoPanel(this);
		ThreePanel	three = new ThreePanel(this);
		FourPanel		four = new FourPanel(this);
		FivePanel		five = new FivePanel(this);
		
		f.add("1번", one);
		f.add("2번", two);
		f.add("3번", three);
		f.add("4번", four);
		f.add("5번", five);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Test01();
	}
}

class OnePanel extends JPanel {
	JButton	b;
	Test01		main;
	OnePanel(Test01 m) {
		main = m;
		b = new JButton("1번단추");
		b.addActionListener(new ButtonEvent());
		add(b);
		this.setBackground(Color.red);
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			main.card.show(main.f, "3번");
		}
	}
}
class TwoPanel extends JPanel {
	JButton	b;
	Test01		main;
	TwoPanel(Test01 m) {
		main = m;
		b = new JButton("2번단추");
		b.addActionListener(new ButtonEvent());
		add(b);
		this.setBackground(Color.green);
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			main.card.first(main.f);
		}
	}
}
class ThreePanel extends JPanel {
	JButton	b;
	Test01		main;
	ThreePanel(Test01 m) {
		main = m;
		b = new JButton("3번단추");
		b.addActionListener(new ButtonEvent());
		add(b);
		this.setBackground(Color.blue);
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			main.card.last(main.f);
		}
	}
}
class FourPanel extends JPanel {
	JButton	b;
	Test01		main;
	FourPanel(Test01 m) {
		main = m;
		b = new JButton("4번단추");
		b.addActionListener(new ButtonEvent());
		add(b);
		this.setBackground(Color.pink);
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			main.card.show(main.f, "2번");
		}
	}
}
class FivePanel extends JPanel {
	JButton	b;
	Test01		main;
	FivePanel(Test01 m) {
		main = m;
		b = new JButton("5번단추");
		b.addActionListener(new ButtonEvent());
		add(b);
		this.setBackground(Color.orange);
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			main.card.previous(main.f);
		}
	}
}