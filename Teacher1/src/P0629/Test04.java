package P0629;
/*
 * 	나는 대화상자 하나를 만들고 싶다.
 * 
 * 	그 안에 단추를 하나 넣고싶다.
 */
import		java.awt.*;
public class Test04 {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		Button	b = new Button("눌러봐");
		f.setLayout(new FlowLayout());
		f.add(b);

		f.setSize(400, 400);
		f.setVisible(true);

	}

}
