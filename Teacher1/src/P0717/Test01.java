package P0717;

import		java.text.*;

public class Test01 {

	public static void main(String[] args) {
		//	.....
		float	result = 1234.567F;
		//	���� 1,234.56	���� ����ϰ� �ʹ�.
		//	1.	������ �����Ѵ�.
		DecimalFormat	form = new DecimalFormat("\u00A4###,###.0000%");
		//	2.	���Ŀ� �°� ��ȯ�Ѵ�.
		String		dap = form.format(result);
		System.out.println(dap);
	}
}


