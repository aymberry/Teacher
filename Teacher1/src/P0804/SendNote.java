package P0804;
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
public class SendNote extends JFrame {
	JTextArea		area;
	JButton		reB, sendB, closeB;
	JLabel			whoLabel ;
	NoteMain		main;
	public SendNote(NoteMain m) { 
		main = m;
		//	�Ʊ�� �׽�Ʈ�� ���ؼ� x ���� ������ ���α׷��� ����ǵ���
		//	�� ���Ҵ�.
		//	������ x ���߸� ������ �� ��ȭ���ڸ� �������� �ǹǷ�...
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		//	����	JFrame���� x ���� ������ �ϴ� �ൿ �����ϱ�
		//		DO_NOTHING_ON_CLOSE 	�ൿ���� ����
		//		HIDE_ON_CLOSE				ȭ�鸸 �����
		//		DISPOSE_ON_CLOSE			ȭ���� ����� �޸𸮿����� �����
		//		EXIT_ON_CLOSE				���α׷��� ������ ��
		
		JLabel		label = new JLabel("�޴»�� ���� : ");
		whoLabel = new JLabel();
		
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		reB = new JButton("�ٽþ���");
		sendB = new JButton("�� �� ��");
		closeB = new JButton("��    ��");
		
		ButtonEvent		evt = new ButtonEvent();
		reB.addActionListener(evt);
		sendB.addActionListener(evt);
		closeB.addActionListener(evt);
		
		JPanel	p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", whoLabel);

		JPanel	p2 = new JPanel();
		p2.add(reB);
		p2.add(sendB);
		p2.add(closeB);
		
		this.add("North", p1);
		this.add("Center", sp);
		this.add("South", p2);
		
		this.setSize(400, 300);
//		this.setVisible(true);
	}
//	public static void main(String[] args) {
//		new SendNote();
//	}
	//	���� ������ �����Լ�
	void sendProc() {
		//	�ڡڡ�
		//	����
		//		1.	���� �ּ�, ���� ������ �˾Ƴ���.
		String	msg = area.getText();
		String	name = whoLabel.getText();
		String	ip = (String)main.ntiset.get(name);
		
		//		2.	�̰��� ��Ŷ���� �����Ѵ�.
		//			1)	 �����ʹ� byte[]�� �����.
		byte[]	buff = msg.getBytes();
		//			2)	�ּҴ� InetAddress�� �����. 
		InetAddress addr = null;
		try {
			addr = InetAddress.getByName(ip);
		}
		catch(Exception e) {}
		
		DatagramPacket pack = 
				new DatagramPacket(buff, buff.length, addr, 8888);
		//		3.	���濡�� �����Ѵ�.
		try {
			main.sendS.send(pack);
		}
		catch(Exception e) {}
		
		//	���� �� ��ȭ���ڴ� �� ���� �������Ƿ� �ݾ�����
		setVisible(false);
		dispose();
	}
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	����
			//		���߰� 3�� �����Ƿ�.. ��������.
			JButton	target = (JButton) e.getSource();
			if(target == reB) {
				//	�ٽþ��� �̹Ƿ�... ȭ���� ����� �ȴ�.
				area.setText("");
			}
			else if(target == sendB) {
				//	������ ������ ���
				sendProc();
			}
			else if(target == closeB) {
				//	������ ������ �ʰ� ȭ���� �ݴ´ٴ� �ǹ��̹Ƿ�..
				setVisible(false);
				//	�޸𸮿����� ������ �ּ���....
				dispose();
			}
		}
	}
}



