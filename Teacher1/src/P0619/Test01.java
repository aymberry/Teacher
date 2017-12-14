package P0619;

public class Test01 {
	public static void main(String[] args) {
		int		a = 2;
		
		switch(a) {
		case	1:
			System.out.println("하나");
			break;
		case	2:	//	a == 1 || a == 2
			System.out.println("둘");
			break;
		case	3:	//	a == 1 || a == 2 || a == 3
			System.out.println("셋");
			break;
		default:
			System.out.println("많다.");
		}
	}
}
