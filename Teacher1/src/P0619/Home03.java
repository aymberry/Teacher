package P0619;

public class Home03 {

	public static void main(String[] args) {
		int	num = (int)(Math.random() * (100 - 50 + 1) + 50);
		//	�ϴ� �������� �߻��ߴ��� �˾ƾ� ����� �´���
		//	Ȯ���� �����ϹǷ�....
		System.out.println("�߻��� �� = " + num);
		
		for(int i = 2; i <= num - 1; i++) {
			int	temp = num % i;
			//	��ŷ
			if(temp == 0) {
				System.out.println("��� = " + i);
			}
		}
	}
}
