package P0717;
import		java.text.*;
public class Test04 {

	public static void main(String[] args) {
		//	...
		int		score = 90;
		
		//	패턴을 지정한다.
		ChoiceFormat	form = new ChoiceFormat("0#F|60#D|70#C|80#B|90<A");
		//	변환한다
		String	dap = form.format(score);
		System.out.println(dap);
	}
}
