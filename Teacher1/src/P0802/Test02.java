package P0802;
/*
 * 	네이버 서버의 IP주소를 알아보자.
 */
import		java.net.*;
public class Test02 {
	public Test02() {
		InetAddress	inet = null;
		try {
			inet = InetAddress.getByName("www.naver.com");
			
			//	IP주소를 알아보자.
			String ip = inet.getHostAddress();
			//	도메인 주소를 알아보자.
			String domain = inet.getHostName();
			
			System.out.println("IP = " + ip);
			System.out.println("도메인 = " + domain);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		new Test02();
	}
}
