package P0731;
/*
 * 	3���� üũ���ڸ� �����
 * 	������ ���߸� ������ ȭ���� ������ �����ϵ��� ����.
 */
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class Check01 {
	JFrame		frame;
	JCheckBox		box1, box2, box3;
	public Check01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	FlowLayout���� �Ϸ��� �Ѵ�.
		frame.setLayout(new FlowLayout());
		//	������ ������ ��� ������ �׳� new ��Ű����?
		//	�� ������ �ٽ� ����� �ʿ䰡 ������ ������ ��Ƴ���
		//	������ �ٽ� ����� �ʿ䰡 ������ �׳� new ��Ű�� �ȴ�.
		
		//	������ ������.
		box1 = new JCheckBox("������", true);
		box2 = new JCheckBox("�ʷϻ�", true);
		box3 = new JCheckBox("�Ķ���", true);
		//	�ƹ��� �̺�Ʈ Ŭ������ �� ������
		//	�ڹٴ� ��ϵ��� ���� �̺�Ʈ�� ����� �� ����.
		MyEvent01		evt = new MyEvent01();
		box1.addItemListener(evt);
		box2.addItemListener(evt);
		box3.addItemListener(evt);
		
		//	�����̳ʿ� ����
		frame.add(box1);
		frame.add(box2);
		frame.add(box3);
		
		//	ȭ�鿡 ���� �ʿ䰡 �ִ� ������
		//	ȭ�鿡�� �����̳ʸ� �����ش�.
		frame.setSize(400,  400);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Check01();
	}
	//	���� Ŭ������ �̺�Ʈ�� ó���� Ŭ������ ������.
	//	��? ���� Ŭ������ �����?
	//		�̺�Ʈ�� �߻��ϸ� �� ���� ���ؼ� �۾��� ���� �ϴ� ��찡
	//		�����Ƿ�...
	//		���� Ŭ������ ����� �ƹ��� ������� �ٱ��� ��� �����
	//		�����Ӱ� ����� �� �ֱ� �����̴�.
	class MyEvent01 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			//	�� �Լ� �ȿ��� �ʿ��� �۾��� �����Ѵ�.
			//	����
			//		3���� üũ������ ���� ���θ� �ľ��ؼ�....
			boolean	red = box1.isSelected();
			boolean	green = box2.isSelected();
			boolean	blue = box3.isSelected();
			//		���ϴ� ������ �����
			int		redC = 0;
			int		greenC = 0;
			int		blueC = 0;	
			if(red == true) {
				redC = 255;
			}
			if(green == true) {
				greenC = 255;
			}
			if(blue == true) {
				blueC = 255;
			}
			Color c = new Color(redC, greenC, blueC);
			//	��
			//		���� �����ϴ� ���
			//		1.	�̹� ������ ���� �̸� �̿��ϴ� ���
			//			��>		Color.WIHTE
			//		2.	���ϴ� ������ ���� ����ϴ� ���
			//			�̶���  RGB �������� �����ؼ� ����Ѵ�.
			//			������ ������ 0~255������ ���ڷ� �����Ѵ�.
			//			��>		new Color(255, 0, 0);		//	 ������
			
			//		�� ������ Frame�� ĥ�Ѵ�.
			//		����	AWT�� Frame�� ������ ĥ�� �� �ִ�.
			//				Swing�� ĥ�� �� ����.
			//			�ֳ��ϸ� Swing�� JFrame�� �ΰ����� �Ǿ��ֱ� �����̴�.
			//		�ذ� ���
			//			Swing������ ���ʿ� �ִ� Frame�� ã�Ƽ� �ű⿡
			//			������ ĥ�ؾ� �Ѵ�.
			//			==>		�Լ� : getContentPane() 
			frame.getContentPane().setBackground(c);
		}
	}

}









