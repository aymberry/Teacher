package P0623;

public class Home01 {

	public static void main(String[] args) {
		int[]	num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//	두 위치의 데이터를 교환하는 행위를 여러번 반복하자
		for(int i = 0; i < 100; i++) {
			//	교환할 위치의 데이터를 하나 구하자.
			//	0번은 고정이므로 임의의 위치는 1~9까지만 구하면 된다.
			int	pos = (int)(Math.random() * (9 - 1 + 1) + 1);
			
			//	0번위치와 위에 구한 위치의 데이터를 교환하자.
			int		temp = num[0];		//	임시로 대피하고
			num[0] = num[pos];
			num[pos] = temp;
		}

		//	썩였는지 출력해보자.
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "    ");
		}
		System.out.println();
	}

}
