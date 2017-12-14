package P0803;
import		java.net.*;
import		java.io.*;
import		java.util.*;
public class ChatServer02 {
	//	이 서버는 1:다 통신을 할 필요가 있다.
	//	그러면 서버 입장에서 접속한 클라이언트의 정보를 가지고 있어야 한다.
	public ArrayList		clientList;
	public ChatServer02() {
		//	서버가 해야 하는 가장 첫번째 일은
		//	접속을 받기만 하는 전화기(ServerSocket)를 준비해야 한다.
		ServerSocket		server = null;
		try {
			server = new ServerSocket(8899);
			//	클라이언트 관리를 준비하자.
			clientList = new ArrayList();
		}
		catch(Exception e) {
			System.exit(0);
		}
		//	두번째 할일을 접속을 받는 일이다.
		//	접속은 계속해서 여러 사람의 접속을 받아야 하므로
		//	반복 처리를 해주어야 한다.
		while(true) {
			try {
				//	접속을 받으면 이 클라이언트와 
				//	실제로 통신을 할 수 있는 전화기를 배정해 주어야 한다.
				//	이 작업은 accept()가 자동으로 처리해 줌으로..... 
				Socket socket = server.accept();
				
				//	마지막으로 할 일은
				//	접속한 클라이언트하고 데이터는 주고 받는 일이다.
				//	접속한 클라이언트하고 대화를 나누게 되면.....
				//	다른 클라이어트가 접속을 할 수 없게 된다.
				//	그래서 접속한 클라이언트하고 대화를 나누는 프로그램을
				//	독립적으로 만들어서 접속과정과 대화를 나누는 과정이
				//	병행 처리되도록 해주어야 한다.
				
				//	이제 마지막 작업
				//		누군가가 접속을 했으므로......
				//		접속한 클라이언트와 대화를 나눌 스레드를 기동한다.
				ClientThread02	t = new ClientThread02(socket, this);
				//	이제 한사람이 접속을 했으므로...
				//	접속한 클라이언트를 접속 관리를 해주어야 할 것이다.
				clientList.add(t);
				t.start();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new ChatServer02();
	}
}













