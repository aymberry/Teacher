package P0627;

public class Test07 {
	public static void main(String[] args) {
		int[]	ori = {1, 2, 3, 4, 5};
		//	ori�� ������ ��ü�� �������� �غ���.
		//	1.	���� ���縦 ���� �迭�� �غ��Ѵ�.
		int[]	copy = new int[5];
		//	2.	����� �̿��ؼ� ���� ���縦 �����Ѵ�.
		System.arraycopy(ori, 0, copy, 0, 5);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(copy[i]);
		}
		
		ori[0] = 100;
		System.out.println(copy[0]);
	}

}

