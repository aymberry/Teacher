package P0801;
/*
 * 	����
 * 		���� ���� �ΰ��� �׵θ��� �θ���.
 */
import		java.awt.*;
import		javax.swing.*;
import		javax.swing.border.*;
public class Border01 {
	public Border01() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		
		JRadioButton		r1 = new JRadioButton("��������");
		JRadioButton		r2 = new JRadioButton("��������");
		ButtonGroup		group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		
		JPanel	p = new JPanel();
		p.add(r1);
		p.add(r2);
		
		//	�׵θ��� �θ��� ������
		//	1.	�׵θ� Ŭ������ �����Ѵ�.
		
		//	BevelBorder ����
//		BevelBorder	border = new BevelBorder(BevelBorder.RAISED);
		
		//	SoftBevelBorder ����
//		SoftBevelBorder	border = 
//				new SoftBevelBorder(SoftBevelBorder.LOWERED);
		
		//	EtchedBorder ����
//		EtchedBorder	border = new EtchedBorder(EtchedBorder.LOWERED);
		
		//	LineBorder ����
//		LineBorder border = new LineBorder(Color.black, 1, true);
		
		//	MatteBorder����
//		ImageIcon img = new ImageIcon("src/P0801/wavy.gif");
//		Insets in = new Insets(20, 20, 20, 20);
//		MatteBorder border = new MatteBorder(in, img);
		
		//	TitledBorder ����
//		EtchedBorder	temp = new EtchedBorder(EtchedBorder.RAISED);
//		TitledBorder	border = new TitledBorder(temp, "����", TitledBorder.RIGHT, TitledBorder.BELOW_TOP);

		//	CompoundBorder ����
		//	������ ����� ������ �����.
//		ImageIcon img = new ImageIcon("src/P0801/wavy.gif");
//		Insets in = new Insets(20, 20, 20, 20);
//		MatteBorder inborder = new MatteBorder(in, img);
		//	�ٱ��� ����� ������ �����.
//		EtchedBorder	outborder = new EtchedBorder(EtchedBorder.LOWERED);
		//	�κ����� ��ģ��.
//		CompoundBorder border = new CompoundBorder(outborder, inborder);
		
		//	EmptyBorder ����
		EmptyBorder inborder = new EmptyBorder(30, 30, 30, 30);
		EtchedBorder	outborder = new EtchedBorder(EtchedBorder.LOWERED);
		
		CompoundBorder border = new CompoundBorder(outborder, inborder);

		//	2.	�ʿ��� ������ setBorder()�� �̿��ؼ� �׵θ��� �����Ѵ�.
		p.setBorder(border);
		
		f.add(p);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Border01();
	}
}
