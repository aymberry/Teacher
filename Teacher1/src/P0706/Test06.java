package P0706;
import		java.awt.*;
public class Test06 {

	public static void main(String[] args) {
		Frame f = new Frame();
		//	lay 변수에 다양한 하위 클래스를 바꿔 줌으로써
		//	단추 모양이 바뀐다.
		LayoutManager lay = new BorderLayout();
//		LayoutManager lay = new FlowLayout();
		f.setLayout(lay);
		
		Button	b = new Button("내 단추");
		f.add(b);
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
}
