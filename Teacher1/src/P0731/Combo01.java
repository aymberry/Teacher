package P0731;
/*
 * 	����
 * 		�޺����ڸ� 2�� ���� �� �Ʒ��� ��ġ�ϰ�
 * 
 * 		���� �޺����ڿ��� �����ϸ� �� ������ �Ʒ��� �޺����ڿ�
 * 		�߰��ǵ��� �غ���.
 */
import		javax.swing.*;
import		java.awt.event.*;
import		java.util.*;
public class Combo01 extends JFrame {
	//	�̷��� �ϸ� ���� ���� Ŭ������ �� Frame�� ��Ȱ�� ����ϰ� �ȴ�.
	JComboBox		upBox, downBox;
	public Combo01() {
		//	�̹� �� Ŭ������ JFrame�̹Ƿ� JFrame�� �ȸ���
		//	�� ��Ȱ�� �ϰ� �ȴ�.
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		Vector	v = new Vector();
		v.add("�ּ���");
		v.add("�ڱ���");
		v.add("�����");
		v.add("����");
		v.add("������");
		
		upBox = new JComboBox(v);
		downBox = new JComboBox();
		
		//	�̺�Ʈ�� ��ϵ� ������ ����Ǿ�����.
		upBox.addActionListener(new MyEvent02());
		
		this.add("North", upBox);
		this.add("South", downBox);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Combo01();
	}

	class MyEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	����
			//		���ʿ��� ������ �׸��� �˾Ƴ���
			String item = (String) upBox.getSelectedItem();
			//		�� ������ �Ʒ��� �޺����ڿ� �Է��Ѵ�.
			downBox.addItem(item);
		}
	}
}



