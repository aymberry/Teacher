package P0704;
//	���� 
//		10���� �迭�� �����͸� �Է��ϴ� �Լ��� �����ϼ���
public class Test09 {
	
	static int[] Input1() {
		//	���� �޸𸮸� ���� �� �޸𸮿� �����͸� ä���� �ٲ�
		
		//		�޸� �����
		int[]	temp = new int[10];
		//		���� ä����
		for(int i = 0; i < 10; i++) {
			temp[i] = (int)(Math.random() * 100);
		}
		//	��� �˷��ٲ�
		return temp;
	}
	static void Input2(int[] temp) {
		//	�ϰ� �޸� ������ָ� �� �޸𸮿� �����͸� ä���� �ٲ�
		for(int i = 0; i < 10; i++) {
			temp[i] = (int)(Math.random() * 100);
		}
	}
	public static void main(String[] args) {
//		int[]	num = Input1();
//		for(int i = 0; i < 10; i++) {
//			System.out.println(num[i]);
//		}

		int[]	num = new int[10];
		Input2(num);
		for(int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
	}

}
