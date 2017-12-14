package P0804;
/*
 * 	UPD ����� �����ϰ�
 * 	�츮�� ģ���� ����� ����� ��ϻ��ڸ� ������ �ִ� Ŭ����
 */
import		java.net.*;
import		java.awt.List;			//	List
import		java.awt.event.*;
import		javax.swing.*;
import		java.util.*;				//	List

public class NoteMain {
	TreeMap		ntiset, itnset;
	List			list;
	
	//	����� �ϱ� ���� �غ�
	//		������ �ΰ� �غ��ؾ� �Ѵ�.
	//		������ ���� ����, �޴� ���� ����
	DatagramSocket		sendS, receiveS;
	
	public NoteMain() {
		//	��Ʈ��ũ�� ��������.
		try {
			sendS = new DatagramSocket();
			receiveS = new DatagramSocket(8888);
			ReceiveThread	t = new ReceiveThread(this);
			t.start();
		}
		catch(Exception e) {
			System.exit(0);
		}

		JFrame	f = new JFrame("���� ������");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		list = new List();
		
		list.addActionListener(new ListEvent());
		
		ntiset = new TreeMap();
		itnset = new TreeMap();
		//	ģ���� �̸��� �˸� IP�ּҸ� ������ �ֵ��� ���� Map
		ntiset.put("������", "192.168.137.61");
		ntiset.put("������", "192.168.137.58");
		ntiset.put("������", "192.168.137.222");
		ntiset.put("����", "192.168.137.7");
		ntiset.put("������", "192.168.137.76");
		ntiset.put("������", "192.168.137.43");
		ntiset.put("������", "192.168.137.44");
		ntiset.put("������", "192.168.137.45");
		ntiset.put("������", "192.168.137.50");
		ntiset.put("�ѽ�ȣ", "192.168.137.221");
		ntiset.put("������", "192.168.137.59");
		ntiset.put("�賲��", "192.168.137.22");
		ntiset.put("�Ȱ��", "192.168.137.65");
		ntiset.put("�ȿ���", "192.168.137.87");
		ntiset.put("������", "192.168.137.53");
		ntiset.put("������", "192.168.137.41");
		ntiset.put("������", "192.168.137.42");
		ntiset.put("������", "192.168.137.51");
		ntiset.put("����", "192.168.137.218");
		ntiset.put("���ֿ�", "192.168.137.74");
		ntiset.put("������", "192.168.137.217");
		ntiset.put("�ּ���", "192.168.137.75");
		ntiset.put("���ȯ", "192.168.137.64");
		//	IP �ּҸ� �˸� ģ���� �̸��� �˾Ƴ��� ���� Map
		itnset.put("192.168.137.61", "������");
		itnset.put("192.168.137.58", "������");
		itnset.put("192.168.137.222", "������");
		itnset.put("192.168.137.7", "����");
		itnset.put("192.168.137.76", "������");
		itnset.put("192.168.137.43", "������");
		itnset.put("192.168.137.44", "������");
		itnset.put("192.168.137.45", "������");
		itnset.put("192.168.137.50", "������");
		itnset.put("192.168.137.221", "�ѽ�ȣ");
		itnset.put("192.168.137.59", "������");
		itnset.put("192.168.137.22", "�賲��");
		itnset.put("192.168.137.65", "�Ȱ��");
		itnset.put("192.168.137.87", "�ȿ���");
		itnset.put("192.168.137.53", "������");
		itnset.put("192.168.137.41", "������");
		itnset.put("192.168.137.42", "������");
		itnset.put("192.168.137.51", "������");
		itnset.put("192.168.137.218", "����");
		itnset.put("192.168.137.74", "���ֿ�");
		itnset.put("192.168.137.217", "������");
		itnset.put("192.168.137.75", "�ּ���");
		itnset.put("192.168.137.64", "���ȯ");
		
		//	Map�� ������(ģ���̸�)�� �̿��ؼ�
		//	��ϻ��ڿ� ģ���̸��� �Է��ϴ� �κ�
		Collection 	temp = itnset.values();
		Iterator	iter = temp.iterator();
		while(iter.hasNext()) {
			list.add((String) iter.next());
		}
		
		f.add(list);
		
		f.setSize(200,  200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new NoteMain();
	}
	//	AWT�� ��ϻ��ڸ� ����Ŭ���ϴ� �̺�Ʈ�� ActionListener ����̴�.
	class ListEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	����
			//		������ ģ���� �̸��� �˾Ƴ���.
			String	name = list.getSelectedItem();
			//		��ȭ���ڸ� ����Ѵ�.
			SendNote	dlg = new SendNote(NoteMain.this);
			//		���� ���� ģ���̸��� ����Ѵ�.
			dlg.whoLabel.setText(name);
			dlg.setVisible(true);
		}
	}
}


