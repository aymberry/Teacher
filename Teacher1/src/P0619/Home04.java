package P0619;

public class Home04 {

	public static void main(String[] args) {
		for(int two = 0; two <= 5; two++) {
			//	2g ���� ����� ��
			for(int three = 0; three <= 4; three++) {
				//	3g ���� ����� ��
				for(int five = 0; five <= 3; five++) {
					//	5g ���� ����� ��
					
					int temp = two * 2 + three * 3 + five * 5;
					//	��ŷ
					if(temp >= 20 && temp <= 30) {
						System.out.println("2g = " + two + " 3g = " + three + " 5g = " + five + " = " + temp);
					}
				}
			}
		}

	}

}
