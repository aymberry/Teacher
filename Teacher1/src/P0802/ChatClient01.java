package 	P0802;
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
import		java.net.*;
import		java.io.*;
public class ChatClient01 extends JFrame {
	Socket				socket;
	BufferedReader	br;
	PrintWriter		pw;
	
	JTextArea		area;
	JTextField 	field;
	JScrollPane	sp;
	public ChatClient01() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		JButton	exitB = new JButton("나가기");
		JButton	sendB = new JButton("보내기");
		
		area = new JTextArea();
		sp = new JScrollPane(area);
		
		field = new JTextField();
		
		SendEvent		evt = new SendEvent();
		sendB.addActionListener(evt);
		field.addActionListener(evt);
		
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("Center", field);
		p1.add("East", sendB);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(exitB);

		this.add("North", p2);
		this.add("Center",  sp);
		this.add("South", p1);
		
		this.setSize(400, 600);
		this.setVisible(true);
		

		try {
			//	서버에 접속을 시도한다.
			socket = new Socket("192.168.137.64", 9988);
			//	통신을 위해서 스트림을 준비한다.
			
			//		1	타겟 스트림을 준비
			InputStream	is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//		2.	필터와 연결한다.
			//			println()를 사용하고 싶어서....
			pw = new PrintWriter(os);
			//			readLine()를 사용하고 싶어서...
			InputStreamReader temp1 = new InputStreamReader(is);
			br = new BufferedReader(temp1);
			

			
			
			
			
			
			
			//	이제 네트워크 준비가 되었으므로....
			//	받을 스래드를 기동시켜 놓자.
			ReceiveThread	t = new ReceiveThread(this);
			t.start();
		}
		catch(Exception e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new ChatClient01();
	}
	
	class SendEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	할일
			//		입력한 내용 알아내서
			String	msg = field.getText();
			if(msg == null || msg.length() == 0) {
				return;
			}
			//		서버에게 전달한다.
			pw.println(msg);
			pw.flush();
			
			//	다음번 입력을 위해서 필드를 지워준다.
			field.setText("");
		}
	}
}

//	서버가 주는 데이터를 받기 위한 독립적인 프로그램을 만들어서 사용한다.
class ReceiveThread extends Thread {
	//	위쪽 클래스와 통신해야 하므로.....
	ChatClient01		main;
	public ReceiveThread(ChatClient01 t) {
		main = t;
	}
	public void run() {
		try {
			while(true) {
				//	데이터 받고
				String	msg = main.br.readLine();
				if(msg == null) {
					break;
				}
				//	화면에 출력하자.
				main.area.append(msg + "\r\n");
				main.sp.getVerticalScrollBar().setValue(main.sp.getVerticalScrollBar().getMaximum());
			}
		}
		//	만약 데이터를 받지 못하게 되면 이 프로그램은 
		//	몬쓰는 프로그램이므로 강제 종료시킨다.
		catch(Exception e) {
			System.exit(0);
		}
	}
}








