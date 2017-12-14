package P0803;
/*
 * 	만들어진 두개의 화면을 CardLayout 기법을 이용해서 화면 변경
 *	처리를 연습해 본다.
 *
 *	CardLayout은 두개 이상의 화면을 하나의 프레임에 넣은 후
 *	실제로는 한 화면만 보이게 하는 방법이다.
 *	필요하다면 보이는 화면을 다른 화면으로 변경할 수 있는 기능
 *
 *	문제	이 기법은 오직 AWT에서만 사용할 수 있는 기법
 */
import		java.awt.*;
import		java.awt.event.*;
import		javax.swing.*;

//	네트워크 처리
import		java.net.*;
import		java.io.*;
public class ChatClient02 {
	Frame			f;
	CardLayout	card;
	NickPanel		nickP;
	ChatPanel		chatP;
	
	//	네트워크 처리에 필요한 변수를 준비한다.
	Socket					socket;
	ObjectInputStream	oin;
	ObjectOutputStream	oout;
	
	public ChatClient02() {
		f = new Frame();
		//	문제
		//		이것은 x단추를 누르면 종료되는 함수가 없다.
		//		강제로 이벤트를 이용해서 x 단추를 누르면
		//		프로그램이 종료되도록 해주어야 한다.
//		f.addWindowListener(new CloseEvent());
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		card = new CardLayout();
		f.setLayout(card);
		//	이제 이 프레임에 두개의 화면을 넣고자 한다.
		//	프레임에 넣을 수 있는것은 Panel이므로.....
		//	화면은 Panel로 만들어야 한다.
		
		nickP = new NickPanel(this);
		chatP = new ChatPanel(this);
		
		f.add("닉네임", nickP);
		f.add("채팅", chatP);
		
		f.setSize(400, 600);
		f.setVisible(true);
		//	=================	화면 구성이 끝났으므러...
		//							네트워크 준비를 하자.
		try {
			//	1.	소켓 클래스를 이용해서 서버에 접속을 시도한다.
			socket = new Socket("192.168.137.24", 8899);
			//	2.	스트림 개설을 한다.
			OutputStream		os = socket.getOutputStream();
			oout = new ObjectOutputStream(os);
			
			InputStream		is = socket.getInputStream();
			oin = new ObjectInputStream(is);
			
			//	내가 보내기 전에 다른 사람이 보낼 수 있으므로
			//	받는 스레드를 기동해 놓자.
			ReceiveThread	t = new ReceiveThread(this);
			t.start();
		}
		catch(Exception e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new ChatClient02();
	}
//	class CloseEvent extends WindowAdapter {
//		public void windowClosing(WindowEvent e) {
//			System.exit(0);
//		}
//	}
}




