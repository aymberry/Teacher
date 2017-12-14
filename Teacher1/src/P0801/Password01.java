package P0801;
/*
 * 	위쪽에 텍스트필드, 아래쪽에 비밀번호입력상자를 만들고
 * 
 * 	비밀번호 입력상자에서 엔터키를 치면 입력한 비밀번호가
 * 								ActionListener
 * 	위쪽에 나오도록 하자.
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
		pass.setEchoChar('●');
	
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
			//	할일
			//		비밀번호 알아내서
			char[]		temp = pass.getPassword();
			String	pw = new String(temp, 0, temp.length);
			//		위쪽에 출력하라.
			field.setText(pw);
		}
	}
}
