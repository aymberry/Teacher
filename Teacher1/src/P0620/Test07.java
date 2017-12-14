package P0620;

public class Test07 {

	public static void main(String[] args) {

//		for(int j = 0; j < 5; j++) {
//			for(int i = 5 - j; i > 0; i--) {
//				//	이것도 5번 반복이다.
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
		//	크게 5줄 출력하는 부분
		for(int j = 6; j >= 2; j--) {
			//	한줄을 출력하는 부분
			for(int i = j - 1/* 5, 4, 3, 2, 1  이 되도록 하자.*/ ; i > 0; i--) {
				System.out.print("#");
			}
			System.out.println();
		}
	
	
	
	
	
	
	}

}
