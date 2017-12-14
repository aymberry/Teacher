package P0622;
/*
 * 	5개의 배열에 1~10사이의 랜덤한 숫자를 발생한 후
 * 	각각의 배열에 기억된 데이터개수만큼 #를 출력하도록 한다.
 * 
 * 	예>		[0] : 5			#####
 * 			[1] : 7			#######
 * 			...
 * 			[4] : 4			####
 */
public class Test04 {

	public static void main(String[] args) {
		int[] num = new int[5];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (10 - 1 + 1) + 1);
		}
		
		//	5줄을 출력해야 한다.
		for(int i = 0; i < num.length; i++) {
			//	각 줄은 데이터의 개수만큼 반복하면서 출력해야 한다.
			for(int j = 0; j < num[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}



