package P0622;

public class Home01 {

	public static void main(String[] args) {
		int[]	num = new int[100];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (1000 - 0 + 1) + 0);
		}
		//	첫번째 데이터가 가장 크고, 가장 작다고 가정하고 출발하자.
		int		max = num[0];
		int		min = num[0];
		//	다음 데이터부터 마지막 데이터까지 비교하면서
		//	자신보다 크거나, 작은 경우는 데이터를 바꾼다.
		for(int i = 1; i < num.length; i++) {
			//	큰값을 바꾼다.
			if(max < num[i]) {
				max = num[i];
			}
			//	작은값을 바꾼다.
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("큰값 = " + max);
		System.out.println("작은값 = " + min);

	}
}



