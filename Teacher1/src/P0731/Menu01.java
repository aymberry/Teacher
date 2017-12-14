package P0731;
import		javax.swing.*;

import java.awt.Event;
import		java.awt.event.*;
public class Menu01 {
	public Menu01() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	�ܸ��޴��� �����.
		JMenuItem		newM = new JMenuItem("������");
		JMenuItem		openM = new JMenuItem("�ҷ�����");
		JMenuItem		saveM = new JMenuItem("�����ϱ�");
		
		JMenuItem		exitM = new JMenuItem("�����ϱ�");
		exitM.addActionListener(new MentEvent01());
		//	�� 
		//	����Ű �����
		//	����Լ�				setAccelerator()
		KeyStroke ks = KeyStroke.getKeyStroke('X', 
			Event.CTRL_MASK ^ Event.SHIFT_MASK ^ Event.ALT_MASK);
		exitM.setAccelerator(ks);
		
		JMenuItem		smallM = new JMenuItem("�۰�");
		JMenuItem		largeM = new JMenuItem("ũ��");
		JMenuItem		redM = new JMenuItem("������");
		JMenuItem		greenM = new JMenuItem("�ʷϻ�");
		JMenuItem		blueM = new JMenuItem("�Ķ���");
		
		//	���� �޴��� �����.
		JMenu			fileM = new JMenu("����");
		JMenu			editM = new JMenu("����");
		JMenu			fontM = new JMenu("�۲�");
		JMenu			colorM = new JMenu("����");
		
		//	���� �޴��� ���� �޴��� ����Ѵ�.
		//		�Լ�		add()
		fileM.add(newM);
		fileM.add(openM);
		fileM.add(saveM);
		fileM.addSeparator();			//	������
		fileM.add(exitM);
		editM.add(fontM);
		editM.add(colorM);
		fontM.add(smallM);
		fontM.add(largeM);
		colorM.add(redM);
		colorM.add(greenM);
		colorM.add(blueM);
		
		//	�޴��ٸ� �����.
		JMenuBar	bar = new JMenuBar();
		//	�޴��ٿ� �ֻ��� �޴��� ���δ�.
		//		�Լ�		add();
		bar.add(fileM);
		bar.add(editM);
		
		//	�����̳ʿ� �޴��ٸ� ���δ�.
		//		�Լ�		setJMenuBar();
		f.setJMenuBar(bar);
		
		//	������ ������ �����.....
		
		//	�����̳ʸ� ȭ�鿡 ������.
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Menu01();
	}
	
	class MentEvent01 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	���� ����޴��� ����ϴ� ���� �̺�Ʈ Ŭ������� �����ϰ�
			System.exit(0);
		}
	}
	
}




