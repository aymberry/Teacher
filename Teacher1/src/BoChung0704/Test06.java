package BoChung0704;

public class Test06 {

	public static void main(String[] args) {
		int x = 1;
		int y = x++;
		//		x++										2		x = 2
		//		y = x			이 동시에 실행된다.		1		y = 1
		if((x == ++y)|(x++==y)) {
			//	x == y			2		2 == 2		참
			//	++y			1		y = 2
			
			//	x++			2		x = 3
			//	x == y			1		2 == 2		참
			x = x + y;
		}
		System.out.println("x= "+x);
	}
}
