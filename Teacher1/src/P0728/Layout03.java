package P0728;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 	���� 5���� BorderLayout�� ��ġ����.
 */
public class Layout03 {
	public Layout03() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton	b1 = new JButton("�����Ⱑ");
		JButton	b2 = new JButton("���ܿ�");
		JButton	b3 = new JButton("���Ƕ�����");
		JButton	b4 = new JButton("������ ����");
		JButton	b5 = new JButton("�����帮�츮��.");

		BorderLayout	lay = new BorderLayout();
		f.setLayout(lay);
		
//		f.add("North", b1);
//		f.add(b2, "South");
//		f.add(BorderLayout.EAST, b3);
		f.add(b4, BorderLayout.WEST);
//		f.add(b5);	//	Center
		//	���� ��ġ�� �����ϸ� �ڵ����� Center�� �����ȴ�.
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Layout03();
	}
}




