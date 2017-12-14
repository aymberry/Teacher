package P0619;

public class Home06 {

	public static void main(String[] args) {

		for(int x = 0; x <= 10; x++) {
			//	x가 발생하는 경우의 수
			for(int y = 0; y <= 10; y++) {
				//	y가 발생하는 경우의 수
				
				int	temp = x * 2 + y * 4;
				//	노킹
				if(temp == 10) {
					System.out.println("X = " + x + "   y = " + y );
				}
			}
		}

	}

}
