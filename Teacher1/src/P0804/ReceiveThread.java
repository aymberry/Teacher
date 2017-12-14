package P0804;

import java.net.DatagramPacket;
import java.net.InetAddress;

/*
 * 	쪽지는 언제 도착할 지 모르므로 쪽지를 받는 프로그램을 독립적으로
 * 	실행되어야 할 것이다.
 */
public class ReceiveThread extends Thread{
	NoteMain		main;
	public ReceiveThread(NoteMain m) {
		main = m;
	}
	//	★★★		UDP 통신 수신 작업
	public void run() {
		try {
			while(true) {
				//	수신할 패킷을 만든다.
				byte[]	buff = new byte[1024];
				DatagramPacket pack = new DatagramPacket(buff, buff.length);
				//	데이터를 수신한다.
				//		스트림으로 수신할 수 없으므로 반드시 함수를 이용해서
				//		수신하도록 한다.
				main.receiveS.receive(pack);
				//	정보를 분석한다.
				//	누가 보냈는지 ip 주소를 알아내자.
				InetAddress addr = pack.getAddress();
				String	ip = addr.getHostAddress();
				
				//	내용을 알아내자.
				byte[] rbuff = pack.getData();
				int		len = pack.getLength();
				String	msg = new String(rbuff, 0, len);
	
				//	우리는 보내준 쪽지를 대화상자에 출력해야 하므로....
				ReceiveNote	dlg = new ReceiveNote(main);
				//	보낸사람 이름도 써주자
				String	who = (String) main.itnset.get(ip);
				dlg.whoLabel.setText(who);
				//	내용을 대화상자에 기록해 주어야 함으로.....
				dlg.area.setText(msg);
				dlg.setVisible(true);
			}
		}
		catch(Exception e) {
		}
		finally {
			System.exit(0);
		}
	}
}
