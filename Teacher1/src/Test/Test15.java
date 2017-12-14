package Test;
public class Test15 {
	public static void main(String[] args) {
		int	x = 1;
		int y = x++;		
		//	이명령도		x++		2		x = 2
		//					y = x		1		y = 1
		
		if((x == ++y) | (x++ == y)) {
			//	2 == 2		2 == 2		x = 3 
			x = x + y;		//	x = 3 +  2		x = 5
		}
		System.out.println(x);
		System.out.println(y);
	}
}
