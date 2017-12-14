package P0801;
/*
 * 	���ʿ� �ؽ�Ʈ�ʵ�, �Ʒ��ʿ� ��й�ȣ�Է»��ڸ� �����
 * 
 * 	��й�ȣ �Է»��ڿ��� ����Ű�� ġ�� �Է��� ��й�ȣ��
 * 								ActionListener
 * 	���ʿ� �������� ����.
 */
import		javax.swing.*;
import		java.awt.event.*;
public class Password01 {
	JTextField			field;
	JPasswordField	pass;
	public Password01() {
		JFrame		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		field = new JTextField();
		pass = new JPasswordField();
		pass.addActionListener(new PassEvent01());
		pass.setEchoChar('��');
	
		f.add("North", field);
		f.add("South", pass);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Password01();
	}

	class PassEvent01 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	����
			//		��й�ȣ �˾Ƴ���
			char[]		temp = pass.getPassword();
			String	pw = new String(temp, 0, temp.length);
			//		���ʿ� ����϶�.
			field.setText(pw);
		}
	}
}
