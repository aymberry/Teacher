package P0620;
import		java.util.*;
public class Home02 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		long		num = sc.nextLong();
		int			hap = 0;
		
		for(   ; num != 0 ;  num = num / 10) {
//			int		na = (int)(num % 10);		//	���� ���ڰ� ���´�.
			hap = hap + (int)(num % 10);
			//	���� ���ڸ��� ������ ���ڸ� ������ ���� ����� �Ѵ�.
						//	���� ���ڰ� ���� ������ ���ڸ� ���Ѵ�.
			//	 �� ���ڰ� 0�� �Ǹ� ���̻� ����� �ʿ䰡 ����. 
		}
		System.out.println(hap);
		
	}

}
