package Test;
public class Test18 {
	public static void main(String[] args) {
		int	a = 1, b = 10;
		do {
			if(a > b) {			//	5 > 6
				continue;
			}
			b--;				//	b = 5
		}while(++a < 6);		//	a = 6 < 6
		
		System.out.println(a + "   " + b);

	}

}
