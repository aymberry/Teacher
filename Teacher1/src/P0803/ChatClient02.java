package P0803;
/*
 * 	������� �ΰ��� ȭ���� CardLayout ����� �̿��ؼ� ȭ�� ����
 *	ó���� ������ ����.
 *
 *	CardLayout�� �ΰ� �̻��� ȭ���� �ϳ��� �����ӿ� ���� ��
 *	�����δ� �� ȭ�鸸 ���̰� �ϴ� ����̴�.
 *	�ʿ��ϴٸ� ���̴� ȭ���� �ٸ� ȭ������ ������ �� �ִ� ���
 *
 *	����	�� ����� ���� AWT������ ����� �� �ִ� ���
 */
import		java.awt.*;
import		java.awt.event.*;
import		javax.swing.*;

//	��Ʈ��ũ ó��
import		java.net.*;
import		java.io.*;
public class ChatClient02 {
	Frame			f;
	CardLayout	card;
	NickPanel		nickP;
	ChatPanel		chatP;
	
	//	��Ʈ��ũ ó���� �ʿ��� ������ �غ��Ѵ�.
	Socket					socket;
	ObjectInputStream	oin;
	ObjectOutputStream	oout;
	
	public ChatClient02() {
		f = new Frame();
		//	����
		//		�̰��� x���߸� ������ ����Ǵ� �Լ��� ����.
		//		������ �̺�Ʈ�� �̿��ؼ� x ���߸� ������
		//		���α׷��� ����ǵ��� ���־�� �Ѵ�.
//		f.addWindowListener(new CloseEvent());
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		card = new CardLayout();
		f.setLayout(card);
		//	���� �� �����ӿ� �ΰ��� ȭ���� �ְ��� �Ѵ�.
		//	�����ӿ� ���� �� �ִ°��� Panel�̹Ƿ�.....
		//	ȭ���� Panel�� ������ �Ѵ�.
		
		nickP = new NickPanel(this);
		chatP = new ChatPanel(this);
		
		f.add("�г���", nickP);
		f.add("ä��", chatP);
		
		f.setSize(400, 600);
		f.setVisible(true);
		//	=================	ȭ�� ������ �������Ƿ�...
		//							��Ʈ��ũ �غ� ����.
		try {
			//	1.	���� Ŭ������ �̿��ؼ� ������ ������ �õ��Ѵ�.
			socket = new Socket("192.168.137.24", 8899);
			//	2.	��Ʈ�� ������ �Ѵ�.
			OutputStream		os = socket.getOutputStream();
			oout = new ObjectOutputStream(os);
			
			InputStream		is = socket.getInputStream();
			oin = new ObjectInputStream(is);
			
			//	���� ������ ���� �ٸ� ����� ���� �� �����Ƿ�
			//	�޴� �����带 �⵿�� ����.
			ReceiveThread	t = new ReceiveThread(this);
			t.start();
		}
		catch(Exception e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new ChatClient02();
	}
//	class CloseEvent extends WindowAdapter {
//		public void windowClosing(WindowEvent e) {
//			System.exit(0);
//		}
//	}
}




