package P0803;
/*
 * 	�� Ŭ������ ������ Ŭ���̾�Ʈ�ϰ� ��ȭ�� ���� ���� ���α׷��̴�.
 * 	�׷��Ƿ� �� Ŭ������ Thread Ŭ������ ������ �Ѵ�.
 */
import		java.net.*;
import 	CHATDATA.*;
import		java.io.*;
public class ClientThread02 extends Thread {
	//	�ʿ��� ����
	//	�ʼ� ����
	//	1.	�� Ŭ������ Ŭ���̾�Ʈ�ϰ� ����� �ϱ� ���� �������� ����� �ִ�.
	public Socket					socket;		
	//	������ �������� ��ȭ�⸦ �޾Ƽ� ����ϸ� �ǰڴ�.
	public	ObjectInputStream	oin;			
	//	socket�� �̿��ؼ� new ���Ѽ� ������ �ڴ�.
	public	ObjectOutputStream	oout;
	//	2.	�� Ŭ������ Main Ŭ������ ��ȣ ������ �� �ʿ䰡 �ִ�.
	public	ChatServer02			main;		
	//	������ this�� �޾Ƽ� ����ϸ� �ȴ�.
	
	//	��������(�ʿ��ϸ� ����� ����)
	//	� ������ ����ϸ� ���� �� Ŭ���̾�Ʈ�� �ս��� ��ȭ�� �� ������?
	public		String		nick;		//	Ŭ���̾�Ʈ�� �˷��ָ� �޾Ƽ� ����Ѵ�.
	public		String		room;		//	Ŭ���̾�Ʈ�� �濡 �����ϸ� �޾Ƽ� ����Ѵ�.
	public ClientThread02(Socket s, ChatServer02 m) {
		socket = s;
		main = m;
		try {
			//	�ڡڡ�
			//	����
			//		��Ģ������ ��Ʈ���� ����� ������ ���谡 ����.
			//		������
			//			����ȭ ó�������� ������ �ſ� �ΰ��ϴ�.
			//	�ڡ�	�ݵ�� out�� ���� ����� in�� ������ �Ѵ�.

			OutputStream	os = socket.getOutputStream();
			oout = new ObjectOutputStream(os);
			
			InputStream is = socket.getInputStream();
			oin = new ObjectInputStream(is);
		}
		catch(Exception e) {}
		//	nick, room�� Ŭ���̾�Ʈ�� �˷��־�� ����� �� �ִ�.
	}
	private	void nickProc(MainData data) {
		//	�г��� ���ۿ� �´� �۾��� ���ָ� �� ���̴�.
		//	��>		�����ͺ��̽��� �Է��� �Ѵٴ���.........
		
		//	�츮�� ���� �г����� �غ�� ���� ������ ����� �Ѵ�.
		//	���� �г����� ChatData Ŭ������ ���Ǿ� �����Ƿ�...
//		ChatData	cData = data.cData;
//		String	nick = cData.nick;

		String	nick = data.cData.nick;
		this.nick = nick;

		//	�� �޾Ҵٰ� ������ �Ѵ�.
		//	�����ϴ� ����
		//	1	���� �����͸� �Է��� Ŭ������ �غ��Ѵ�.
		MainData	rData = new MainData();
		//	2.	���������� ����Ѵ�.
		rData.protocol = 2101;
		//	3.	�����Ѵ�.
		try {
			oout.writeObject(rData);
		}
		catch(Exception e) {}
	}
	
	private	void enterRoom(MainData data) {
		//	������ ���� �������� �˻��ؼ� ���� ���θ� �ľ��ؾ� ������....
		//	�츮�� ������ ����ϴ� ������ �ϰ�...
		//	��� �غ�� ������ �� �̸��� ������ ���´�.
		this.room = data.cData.room;
		
		//	���� ���������� ������ ����ϴ°����� �����ϰ�
		//	�����Ѵ�.
		MainData	rData = new MainData();
		rData.protocol = 2201;
		try {
			oout.writeObject(rData);
		}
		catch(Exception e) {}
	}
	
	private	void exitRoom(MainData data) {
		//	�츮�� ������ �����ϰ� �������� �����Ѵ�.
		this.room = "";
		
		MainData	rData = new MainData();
		rData.protocol = 2202;
		try {
			oout.writeObject(rData);
		}
		catch(Exception e) {}
	}
	
	private	void chatMsg(MainData data) {
		//	1.	���� ���� �����͸� �����Ѵ�.
		//		����		[���ȯ��] �ȳ�		�� ������� ������ �����̴�.
		String	msg = "[" + this.nick + " �� ]" + data.cData.msg;
			
		//	2.	���� Ŭ������ �����.
		MainData	rData = new MainData();
		rData.protocol = 2301;
		//		�̹����� �ΰ� ������ ���� �Ѵ�.
		//		��, ��ȭ���뵵 ���� �����־�� �Ѵ�.
		rData.cData = new ChatData();
		rData.cData.msg = msg;
		
		//	3.	���� �� �Ҽ� ��� ������� ������ �Ѵ�.
		int		size = main.clientList.size();
		
		//	�� �۾��� ����Ǳ� ������ ������ �� ������ ������� 
		//	���ϵ��� ����ȭ�� ó���Ѵ�.
		synchronized(main.clientList) {
			for(int i = 0; i < size; i++) {
				//	������ ������ �ϳ��� ������.
				ClientThread02	temp = (ClientThread02) main.clientList.get(i);
				//	���� ���� ������ �� �̸��� �� ���ϰ� ������...
				//	������ �Ҽ��̹Ƿ� �� ������Ը� �����Ѵ�.
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
				//	���� Ŭ���̾�Ʈ�� ������ �޴´�.
				//	������ Ŭ���̾�Ʈ�� Ŭ������ ��ä�� �ֱ�� �����Ƿ�
				//	Ŭ������ ��ä�� �޴´�.
				MainData	data = (MainData) oin.readObject();
				if(data == null) {
					//	���̻� ���� ���� �����Ƿ� �����带 �����Ѵ�.
					//	run()�� ������ ������� �ڵ� ����ȴ�.
					break;
				}
				//	����� �޾�����...	�������� �ǹ̸� �ľ��Ѵ�.
				int	protocol = data.protocol;
				switch(protocol) {
				case	1101:	//	�г���
					//	���� �ǹ̿� �´� �ൿ�� ���ָ� �ɰ��̴�.
					nickProc(data);
					break;
				case	1201:	//	������
					enterRoom(data);
					break;
				case	1202:	//	������
					exitRoom(data);
					break;
				case	1301:	//	�Ϲݴ�ȭ
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






