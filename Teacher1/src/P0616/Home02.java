package P0616;

public class Home02 {

	public static void main(String[] args) {
		int	num = (int) (Math.random() * (100 - 1 + 1) + 1);
		
		//	�ϴ� �߻��� ���� ¦����� �����ϰ� �������.
		String	result = "¦��";
		//	�ٵ� Ȧ���� �� �����Ƿ� �ѹ� �����
		if(num % 2 == 1) {
			//	2�� ���� �������� 0�̸� ¦���̹Ƿ�
			//	2�� ���� �������� 1�̸� Ȧ���� ���̴�.
			
			//	�׷��� Ȧ���� �ٲ�����
			result = "Ȧ��";
		}	//	num % 2 == 1		true
		
		System.out.println(num + " �� " + result + "�Դϴ�.");

	}	//	main �Լ�
}	//	class
