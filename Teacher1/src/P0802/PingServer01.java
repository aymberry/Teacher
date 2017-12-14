package P0802;
/*
 * 	����
 * 		Ping ������ ������.
 * 
 * 		Ping ������? ������ ����Ǵ����� Ȯ���ϱ� ���� ������
 * 						Ŭ���̾�Ʈ�� ������ �����ϸ�
 * 						�� ������ �޾ �״�� Ŭ���̾�Ʈ���� �ٽ� �ǵ��� ������
 * 						Ŭ���̾�Ʈ ���忡���� �ڽ��� �������� �� ������
 * 						�״�� �ڽſ��� ����
 * 						������ ����ǰ� �ִٴ� ����� �� �� �ֵ��� �ϴ� ����
 * 
 */
import		java.io.*;
import		java.net.*;
public class PingServer01 {

	public PingServer01() {
		ServerSocket	server = null;
		try {
			server = new ServerSocket(9999);
			//	������ Ŭ���̾�Ʈ�� �����ϱ⸦ ����ϱ� ���� ������
			//	�غ��Ѵ�.
			//	��Ʈ��ȣ�� �ƹ��ų� �ο��ص� ��Ģ������ ����� ������...
			//	���� ���α׷��� �����ϸ� �ȵȴ�.
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//	�ڡڡ�
		while(true) {
			try {
				Socket  socket = server.accept();
				//	�� �Լ��� ���Ӹ� ����ϴ� �Լ��̴�.
				//	�������� ������ �ϸ� ���� ��ȭ�� �� �� �ִ� ��ȭ�⸦
				//	�����ؾ� �Ѵ�.
				//	��� �� �Լ��� �������� ������ �ϸ�
				//	�� ����� ���� ����� �� �� �ִ�  Socket�� �����
				//	�ֱ⸸ �ϸ� �ȴ�.
				
				//	���� ���� �����ߴ��� �˾ƺ���.
				InetAddress inet = socket.getInetAddress();
				String ip = inet.getHostAddress();
				
				//	Ŭ���̾�Ʈ�� �� �����͸� �ޱ� ���ؼ��� ����
				//	��Ʈ���� �̿��Ѵ�.
				//	1.	Ÿ�� ��Ʈ���� �غ��Ѵ�.
				InputStream	is = socket.getInputStream();
				//	2.	�ʿ��ϴٸ� ���Ϳ� �����Ѵ�.
				InputStreamReader	temp = new InputStreamReader(is);
				BufferedReader		br = new BufferedReader(temp);
				//	3.	������ ����
				String	data = br.readLine();
				System.out.println(ip + "�� �� ������ = " + data);
				
				
				//	���� �����͸� �״�� Ŭ���̾�Ʈ���� �ǵ��� �ش�.
				//	��Ʈ���� �̿��ؼ� �����ϸ� �ȴ�.
				OutputStream os = socket.getOutputStream();
				PrintWriter	pw = new PrintWriter(os);
				pw.println("[RE] " + data);
				pw.flush();
						
				//	���� �������� ������ ��ȭ�� �ϱ⸦(�����ϱ⸦) ��ٸ����� �Ѵ�.
				//	�� �Լ��� Blocking �Լ��̴�.
				//	Blocking �Լ���? Ư���� ������ �������� ������
				//						�������� �������� �ʰ� ��ٸ��� �Լ��� ���ϸ�
				//	������ ������ �ؾ߸� ������ �����ϵ��� �Ѵ�.
				//	�� ���� �ٲٸ� �������� ����Ǿ��ٴ� ���� ��
				//	�������� ������ �ߴٴ� ���̴�.
				
				//	������ �� �Լ��� �����¿� �ִٰ� ������ �ϸ�
				//	�ٸ� Ŭ���̾�Ʈ�� ������ ���� ���Ѵ�.
				//	��, �ѹ� ��⿡ �ѹ��� ������ �ް� �ȴ�.
	
				//	���� ����� ���� �ޱ� ���ؼ��� accept()�� �ٽ� ����Ǿ�� �Ѵ�.
			}
			catch(Exception e) {
				System.out.println("���� ���� = " + e);
			}
		}
		
		
	}

	public static void main(String[] args) {
		new PingServer01();
	}
}






