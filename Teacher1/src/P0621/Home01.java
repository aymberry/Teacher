package P0621;

public class Home01 {
	public static void main(String[] args) {
		int		num = 0;		//	���� ����
		int		hap = 0;		//	���� ����� ����� ����
		while(hap < 100000) {
			num++;		//	���� ���ڸ� �ϳ��� �����ϸ鼭
			hap = hap + num;
		}
		System.out.println(num + "���� ���ϸ� ��� = " + hap);
	}
}
	