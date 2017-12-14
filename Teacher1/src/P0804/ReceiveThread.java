package P0804;

import java.net.DatagramPacket;
import java.net.InetAddress;

/*
 * 	������ ���� ������ �� �𸣹Ƿ� ������ �޴� ���α׷��� ����������
 * 	����Ǿ�� �� ���̴�.
 */
public class ReceiveThread extends Thread{
	NoteMain		main;
	public ReceiveThread(NoteMain m) {
		main = m;
	}
	//	�ڡڡ�		UDP ��� ���� �۾�
	public void run() {
		try {
			while(true) {
				//	������ ��Ŷ�� �����.
				byte[]	buff = new byte[1024];
				DatagramPacket pack = new DatagramPacket(buff, buff.length);
				//	�����͸� �����Ѵ�.
				//		��Ʈ������ ������ �� �����Ƿ� �ݵ�� �Լ��� �̿��ؼ�
				//		�����ϵ��� �Ѵ�.
				main.receiveS.receive(pack);
				//	������ �м��Ѵ�.
				//	���� ���´��� ip �ּҸ� �˾Ƴ���.
				InetAddress addr = pack.getAddress();
				String	ip = addr.getHostAddress();
				
				//	������ �˾Ƴ���.
				byte[] rbuff = pack.getData();
				int		len = pack.getLength();
				String	msg = new String(rbuff, 0, len);
	
				//	�츮�� ������ ������ ��ȭ���ڿ� ����ؾ� �ϹǷ�....
				ReceiveNote	dlg = new ReceiveNote(main);
				//	������� �̸��� ������
				String	who = (String) main.itnset.get(ip);
				dlg.whoLabel.setText(who);
				//	������ ��ȭ���ڿ� ����� �־�� ������.....
				dlg.area.setText(msg);
				dlg.setVisible(true);
			}
		}
		catch(Exception e) {
		}
		finally {
			System.exit(0);
		}
	}
}
