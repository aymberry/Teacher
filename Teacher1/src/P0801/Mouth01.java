package P0801;
/*
 * 	����
 * 		�����̳� �ȿ� �г��� �ΰ� ��ġ�ϰ�
 * 
 * 		������ �гο� ���콺 �����Ͱ� ���� ������ ���� ������
 * 		�ٲٵ��� �ϰ�ʹ�.
 */
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class Mouth01 {

	public Mouth01() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(1, 2));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		MouthEvent01		evt = new MouthEvent01();
		p1.addMouseListener(evt);
		p2.addMouseListener(evt);
		
		f.add(p1);
		f.add(p2);
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Mouth01();
	}
//	class MouthEvent01 implements MouseListener {
	class MouthEvent01 extends MouseAdapter {
//		public void	mouseClicked(MouseEvent e) {}
		//	���콺 �����Ͱ� ������ ���� �����ϴ� �Լ�
		public void	mouseEntered(MouseEvent e) {
			//	����
			//		�̺�Ʈ�� �߻��� ������ �˾Ƴ���.
			JPanel		target = (JPanel) e.getSource();
			//		�� �г��� ������ ��������.
			target.setBackground(Color.red);
		}
		//	���콺 �����Ͱ� ������ ������ �����ϴ� �Լ�
		public void	mouseExited(MouseEvent e) {
			JPanel	target = (JPanel) e.getSource();
			target.setBackground(Color.green);
		}
//		public void	mousePressed(MouseEvent e) {}
//		public void	mouseReleased(MouseEvent e) {}
	}
	
	
	
	
}







