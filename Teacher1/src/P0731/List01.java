package P0731;
/*
 * 	문제
 * 		목록 상자를 하나 만들고 그 안에 5개의 항목을 넣어보자.
 * 
 * 		항목을 선택하면 선택한 항목을 화면에 출력하도록 하자.
 */
import		javax.swing.*;
import		javax.swing.event.*;
import		java.awt.*;
public class List01 {
	JList	list;
	public List01() {
		JFrame	frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		//	FlowLayout은 그 도구를 가장 작은 크기로 만들므로
		//	도구의 실제 모양을 정확하게 볼수 있는 방법중 하나이다.
		
		String[] item = {"아이유", "송혜교", "한혜진", "김혜수", "황신애"};
		list = new JList(item);
		list.setVisibleRowCount(3);
		
		list.addListSelectionListener(new MyEvent03());
		//	나는 3개 정도만 보이게 크기를 만들고 싶다.
		
		//	★★
		//	특정 도구에 스크롤바가 필요하면 강제로 스크롤바를 만들어
		//	주어야 한다.
		JScrollPane	sp = new JScrollPane(list);
		
		//	컨테이너에는 리스트가 아닌 스크롤바가 들어가야 한다.
		//	왜냐하면 리스트 밖에 스크롤바를 입혀 놓았기 때문에
		//	스클로바가 들어가 스클로바 안쪽에 리스트가 같이 보인다.
		frame.add(sp);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new List01();
	}
	
	class MyEvent03 implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			//	할일
			//		선택한 항목 알아내기
			String	item = (String) list.getSelectedValue();
			//		화면에 출력하기
			System.out.println("선택 항목 = " + item);
			
			//	왜 2번 결과가 나오나요?
			//		이유
			//			선택되기 전에 한번 이벤트가 발생하고
			//			선택된 후에 다시 한번 이벤트가 발생하기 때문이다.
		}
	}
}





