package P0801;
import		javax.swing.*;
public class Panel01 {

	public Panel01() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	��ġ������ BorderLayout���� �ϰ��� �Ѵ�.
		//	JFrame�� �ڵ� ��ġ������ BorderLayout�̴�.
		
		JButton	b1 = new JButton("1�� ����");
		JButton	b2 = new JButton("2�� ����");
		
		//	�ϳ��� ������ �������� ������ �ֱ� ���ؼ���
		//	�������� ������ ��� �ϳ��� ����ó�� ������ �Ѵ�.
		//	��ó�� �������� ������ �ϳ��� ���� ����� ����ϴ� ����
		//	�ٷ� JPanel�̴�.
		
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
