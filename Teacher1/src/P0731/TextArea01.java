package P0731;
/*
 * 	문제
 * 
 * 		텍스트 에리어를 하나 만들고
 * 		아래쪽에 단추 두개를 만들어 놓는다.
 * 
 * 		간단한 메모장 만들어보자.
 * 		(저장하기와 불러오기가 가능한)
 */
import		java.io.*;
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class TextArea01 {
	JTextArea		area;
	JButton		openB, saveB;
	JFrame		frame;
	public TextArea01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		area = new JTextArea();
		//	팁
		//		스윙은 문자를 표현할때 모든 도구에서
		//		글꼴을 지정할 수 있다.
		//		글꼴 지정방법
		//		1.	글꼴을 만든다.
		//		Font	font = new Font("글꼴이름", 속성, 크기);
		//		2.	필요한 도구에 글꼴을 등록한다.
		//			등록 함수		setFont(font);
		//	속성
		//		PLAIN					일반글꼴
		//		BOLD					굵은체
		//		ITALIC					기울림체
		//		BOLC + ITALIC		썩은거
		
		Font	font = new Font("휴먼옛체", Font.PLAIN, 16);
		area.setFont(font);
		JScrollPane	sp = new JScrollPane(area);
		
		openB = new JButton("불러오기");
		saveB = new JButton("저장하기");
		
		MyEvent05		evt = new MyEvent05();
		openB.addActionListener(evt);
		saveB.addActionListener(evt);
		
		
		JPanel p = new JPanel();
		p.add(openB);
		p.add(saveB);
		
		frame.add("Center", sp);
		frame.add("South", p);
		
		frame.setSize(700,  700);
		frame.setVisible(true);
	}
	
	//	오픈을 위한 전용 함수
	void openProc() {
		//	우리가 전에 배웠던 스트림을 이용해서 파일을 불러와서
		//	준비된 영역(TextArea)에 출력하면 된다.
		//	1.	혹시 TextArea에 무슨 내용이 있을지 모르므로....
		//		지우자.
		area.setText("");
		FileInputStream	fin = null;
		try {
//			fin = new FileInputStream("D:\\수업설명\\Java\\0731설명.txt");
			//	나는 파일 선택 대화상자를 이용해서 
			//	원하는 파일을 선택하도록 할 예정이다.
			//	1.	파일 선택 대화상자를 화면에 출력하자.
			//		1)	JFileChooser 를 생성하고
			JFileChooser	fc = new JFileChooser();
			//		2)	showXXX()를 이용해서 화면에 출력한다.
			int	type = fc.showOpenDialog(frame);
			//			중요	??? 에 들어갈 내용
			//					이 대화상자를 출력하기 위한 아버지 
			//					컨테이너를 입력한다.(Frame)
			
			//	참고	반환값의 의미
			//			이 파일 선택 대화상자를 닫을텐데...
			//			대화상자를 닫게한 단추의 종류가 반환된다.
			//		왜 중요하냐
			//		선택한 단추의 종류에 따라서 작업 내용이 달라지기
			//		때문이다.
			//			JFileChooser.CANCEL_OPTION		취소
			//			JFileChooser.APPROVE_OPTION		열기
			//			JFileChooser.ERROR_OPTION			x 단추
			if(type != JFileChooser.APPROVE_OPTION) {
				//	이 말은 취소, x 단추를 눌렀다는 말이므로
				//	불러오기 작업을 하면 안된다.
				return;	//	함수를 더이상 진행하지 말고 끝내세요.
			}
			//	이제 제대로 선택을 한것이므러
			//	1.	선택한 파일을 알아내자.
			File		file = fc.getSelectedFile();
			//	2.	스트림 열자
			fin = new FileInputStream(file);
			
			while(true) {
				byte[]	buff = new byte[256];
				int		len = fin.read(buff);
				if(len == -1) {
					break;
				}
				String str = new String(buff, 0, len);
				area.append(str);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				fin.close();
			}
			catch(Exception e) {}
		}
	}
	//	저장을 위한 전용 함수
	void saveProc() {
		//	할일
		//		1.	TextArea에 입력된 내용을 알아낸다.
		String	data = area.getText();
		
		//		2.	그 내용을 스트림을 이용해서 파일에 저장한다.
		FileOutputStream fout = null;
		try {
			//	파일 선택 대화상자를 이용해서 저장할 파일 이름을
			//	알아내고 그 이름으로 저장하도록 하자.
			//	1.	파일 선택 대화상자를 화면에 보여준다.
			//		1)		new 시킨다.
			JFileChooser		fc = new JFileChooser();
			//		2)		showXXX()를 이용해서 출력한다.
			int	type = fc.showSaveDialog(frame);
			//	파라메터		아버지 컨테이너(이 대화상자를 
			//					화면에 출력하기 위한 먼저 존재하는 화면)
			//	반환값		이 대화상자가 화면에서 사라지는 순간
			//				어느 단추를 이용해서 화면에서 사라지게
			//				했는지 그 단추의 종류가 반환된다.
			//			JFileChooser.CANCEL_OPTION		취소
			//			JFileChooser.APPROVE_OPTION		저장
			//			JFileChooser.ERROR_OPTION			x 단추
			if(type != JFileChooser.APPROVE_OPTION) {
				//	이것은 작업을 취소한 것이다.
				//	작업을 중지한다.
				return;
			}
			//	제대로 선택되었는데요?
			//	선택한 파일의 정보를 알아내고
			File		file = fc.getSelectedFile();
			
			//	선택한 파일로 스트림을 개설한다.
			fout = new FileOutputStream(file);
			
			//	byte[]로 변환해서
			byte[]	temp = data.getBytes();
			//	스트림으로 기록한다.
			fout.write(temp);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				fout.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new TextArea01();
	}
	//	단추 두개에 이벤트를 걸어야 한다.
	//	이번에는 클래스 한개를 이용해서 두 단추 모두 처리하도록 한다.
	class MyEvent05 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	이 함수는 JVM이 이벤트가 발생하면 자동 호출하는 함수이다.
			//	이때 JVM은 발생한 이벤트의 정보를
			//	ActionEvent e에게 알려준다.
			//	예>		이벤트가 발생한 좌표, 마우스 클릭 회수,..
			//	
			//	그러므로 우리는 이 정보를 분석해서 이벤트가 일어난
			//	상황을 알 수 있게 된다.
			//	가장 중요한 상황		이벤트가 일어난 도구
			//			함수		getSource();
			JButton	target = (JButton) e.getSource();
			
			if(target == openB) {
				//	보나마다 Open 단추에서 이벤트가 일어난 것이다.
				//	할일이 좀 많으므로.... 함수로 따로 만들자.
				openProc();
			}
			else if(target == saveB) {
				//	보나마다 Save 단추에서 이벤트가 일어난 것이다.
				saveProc();
				//	함수의 위치는 내부 클래스는 자신것도 사용하고
				//	바깥것도 사용할 수 있으므로.. 아무데나 만들어라...
			}
		}
	}
}





