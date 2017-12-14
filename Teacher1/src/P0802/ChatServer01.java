package P0802;
import		java.net.*;
import		java.io.*;
import		java.util.*;
public class ChatServer01 {
	//	���� ���忡���� ������ Ŭ���̾�Ʈ�� �����ؾ� �� �� ����.
	//	������ �������� �𸣹Ƿ�.... �÷����� �̿��ؼ� ������ ����.
	ArrayList		clientList;
	public ChatServer01() {
		//	�Ʊ� ���Ͱ� ���� ������ ������ ���� ��ȭ�Ⱑ �ʿ��ϴ�.
		ServerSocket		server = null;
		try {
			server = new ServerSocket(9988);
			clientList = new ArrayList();
		}
		catch(Exception e) {}
		//	��������� ������ ��� �ޱ� ���ؼ��� �ݺ��ؼ� accept()��
		//	����ؾ� �Ѵ�.
		while(true) {
			try {
				//	�������� ������ �ϸ� �� ����� ������ ����� ��ȭ�⸦
				//	����� �ش�.
				Socket socket = server.accept();
				//	���� �̻���� ��ȭ�� �ؾ� �Ѵ�.
				//	�츮�� ���� ���α׷��� ä�� ���α׷��̹Ƿ�
				//	��� ��ȭ�� ���� �𸥴�.
				//	�ٵ�... �� ����� ��ȭ�� �ϴٺ��� �ٸ� �����
				//	��ȭ�� ���ϹǷ� �� ����� ��ȭ�� �ϴ� �۾���
				//	������ ó���� �ؾ߰ڴ�.
				//	�׷��� ������ ����ڰ� ���������� �ڱ� Ŭ���̾�Ʈ��
				//	��ȭ�� ���� �� �ִ�.
				
				//	�� Ŭ���̾�Ʈ�ϰ� ���� ����� �����带 ������ش�.
				ClientThread thread = new ClientThread(this, socket);
				//	������ Ŭ���̾�Ʈ�� ������ �ʿ䰡 �ִ�.
				clientList.add(thread);
				//	Ŭ������ ��ä�� �÷��ǿ� �־�������Ƿ�
				//	�� Ŭ���� �ȿ� �ִ� ��� ������ �̿��� �� ���� ���̴�.
				thread.start();
			}
			catch(Exception e) {
				System.out.println("���� ���� = " + e);
			}
		}
	}
	public static void main(String[] args) {
		new ChatServer01();
	}
}

//	�� Ŭ������ �ϳ��� Ŭ���̾�Ʈ�� ���������� ��ȭ�� ���� ���α׷��̴�.
//	�׷��Ƿ� �� ���α׷��� Ŭ���̾�Ʈ�� ��ȭ�� ������ ���� �ڿ�
//	�غ� �Ǿ� �־�� �Ѵ�.
class ClientThread extends Thread {
	//	�� ���α׷��� ���ʿ� main�� ��ȣ ������ �� �ʿ䰡 ���� �ʹ�.
	ChatServer01		main;
	//	Ŭ���̾�Ʈ�� ��ȭ�� ������ ���� �ʼ� ����
	Socket				socket;	
	PrintWriter		pw;
	BufferedReader	br;
	//	Ȥ�� �ʿ��ϸ� Ŭ���̾�Ʈ�� ������ ������ �ִ°��� ���ڴ�.
	//	���� ���� ����ϴ� Ŭ���̾�Ʈ�� IP �ּҸ� ����ϰ��� �Ѵ�.
	String				ip;

	//	��ȣ ������ �ϱ� �����Ƿ� ���� �ּҸ� ���� �غ� �ؾ� �Ѵ�.
	public ClientThread(ChatServer01 temp, Socket s) {
		main = temp;
		//	Socket �� �̹� �տ��� ������ �� ��й޾Ҵ�.
		//	�׷��Ƿ� �̰͵� �޾Ƽ� �������.
		socket = s;
		//	��Ʈ���� ������ �˸� ���� �� �ִ�.
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
	//	����������� ������ ���� �Լ�
	void sendMsg(String data) {
		//	 ������ ������ �� ����.
		//		"�ȳ�"		�̶�� ��ȭ�� �ָ�
		//		����		"[192.???.???.???�� ����] �ȳ�"���� �����ϰ� �ʹ�.
		String msg = "[" + ip + "�� ����] " + data;
		//	������ ��� ������� �� ������ ��������.
		
		//	������ Ŭ���̾�Ʈ�� ���ڸ� �˾Ƴ���.
		int		size = main.clientList.size();
		//	����������� ���ÿ� �����ϴ� ���� ���� �ʴ´�.
		//	�ݵ�� �ѻ���� ���ε��� ������ �ؾ� �Ѵ�.
		synchronized(main.clientList) {
			for(int i = 0; i < size; i++) {
				//	������ Ŭ���̾�Ʈ�� �ϳ��� ������.
				ClientThread	t = (ClientThread) main.clientList.get(i);
				t.pw.println(msg);
				t.pw.flush();
			}
		}
	}
	public void run() {
		try {
			while(true) {
				//	����
				//		Ŭ���̾�Ʈ�� �� ������ ����
				String	msg = br.readLine();
				if(msg == null) {
					break;
				}
				//		��������.
				//		Ping�� �����͸� �� ���濡�� �����ϸ� �ȴ�.
				//		�̷� ���α׷��� 1:1 ���α׷��̶�� �Ѵ�.
				//		Chat�� �����͸� �� ���� ���� �ٸ� ������Ե�
				//		�����ؾ� �Ѵ�.
				//		�̷� ���α׷��� 1:�� ���α׷��̶�� �Ѵ�.
				
				//		1:�� ���α׷��� ������ ��������� �����ؾ� �ϹǷ�
				//		�ʼ������� ���� Ŭ���̾�Ʈ ������ �ؾ� �Ѵ�.
				sendMsg(msg);
			}
		}
		catch(Exception e) {}
		//	���� ���̻� ��ȭ�� ���� �ʿ䰡 �����Ƿ� �ڿ��� �� �ݾ�����.
		finally {
			//	Ŭ���̾�Ʈ ���� �÷��ǿ��� �ڽ� Ŭ������ �����Ѵ�.
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










