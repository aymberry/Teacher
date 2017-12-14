package P0614;

public class Test09 {

	public static void main(String[] args) {
		int		a = 10;
		
//		int		b = ++a + ++a;
		//	a는 	++a	1		11
		//			++a	2		12
		//			=		3		23
		int		b = ++a + a++;
		//		++a		1		11
		//		a++		3		12
		//		=			2		22
		//		int		b = a++ + a++의 결과를 예측하세요
		System.out.println(b);
	}

}
