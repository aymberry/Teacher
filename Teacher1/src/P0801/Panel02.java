package P0801;
import		javax.swing.*;
import		java.awt.*;
public class Panel02 extends JFrame {

	public Panel02() {
		//	���ڽ��� �̹� Frame�̴�.
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		JButton	exitB = new JButton("������");
		JButton	sendB = new JButton("������");
		
		JTextArea	area = new JTextArea();
		//	�ؽ�Ʈ ����� ��ũ�ѹٸ� ������.
		JScrollPane	sp = new JScrollPane(area);
		
		JTextField field = new JTextField();
		
		//	�Ʒ��ʿ� �� �ΰ��� ������ �����Ѵ�.
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("Center", field);
		p1.add("East", sendB);
		
		//	���ʿ� �� ���ߴ� �׳� ������ ���� ũ�Ⱑ Ŀ���Ƿ�
		//	�۰� �����ؼ� �ְ� �ʹ�.
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
