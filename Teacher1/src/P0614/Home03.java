package P0614;

public class Home03 {

	public static void main(String[] args) {
		float	one = 365.2426F;
		
		int		day = (int) one;
		//	������ 0.2426�� �̿��ؼ� �ð�, ���� ����ؾ��Ѵ�.
		one = one - day;		//	0.2426
		int		hour = (int)(one * 24);

		//	�ð����� ���� �κ��� �� �������� �̿��ؼ�
		//	���� ����ؾ� �Ѵ�.
		one = one - (hour / 24F);
		int		minute = (int)(one * 24 * 60);
		//	������ ���� �κ��� �� �������� �̿��ؼ�
		//	�ʸ� ����ؾ� �Ѵ�.
		one = one - (minute / 24F / 60);

		int	second = (int)(one * 24 * 60 * 60);
		System.out.println(day + " ��");
		System.out.println(hour + " �ð�");
		System.out.println(minute + " ��");
		System.out.println(second + " ��");
	}
}
