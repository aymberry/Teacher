package P0712;
public class Test03 {
	public static void main(String[] args) {
		int		a = 10;
		int		b = 0;
		int		c;
		try {
			c = a / b;	//	���ܰ� �߻��ϸ� JVM�� ArithmeticException�� ����(new ���Ѽ�)
						//	catch���� �����ְ� �ȴ�.
		}
		catch(/* ? */Exception e) {
			//	?�� JVM �� �����ִ� ���� Ŭ������ ���� �غ� �ؾ� �Ѵ�.
			//	����
			//		�������� �˷��ִ� Ŭ������ �޴� �ٴ� ����
			//		�˷��ִ� Ŭ������ ����� ������ �غ��Ѵٴ� �ǹ��̴�.
			//		e�� �ǹ̴� �����ִ� Ŭ���� �ּҸ� ����� ������ �ǹ̴�.
			c = a / 1;
		}

	}

}
