package P0627;

public class Test05 {

	public static void main(String[] args) {
		int[]	ori = {1, 2, 3, 4, 5};
		
		//	���� ���� ���縦 �õ�����.
		//	���� ����� �ּҸ� �ٸ� ������ �������ִ� ����� ���Ѵ�.
		int[]	copy = ori;
		
		System.out.println("����޴� ������ = " + copy[0]);
		ori[0] = 100;
		System.out.println("����޴� ������ = " + copy[0]);
	}
}
