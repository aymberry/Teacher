package P0803;

import 	CHATDATA.*;
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;

public class NickPanel extends JPanel {
	//	이 클래스는 메인클래스와 상호 참조할 필요가 있다.
	//	최소한 카드 변경을 할때 card는 사용해여 하므러...
	ChatClient02		main;
	
	JTextField		nickF;
	//	방이름은 콤보상자를 이용해서 몇가지를 정해놓고 그 중 하나를
	//	선택해서 사용하도록 한다.
	JComboBox	roomB;
	JButton		nickBtn, roomBtn;
	public NickPanel(ChatClient02 m) {
		main = m;
		this.setLayout(new BorderLayout());
		
		nickF = new JTextField();
		String[] item = {"1조방", "2조방", "3조방", "4조방"};
		roomB = new JComboBox(item);
		roomB.setEnabled(false);
		nickBtn = new JButton("닉네임");
		roomBtn = new JButton("방입장");
		roomBtn.setEnabled(false);
		//	이벤트 등록
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
		//	할일
		//		텍스트 필드의 닉네임을 알아내서
		String	nick = nickF.getText();
		if(nick == null || nick.length() == 0) {
			//	String		nick			null
			//	String		nick=""		크기가 0이다.
			return;
		}
		//		서버에 보낸다.
		//		클래스를 new 시킨다.
		MainData	data = new MainData();
		//		프로토콜 지정하고
		data.protocol = 1101;
		//		보조 데이터가 있으면 그 데이터를 기억할 변수를 new 시킨다.
		data.cData = new ChatData();
		//		필요한 데이터를 기억한다.
		data.cData.nick = nick;
		
		//	준비가 되었으면 서버에 보낸다.
		try {
			main.oout.writeObject(data);
		}
		catch(Exception e) {}
	}
	void roomProc() {
		//	할일
		//		선택한 방을 알아낸다.
		String	room = (String) roomB.getSelectedItem();
		//		서버에게 보낸다.
		//		1.	클래스 만든다.
		MainData	data = new MainData();
		//		2.	프로토콜 넣는다
		data.protocol = 1201;
		//		보조 데이터가 있으묜.... 그데이터를 기억할 클래스를 new 시킨다.
		data.cData = new ChatData();
		//		필요한 데이터를 기억한다.
		data.cData.room = room;
		
		try {
			main.oout.writeObject(data);
		}
		catch(Exception e) {}
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	둘중 어느 단추인지를 구분해야 한다.
			JButton	target = (JButton) e.getSource();
			if(target == nickBtn) {
				//	닉네임을 서버에 보내는작업	
				nickProc();
			}
			else if(target == roomBtn) {
				//	방이름을 서버에 보내는 작업
				roomProc();
			}
		}
	}
}



