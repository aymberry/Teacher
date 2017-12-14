package P0731;
/*
 * 	문제
 * 		한개의 텍스트 필드를 만들어서 아래로 배치하고
 * 		한개의 목록상자를 만들어서 위쪽에 배치하고
 * 		아래쪽에 입력상자에 내용을 입력한 후 엔터키를 치면
 * 		그 내용이 목록상자에 나오도록 하자.
 */
import		java.util.*;
import		javax.swing.*;
import		java.awt.event.*;
public class TextField01 extends JFrame {
	Vector		v;	//	목록상자에 데이터를 입력하려면
					//	한개씩은 안되고 벡터나 배열에 모아서 한번에 
					//	해야 하므로... 항목을 기억할 변수
	JList			list;
	JTextField		field;
	public TextField01() {
		//	1.	컨테이너 준비
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//	2.	배치전략 세우고
		//		BorderLayout으로 할 예정이므로 한해도 된다.
		//	3.	도구 준비하고
		v = new Vector();
		list = new JList(v);
		JScrollPane sp = new JScrollPane(list);
		list.setVisibleRowCount(5);
		
		field = new JTextField();
		//	이벤트 등록을 한다.
		field.addActionListener(new FieldEvent01());
		
		this.add("North", sp);
		this.add("South", field);
		
		//	4.	화면에 출력한다.
		this.setSize(400, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new TextField01();
	}
	class FieldEvent01 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	할일
			//	1.	텍스트 필드에 입력한 내용 알아내자.
			String		data = field.getText();
			
			//	2.	리스트에 넣자
			//		리스트에는 항목을 한개씩 추가할 수 없다.
			//		벡터나 배열에 추가할 항목을 기억한 후
			//		그것을 이용한다.
			//	즉, 벡터나 배열에 목록 상자에 들어갈 내용을 추가
			//	삭제하여 조절한 후 그것을 통채로 넣는다.
			v.add(data);
			list.setListData(v);
		}
	}
}



