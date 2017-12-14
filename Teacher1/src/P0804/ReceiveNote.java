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
		
		JLabel		label = new JLabel("������� ���� : ");
		whoLabel = new JLabel();
		
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		reB = new JButton("�����ϱ�");
		closeB = new JButton("��    ��");
		
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
		//	����
		//		���� ������ ��ȭ���ڸ� �����.
		SendNote	dlg = new SendNote(main);
		//		�޴»�� ������ �Է��� �ش�.
		//		�̸��� �Է��ϸ� �ǹǷ�
		String	name = whoLabel.getText();
		dlg.whoLabel.setText(name);
		//		ȭ�鿡 ����Ѵ�.
		dlg.setVisible(true);
		
		this.setVisible(false);
		this.dispose();
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton	target = (JButton) e.getSource();
			if(target == reB) {
				//	������ �� �����Ƿ� �Լ��� ������.
				reSend();
			}
			else if(target == closeB) {
				setVisible(false);
				dispose();
			}
		}
	}
	
	
	
	
	
	
	
}



