package P0615;

public class Test02 {

	public static void main(String[] args) {
		float	a = 0.51F;
		
		int		hour = (int)(a * 24);	//	0.51일은 몇시간인가요?
		System.out.println(hour);
		//	이제 시간 계산에 사용된 0.5를 뺀 나머지 숫자를 알아보자.
		a = a - (hour / 24F);
		System.out.println(a);
		
	}

}
