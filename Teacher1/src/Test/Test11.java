package Test;
public class Test11 {
	public static void main(String[] args) {
		int	a = 10;
		int	b = ++a + ++a;
		//		++a		1	a = 11
		//		++a		2	a  = 12
		//		a + a;		3	a + a = 23	
		//		b = ?		4	b = 23
		System.out.println(a);
		System.out.println(b);

	}
}
