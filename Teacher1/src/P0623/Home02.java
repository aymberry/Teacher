package P0623;

public class Home02 {

	public static void main(String[] args) {
		int[]	num = new int[10];
		//	10�� �ݺ��ϸ鼭 ������ ���ڸ� �迭�� ����Ѵ�.
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		
		//	���� ȸ����ŭ �ݺ��� ��Ų��.
		for(int i = 0; i < 9; i++) {
		//		������ ���帶�� ��ȸ����ŭ �ݺ��� �Ѵ�.
			
			//	���� �� ������ ��ȯ�� �õ��Ѵ�.
			boolean	isSwap = false;		//	�������� ���ٰ� �����ϰ� ���
			for(int j = 0 ; j < (9 - i); j++) {
		//			if(�ڽŰ� > �ڽ�+1) {		num[i] > num[i + 1] 
		//				�����͸� ��ȯ�ϸ� �ȴ�.
				
				//	������ ��ȯ�� �Ͼ��.
				if(num[j] > num[j + 1]) {
					int	temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					isSwap = true;		//	�������� �Ͼ�ٰ� �������� ����
					//	�� ������ �ѹ��̶� ����ϸ� �̰��� �̿ϼ��̴�.
				}
			}
			//	���� �� ���尡 ����Ǿ���.
			//	�� �κп��� ��Ʈ�� �Ϸ�Ǿ����� �˼� �ִ°��� ����
			//	��Ʈ�� Ư¡�̴�.
			//	����
			//		���� �Ѷ� ������������ �������� �Ͼ����?
			//		�Ͼ�� �ʾҴ��� Ȯ���ϴ� �����?
			if(isSwap == false) {
				//	���� ��Ʈ�� �Ϸ�Ǿ���.
				//	��� ���̻� ���� ���带 �õ��� �ʿ䰡 ����.
				break;
			}
		}
//		java.util.Arrays.sort(num);
		//	10���� �����͸� ����غ���
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "    ");
		}
		System.out.println();
	}
}
