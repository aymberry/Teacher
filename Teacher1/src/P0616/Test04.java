package P0616;
/*
 * 	����
 * 		������ �� ���� �Է��� ��
 * 		�ݵ�� ũ�� ������� ����ϴ� ���α׷��� ���弼��
 */
public class Test04 {
	public static void main(String[] args) {
		int		a = (int)(Math.random() * (100 - 1 + 1) + 1);
		int		b = (int)(Math.random() * (100 - 1 + 1) + 1);
		int		max, min;		//	ū���� �������� �����ؼ� ����� ����
		
		if(a > b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		
		System.out.println(max + "    " + min);
	}
}
