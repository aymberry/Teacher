package P0619;

public class Home06 {

	public static void main(String[] args) {

		for(int x = 0; x <= 10; x++) {
			//	x�� �߻��ϴ� ����� ��
			for(int y = 0; y <= 10; y++) {
				//	y�� �߻��ϴ� ����� ��
				
				int	temp = x * 2 + y * 4;
				//	��ŷ
				if(temp == 10) {
					System.out.println("X = " + x + "   y = " + y );
				}
			}
		}

	}

}
