package P0728;
/*
 * 	ȭ�鿡 ���� �ϳ��� ���� Frame�� ����� ����.
 */
import		javax.swing.*;
public class Button01 {
	public Button01() {
		//	���� �����̳ʴ� �Ѱ��̻� �����ؾ� �Ѵ�.
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	�����̳� �ȿ� ���� ������ �غ��Ѵ�.
//		JButton	b = new JButton("������");
		ImageIcon	img = new ImageIcon("src/P0728/abc.jpg");
		JButton	b = new JButton(img);
		//	������ �ݵ�� �����̳� �ȿ� ��ܾ� �Ѵ�.
		f.add(b);
		
		//	ȭ�鿡�� �����̳ʰ� �������� �Ѵ�.
		f.setSize(300,  300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Button01();
	}
}
