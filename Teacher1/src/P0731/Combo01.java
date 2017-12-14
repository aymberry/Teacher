package P0731;
/*
 * 	문제
 * 		콤보상자를 2개 만들어서 위 아래로 배치하고
 * 
 * 		위쪽 콤보상자에서 선택하면 그 내용이 아래쪽 콤보상자에
 * 		추가되도록 해보자.
 */
import		javax.swing.*;
import		java.awt.event.*;
import		java.util.*;
public class Combo01 extends JFrame {
	//	이렇게 하면 내가 만든 클래스가 곧 Frame의 역활도 담당하게 된다.
	JComboBox		upBox, downBox;
	public Combo01() {
		//	이미 이 클래스가 JFrame이므로 JFrame을 안만들어도
		//	그 역활을 하게 된다.
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		Vector	v = new Vector();
		v.add("최순실");
		v.add("박근혜");
		v.add("김기춘");
		v.add("우명우");
		v.add("정유라");
		
		upBox = new JComboBox(v);
		downBox = new JComboBox();
		
		//	이벤트는 등록된 도구만 실행되어진다.
		upBox.addActionListener(new MyEvent02());
		
		this.add("North", upBox);
		this.add("South", downBox);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Combo01();
	}

	class MyEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	할일
			//		위쪽에서 선택한 항목을 알아내서
			String item = (String) upBox.getSelectedItem();
			//		그 내용을 아래쪽 콤보상자에 입력한다.
			downBox.addItem(item);
		}
	}
}



