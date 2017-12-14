package P0710;
/*
 * 	윈폼을 하나 만들고 단추 2개를 만들어서 단추를 클릭해보자.
 * 
 * 	단추를 누르는 이벤트가 발생하면 JVM은 무조건 
 * 	actionPerformed()를 호출한다.
 * 
 */
import		java.awt.*;
import		java.awt.event.*;
public class Test03 {
	public static void main(String[] args) {
		Frame		f = new Frame();
		Button		b1 = new Button("1번 단추");
		Button		b2 = new Button("2번 단추");
		
		MyEvent	evt = new MyEvent();
		b1.addActionListener(evt);
		b2.addActionListener(evt);
		
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
}

class MyEvent implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("나 실행되요?");
		//	고로 이 안에서 하고싶은 일은 사용자가 정해야 할 것이다.
	}
}





