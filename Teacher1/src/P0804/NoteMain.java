package P0804;
/*
 * 	UPD 통신을 관리하고
 * 	우리반 친구를 명단을 출력할 목록상자를 가지고 있는 클래스
 */
import		java.net.*;
import		java.awt.List;			//	List
import		java.awt.event.*;
import		javax.swing.*;
import		java.util.*;				//	List

public class NoteMain {
	TreeMap		ntiset, itnset;
	List			list;
	
	//	통신을 하기 위한 준비
	//		소켓을 두개 준비해야 한다.
	//		보내는 전용 소켓, 받는 전용 소켓
	DatagramSocket		sendS, receiveS;
	
	public NoteMain() {
		//	네트워크를 개설하자.
		try {
			sendS = new DatagramSocket();
			receiveS = new DatagramSocket(8888);
			ReceiveThread	t = new ReceiveThread(this);
			t.start();
		}
		catch(Exception e) {
			System.exit(0);
		}

		JFrame	f = new JFrame("쪽지 보내기");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		list = new List();
		
		list.addActionListener(new ListEvent());
		
		ntiset = new TreeMap();
		itnset = new TreeMap();
		//	친구의 이름을 알면 IP주소를 꺼낼수 있도록 만든 Map
		ntiset.put("정준일", "192.168.137.61");
		ntiset.put("최정규", "192.168.137.58");
		ntiset.put("김진수", "192.168.137.222");
		ntiset.put("김대오", "192.168.137.7");
		ntiset.put("손지인", "192.168.137.76");
		ntiset.put("임주향", "192.168.137.43");
		ntiset.put("공은미", "192.168.137.44");
		ntiset.put("이진석", "192.168.137.45");
		ntiset.put("김판진", "192.168.137.50");
		ntiset.put("한승호", "192.168.137.221");
		ntiset.put("박형진", "192.168.137.59");
		ntiset.put("김남곤", "192.168.137.22");
		ntiset.put("안경수", "192.168.137.65");
		ntiset.put("안영미", "192.168.137.87");
		ntiset.put("김종현", "192.168.137.53");
		ntiset.put("김현기", "192.168.137.41");
		ntiset.put("조윤형", "192.168.137.42");
		ntiset.put("방태종", "192.168.137.51");
		ntiset.put("소현", "192.168.137.218");
		ntiset.put("박주영", "192.168.137.74");
		ntiset.put("나혜진", "192.168.137.217");
		ntiset.put("주성식", "192.168.137.75");
		ntiset.put("김명환", "192.168.137.64");
		//	IP 주소를 알면 친구의 이름을 알아내기 위한 Map
		itnset.put("192.168.137.61", "정준일");
		itnset.put("192.168.137.58", "최정규");
		itnset.put("192.168.137.222", "김진수");
		itnset.put("192.168.137.7", "김대오");
		itnset.put("192.168.137.76", "손지인");
		itnset.put("192.168.137.43", "임주향");
		itnset.put("192.168.137.44", "공은미");
		itnset.put("192.168.137.45", "이진석");
		itnset.put("192.168.137.50", "김판진");
		itnset.put("192.168.137.221", "한승호");
		itnset.put("192.168.137.59", "박형진");
		itnset.put("192.168.137.22", "김남곤");
		itnset.put("192.168.137.65", "안경수");
		itnset.put("192.168.137.87", "안영미");
		itnset.put("192.168.137.53", "김종현");
		itnset.put("192.168.137.41", "김현기");
		itnset.put("192.168.137.42", "조윤형");
		itnset.put("192.168.137.51", "방태종");
		itnset.put("192.168.137.218", "소현");
		itnset.put("192.168.137.74", "박주영");
		itnset.put("192.168.137.217", "나혜진");
		itnset.put("192.168.137.75", "주성식");
		itnset.put("192.168.137.64", "김명환");
		
		//	Map의 데이터(친구이름)을 이용해서
		//	목록상자에 친구이름을 입력하는 부분
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
	//	AWT의 목록상자를 더블클릭하는 이벤트는 ActionListener 담당이다.
	class ListEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	할일
			//		선택한 친구의 이름을 알아낸다.
			String	name = list.getSelectedItem();
			//		대화상자를 출력한다.
			SendNote	dlg = new SendNote(NoteMain.this);
			//		먼저 받을 친구이름을 출력한다.
			dlg.whoLabel.setText(name);
			dlg.setVisible(true);
		}
	}
}


