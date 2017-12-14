package P0802;
/*
 * 	Ping 클라이언트를 만들어보자.
 * 
 * 		서버에게 접속하고 뭔가는 전달한 후 그 내용을 받는지 확인하는 프로그램
 * 
 */
import		java.net.*;
import		java.io.*;
public class PingClient01 {
	public PingClient01() {
		//	서버에 접속을 하기 위해서는 통신 도구가 있어야 한다.
		//	Socket 이라는 클래스가 이 역활을 담당해 준다.
		Socket		socket = null;
		try {
			socket = new Socket("192.168.137.64", 9999);
			//	Socket을 생성하면 서버에 접속이 완료된다.
			
			//	서버에게 데이터를 보내는 방법은 스트림을 이용한다.
			//	1.	타겟 스트림을 준비한다.
			OutputStream		os = socket.getOutputStream();
			//	2.	필요하다면 필터와 연결한다.
			PrintWriter		pw = new PrintWriter(os);
			//	3.	데이터를 전송한다.
			String	data = "맘대로 쓰세요.";
			pw.println(data);
			pw.flush();
			
			//	서버가 응답하는 데이터 받을 준비하자.
			//	1.	타겟 스트림을 준비한다.
			InputStream	is = socket.getInputStream();
			//	2.	필요하다면 필터와 연결한다.
			InputStreamReader	temp = new InputStreamReader(is);
			BufferedReader		br = new BufferedReader(temp);
			//	3.	데이터 받자
			String	redata = br.readLine();
			System.out.println("받은 데이터 = " + redata);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		new PingClient01();
	}
}
