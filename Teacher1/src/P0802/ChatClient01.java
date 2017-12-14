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
		
		JButton	exitB = new JButton("������");
		JButton	sendB = new JButton("������");
		
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
			//	������ ������ �õ��Ѵ�.
			socket = new Socket("192.168.137.64", 9988);
			//	����� ���ؼ� ��Ʈ���� �غ��Ѵ�.
			
			//		1	Ÿ�� ��Ʈ���� �غ�
			InputStream	is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//		2.	���Ϳ� �����Ѵ�.
			//			println()�� ����ϰ� �;....
			pw = new PrintWriter(os);
			//			readLine()�� ����ϰ� �;...
			InputStreamReader temp1 = new InputStreamReader(is);
			br = new BufferedReader(temp1);
			

			
			
			
			
			
			
			//	���� ��Ʈ��ũ �غ� �Ǿ����Ƿ�....
			//	���� �����带 �⵿���� ����.
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
			//	����
			//		�Է��� ���� �˾Ƴ���
			String	msg = field.getText();
			if(msg == null || msg.length() == 0) {
				return;
			}
			//		�������� �����Ѵ�.
			pw.println(msg);
			pw.flush();
			
			//	������ �Է��� ���ؼ� �ʵ带 �����ش�.
			field.setText("");
		}
	}
}

//	������ �ִ� �����͸� �ޱ� ���� �������� ���α׷��� ���� ����Ѵ�.
class ReceiveThread extends Thread {
	//	���� Ŭ������ ����ؾ� �ϹǷ�.....
	ChatClient01		main;
	public ReceiveThread(ChatClient01 t) {
		main = t;
	}
	public void run() {
		try {
			while(true) {
				//	������ �ް�
				String	msg = main.br.readLine();
				if(msg == null) {
					break;
				}
				//	ȭ�鿡 �������.
				main.area.append(msg + "\r\n");
				main.sp.getVerticalScrollBar().setValue(main.sp.getVerticalScrollBar().getMaximum());
			}
		}
		//	���� �����͸� ���� ���ϰ� �Ǹ� �� ���α׷��� 
		//	�󾲴� ���α׷��̹Ƿ� ���� �����Ų��.
		catch(Exception e) {
			System.exit(0);
		}
	}
}








