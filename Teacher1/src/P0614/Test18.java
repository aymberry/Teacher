package P0614;

public class Test18 {

	public static void main(String[] args) {
		float		a = 3.55F;
		//	정수를 구하고 싶으면....
		int			b = (int) a;		//	3
		//	반올림한 정수를 구하고 싶다면....
		//		0.1, 0.2, 0.3, 0.4			0
		//		이 4개의 숫자는 정수로 만들때 0을 유지해야 한다.
		//		0.5, 0.6, ...					1
		//		나머지 숫자는 정수로 만들때 1로 변해야 한다.
		
		//		이 규칙을 만들기 위해서는 0.5를 더해주면 된다.
		int		c = (int)(a + 0.5);
		System.out.println(c);

	}

}
