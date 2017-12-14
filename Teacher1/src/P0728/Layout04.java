package P0728;
import java.awt.Cursor;

/*
 * 	��ġ���� ���� ������ �Է��� ���
 * 
 * 	����		���� 2���� ���ϴ� ��ġ�� �Է��� ����.
 */
import		javax.swing.*;
public class Layout04 {
	public Layout04() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//	��
		//		�����̳��� ũ�⸦ �������� ���ϰ� �����ϴ� ���
		f.setResizable(false);
		//	�����е��� ������ ������ ����� ���鼭
		//	�ʿ��� ����� ������ ã�Ƽ� ���θ� �ϱ� �ٶ���.
		
		//	��
		//		���콺 Ŀ�� ��� �ٲٱ�
		//		setCursor()�� �̿��ؼ� �ٲٸ� �Ǵµ�...
		//		�ٲ� ����� Cursor Ŭ������ �غ�Ǿ� �ִ�.
		f.setCursor(Cursor.HAND_CURSOR);
		
		
		//	���� ��ġ������ ������� �ʱ⸦ ���ϸ�
		//	�����ϸ� �ȵǰ�  null�� �Է��ؾ� �Ѵ�.
		f.setLayout(null);
		//	��ó�� ��ġ������ ���� �����̳ʿ� ������ �Է��� ��쿡��
		//	�� ������ ��ġ�� ��Ҹ� ��Ȯ�� �����ϰ�
		//	������ ũ�⸦ ��Ȯ�� �����ؼ� �Է��ؾ� �Ѵ�.
		//		����Լ�	setBounds()
		//			�Ķ����	1	��ġ�� x��ǥ��
		//						2	��ġ�� y��ǥ��
		//						3	������ ���� ũ��
		//						4	������ ���� ũ��
		JButton	b1 = new JButton("1�� ����");
		b1.setBounds(50, 30, 200, 30);
		
		JButton	b2 = new JButton("2�� ����");
		b2.setBounds(300, 400, 100, 50);
		
		f.add(b1);
		f.add(b2);
		
		f.setSize(500,  500);
		f.setVisible(true);

	}
	public static void main(String[] args) {
		new Layout04();
	}
}


