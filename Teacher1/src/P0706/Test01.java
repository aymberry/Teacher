package P0706;
//	�ſ� �߿��� �ҽ��̹Ƿ� ������ ���� �����ϱ� �ٶ���.
public class Test01 {
	public static void main(String[] args) {
		//	����ȯ�� ���ؼ� Ŭ������ ������.
		
//		Father01	f = new Son01();
		//	new Son01()	�� Heap Type => Son01
		//	Father01	f	�� Heap Type => Fahter01
		
		//	Up Casting�̹Ƿ� ���������� ����Ѵ�.
//		f.xyz();
		//	Father���� ����ؼ� Son ���� ���������� ��
		//	������ ������ xyz�� �����϶�.	==>		Son

		Grand01	g = new Son01();
		//	Up Casting�̴�.
//		g.abc();		//	Father�� abc()
		//	�ڡڡڡڡ�
//		g.xyz();
		//	�̰��� �ȵǴ� ������
		//	Grand �ȿ� xyz()�� �������� �ʱ� �����̴�.
		//	�׷��� ���� ������ �� �� ����.

		//	�ذ���
		//	==>		����?
		//			Grand �ȿ� xyz�� ���� ������ ������ �߻��Ѵ�.
		//			���� Father���� ����ϵ��� ������ ���� ���� ���̴�.
		Father01	f = (Father01) g;
		//	Father01	f	�� Heap Type		: Fahter01
		//	g				�� Heap Ttpe		: Grand01
		//	 �׷��� Instance�� ������ �ʰ� �ٸ� ���۷����� �ٲ���̴�.
		f.xyz();
		//	��� �� ������ Father���� ����ؼ� Son���� ��������������
		//	�����ϴ� ����̴�.
		
//		Father01	f = new Son01();
//		f.lmn();
		//	Grand01���� ��ӹ��� lmn()�� �����ϹǷ�
		//	���� ������ �Ǵ� ���̴�.
		
	}
}

class Grand01 {
	void abc() {
		System.out.println("���� �Ҿƹ��� abc�̴�.");
	}
	void lmn() {
		System.out.println("���� �Ҿƹ��� lmn�̴�.");
	}
}
class Father01 extends Grand01 {
	void abc() {
		System.out.println("���� �ƹ��� abc�̴�.");
	}
	void xyz() {
		System.out.println("���� �ƹ��� xyz�̴�.");
	}
}
class Son01 extends Father01 {
	void xyz() {
		System.out.println("���� �Ƶ� xyz�̴�.");
	}
	void lmn() {
		System.out.println("���� �Ƶ� lmn�̴�.");
	}
}
