package P0713;

public class Wrapper01 {

	public static void main(String[] args) {
		int		a = 10;
		Object	o;
		o = a;	
		//	�̰��� �츮�� �ڵ� Boxing �Ǿ���.
		//	�̷��� �ϸ� JVM�� �ڵ����� a ������ �ּ� ������ �ٲپ
		//	�ּ� ������ ����� ���ְ� �ȴ�.

		Object		temp = 5;
		int		num = (int) temp;
		//	�̰��� �츮�� Unboxing �Ѵٰ� ǥ���Ѵ�.
		//	�� �ּҸ� �����ͷ� ��ȯ�ؼ� ����� �ְ� �ȴ�.
		
		
	}

}

