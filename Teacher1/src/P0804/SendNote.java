package P0804;
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
public class SendNote extends JFrame {
	JTextArea		area;
	JButton		reB, sendB, closeB;
	JLabel			whoLabel ;
	NoteMain		main;
	public SendNote(NoteMain m) { 
		main = m;
		//	아까는 테스트를 위해서 x 단추 누르면 프로그램이 종료되도록
		//	해 놓았다.
		//	지금은 x 단추를 누르면 이 대화상자만 없어지면 되므로...
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		//	참고	JFrame에서 x 단추 누르면 하는 행동 지정하기
		//		DO_NOTHING_ON_CLOSE 	행동하지 말것
		//		HIDE_ON_CLOSE				화면만 지울것
		//		DISPOSE_ON_CLOSE			화면을 지우고 메모리에서도 지울것
		//		EXIT_ON_CLOSE				프로그램을 종료할 것
		
		JLabel		label = new JLabel("받는사람 성명 : ");
		whoLabel = new JLabel();
		
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		reB = new JButton("다시쓰기");
		sendB = new JButton("보 내 기");
		closeB = new JButton("닫    기");
		
		ButtonEvent		evt = new ButtonEvent();
		reB.addActionListener(evt);
		sendB.addActionListener(evt);
		closeB.addActionListener(evt);
		
		JPanel	p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", whoLabel);

		JPanel	p2 = new JPanel();
		p2.add(reB);
		p2.add(sendB);
		p2.add(closeB);
		
		this.add("North", p1);
		this.add("Center", sp);
		this.add("South", p2);
		
		this.setSize(400, 300);
//		this.setVisible(true);
	}
//	public static void main(String[] args) {
//		new SendNote();
//	}
	//	쪽지 보내기 전담함수
	void sendProc() {
		//	★★★
		//	할일
		//		1.	상대방 주소, 보낼 내용을 알아낸다.
		String	msg = area.getText();
		String	name = whoLabel.getText();
		String	ip = (String)main.ntiset.get(name);
		
		//		2.	이것을 패킷으로 포장한다.
		//			1)	 데이터는 byte[]로 만든다.
		byte[]	buff = msg.getBytes();
		//			2)	주소는 InetAddress로 만든다. 
		InetAddress addr = null;
		try {
			addr = InetAddress.getByName(ip);
		}
		catch(Exception e) {}
		
		DatagramPacket pack = 
				new DatagramPacket(buff, buff.length, addr, 8888);
		//		3.	상대방에게 전송한다.
		try {
			main.sendS.send(pack);
		}
		catch(Exception e) {}
		
		//	이제 이 대화상자는 할 일을 다했으므로 닫아주자
		setVisible(false);
		dispose();
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	할일
			//		단추가 3개 있으므로.. 구분하자.
			JButton	target = (JButton) e.getSource();
			if(target == reB) {
				//	다시쓰기 이므로... 화면을 지우면 된다.
				area.setText("");
			}
			else if(target == sendB) {
				//	쪽지를 보내는 기능
				sendProc();
			}
			else if(target == closeB) {
				//	쪽지를 보내지 않고 화면을 닫는다는 의미이므로..
				setVisible(false);
				//	메모리에서도 삭제해 주세요....
				dispose();
			}
		}
	}
}



