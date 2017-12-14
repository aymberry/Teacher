package P0614;

public class Home03 {

	public static void main(String[] args) {
		float	one = 365.2426F;
		
		int		day = (int) one;
		//	나머지 0.2426을 이용해서 시간, 분을 계산해야한다.
		one = one - day;		//	0.2426
		int		hour = (int)(one * 24);

		//	시간으로 계산된 부분을 뺀 나머지를 이용해서
		//	분을 계산해야 한다.
		one = one - (hour / 24F);
		int		minute = (int)(one * 24 * 60);
		//	분으로 계산된 부분을 뺀 나머지를 이용해서
		//	초를 계산해야 한다.
		one = one - (minute / 24F / 60);

		int	second = (int)(one * 24 * 60 * 60);
		System.out.println(day + " 일");
		System.out.println(hour + " 시간");
		System.out.println(minute + " 분");
		System.out.println(second + " 초");
	}
}
