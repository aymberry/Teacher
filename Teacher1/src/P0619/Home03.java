package P0619;

public class Home03 {

	public static void main(String[] args) {
		int	num = (int)(Math.random() * (100 - 50 + 1) + 50);
		//	일단 무슨수가 발생했는지 알아야 결과가 맞는지
		//	확인이 가능하므로....
		System.out.println("발생한 수 = " + num);
		
		for(int i = 2; i <= num - 1; i++) {
			int	temp = num % i;
			//	노킹
			if(temp == 0) {
				System.out.println("약수 = " + i);
			}
		}
	}
}
