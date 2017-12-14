package P0615;

public class Test07 {

	public static void main(String[] args) {
		int		a = 10;
		int		b = a >> 32;
		
		System.out.println(a);
		//	32 % 32만큼 쉬프트 하므로 0번 쉬프트가 되어서
		//	한번도 쉬프트 시키지 않게 된다.
	}

}
