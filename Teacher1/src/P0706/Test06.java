package P0706;
import		java.awt.*;
public class Test06 {

	public static void main(String[] args) {
		Frame f = new Frame();
		//	lay ������ �پ��� ���� Ŭ������ �ٲ� �����ν�
		//	���� ����� �ٲ��.
		LayoutManager lay = new BorderLayout();
//		LayoutManager lay = new FlowLayout();
		f.setLayout(lay);
		
		Button	b = new Button("�� ����");
		f.add(b);
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
}
