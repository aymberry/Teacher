package P0622;

public class Home01 {

	public static void main(String[] args) {
		int[]	num = new int[100];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (1000 - 0 + 1) + 0);
		}
		//	ù��° �����Ͱ� ���� ũ��, ���� �۴ٰ� �����ϰ� �������.
		int		max = num[0];
		int		min = num[0];
		//	���� �����ͺ��� ������ �����ͱ��� ���ϸ鼭
		//	�ڽź��� ũ�ų�, ���� ���� �����͸� �ٲ۴�.
		for(int i = 1; i < num.length; i++) {
			//	ū���� �ٲ۴�.
			if(max < num[i]) {
				max = num[i];
			}
			//	�������� �ٲ۴�.
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("ū�� = " + max);
		System.out.println("������ = " + min);

	}
}



