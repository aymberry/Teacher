package P0615;

public class Test02 {

	public static void main(String[] args) {
		float	a = 0.51F;
		
		int		hour = (int)(a * 24);	//	0.51���� ��ð��ΰ���?
		System.out.println(hour);
		//	���� �ð� ��꿡 ���� 0.5�� �� ������ ���ڸ� �˾ƺ���.
		a = a - (hour / 24F);
		System.out.println(a);
		
	}

}
