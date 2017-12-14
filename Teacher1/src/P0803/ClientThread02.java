package P0803;
/*
 * 	이 클래스는 접속한 클라이언트하고 대화를 나눌 독립 프로그램이다.
 * 	그러므로 이 클래스는 Thread 클래스로 만들어야 한다.
 */
import		java.net.*;
import 	CHATDATA.*;
import		java.io.*;
public class ClientThread02 extends Thread {
	//	필요한 변수
	//	필수 변수
	//	1.	이 클래스는 클라이언트하고 통신을 하기 위한 목적으로 만들고 있다.
	public Socket					socket;		
	//	메인이 배정받은 전화기를 받아서 사용하면 되겠다.
	public	ObjectInputStream	oin;			
	//	socket을 이용해서 new 시켜서 만들어야 겠다.
	public	ObjectOutputStream	oout;
	//	2.	이 클래스는 Main 클래스와 상호 참조를 할 필요가 있다.
	public	ChatServer02			main;		
	//	메인의 this를 받아서 사용하면 된다.
	
	//	보조변수(필요하면 만드는 변수)
	//	어떤 정보를 기억하면 좀더 이 클라이언트와 손쉽게 대화할 수 있을까?
	public		String		nick;		//	클라이언트가 알려주면 받아서 사용한다.
	public		String		room;		//	클라이언트가 방에 입장하면 받아서 사용한다.
	public ClientThread02(Socket s, ChatServer02 m) {
		socket = s;
		main = m;
		try {
			//	★★★
			//	참고
			//		원칙적으로 스트림을 만드는 순서는 관계가 없다.
			//		하지만
			//			직렬화 처리에서는 순서가 매우 민감하다.
			//	★★	반드시 out을 먼저 만들고 in을 만들어야 한다.

			OutputStream	os = socket.getOutputStream();
			oout = new ObjectOutputStream(os);
			
			InputStream is = socket.getInputStream();
			oin = new ObjectInputStream(is);
		}
		catch(Exception e) {}
		//	nick, room은 클라이어트가 알려주어야 기억할 수 있다.
	}
	private	void nickProc(MainData data) {
		//	닉네임 전송에 맞는 작업을 해주면 될 것이다.
		//	예>		데이터베이스에 입력을 한다던지.........
		
		//	우리는 받은 닉네임을 준비된 정보 변수에 기억을 한다.
		//	보낸 닉네임은 ChatData 클래스에 기억되어 있으므로...
//		ChatData	cData = data.cData;
//		String	nick = cData.nick;

		String	nick = data.cData.nick;
		this.nick = nick;

		//	잘 받았다고 응답을 한다.
		//	응답하는 순서
		//	1	먼저 데이터를 입력할 클래스를 준비한다.
		MainData	rData = new MainData();
		//	2.	프로코톨을 기억한다.
		rData.protocol = 2101;
		//	3.	전송한다.
		try {
			oout.writeObject(rData);
		}
		catch(Exception e) {}
	}
	
	private	void enterRoom(MainData data) {
		//	원래는 방의 정원등을 검사해서 입장 여부를 파악해야 하지만....
		//	우리는 무조건 허락하는 것으로 하고...
		//	대신 준비된 변수에 방 이름을 저장해 놓는다.
		this.room = data.cData.room;
		
		//	역시 마찬가지고 무조건 허락하는것으로 간주하고
		//	응답한다.
		MainData	rData = new MainData();
		rData.protocol = 2201;
		try {
			oout.writeObject(rData);
		}
		catch(Exception e) {}
	}
	
	private	void exitRoom(MainData data) {
		//	우리는 정보를 삭제하고 방퇴장을 응답한다.
		this.room = "";
		
		MainData	rData = new MainData();
		rData.protocol = 2202;
		try {
			oout.writeObject(rData);
		}
		catch(Exception e) {}
	}
	
	private	void chatMsg(MainData data) {
		//	1.	먼저 응답 데이터를 가공한다.
		//		나는		[김명환님] 안녕		의 모습으로 가공할 예정이다.
		String	msg = "[" + this.nick + " 님 ]" + data.cData.msg;
			
		//	2.	응답 클래스를 만든다.
		MainData	rData = new MainData();
		rData.protocol = 2301;
		//		이번에는 부가 정보가 들어가야 한다.
		//		즉, 대화내용도 같이 보내주어야 한다.
		rData.cData = new ChatData();
		rData.cData.msg = msg;
		
		//	3.	같은 방 소속 모든 사람에게 응답을 한다.
		int		size = main.clientList.size();
		
		//	이 작업이 종료되기 전에는 누구도 이 변수를 사용하지 
		//	못하도록 동기화를 처리한다.
		synchronized(main.clientList) {
			for(int i = 0; i < size; i++) {
				//	접속한 정보를 하나씩 꺼낸다.
				ClientThread02	temp = (ClientThread02) main.clientList.get(i);
				//	지금 꺼낸 정보중 방 이름이 내 방하고 같으면...
				//	같은방 소속이므로 그 사람에게만 전송한다.
				if(this.room.equals(temp.room)) {
					try {
						temp.oout.writeObject(rData);
					}
					catch(Exception e) {}
				}
			}
		}
	}
	public void run() {
		try {
			while(true) {
				//	먼저 클라이언트준 내용을 받는다.
				//	오늘은 클라이언트가 클래스를 통채로 주기로 했으므로
				//	클래스를 통채로 받는다.
				MainData	data = (MainData) oin.readObject();
				if(data == null) {
					//	더이상 받을 수가 없으므로 스레드를 종료한다.
					//	run()이 끝나면 스레드는 자동 종료된다.
					break;
				}
				//	제대로 받았으면...	데이터의 의미를 파악한다.
				int	protocol = data.protocol;
				switch(protocol) {
				case	1101:	//	닉네임
					//	이제 의미에 맞는 행동을 해주면 될것이다.
					nickProc(data);
					break;
				case	1201:	//	방입장
					enterRoom(data);
					break;
				case	1202:	//	방퇴장
					exitRoom(data);
					break;
				case	1301:	//	일반대화
					chatMsg(data);
					break;
				}
			}	//	while
		}
		catch(Exception e) {
		}
		finally {
			main.clientList.remove(this);
			try {
				oin.close();
				oout.close();
				socket.close();
			}
			catch(Exception e) {}
		}
	}
}






