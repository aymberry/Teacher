package P0717;
import		java.util.*;
import		java.text.*;
public class Test02 {

	public static void main(String[] args) {
		//	.....
		Calendar	car = Calendar.getInstance();
		//	...	이쁘게 출력하기 위해서
		SimpleDateFormat	form = new SimpleDateFormat("YY년 MM월 dd일 HH시 mm분 ss초 E요일");
		
		String	dap = form.format(car.getTime());
		System.out.println(dap);
		
	}

}
