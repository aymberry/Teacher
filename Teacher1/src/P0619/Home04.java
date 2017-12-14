package P0619;

public class Home04 {

	public static void main(String[] args) {
		for(int two = 0; two <= 5; two++) {
			//	2g 추의 경우의 수
			for(int three = 0; three <= 4; three++) {
				//	3g 추의 경우의 수
				for(int five = 0; five <= 3; five++) {
					//	5g 추의 경우의 수
					
					int temp = two * 2 + three * 3 + five * 5;
					//	노킹
					if(temp >= 20 && temp <= 30) {
						System.out.println("2g = " + two + " 3g = " + three + " 5g = " + five + " = " + temp);
					}
				}
			}
		}

	}

}
