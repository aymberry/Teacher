package P0802;
/*
 * 	����ǻ���� IP�ּҿ� ������ �ּҸ� �˾ƺ���.
 */
import		java.net.*;
public class Test01 {
	public Test01() {
		InetAddress	inet = null;
		try {
			inet = InetAddress.getLocalHost();
			
			//	IP�ּҸ� �˾ƺ���.
			String ip = inet.getHostAddress();
			//	������ �ּҸ� �˾ƺ���.
			String domain = inet.getHostName();
			
			System.out.println("IP = " + ip);
			System.out.println("������ = " + domain);
		}
		catch(Exception e) {}
	}
	public static void main(String[] args) {
		new Test01();
	}
}

