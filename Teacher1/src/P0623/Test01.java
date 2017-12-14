package P0623;
/*
 * 	문제
 * 		1~10까지의 숫자를 순서대로 배열 변수에 입력한 후
 * 
 * 		이것의 순서를 썩어서 출력하도록 하세요.
 * 
 *  	원리
 *  		순서대로 입력 한 후
 *  		랜덤 두 위치의 숫자를 바꾼다.
 *  		(이 과정을 여러번 반복하면 순서가 랜덤하게 바뀔 것이다.)
 */
public class Test01 {
	public static void main(String[] args) {
		//	데이터를 순서대로 입력하자.
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
		System.out.println();
		
		//	이제 배열의 데이터를 썩어보자.
		//	썩는 방식은 임의의 두 위치의 데이터를 교환하면 된다.
		//	썩는 과정을 여러번 반복하면 모든 데이터가 위치가 바뀔것이다.
		for(int i = 0; i < 1000; i++) {
			//	임의의 두 위치를 발생한다.
			int	pos1 = (int)(Math.random() * (9 - 0 + 1) + 0);
			int	pos2 = (int)(Math.random() * (9 - 0 + 1) + 0);
			//	두 위치의 데이터를 교환시키자.
			
			int	temp = num[pos1];		//	잊어버리기 전에 대피시킨다.
			num[pos1] = num[pos2];
			num[pos2] = temp;
		}
		
		//	결과를 출력하자.
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "   ");
		}
		System.out.println();
	}
}








