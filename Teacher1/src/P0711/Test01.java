package P0711;
public class Test01 {
	public static void main(String[] args) {
		Outer01.Inner012		in = new Outer01.Inner012();
		in.abc();
		
		//	�������̽��� �� ��ü�� new ��Ű�� ���ϰ�
		//	��� ���� Ŭ������ new ���Ѽ� ����ϼ���.
		Son01		s = new Son01();
		s.abc();
	}
}

class Outer01 {
	int	a;
	float b;
	void abc() {
		System.out.println("���� �ٱ��� abc�̴�.");
	}
	//	�� �������̽��� Top Level �������̽��� �ȴ�.
	interface Inner011 {
		//	�� �������̽��� �ٱ� Ŭ�����ϰ�� �ƹ� ���谡 ���� ������
		//	��ġ ���������� ����� ó�� ����� ������ �ȴ�.
		int	a = 10;
		void abc();
	}
	//	�� Ŭ������ Top Level  Ŭ������ �ȴ�.
	static class Inner012 {
		int	a = 100;
		void abc() {
			System.out.println("���� ������ abc�̴�.");
		}
	}
}
//	�������̽��� �Ϲ� ����Ŭ������ ����ؼ� ����ϼ���.
class Son01 implements Outer01.Inner011 {
	//	�� �������̽��� ������ �ִ� ��� �߻� �Լ��� �������̵� �ϼ���.
	public void abc() {
		System.out.println("���� �������̽� �߻� �Լ��̴�.");
	}
}














