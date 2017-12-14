package Test;
import		java.util.*;
public class Test {
//	m03-244-892
	public static void main(String[] args) {
		//	Calendar 클래스를 생성한다.
		Calendar	car = Calendar.getInstance();
		//	원하는 달의 1일을 강제로 지정한다.
		//	참고	달은 1월을 0부터 하므로 7월을 원하면 6으로
		//			입력해야 한다.
		car.set(2017,  11, 1);
		//	그날(1일)의 요일을 구한다.
		int	week = car.get(Calendar.DAY_OF_WEEK);
		//	그달의 마지막 날을 구한다.
		int	last = car.getMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("  일  월  화  수  목  금  토 ");
		System.out.println("==============================");
		//	출력회수를 지정할 변수
		int		printcount = 0;
		//	시작요일만큼(7월이면 토요일이므로) 금요일까지
		//	공백으로 출력한다.
		for(int i = 0; i < week - 1; i++) {
			System.out.print("    ");
			//	한번 출력할때마다 출력회수를 증가한다.
			printcount++;
		}
		//	본격적으로 달력을 출력한다.
		for(int i = 1; i <= last; i++) {
			//	7번 출력하면 강제로 줄을 바꾼다.
			if(printcount % 7 == 0) {
				System.out.println();
			}
			//	달력 출력한다.
			System.out.printf("  %2d", i);
			printcount++;
		}
	}

}
