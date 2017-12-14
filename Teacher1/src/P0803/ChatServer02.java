package P0803;
import		java.net.*;
import		java.io.*;
import		java.util.*;
public class ChatServer02 {
	//	�� ������ 1:�� ����� �� �ʿ䰡 �ִ�.
	//	�׷��� ���� ���忡�� ������ Ŭ���̾�Ʈ�� ������ ������ �־�� �Ѵ�.
	public ArrayList		clientList;
	public ChatServer02() {
		//	������ �ؾ� �ϴ� ���� ù��° ����
		//	������ �ޱ⸸ �ϴ� ��ȭ��(ServerSocket)�� �غ��ؾ� �Ѵ�.
		ServerSocket		server = null;
		try {
			server = new ServerSocket(8899);
			//	Ŭ���̾�Ʈ ������ �غ�����.
			clientList = new ArrayList();
		}
		catch(Exception e) {
			System.exit(0);
		}
		//	�ι�° ������ ������ �޴� ���̴�.
		//	������ ����ؼ� ���� ����� ������ �޾ƾ� �ϹǷ�
		//	�ݺ� ó���� ���־�� �Ѵ�.
		while(true) {
			try {
				//	������ ������ �� Ŭ���̾�Ʈ�� 
				//	������ ����� �� �� �ִ� ��ȭ�⸦ ������ �־�� �Ѵ�.
				//	�� �۾��� accept()�� �ڵ����� ó���� ������..... 
				Socket socket = server.accept();
				
				//	���������� �� ����
				//	������ Ŭ���̾�Ʈ�ϰ� �����ʹ� �ְ� �޴� ���̴�.
				//	������ Ŭ���̾�Ʈ�ϰ� ��ȭ�� ������ �Ǹ�.....
				//	�ٸ� Ŭ���̾�Ʈ�� ������ �� �� ���� �ȴ�.
				//	�׷��� ������ Ŭ���̾�Ʈ�ϰ� ��ȭ�� ������ ���α׷���
				//	���������� ���� ���Ӱ����� ��ȭ�� ������ ������
				//	���� ó���ǵ��� ���־�� �Ѵ�.
				
				//	���� ������ �۾�
				//		�������� ������ �����Ƿ�......
				//		������ Ŭ���̾�Ʈ�� ��ȭ�� ���� �����带 �⵿�Ѵ�.
				ClientThread02	t = new ClientThread02(socket, this);
				//	���� �ѻ���� ������ �����Ƿ�...
				//	������ Ŭ���̾�Ʈ�� ���� ������ ���־�� �� ���̴�.
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













