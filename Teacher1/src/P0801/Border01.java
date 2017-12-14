package P0801;
/*
 * 	문제
 * 		라디오 단추 두개에 테두리를 두르자.
 */
import		java.awt.*;
import		javax.swing.*;
import		javax.swing.border.*;
public class Border01 {
	public Border01() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		
		JRadioButton		r1 = new JRadioButton("오름차순");
		JRadioButton		r2 = new JRadioButton("내림차순");
		ButtonGroup		group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		
		JPanel	p = new JPanel();
		p.add(r1);
		p.add(r2);
		
		//	테두리를 두르고 싶으면
		//	1.	테두리 클래스를 생성한다.
		
		//	BevelBorder 사용법
//		BevelBorder	border = new BevelBorder(BevelBorder.RAISED);
		
		//	SoftBevelBorder 사용법
//		SoftBevelBorder	border = 
//				new SoftBevelBorder(SoftBevelBorder.LOWERED);
		
		//	EtchedBorder 사용법
//		EtchedBorder	border = new EtchedBorder(EtchedBorder.LOWERED);
		
		//	LineBorder 사용법
//		LineBorder border = new LineBorder(Color.black, 1, true);
		
		//	MatteBorder사용법
//		ImageIcon img = new ImageIcon("src/P0801/wavy.gif");
//		Insets in = new Insets(20, 20, 20, 20);
//		MatteBorder border = new MatteBorder(in, img);
		
		//	TitledBorder 사용법
//		EtchedBorder	temp = new EtchedBorder(EtchedBorder.RAISED);
//		TitledBorder	border = new TitledBorder(temp, "정렬", TitledBorder.RIGHT, TitledBorder.BELOW_TOP);

		//	CompoundBorder 사용법
		//	안쪽을 장식할 보더를 만든다.
//		ImageIcon img = new ImageIcon("src/P0801/wavy.gif");
//		Insets in = new Insets(20, 20, 20, 20);
//		MatteBorder inborder = new MatteBorder(in, img);
		//	바깥을 장식할 보더를 만든다.
//		EtchedBorder	outborder = new EtchedBorder(EtchedBorder.LOWERED);
		//	두보더를 합친다.
//		CompoundBorder border = new CompoundBorder(outborder, inborder);
		
		//	EmptyBorder 사용법
		EmptyBorder inborder = new EmptyBorder(30, 30, 30, 30);
		EtchedBorder	outborder = new EtchedBorder(EtchedBorder.LOWERED);
		
		CompoundBorder border = new CompoundBorder(outborder, inborder);

		//	2.	필요한 도구에 setBorder()를 이용해서 테두리를 적용한다.
		p.setBorder(border);
		
		f.add(p);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Border01();
	}
}
