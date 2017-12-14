package P0731;
/*
 * 	화면에 컨테이너 하나를 만들고
 * 	그 안에서 오른쪽 단추를 누르면 팝업 메뉴가 나오게 하자.
 */
import		java.awt.*;
import		javax.swing.*;
import		java.awt.event.*;
public class Popup01 {
	JFrame		frame;
	JPopupMenu	pop;
	public Popup01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addMouseListener(new PopEvent01());		
		//	필요한 도구 있으면 만들면 되고.......
		
		
		//	파업 메뉴를 만들자.
		JMenuItem		newM = new JMenuItem("새문서");
		JMenuItem		openM = new JMenuItem("불러오기");
		JMenuItem		saveM = new JMenuItem("저장하기");
		JMenuItem		exitM = new JMenuItem("종료하기");
		
//		JMenu			fileM = new JMenu("파일");
//		fileM.add(newM);
//		fileM.add(openM);
//		fileM.add(saveM);
//		fileM.addSeparator();
//		fileM.add(exitM);

		//	마지막은 JPopupMenu  클래스에 넣는다.
		pop = new JPopupMenu();
//		pop.add(fileM);
		pop.add(newM);
		pop.add(openM);
		pop.add(saveM);
		pop.addSeparator();
		pop.add(exitM);
		
		//	아직까지 팝업 메뉴가 화면에 나온것은 아니다.

		frame.setSize(500,  500);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Popup01();
	}

	//	팝업 메뉴를 출력하기 위해서 마우스 이벤트를 처리해야 한다.
	class PopEvent01 implements MouseListener {
		//	인터페이스를 이용했으면 그 인터페이스 안에 있는
		//	모든 함수를 오버라이드해야 한다.
		public void mouseClicked(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			//	팝업창은 마우스에서 손을 뗄데 나오게 된다.
			//	팝업 상자가 나타날 준비가 되었니? 라고 묻는 함수이다.
			
			//	팝업메뉴는 오직 왼쪽 단추를 누를때만 나와야 하고
			//	이미 팝업메뉴가 존재하면 나오면 안되므로...
			//	이 모든것을 알아서 검사하는 함수가 isPopupTrigger()이다. 
			if(e.isPopupTrigger()) {
				//	팝업 상자가 나타날 위치는 마우스를 누른 위치이므로
				//	이것은 이벤트 정보(MouseEvent e) 이 알려준다.
				pop.show(frame, e.getX(), e.getY());
			}
		}
	}
}





