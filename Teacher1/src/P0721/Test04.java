package P0721;
/*
 * 	문제	10개의 배열에 랜덤한 숫자를 입력한 후
 * 			모두 더해서 출력하자.
 */
public class Test04 {
	public static void main(String[] args) {
		int[]	nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101);
		}

		int	total = 0;
		for(int temp : nums) {
			System.out.print(temp + "  ");
			total = total + temp;
		}
		//	단점	배열 혹은 컬렉션의 데이터를 꺼낼때만 사용할 수 있다.
		//			데이터 변경등 데이터 조작은 불가능하다.
		
		System.out.println("   ==>  " + total);
		
	}
}



	