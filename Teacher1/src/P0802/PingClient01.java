package P0802;
/*
 * 	Ping Ŭ���̾�Ʈ�� ������.
 * 
 * 		�������� �����ϰ� ������ ������ �� �� ������ �޴��� Ȯ���ϴ� ���α׷�
 * 
 */
import		java.net.*;
import		java.io.*;
public class PingClient01 {
	public PingClient01() {
		//	������ ������ �ϱ� ���ؼ��� ��� ������ �־�� �Ѵ�.
		//	Socket �̶�� Ŭ������ �� ��Ȱ�� ����� �ش�.
		Socket		socket = null;
		try {
			socket = new Socket("192.168.137.64", 9999);
			//	Socket�� �����ϸ� ������ ������ �Ϸ�ȴ�.
			
			//	�������� �����͸� ������ ����� ��Ʈ���� �̿��Ѵ�.
			//	1.	Ÿ�� ��Ʈ���� �غ��Ѵ�.
			OutputStream		os = socket.getOutputStream();
			//	2.	�ʿ��ϴٸ� ���Ϳ� �����Ѵ�.
			PrintWriter		pw = new PrintWriter(os);
			//	3.	�����͸� �����Ѵ�.
			String	data = "����� ������.";
			pw.println(data);
			pw.flush();
			
			//	������ �����ϴ� ������ ���� �غ�����.
			//	1.	Ÿ�� ��Ʈ���� �غ��Ѵ�.
			InputStream	is = socket.getInputStream();
			//	2.	�ʿ��ϴٸ� ���Ϳ� �����Ѵ�.
			InputStreamReader	temp = new InputStreamReader(is);
			BufferedReader		br = new BufferedReader(temp);
			//	3.	������ ����
			String	redata = br.readLine();
			System.out.println("���� ������ = " + redata);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		new PingClient01();
	}
}
