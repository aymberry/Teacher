package P0803;

import CHATDATA.MainData;

public class ReceiveThread extends Thread {
	//	메인클래스와 상호 참고 준비를 한다.
	ChatClient02		main;
	public ReceiveThread(ChatClient02 m) {
		main = m;
	}
	void nickProc(MainData data) {
		//	할일
		//		못쓰도록 만든 콤보상자를 풀어줄 예정이다.
		main.nickP.roomB.setEnabled(true);
		main.nickP.roomBtn.setEnabled(true);
	}
	
	void enterRoom(MainData data) {
		//	할일
		//		화면을 채팅 화면으로 변경하고 하고
		main.card.show(main.f, "채팅");
		//		채팅 화면을 깔끔하게 지워놓자.
		main.chatP.area.setText("");
	}
	
	void exitRoom(MainData data) {
		//	할일
		//		화면만 다시 원래 화면으로 바꾼다.
		main.card.show(main.f, "닉네임");
	}
	
	void showMsg(MainData data) {
		//	할일
		//		출력할 내용을 알아낸다.
		String	msg = data.cData.msg;
		
		//		텍스트 에리어에 출력하자.
		main.chatP.area.append(msg + "\r\n");
		//		스클로바를 자동으로 내리자.
		main.chatP.sp.getVerticalScrollBar().setValue(main.chatP.sp.getVerticalScrollBar().getMaximum());
	}
	public void run() {
		try {
			while(true) {
				//	받는작업만 열심히 한다.
				MainData	data = (MainData) main.oin.readObject();
				
				//	받은 결과를 분석하자.
				//	우리는 프로토콜 변수에 그 의미를 기록해 놓기로
				//	약속을 했다.
				switch(data.protocol) {
				case	2101:		//	닉네임 응답
					//	닉네임 응답을 받았을때 해야할 일만 하면되고....
					//	이제 못쓰도록 만든 방 선택을 사용할 수 있도록
					//	풀어줄 것이다.
					nickProc(data);
					break;
				case	2201:		//	방입장 응답
					enterRoom(data);
					break;
				case	2202:		//	방퇴장 응답
					exitRoom(data);
					break;
				case	2301:		//	채팅내용
					//	채팅 내용을 준비된 화면에 출력하면 되고....
					showMsg(data);
					break;
				}
				
				
			}
		}
		catch(Exception e) {}
	}
}






