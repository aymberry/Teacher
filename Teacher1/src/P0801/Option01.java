package P0801;
/*
 * 	화면에 단추 하나를 만들고 누르면 각종 대화상자를 출력해 보자.
 */
import		javax.swing.*;
import		java.awt.event.*;
public class Option01 {
	JFrame	f; 
	public Option01() {
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton	b = new JButton("눌러봐");
		b.addActionListener(new ButtonEvent01());
		f.add(b);
		
		f.setSize(300,  300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Option01();
	}
	void comfirm() {
		//	comfirm 대화상자를 보여주자.
		//	1.	showConfirmDialog(Component parentComponent, Object message)
	//	int	type = JOptionPane.showConfirmDialog(f, "확인하세요");
		
//		int	type = JOptionPane.showConfirmDialog(f, "확인하세요", 
//				"확인", JOptionPane.OK_CANCEL_OPTION);
		
//		int	type = JOptionPane.showConfirmDialog(f, "확인하세요", 
//				"확인", JOptionPane.OK_CANCEL_OPTION, 
//				JOptionPane.ERROR_MESSAGE);

		ImageIcon	img = new ImageIcon("src/P0801/sam.png");
		int	type = JOptionPane.showConfirmDialog(f, "확인하세요", 
		"확인", JOptionPane.OK_CANCEL_OPTION, 
		JOptionPane.ERROR_MESSAGE, img);
		
		//	참고	반환값의 의미
		//			이 대화상자를 닫게 만든 단추의 종류
		//			CANCEL_OPTION		취소 단추
		/* 			CLOSED_OPTION		x 단추
		 * 			DEFAULT_OPTION
		 * 			NO_OPTION			아니오
		 * 			OK_OPTION			확인
		 * 			YES_OPTION			예
		 */
		if(type == JOptionPane.OK_OPTION) {
			System.out.println("확인 단추");
		}
		else if(type == JOptionPane.CANCEL_OPTION) {
			System.out.println("취소 단추");
		}
		
	}
	void input() {
//		String data = JOptionPane.showInputDialog(f, "이름이 뭐예요?");
		
//		String data = JOptionPane.showInputDialog(f, "이름이 뭐예요?", "무명씨");
		
		String[] items = {"홍길동", "박아지", "장독대", "이기자", "김치국"};
		
		String data = (String)JOptionPane.showInputDialog(f, "이름이 뭐예요?", 
				"제목", JOptionPane.ERROR_MESSAGE, null, items, "이기자");
	
		//	반환값의 의미
		//		입력한 내용을 반환한다.
	}
	void message() {
		JOptionPane.showMessageDialog(f, "가입완료 축하", "가입", 
				JOptionPane.INFORMATION_MESSAGE, null);
	}
	void option() {
		String[] title = {"아이유", "송혜교", "한효주"};
		
		int type = JOptionPane.showOptionDialog(f, "좋아하는 연예인", 
				"적당히", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, null, title, "아이유");
	}
	class ButtonEvent01 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	단추가 눌려지면 4가지 종류의 대화상자를 하나씩 보여주자.
//			comfirm();
//			input();
//			message();
			option();
		}
	}
}






