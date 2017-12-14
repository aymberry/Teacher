package P0803;

import CHATDATA.MainData;

public class ReceiveThread extends Thread {
	//	����Ŭ������ ��ȣ ���� �غ� �Ѵ�.
	ChatClient02		main;
	public ReceiveThread(ChatClient02 m) {
		main = m;
	}
	void nickProc(MainData data) {
		//	����
		//		�������� ���� �޺����ڸ� Ǯ���� �����̴�.
		main.nickP.roomB.setEnabled(true);
		main.nickP.roomBtn.setEnabled(true);
	}
	
	void enterRoom(MainData data) {
		//	����
		//		ȭ���� ä�� ȭ������ �����ϰ� �ϰ�
		main.card.show(main.f, "ä��");
		//		ä�� ȭ���� ����ϰ� ��������.
		main.chatP.area.setText("");
	}
	
	void exitRoom(MainData data) {
		//	����
		//		ȭ�鸸 �ٽ� ���� ȭ������ �ٲ۴�.
		main.card.show(main.f, "�г���");
	}
	
	void showMsg(MainData data) {
		//	����
		//		����� ������ �˾Ƴ���.
		String	msg = data.cData.msg;
		
		//		�ؽ�Ʈ ����� �������.
		main.chatP.area.append(msg + "\r\n");
		//		��Ŭ�ιٸ� �ڵ����� ������.
		main.chatP.sp.getVerticalScrollBar().setValue(main.chatP.sp.getVerticalScrollBar().getMaximum());
	}
	public void run() {
		try {
			while(true) {
				//	�޴��۾��� ������ �Ѵ�.
				MainData	data = (MainData) main.oin.readObject();
				
				//	���� ����� �м�����.
				//	�츮�� �������� ������ �� �ǹ̸� ����� �����
				//	����� �ߴ�.
				switch(data.protocol) {
				case	2101:		//	�г��� ����
					//	�г��� ������ �޾����� �ؾ��� �ϸ� �ϸ�ǰ�....
					//	���� �������� ���� �� ������ ����� �� �ֵ���
					//	Ǯ���� ���̴�.
					nickProc(data);
					break;
				case	2201:		//	������ ����
					enterRoom(data);
					break;
				case	2202:		//	������ ����
					exitRoom(data);
					break;
				case	2301:		//	ä�ó���
					//	ä�� ������ �غ�� ȭ�鿡 ����ϸ� �ǰ�....
					showMsg(data);
					break;
				}
				
				
			}
		}
		catch(Exception e) {}
	}
}






