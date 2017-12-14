package	P0803;
import		javax.swing.*;

import CHATDATA.ChatData;
import CHATDATA.MainData;

import		java.awt.event.*;
import		java.awt.*;
public class ChatPanel extends JPanel {
	ChatClient02	main;
	JButton		exitB, sendB;
	JTextArea		area;
	JScrollPane	sp;
	JTextField 	field;
	public ChatPanel(ChatClient02 m) {
		main = m;
		//	���ڽ��� �̹� Frame�̴�.
		this.setLayout(new BorderLayout());
		
		exitB = new JButton("������");
		sendB = new JButton("������");
		
		area = new JTextArea();
		//	�ؽ�Ʈ ����� ��ũ�ѹٸ� ������.
		sp = new JScrollPane(area);
		
		field = new JTextField();
		
		SendEvent		evt = new SendEvent();
		sendB.addActionListener(evt);
		exitB.addActionListener(evt);
		field.addActionListener(evt);
		
		//	�Ʒ��ʿ� �� �ΰ��� ������ �����Ѵ�.
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("Center", field);
		p1.add("East", sendB);
		
		//	���ʿ� �� ���ߴ� �׳� ������ ���� ũ�Ⱑ Ŀ���Ƿ�
		//	�۰� �����ؼ� �ְ� �ʹ�.
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(exitB);
		
		this.add("North", p2);
		this.add("Center",  sp);
		this.add("South", p1);
		
//		this.setSize(400, 600);
//		this.setVisible(true);
	}

//	public static void main(String[] args) {
//		new ChatPanel();
//	}
	void sendMsg() {
		//	����
		//		���� ä�� ������ �˾Ƴ���.
		String	msg = field.getText();
		if(msg == null || msg.length() == 0) {
			return;
		}
		//		�������� ������.
		MainData	data = new MainData();
		data.protocol = 1301;
		data.cData = new ChatData();
		data.cData.msg = msg;
		
		try {
			main.oout.writeObject(data);
		}
		catch(Exception e) {}
		//	������ ���ؼ� �ؽ�Ʈ �ʵ带 ��������
		field.setText("");
	}
	void exitRoom() {
		//	���������� �� ���� ����
		//	�������� ���� �����ڰ��� �����Ѵ�.
		MainData		data = new MainData();
		data.protocol = 1202;
		try {
			main.oout.writeObject(data);
		}
		catch(Exception e) {	}
	}
	class SendEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	�̹����� ����2���� �ؽ�Ʈ �ʵ忡 �̺�Ʈ�� �ɾ�� �Ѵ�.
			//	���Ե� ActionListener�� �ذ��� �� �ִ�.
			
			//	�̺�Ʈ�� �Ͼ ��Ҹ� �˾ƾ��Ѵ�.
			//	��� �߻��ߴ� �𸣹Ƿ� ������ �޴´�.
			Object		target = e.getSource();
			if(target instanceof JTextField) {
				//	�Ѱ��ۿ� �����Ƿ� �׳� �̿��ϸ�ǰ�
				//	��ȭ������ ������ �۾�
				sendMsg();
			}
			else if(target instanceof JButton) {
				//	���ߴ� 2���� �����Ƿ�....
				JButton	temp = (JButton) target;
				if(temp == sendB) {
					//	��ȭ������ ������ �۾�
					sendMsg();
				}
				else if(temp == exitB) {
					//	������ �۾�
					exitRoom();
				}
			}
		}
	}
	
	
	
}






