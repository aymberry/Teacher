package P0731;
import		javax.swing.*;

import java.awt.Event;
import		java.awt.event.*;
public class Menu01 {
	public Menu01() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	단말메뉴를 만든다.
		JMenuItem		newM = new JMenuItem("새문서");
		JMenuItem		openM = new JMenuItem("불러오기");
		JMenuItem		saveM = new JMenuItem("저장하기");
		
		JMenuItem		exitM = new JMenuItem("종료하기");
		exitM.addActionListener(new MentEvent01());
		//	팁 
		//	단축키 만들기
		//	사용함수				setAccelerator()
		KeyStroke ks = KeyStroke.getKeyStroke('X', 
			Event.CTRL_MASK ^ Event.SHIFT_MASK ^ Event.ALT_MASK);
		exitM.setAccelerator(ks);
		
		JMenuItem		smallM = new JMenuItem("작게");
		JMenuItem		largeM = new JMenuItem("크게");
		JMenuItem		redM = new JMenuItem("빨간색");
		JMenuItem		greenM = new JMenuItem("초록색");
		JMenuItem		blueM = new JMenuItem("파란색");
		
		//	상위 메뉴를 만든다.
		JMenu			fileM = new JMenu("파일");
		JMenu			editM = new JMenu("편집");
		JMenu			fontM = new JMenu("글꼴");
		JMenu			colorM = new JMenu("색상");
		
		//	하위 메뉴를 상위 메뉴에 등록한다.
		//		함수		add()
		fileM.add(newM);
		fileM.add(openM);
		fileM.add(saveM);
		fileM.addSeparator();			//	밑줄쫙
		fileM.add(exitM);
		editM.add(fontM);
		editM.add(colorM);
		fontM.add(smallM);
		fontM.add(largeM);
		colorM.add(redM);
		colorM.add(greenM);
		colorM.add(blueM);
		
		//	메뉴바를 만든다.
		JMenuBar	bar = new JMenuBar();
		//	메뉴바에 최상위 메뉴를 붙인다.
		//		함수		add();
		bar.add(fileM);
		bar.add(editM);
		
		//	컨테이너에 메뉴바를 붙인다.
		//		함수		setJMenuBar();
		f.setJMenuBar(bar);
		
		//	나머지 도구를 만들고.....
		
		//	컨테이너를 화면에 보이자.
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Menu01();
	}
	
	class MentEvent01 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	오직 종료메뉴만 사용하는 전용 이벤트 클래스라고 가정하고
			System.exit(0);
		}
	}
	
}




