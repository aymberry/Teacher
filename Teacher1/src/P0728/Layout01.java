package P0728;
/*
 * 	���� 3���� ������ ����.
 */
import		javax.swing.*;
import		java.awt.*;	//	��ġ���� Ŭ���� ����� ���ؼ�
public class Layout01 {
	public Layout01() {
		//	1.	�����̳ʸ� �����.
		JFrame	f = new JFrame("��ġ���� ����");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	2.	�ʿ��� ���� �����.
		JButton b1 = new JButton("1�� ����");
		JButton b2 = new JButton("2�� ����");
		JButton b3 = new JButton("3�� ����");
		
		//	3.	��ġ������ �����.
		FlowLayout	lay = new FlowLayout(FlowLayout.CENTER, 20, 20);
		f.setLayout(lay);
		
		//	4.	�����̳ʿ� ������ �ִ´�.
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		//	5.	ȭ�鿡�� �����̳ʸ� ����Ѵ�.
		f.setSize(500,  500);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Layout01();
	}
}


