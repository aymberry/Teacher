package P0717;
import		java.util.*;
import		java.text.*;
public class Test02 {

	public static void main(String[] args) {
		//	.....
		Calendar	car = Calendar.getInstance();
		//	...	�̻ڰ� ����ϱ� ���ؼ�
		SimpleDateFormat	form = new SimpleDateFormat("YY�� MM�� dd�� HH�� mm�� ss�� E����");
		
		String	dap = form.format(car.getTime());
		System.out.println(dap);
		
	}

}
