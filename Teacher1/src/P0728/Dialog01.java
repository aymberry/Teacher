package P0728;
/*
 * 	�̹����� Dialog�� ���� ����غ���.
 */
import		javax.swing.*;
public class Dialog01 {
	public Dialog01() {
		//	����
		//		Dialog�� �ݵ�� �ٸ� �����̳ʰ� ���� �����ؾ�
		//		ȭ�鿡 ��Ÿ�� �� �ִ�.
		//	���� �ٸ� �����̳ʰ� �����ؾ� �Ѵ�.
		JFrame	frame = new JFrame();
		JDialog		dialog = new JDialog(frame);
		
		//	������ �۾��� �����ϴ�.
		dialog.setSize(400,  400);
		dialog.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Dialog01();
	}
}
