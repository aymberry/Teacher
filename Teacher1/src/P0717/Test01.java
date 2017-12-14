package P0717;

import		java.text.*;

public class Test01 {

	public static void main(String[] args) {
		//	.....
		float	result = 1234.567F;
		//	나는 1,234.56	으로 출력하고 싶다.
		//	1.	패턴을 지정한다.
		DecimalFormat	form = new DecimalFormat("\u00A4###,###.0000%");
		//	2.	형식에 맞게 변환한다.
		String		dap = form.format(result);
		System.out.println(dap);
	}
}


