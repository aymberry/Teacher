package P0731;
/*
 * 	���� ���� 3�� �����
 * 	������ ���� ������ �������� ȭ���� ĥ�ϼ���.
 */
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class Radio01 extends JFrame {
	public Radio01() {
		//	�̹� �� Ŭ������ JFrame�� ��Ȱ�� �Ѵ�.
		//	����
		//		IS a ����		��� ���� ���¸� ���ϴ� ��
		//						���� ���°� IS �����̴�.
		//						��,  Radio01 Is a JFrame
		//		HAS a����		������ ������ �ִ� ���¸� ���ϴ� ��
		//						JFrame	f = new JFrame(); �� ��츦 ���ϸ�
		//						Radio01 Has a JFrame���� ǥ���Ѵ�. 
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JRadioButton	redB = new JRadioButton("RED");
		JRadioButton	greenB = new JRadioButton("GREEN");
		JRadioButton	blueB = new JRadioButton("BLUE");
		
		redB.addItemListener(new MyEvent041());
		greenB.addItemListener(new MyEvent042());
		blueB.addItemListener(new MyEvent043());
		
		//	���� ���ߴ� �ݵ�� �׷�ȭ �Ǿ�� �Ѵ�.
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
	//	3���� ���� ���߸��� �̺�Ʈ ó���� �ؾ� ������.....
	
	//		�������� �̺�Ʈ ó��
	class MyEvent041 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Radio01.this.getContentPane().setBackground(Color.red);
		}
	}
	//	�ʷϴ��� �̺�Ʈ ó��
	class MyEvent042 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Radio01.this.getContentPane().setBackground(Color.green);
		}
	}
	//	�Ķ� ���� �̺�Ʈ ó��
	class MyEvent043 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Radio01.this.getContentPane().setBackground(Color.blue);
		}
	}
	
	
	
	
	
	
}
