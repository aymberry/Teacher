package P0728;
import java.awt.Cursor;

/*
 * 	배치전략 없이 도구를 입력한 방법
 * 
 * 	문제		단추 2개를 원하는 위치에 입력해 놓자.
 */
import		javax.swing.*;
public class Layout04 {
	public Layout04() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//	팁
		//		컨테이너의 크기를 조절하지 못하게 방지하는 방법
		f.setResizable(false);
		//	여러분들이 앞으로 뭔가를 만들어 보면서
		//	필요한 기능이 있으면 찾아서 공부를 하기 바란다.
		
		//	팁
		//		마우스 커서 모양 바꾸기
		//		setCursor()를 이용해서 바꾸면 되는데...
		//		바꿀 모양은 Cursor 클래스에 준비되어 있다.
		f.setCursor(Cursor.HAND_CURSOR);
		
		
		//	만약 배치전략을 사용하지 않기를 원하면
		//	생략하면 안되고  null로 입력해야 한다.
		f.setLayout(null);
		//	이처럼 배치전략이 없는 컨테이너에 도구를 입력할 경우에는
		//	그 도구가 위치할 장소를 명확히 지정하고
		//	도구의 크기를 명확히 지정해서 입력해야 한다.
		//		사용함수	setBounds()
		//			파라메터	1	위치할 x좌표값
		//						2	위치할 y좌표값
		//						3	도구의 가로 크기
		//						4	도그의 세로 크기
		JButton	b1 = new JButton("1번 단추");
		b1.setBounds(50, 30, 200, 30);
		
		JButton	b2 = new JButton("2번 단추");
		b2.setBounds(300, 400, 100, 50);
		
		f.add(b1);
		f.add(b2);
		
		f.setSize(500,  500);
		f.setVisible(true);

	}
	public static void main(String[] args) {
		new Layout04();
	}
}


