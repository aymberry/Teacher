package P0622;

public class Home02 {
	public static void main(String[] args) {
		//	������ ������ �߻�ȸ���� ����� �迭�� �غ��Ѵ�.
		int[]	count = new int[10];
		
		//	100�� ���ڸ� �߻��ϵ��� �Ѵ�.
		for(int i = 0; i < 100; i++) {
			char	ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			//	���� �߻��� ������ �ľ��Ͽ� �غ�� �迭�� ��ġ��
			//	ī��Ʈ ��Ų��.
			//	�ݺ� ��Ģ		�߻��ѹ��� - 65		 ��ġ�� ���´�.
			//					'A'(65) - 65		0
			//					'B'(66) - 65		1
			count[ch - 65]++;
		}
		//	�̰��� �ٽ� �׷��� ���·� ����϶�.
		//	��� 10���� ����ؾ� �Ѵ�.
		for(int i = 0; i < count.length; i++) {
			//	�� ���� �߻��� ȸ����ŭ ����ؾ� �Ѵ�.
			for(int j = 0; j < count[i]; j++) {
				System.out.print("#");
			}
			System.out.println("(" + count[i] + ")");
		}
	}
}
