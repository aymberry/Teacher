package P0621;

public class Test07 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i == 3) {	//	(1)
				break;
			}
			for(int j = 0; j < 5; j++) {
//				if(j == 3) {	//	(2)
//					break;
//				}
				System.out.println(i + "  , " + j);
			}
			//		(2)가 실행되면 여기로 나온다.
		}
		//	(1)이 실행되면 여기로 나온다.
	}
}
