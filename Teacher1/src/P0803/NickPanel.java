package P0803;

import 	CHATDATA.*;
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;

public class NickPanel extends JPanel {
	//	�� Ŭ������ ����Ŭ������ ��ȣ ������ �ʿ䰡 �ִ�.
	//	�ּ��� ī�� ������ �Ҷ� card�� ����ؿ� �ϹǷ�...
	ChatClient02		main;
	
	JTextField		nickF;
	//	���̸��� �޺����ڸ� �̿��ؼ� ����� ���س��� �� �� �ϳ���
	//	�����ؼ� ����ϵ��� �Ѵ�.
	JComboBox	roomB;
	JButton		nickBtn, roomBtn;
	public NickPanel(ChatClient02 m) {
		main = m;
		this.setLayout(new BorderLayout());
		
		nickF = new JTextField();
		String[] item = {"1����", "2����", "3����", "4����"};
		roomB = new JComboBox(item);
		roomB.setEnabled(false);
		nickBtn = new JButton("�г���");
		roomBtn = new JButton("������");
		roomBtn.setEnabled(false);
		//	�̺�Ʈ ���
		ButtonEvent	evt = new ButtonEvent();
		nickBtn.addActionListener(evt);
		roomBtn.addActionListener(evt);
		
		JPanel		p1 = new JPanel(new GridLayout(2, 1));
		p1.add(nickF);
		p1.add(roomB);

		JPanel		p2 = new JPanel(new GridLayout(2, 1));
		p2.add(nickBtn);
		p2.add(roomBtn);
		
		JPanel		p3 = new JPanel(new BorderLayout());
		p3.add("Center", p1);
		p3.add("East", p2);
		
		this.add("South", p3);
//		this.setSize(400, 600);
//		this.setVisible(true);
	}

//	public static void main(String[] args) {
//		new NickPanel();
//
//	}
	void nickProc() {
		//	����
		//		�ؽ�Ʈ �ʵ��� �г����� �˾Ƴ���
		String	nick = nickF.getText();
		if(nick == null || nick.length() == 0) {
			//	String		nick			null
			//	String		nick=""		ũ�Ⱑ 0�̴�.
			return;
		}
		//		������ ������.
		//		Ŭ������ new ��Ų��.
		MainData	data = new MainData();
		//		�������� �����ϰ�
		data.protocol = 1101;
		//		���� �����Ͱ� ������ �� �����͸� ����� ������ new ��Ų��.
		data.cData = new ChatData();
		//		�ʿ��� �����͸� ����Ѵ�.
		data.cData.nick = nick;
		
		//	�غ� �Ǿ����� ������ ������.
		try {
			main.oout.writeObject(data);
		}
		catch(Exception e) {}
	}
	void roomProc() {
		//	����
		//		������ ���� �˾Ƴ���.
		String	room = (String) roomB.getSelectedItem();
		//		�������� ������.
		//		1.	Ŭ���� �����.
		MainData	data = new MainData();
		//		2.	�������� �ִ´�
		data.protocol = 1201;
		//		���� �����Ͱ� ������.... �׵����͸� ����� Ŭ������ new ��Ų��.
		data.cData = new ChatData();
		//		�ʿ��� �����͸� ����Ѵ�.
		data.cData.room = room;
		
		try {
			main.oout.writeObject(data);
		}
		catch(Exception e) {}
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	���� ��� ���������� �����ؾ� �Ѵ�.
			JButton	target = (JButton) e.getSource();
			if(target == nickBtn) {
				//	�г����� ������ �������۾�	
				nickProc();
			}
			else if(target == roomBtn) {
				//	���̸��� ������ ������ �۾�
				roomProc();
			}
		}
	}
}



