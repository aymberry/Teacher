package P0620;

public class Test07 {

	public static void main(String[] args) {

//		for(int j = 0; j < 5; j++) {
//			for(int i = 5 - j; i > 0; i--) {
//				//	�̰͵� 5�� �ݺ��̴�.
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
		//	ũ�� 5�� ����ϴ� �κ�
		for(int j = 6; j >= 2; j--) {
			//	������ ����ϴ� �κ�
			for(int i = j - 1/* 5, 4, 3, 2, 1  �� �ǵ��� ����.*/ ; i > 0; i--) {
				System.out.print("#");
			}
			System.out.println();
		}
	
	
	
	
	
	
	}

}
