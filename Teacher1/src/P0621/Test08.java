package P0621;

public class Test08 {

	public static void main(String[] args) {
		aaa:	//	바깥 for의 이름이다.
		for(int i = 0; i < 5; i++) {
			bbb:	//	안쪽 for의 이름이다.
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					continue aaa;
				}
				System.out.println(i + "   ,   " + j);
			}
		}

	}

}
