package P0623;

public class Home01 {

	public static void main(String[] args) {
		int[]	num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//	�� ��ġ�� �����͸� ��ȯ�ϴ� ������ ������ �ݺ�����
		for(int i = 0; i < 100; i++) {
			//	��ȯ�� ��ġ�� �����͸� �ϳ� ������.
			//	0���� �����̹Ƿ� ������ ��ġ�� 1~9������ ���ϸ� �ȴ�.
			int	pos = (int)(Math.random() * (9 - 1 + 1) + 1);
			
			//	0����ġ�� ���� ���� ��ġ�� �����͸� ��ȯ����.
			int		temp = num[0];		//	�ӽ÷� �����ϰ�
			num[0] = num[pos];
			num[pos] = temp;
		}

		//	�⿴���� ����غ���.
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "    ");
		}
		System.out.println();
	}

}
