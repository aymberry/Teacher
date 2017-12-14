package P0620;
import		java.util.*;
public class Home02 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		long		num = sc.nextLong();
		int			hap = 0;
		
		for(   ; num != 0 ;  num = num / 10) {
//			int		na = (int)(num % 10);		//	끝에 숫자가 나온다.
			hap = hap + (int)(num % 10);
			//	끝에 숫자를뺀 나머지 숫자를 가지고 다음 계산을 한다.
						//	끝에 숫자가 빠진 나머지 숫자를 구한다.
			//	 이 숫자가 0이 되면 더이상 계산할 필요가 없다. 
		}
		System.out.println(hap);
		
	}

}
