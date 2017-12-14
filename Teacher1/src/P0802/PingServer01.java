package P0802;
/*
 * 	문제
 * 		Ping 서버를 만들어보자.
 * 
 * 		Ping 서버란? 서버가 실행되는지를 확인하기 위한 서버로
 * 						클라이언트가 내용을 전달하면
 * 						그 내용을 받어서 그대로 클라이언트에게 다시 되돌려 줌으로
 * 						클라이언트 입장에서는 자신이 서버에게 준 내용이
 * 						그대로 자신에게 오면
 * 						서버가 실행되고 있다는 사실을 알 수 있도록 하는 서버
 * 
 */
import		java.io.*;
import		java.net.*;
public class PingServer01 {

	public PingServer01() {
		ServerSocket	server = null;
		try {
			server = new ServerSocket(9999);
			//	서버는 클라이언트가 접속하기를 대기하기 위한 소켓을
			//	준비한다.
			//	포트번호는 아무거나 부여해도 원칙적으로 상관이 없지만...
			//	기존 프로그램과 동일하면 안된다.
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//	★★★
		while(true) {
			try {
				Socket  socket = server.accept();
				//	이 함수는 접속만 담당하는 함수이다.
				//	누군가가 접속을 하면 실제 전화를 할 수 있는 전화기를
				//	배정해야 한다.
				//	고로 이 함수는 누군가가 접속을 하면
				//	그 사람과 실제 통신을 할 수 있는  Socket를 만들어
				//	주기만 하면 된다.
				
				//	이제 누가 접속했는지 알아보자.
				InetAddress inet = socket.getInetAddress();
				String ip = inet.getHostAddress();
				
				//	클라이언트가 준 데이터를 받기 위해서는 역시
				//	스트림을 이용한다.
				//	1.	타겟 스트림을 준비한다.
				InputStream	is = socket.getInputStream();
				//	2.	필요하다면 필터와 연결한다.
				InputStreamReader	temp = new InputStreamReader(is);
				BufferedReader		br = new BufferedReader(temp);
				//	3.	데이터 받자
				String	data = br.readLine();
				System.out.println(ip + "가 준 데이터 = " + data);
				
				
				//	받은 데이터를 그대로 클라이언트에게 되돌려 준다.
				//	스트림을 이용해서 전달하면 된다.
				OutputStream os = socket.getOutputStream();
				PrintWriter	pw = new PrintWriter(os);
				pw.println("[RE] " + data);
				pw.flush();
						
				//	이제 누군가가 나한테 전화를 하기를(접속하기를) 기다리도록 한다.
				//	이 함수는 Blocking 함수이다.
				//	Blocking 함수란? 특정한 조건이 만족하지 않으면
				//						다음줄을 실행하지 않고 기다리는 함수를 말하며
				//	상대방이 접속을 해야만 다음을 실행하도록 한다.
				//	이 말을 바꾸면 다음줄이 실행되었다는 말은 곧
				//	누군가가 접속을 했다는 말이다.
				
				//	문제는 이 함수는 대기상태에 있다가 접속을 하면
				//	다른 클라이언트는 접속을 받지 못한다.
				//	즉, 한번 대기에 한번만 접속을 받게 된다.
	
				//	다음 사람을 접속 받기 위해서는 accept()가 다시 실행되어야 한다.
			}
			catch(Exception e) {
				System.out.println("접속 에러 = " + e);
			}
		}
		
		
	}

	public static void main(String[] args) {
		new PingServer01();
	}
}






