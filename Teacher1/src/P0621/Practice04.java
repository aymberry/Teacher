package P0621;
/*
 * 3~100 중 솟수만 모두 출력하라
 */
public class Practice04 {

	public static void main(String[] args) {
		System.out.print("3~100중 소수는 3");
		
		for(int i = 4 ; i <= 100 ; i++) {

			for (int j = 2 ; j <= i ; j++) {
				if(i==j) {					//  튕김 없이 끝까지 도달했으면 소수
					System.out.print(", "+i); 
				}
				
				if (i%j==0) break;	//	나눠졌으니 소수
			}
		}
	}
}
