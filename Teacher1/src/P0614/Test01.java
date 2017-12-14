package P0614;

public class Test01 {

	public static void main(String[] args) {
//		int	a = 3.14;
		//	에러가 난 이유? 설명 참고
		int	a = (int) 3.14;
		//	.......
		float b = a;
		System.out.println(b);
	}

}
