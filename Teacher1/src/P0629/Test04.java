package P0629;
/*
 * 	���� ��ȭ���� �ϳ��� ����� �ʹ�.
 * 
 * 	�� �ȿ� ���߸� �ϳ� �ְ�ʹ�.
 */
import		java.awt.*;
public class Test04 {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		Button	b = new Button("������");
		f.setLayout(new FlowLayout());
		f.add(b);

		f.setSize(400, 400);
		f.setVisible(true);

	}

}
