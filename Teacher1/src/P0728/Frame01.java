package P0728;
/*
 * 	ȭ�鿡 ������ �ϳ��� ����� ����.
 */
import		javax.swing.*;
public class Frame01 {
	public Frame01() {
		//	�������� �ʿ��ϸ� ��ǰ�� new ��Ų ��
		//	�ʿ��� �Լ��� �̿��ؼ� �۾��� �ϸ� �ȴ�.
		JFrame	frame = new JFrame("���� ���� ������");
		//	����
		//		JFrame�� x ���߸� ������ ���α׷� ������� �ʰ�
		//		�ٸ� ȭ�鿡�� �������� �Ⱥ��̵��� �� ���̴�.
		//		x ���� ������ ���α׷��� ���� ����ǵ��� �ϰ��� �Ѵ�.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	1.	�������� ũ�⸦ �����Ѵ�.
		frame.setSize(500, 500);
		//	2.	�������� ȭ�鿡 ����ϵ��� �����Ѵ�.
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Frame01();
	}
}
