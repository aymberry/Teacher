package P0620;

public class Home03 {

	public static void main(String[] args) {
		int		num1 = (int)(Math.random() * (100 - 10 + 1) + 10);
		int		num2 = (int)(Math.random() * (100 - 10 + 1) + 10);
		
		System.out.println("발생한 수 = " + num1 + "   ,   " + num2);
		
		int		min = (num1 < num2) ? num1 : num2;
		
		for(int i = 1; i <= min; i++) {
			int		temp1 = num1 % i;
			int		temp2 = num2 % i;
			if(temp1 == 0 && temp2 == 0) {
				System.out.println(i + "는 공약수이다.");
			}
		}
	}
}
