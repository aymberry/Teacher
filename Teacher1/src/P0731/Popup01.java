package P0731;
/*
 * 	ȭ�鿡 �����̳� �ϳ��� �����
 * 	�� �ȿ��� ������ ���߸� ������ �˾� �޴��� ������ ����.
 */
import		java.awt.*;
import		javax.swing.*;
import		java.awt.event.*;
public class Popup01 {
	JFrame		frame;
	JPopupMenu	pop;
	public Popup01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addMouseListener(new PopEvent01());		
		//	�ʿ��� ���� ������ ����� �ǰ�.......
		
		
		//	�ľ� �޴��� ������.
		JMenuItem		newM = new JMenuItem("������");
		JMenuItem		openM = new JMenuItem("�ҷ�����");
		JMenuItem		saveM = new JMenuItem("�����ϱ�");
		JMenuItem		exitM = new JMenuItem("�����ϱ�");
		
//		JMenu			fileM = new JMenu("����");
//		fileM.add(newM);
//		fileM.add(openM);
//		fileM.add(saveM);
//		fileM.addSeparator();
//		fileM.add(exitM);

		//	�������� JPopupMenu  Ŭ������ �ִ´�.
		pop = new JPopupMenu();
//		pop.add(fileM);
		pop.add(newM);
		pop.add(openM);
		pop.add(saveM);
		pop.addSeparator();
		pop.add(exitM);
		
		//	�������� �˾� �޴��� ȭ�鿡 ���°��� �ƴϴ�.

		frame.setSize(500,  500);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Popup01();
	}

	//	�˾� �޴��� ����ϱ� ���ؼ� ���콺 �̺�Ʈ�� ó���ؾ� �Ѵ�.
	class PopEvent01 implements MouseListener {
		//	�������̽��� �̿������� �� �������̽� �ȿ� �ִ�
		//	��� �Լ��� �������̵��ؾ� �Ѵ�.
		public void mouseClicked(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			//	�˾�â�� ���콺���� ���� ���� ������ �ȴ�.
			//	�˾� ���ڰ� ��Ÿ�� �غ� �Ǿ���? ��� ���� �Լ��̴�.
			
			//	�˾��޴��� ���� ���� ���߸� �������� ���;� �ϰ�
			//	�̹� �˾��޴��� �����ϸ� ������ �ȵǹǷ�...
			//	�� ������ �˾Ƽ� �˻��ϴ� �Լ��� isPopupTrigger()�̴�. 
			if(e.isPopupTrigger()) {
				//	�˾� ���ڰ� ��Ÿ�� ��ġ�� ���콺�� ���� ��ġ�̹Ƿ�
				//	�̰��� �̺�Ʈ ����(MouseEvent e) �� �˷��ش�.
				pop.show(frame, e.getX(), e.getY());
			}
		}
	}
}





