package P0728;
/*
 * 	단추를 하나 만들고 그 단추를 클릭하면 7단 구구단을 출력하도록 하자.
 */
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class Event01 {
	public Event01() {
		JFrame	f = new JFrame("이벤트 연습");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton	b = new JButton("눌러봐");
		//	★★★
		//	나는 단추를 클릭했을때 이벤트를 실행하고 싶으면
		//	이벤트 실행을 원하는 도구에 이벤트 등록을 해야 한다.
		b.addActionListener(new MyEvnet());
		
		FlowLayout lay = new FlowLayout();
		f.setLayout(lay);
		
		f.add(b);
		
		f.setSize(400, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Event01();
	}
}
//	이벤트 처리를 하고자 하면
//		어떤 함수가 실행되는지를 파악한다.
//		단추를 클릭하는 이벤트를 이용할 예정이므러....
//			actionPerformed()가 사용된다.
//		이 함수가 어떤 경청자 인터페이스 소속인지를 알아낸다.
//		우리는 ActionListener를 이용하게 된다.

//	1.	선택한 경청자 인터페이스를 이용한 클래스를 제작한다.
class MyEvnet implements ActionListener {
	//	2.	그 인터페이스가 가진 함수를 오버라이드 한다.
	public void actionPerformed(ActionEvent e) {
		//	3.	실행 함수 안에서 필요한 작업을 처리한다.
		int		dan = 7;
		for(int i = 1; i <= 9; i++) {
			int	temp = dan * i;
			System.out.println(dan + " * " + i + " = " + temp);
		}
	}
}














