package P0710;
/*
 * 	������ �ϳ� ����� ���� 2���� ���� ���߸� Ŭ���غ���.
 * 
 * 	���߸� ������ �̺�Ʈ�� �߻��ϸ� JVM�� ������ 
 * 	actionPerformed()�� ȣ���Ѵ�.
 * 
 */
import		java.awt.*;
import		java.awt.event.*;
public class Test03 {
	public static void main(String[] args) {
		Frame		f = new Frame();
		Button		b1 = new Button("1�� ����");
		Button		b2 = new Button("2�� ����");
		
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
		System.out.println("�� ����ǿ�?");
		//	��� �� �ȿ��� �ϰ���� ���� ����ڰ� ���ؾ� �� ���̴�.
	}
}





