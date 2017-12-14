package P0714;
import		java.util.*;
public class Random01 {
	public static void main(String[] args) {
		Random	r = new Random();
		
		for(int i = 0; i < 10; i++) {
//			int		num = r.nextInt(100);
			boolean	num = r.nextBoolean();	
			System.out.println(num);
		}
	}
}







