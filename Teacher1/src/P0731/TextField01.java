package P0731;
/*
 * 	����
 * 		�Ѱ��� �ؽ�Ʈ �ʵ带 ���� �Ʒ��� ��ġ�ϰ�
 * 		�Ѱ��� ��ϻ��ڸ� ���� ���ʿ� ��ġ�ϰ�
 * 		�Ʒ��ʿ� �Է»��ڿ� ������ �Է��� �� ����Ű�� ġ��
 * 		�� ������ ��ϻ��ڿ� �������� ����.
 */
import		java.util.*;
import		javax.swing.*;
import		java.awt.event.*;
public class TextField01 extends JFrame {
	Vector		v;	//	��ϻ��ڿ� �����͸� �Է��Ϸ���
					//	�Ѱ����� �ȵǰ� ���ͳ� �迭�� ��Ƽ� �ѹ��� 
					//	�ؾ� �ϹǷ�... �׸��� ����� ����
	JList			list;
	JTextField		field;
	public TextField01() {
		//	1.	�����̳� �غ�
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//	2.	��ġ���� �����
		//		BorderLayout���� �� �����̹Ƿ� ���ص� �ȴ�.
		//	3.	���� �غ��ϰ�
		v = new Vector();
		list = new JList(v);
		JScrollPane sp = new JScrollPane(list);
		list.setVisibleRowCount(5);
		
		field = new JTextField();
		//	�̺�Ʈ ����� �Ѵ�.
		field.addActionListener(new FieldEvent01());
		
		this.add("North", sp);
		this.add("South", field);
		
		//	4.	ȭ�鿡 ����Ѵ�.
		this.setSize(400, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new TextField01();
	}
	class FieldEvent01 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	����
			//	1.	�ؽ�Ʈ �ʵ忡 �Է��� ���� �˾Ƴ���.
			String		data = field.getText();
			
			//	2.	����Ʈ�� ����
			//		����Ʈ���� �׸��� �Ѱ��� �߰��� �� ����.
			//		���ͳ� �迭�� �߰��� �׸��� ����� ��
			//		�װ��� �̿��Ѵ�.
			//	��, ���ͳ� �迭�� ��� ���ڿ� �� ������ �߰�
			//	�����Ͽ� ������ �� �װ��� ��ä�� �ִ´�.
			v.add(data);
			list.setListData(v);
		}
	}
}



