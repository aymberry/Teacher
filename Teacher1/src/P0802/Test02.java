package P0802;
/*
 * 	���̹� ������ IP�ּҸ� �˾ƺ���.
 */
import		java.net.*;
public class Test02 {
	public Test02() {
		InetAddress	inet = null;
		try {
			inet = InetAddress.getByName("www.naver.com");
			
			//	IP�ּҸ� �˾ƺ���.
			String ip = inet.getHostAddress();
			//	������ �ּҸ� �˾ƺ���.
			String domain = inet.getHostName();
			
			System.out.println("IP = " + ip);
			System.out.println("������ = " + domain);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		new Test02();
	}
}
