package P0802;
/*
 * 	내컴퓨터의 IP주소와 도메인 주소를 알아보자.
 */
import		java.net.*;
public class Test01 {
	public Test01() {
		InetAddress	inet = null;
		try {
			inet = InetAddress.getLocalHost();
			
			//	IP주소를 알아보자.
			String ip = inet.getHostAddress();
			//	도메인 주소를 알아보자.
			String domain = inet.getHostName();
			
			System.out.println("IP = " + ip);
			System.out.println("도메인 = " + domain);
		}
		catch(Exception e) {}
	}
	public static void main(String[] args) {
		new Test01();
	}
}

