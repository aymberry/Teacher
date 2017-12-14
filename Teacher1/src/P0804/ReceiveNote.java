package P0804;
import		javax.swing.*;
import		java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ReceiveNote extends JFrame {
	JTextArea		area;
	JButton		reB, closeB;
	JLabel			whoLabel;
	
	NoteMain		main;
	public ReceiveNote(NoteMain m) {
		main = m;
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		JLabel		label = new JLabel("보낸사람 성명 : ");
		whoLabel = new JLabel();
		
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		reB = new JButton("답장하기");
		closeB = new JButton("닫    기");
		
		ButtonEvent	evt = new ButtonEvent();
		reB.addActionListener(evt);
		closeB.addActionListener(evt);
		
		JPanel	p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", whoLabel);

		JPanel	p2 = new JPanel();
		p2.add(reB);
		p2.add(closeB);
		
		this.add("North", p1);
		this.add("Center", sp);
		this.add("South", p2);
		
		this.setSize(400, 300);
//		this.setVisible(true);
	}
//	public static void main(String[] args) {
//		new ReceiveNote();
//	}
	void reSend() {
		//	할일
		//		쪽지 보내기 대화상자를 만든다.
		SendNote	dlg = new SendNote(main);
		//		받는사람 정보를 입력해 준다.
		//		이름을 입력하면 되므로
		String	name = whoLabel.getText();
		dlg.whoLabel.setText(name);
		//		화면에 출력한다.
		dlg.setVisible(true);
		
		this.setVisible(false);
		this.dispose();
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton	target = (JButton) e.getSource();
			if(target == reB) {
				//	할일이 좀 있으므로 함수로 돌리자.
				reSend();
			}
			else if(target == closeB) {
				setVisible(false);
				dispose();
			}
		}
	}
	
	
	
	
	
	
	
}



