package P0728;
/*
 * 	���߸� �ϳ� ����� �� ���߸� Ŭ���ϸ� 7�� �������� ����ϵ��� ����.
 */
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class Event01 {
	public Event01() {
		JFrame	f = new JFrame("�̺�Ʈ ����");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton	b = new JButton("������");
		//	�ڡڡ�
		//	���� ���߸� Ŭ�������� �̺�Ʈ�� �����ϰ� ������
		//	�̺�Ʈ ������ ���ϴ� ������ �̺�Ʈ ����� �ؾ� �Ѵ�.
		b.addActionListener(new MyEvnet());
		
		FlowLayout lay = new FlowLayout();
		f.setLayout(lay);
		
		f.add(b);
		
		f.setSize(400, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Event01();
	}
}
//	�̺�Ʈ ó���� �ϰ��� �ϸ�
//		� �Լ��� ����Ǵ����� �ľ��Ѵ�.
//		���߸� Ŭ���ϴ� �̺�Ʈ�� �̿��� �����̹Ƿ�....
//			actionPerformed()�� ���ȴ�.
//		�� �Լ��� � ��û�� �������̽� �Ҽ������� �˾Ƴ���.
//		�츮�� ActionListener�� �̿��ϰ� �ȴ�.

//	1.	������ ��û�� �������̽��� �̿��� Ŭ������ �����Ѵ�.
class MyEvnet implements ActionListener {
	//	2.	�� �������̽��� ���� �Լ��� �������̵� �Ѵ�.
	public void actionPerformed(ActionEvent e) {
		//	3.	���� �Լ� �ȿ��� �ʿ��� �۾��� ó���Ѵ�.
		int		dan = 7;
		for(int i = 1; i <= 9; i++) {
			int	temp = dan * i;
			System.out.println(dan + " * " + i + " = " + temp);
		}
	}
}














