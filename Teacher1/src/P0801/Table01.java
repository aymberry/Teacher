package P0801;
/*
 * 	문제
 * 
 * 		엑셀처럼 표를 만들어서 그 안에 데이터를 입력해보자.
 */
import		javax.swing.*;
public class Table01 {
	public Table01() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//	각칸의 제목을 1차 배열로 만든다.
		String[] title = {"이름", "전화번호", "나이", "주소"};
		//	각칸에 들어갈 실제 데이터를 2차 배열로 만든다.
		String[][] data = {{"홍길동", "010-1111-2222", "24", "서울시 구로구"}, 
							{"박아지", "010-2222-3333", "32", "서울시 금천구"}, 
							{"장독대", "010-3333-4444", "27", "서울시 동작구"}};

		//	위의 2개의 데이터를 이용해서 JTable을 만든다.
		JTable table = new JTable(data, title);
		//	이것 역시 스크롤바가 없으므로 강제로 만든다.
		JScrollPane sp = new JScrollPane(table);
		
		f.add(sp);
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Table01();
	}
}




