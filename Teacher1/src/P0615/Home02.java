package P0615;

public class Home02 {

	public static void main(String[] args) {
		int	apple	= 15;
		
		int	basket = (apple % 7 == 0) ? (apple / 7) : (apple / 7 + 1);
		
		System.out.println("바구니 수 = " + basket);

	}

}
