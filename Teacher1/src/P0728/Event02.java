package P0728;
/*
 * 	����
 * 		���߸� �ϳ� ����� ���߸� ���������� ������ ������ �����ϰ� �ʹ�.
 */
import		javax.swing.*;
import 	java.awt.*;
import		java.awt.event.*;

public class Event02 {
	JButton	b = new JButton("������");
	//	������ �������� ����� ������ �������� ���峪��?
	//	��
	//		�� ������ �ٸ������� ����� �ʿ䰡 ������ �������� ����
	//		�ٸ� ������ ������� ������ �������� ����� �ȴ�.
	
	public Event02() {
		JFrame		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	4�ܰ�
		//		�̺�Ʈ�� ���ϴ� ������ �ݵ�� ��ϵǾ�� �Ѵ�.
		b.addActionListener(new MyEvent02());
		
		//	��ġ������ �����Ǿ����Ƿ� BorderLayout�� �Ǿ���
		//	��ġ�� ���������Ƿ� Center�� �� ���̴�.
		
		f.add(b);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Event02();
	}
	//	�����δ� �̺�Ʈ Ŭ������ 90%�� ���� Ŭ������ ����°���
	//	����.
	class MyEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	�̰����� ������ �ٲٰ� �ʹ�.
			
			//	������ ������ ��
			int		red = (int)(Math.random() * 256);
			int		green = (int)(Math.random() * 256);
			int		blue = (int)(Math.random() * 256);
			
			Color color = new Color(red, green, blue);
			
			b.setBackground(color);	
		}
	}
}













