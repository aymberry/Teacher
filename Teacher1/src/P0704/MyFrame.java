package P0704;
import		java.awt.*;
import		java.awt.event.*;
public class MyFrame extends Frame {
	//	�� Ŭ������ ���� ���� ���� Ŭ�����̴�.
	//	�ٵ�	�� �ȿ��� �ƹ��� ���뵵 �ڵ����� �ʾҴ�.
	
	//	�� Ŭ���� �ȿ��� ���� �ƹ��� ���뵵 �ڵ����� �ʾ�����....
	//	�̹� Frame Ŭ������ ������ �ִ� ��� ����� ����Ǿ� �ִ�.
	public MyFrame() {
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
}





