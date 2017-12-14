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
		//	나자신이 이미 Frame이다.
		this.setLayout(new BorderLayout());
		
		exitB = new JButton("나가기");
		sendB = new JButton("보내기");
		
		area = new JTextArea();
		//	텍스트 에리어에 스크롤바를 입힌다.
		sp = new JScrollPane(area);
		
		field = new JTextField();
		
		SendEvent		evt = new SendEvent();
		sendB.addActionListener(evt);
		exitB.addActionListener(evt);
		field.addActionListener(evt);
		
		//	아래쪽에 들어갈 두개의 도구를 포장한다.
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("Center", field);
		p1.add("East", sendB);
		
		//	위쪽에 들어갈 단추는 그냥 넣으면 가로 크기가 커지므로
		//	작게 포장해서 넣고 싶다.
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
		//	할일
		//		보낼 채팅 내용을 알아낸다.
		String	msg = field.getText();
		if(msg == null || msg.length() == 0) {
			return;
		}
		//		서버에게 보낸다.
		MainData	data = new MainData();
		data.protocol = 1301;
		data.cData = new ChatData();
		data.cData.msg = msg;
		
		try {
			main.oout.writeObject(data);
		}
		catch(Exception e) {}
		//	다음을 위해서 텍스트 필드를 지워놓자
		field.setText("");
	}
	void exitRoom() {
		//	전제적으로 할 일을 없고
		//	서버에게 방을 나가겠가고 전송한다.
		MainData		data = new MainData();
		data.protocol = 1202;
		try {
			main.oout.writeObject(data);
		}
		catch(Exception e) {	}
	}
	class SendEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	이번에는 단추2개와 텍스트 필드에 이벤트를 걸어야 한다.
			//	고맙게도 ActionListener로 해결할 수 있다.
			
			//	이벤트가 일어난 장소를 알아야한다.
			//	어디서 발생했는 모르므로 상위로 받는다.
			Object		target = e.getSource();
			if(target instanceof JTextField) {
				//	한개밖에 없으므로 그냥 이용하면되고
				//	대화내용을 보내는 작업
				sendMsg();
			}
			else if(target instanceof JButton) {
				//	단추는 2개가 있으므로....
				JButton	temp = (JButton) target;
				if(temp == sendB) {
					//	대화내용을 보내는 작업
					sendMsg();
				}
				else if(temp == exitB) {
					//	방퇴장 작업
					exitRoom();
				}
			}
		}
	}
	
	
	
}






