package P0801;
/*
 * 	ȭ�鿡 ���� �ϳ��� ����� ������ ���� ��ȭ���ڸ� ����� ����.
 */
import		javax.swing.*;
import		java.awt.event.*;
public class Option01 {
	JFrame	f; 
	public Option01() {
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton	b = new JButton("������");
		b.addActionListener(new ButtonEvent01());
		f.add(b);
		
		f.setSize(300,  300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Option01();
	}
	void comfirm() {
		//	comfirm ��ȭ���ڸ� ��������.
		//	1.	showConfirmDialog(Component parentComponent, Object message)
	//	int	type = JOptionPane.showConfirmDialog(f, "Ȯ���ϼ���");
		
//		int	type = JOptionPane.showConfirmDialog(f, "Ȯ���ϼ���", 
//				"Ȯ��", JOptionPane.OK_CANCEL_OPTION);
		
//		int	type = JOptionPane.showConfirmDialog(f, "Ȯ���ϼ���", 
//				"Ȯ��", JOptionPane.OK_CANCEL_OPTION, 
//				JOptionPane.ERROR_MESSAGE);

		ImageIcon	img = new ImageIcon("src/P0801/sam.png");
		int	type = JOptionPane.showConfirmDialog(f, "Ȯ���ϼ���", 
		"Ȯ��", JOptionPane.OK_CANCEL_OPTION, 
		JOptionPane.ERROR_MESSAGE, img);
		
		//	����	��ȯ���� �ǹ�
		//			�� ��ȭ���ڸ� �ݰ� ���� ������ ����
		//			CANCEL_OPTION		��� ����
		/* 			CLOSED_OPTION		x ����
		 * 			DEFAULT_OPTION
		 * 			NO_OPTION			�ƴϿ�
		 * 			OK_OPTION			Ȯ��
		 * 			YES_OPTION			��
		 */
		if(type == JOptionPane.OK_OPTION) {
			System.out.println("Ȯ�� ����");
		}
		else if(type == JOptionPane.CANCEL_OPTION) {
			System.out.println("��� ����");
		}
		
	}
	void input() {
//		String data = JOptionPane.showInputDialog(f, "�̸��� ������?");
		
//		String data = JOptionPane.showInputDialog(f, "�̸��� ������?", "����");
		
		String[] items = {"ȫ�浿", "�ھ���", "�嵶��", "�̱���", "��ġ��"};
		
		String data = (String)JOptionPane.showInputDialog(f, "�̸��� ������?", 
				"����", JOptionPane.ERROR_MESSAGE, null, items, "�̱���");
	
		//	��ȯ���� �ǹ�
		//		�Է��� ������ ��ȯ�Ѵ�.
	}
	void message() {
		JOptionPane.showMessageDialog(f, "���ԿϷ� ����", "����", 
				JOptionPane.INFORMATION_MESSAGE, null);
	}
	void option() {
		String[] title = {"������", "������", "��ȿ��"};
		
		int type = JOptionPane.showOptionDialog(f, "�����ϴ� ������", 
				"������", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, null, title, "������");
	}
	class ButtonEvent01 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	���߰� �������� 4���� ������ ��ȭ���ڸ� �ϳ��� ��������.
//			comfirm();
//			input();
//			message();
			option();
		}
	}
}






