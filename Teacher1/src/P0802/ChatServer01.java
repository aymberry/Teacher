package P0802;
import		java.net.*;
import		java.io.*;
import		java.util.*;
public class ChatServer01 {
	//	서버 입장에서는 접속한 클라이언트를 관리해야 할 것 같다.
	//	몇사람이 접속할지 모르므로.... 컬렉션을 이용해서 관리를 하자.
	ArrayList		clientList;
	public ChatServer01() {
		//	아까 본것과 같이 서버는 접속을 받을 전화기가 필요하다.
		ServerSocket		server = null;
		try {
			server = new ServerSocket(9988);
			clientList = new ArrayList();
		}
		catch(Exception e) {}
		//	여러사람의 접속을 계속 받기 위해서는 반복해서 accept()를
		//	사용해야 한다.
		while(true) {
			try {
				//	누군가가 접속을 하면 그 사람과 실제로 통신할 전화기를
				//	배분해 준다.
				Socket socket = server.accept();
				//	이제 이사람과 대화를 해야 한다.
				//	우리가 만들 프로그램은 채팅 프로그램이므로
				//	몇번 대화를 할지 모른다.
				//	근데... 이 사람과 대화를 하다보면 다른 사람이
				//	대화를 못하므로 각 사람과 대화를 하는 작업은
				//	스레드 처리를 해야겠다.
				//	그래야 각각의 담당자가 독립적으로 자기 클라이언트와
				//	대화를 나눌 수 있다.
				
				//	이 클라이언트하고 실제 통신할 스레드를 만들어준다.
				ClientThread thread = new ClientThread(this, socket);
				//	접속한 클라이언트를 관리할 필요가 있다.
				clientList.add(thread);
				//	클래스를 통채로 컬렉션에 넣어놓았으므로
				//	이 클래스 안에 있는 모든 정보를 이용할 수 있을 것이다.
				thread.start();
			}
			catch(Exception e) {
				System.out.println("접속 에러 = " + e);
			}
		}
	}
	public static void main(String[] args) {
		new ChatServer01();
	}
}

//	이 클래스는 하나의 클라이언트와 독립적으로 대화를 나눌 프로그램이다.
//	그러므러 이 프로그램은 클라이언트와 대화를 나누기 위한 자원
//	준비가 되어 있어야 한다.
class ClientThread extends Thread {
	//	이 프로그램은 앞쪽에 main과 상호 참조를 할 필요가 있을 것다.
	ChatServer01		main;
	//	클라이언트와 대화를 나누기 위한 필수 조건
	Socket				socket;	
	PrintWriter		pw;
	BufferedReader	br;
	//	혹시 필요하면 클라이언트의 정보도 가지고 있는것이 좋겠다.
	//	나는 내가 담당하는 클라이언트의 IP 주소를 기억하고자 한다.
	String				ip;

	//	상호 참조를 하기 했으므로 상대방 주소를 받을 준비를 해야 한다.
	public ClientThread(ChatServer01 temp, Socket s) {
		main = temp;
		//	Socket 은 이미 앞에서 접속할 때 배분받았다.
		//	그러므로 이것도 받아서 사용하자.
		socket = s;
		//	스트림은 소켓을 알면 만들 수 있다.
		try {
			InputStream	is = socket.getInputStream();
			InputStreamReader temp1 = new InputStreamReader(is);
			br = new BufferedReader(temp1);
			
			OutputStream os = socket.getOutputStream();
			pw = new PrintWriter(os);
			
			InetAddress inet = socket.getInetAddress();
			ip = inet.getHostAddress();
		}
		catch(Exception e) {}
	}
	//	여러사람에게 응답할 전담 함수
	void sendMsg(String data) {
		//	 데이터 가공을 좀 하자.
		//		"안녕"		이라고 대화를 주면
		//		응답		"[192.???.???.???님 말씀] 안녕"으로 응답하고 싶다.
		String msg = "[" + ip + "님 말씀] " + data;
		//	접속한 모든 사람에게 이 내용을 응답하자.
		
		//	접속한 클라이언트의 숫자를 알아내자.
		int		size = main.clientList.size();
		//	여러사람에게 동시에 응답하는 것은 되지 않는다.
		//	반드시 한사람씩 따로따로 응답을 해야 한다.
		synchronized(main.clientList) {
			for(int i = 0; i < size; i++) {
				//	접속한 클라이언트를 하나씩 꺼내자.
				ClientThread	t = (ClientThread) main.clientList.get(i);
				t.pw.println(msg);
				t.pw.flush();
			}
		}
	}
	public void run() {
		try {
			while(true) {
				//	할일
				//		클라이언트가 준 데이터 받자
				String	msg = br.readLine();
				if(msg == null) {
					break;
				}
				//		응답하자.
				//		Ping은 데이터를 준 상대방에만 응답하면 된다.
				//		이런 프로그램을 1:1 프로그램이라고 한다.
				//		Chat는 데이터를 준 상대방 말고 다른 사람에게도
				//		응답해야 한다.
				//		이런 프로그램을 1:다 프로그램이라고 한다.
				
				//		1:다 프로그램은 서버는 여러사람에 응답해야 하므로
				//		필수적으로 접속 클라이언트 관리를 해야 한다.
				sendMsg(msg);
			}
		}
		catch(Exception e) {}
		//	이제 더이상 대화를 나눌 필요가 없으므로 자원을 다 닫아주자.
		finally {
			//	클라이언트 관리 컬렉션에서 자신 클래스를 삭제한다.
			main.clientList.remove(this);
			try {
				pw.close();
				br.close();
				socket.close();
			}
			catch(Exception e) {}
		}
	}
}










