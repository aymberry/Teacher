package P0621;

public class Test08 {

	public static void main(String[] args) {
		aaa:	//	�ٱ� for�� �̸��̴�.
		for(int i = 0; i < 5; i++) {
			bbb:	//	���� for�� �̸��̴�.
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					continue aaa;
				}
				System.out.println(i + "   ,   " + j);
			}
		}

	}

}
