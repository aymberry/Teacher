package P0622;
/*
 * 	����
 * 		10���� �����͸� �����ϰ� �Է��� ��
 * 		�� �� ���� ū���� ����϶�.
 * 
 * 		����		ù��° �����͸� ���� ū �����ͷ� �ϴ� �����Ѵ�.
 * 					���� �����ͺ��� ������ �����ͱ��� ���ϸ鼭
 * 					���� �����ͺ��� ũ�� �ٲ�ġ�� �Ѵ�.
 */
public class Test03 {
	public static void main(String[] args) {
		int[]	num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
			System.out.println(num[i]);
		}
		
		int		max = num[0];
		for(int i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		
		System.out.println("���� ū �� = " + max);

	}

}



