package P0619;

public class Home05 {

	public static void main(String[] args) {

		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < (5 - j); i++) {
				//	한줄을 출력한다.
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
