package P0706;
public class Test02 {
	public static void main(String[] args) {
		//	1.	���۷����� ������ ����Ѵ�.
//		Grand02	g = new Son02();
//		System.out.println("������ = " + g.a);
		//	���۷����� Grand �̹Ƿ� Grand�� a�� ����Ѵ�.
//		System.out.println("������ = " + g.b);
		//	Grand�� b ������ ���� ������ ����� ���� ���Ѵ�.
		
		
		//	2.	��� �Լ����� ����ϸ� ���� �Լ��� �����ϴ� Ŭ������
		//		������ ����Ѵ�.
//		g.abc();
		//	���� ����Ǵ� abc�� Father�� ������ �ִ� �Լ��̹Ƿ�
		//	Father Ŭ������ ������ ����Ѵ�.
		
		Son02	s = new Son02();
		s.xyz();
	}
}

class Grand02 {
	int		a = 100;
	int		c = 700000;
	void abc() {
		System.out.println("�Ҿƹ��� = " + a);
	}
}
class Father02 extends Grand02 {
	int		a = 1000;
	int		b = 5000;
	void abc() {
		System.out.println("�ƹ��� = " + a);
	}
}
class Son02 extends Father02 {
	int		a = 10000;
	int		b = 50000;
//	void abc() {
//		System.out.println("�ƹ��� = " + a);
//	}
	void xyz() {
		System.out.println("�Ƶ� = " + c);
	}
	//	���	c ������ ��� �޾Ұ� ���������� ��Ű�� �ʾ����Ƿ�
	///			Son���� �����Ѵ�.
}




