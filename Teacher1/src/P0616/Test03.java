package P0616;
/*
 * 	����
 * 		1~100������ ������ ���� �ϳ��� �Է��� ��
 * 		�� ���ڰ� ¦������ Ȧ�������� ����ϵ��� �Ѵ�.
 */
public class Test03 {

	public static void main(String[] args) {
		int		num = (int)(Math.random() * (100 - 1 + 1) + 1);
		String	result;		//	���(¦��, Ȧ��)�� ����� ����

		if(num % 2 == 0) {
			result = "¦��";
		}
		else {
			result = "Ȧ��";
		}
		
		System.out.println("�߻��� �� = " + num);
		System.out.println("��� = " + result);
	}
}



