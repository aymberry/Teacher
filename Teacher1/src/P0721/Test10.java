package P0721;

public class Test10 {
	public static void main(String[] args) {
		MyClass10		my = new MyClass10();
		my.abc();
		my.xyz();
	}
}

abstract class MyAbsClass10 {
	abstract void abc();
}
//	�� Ŭ������ ����ϱ� ���ؼ��� �Ϲ� Ŭ������ ����� �޾Ƽ�
//	�߻� �Լ��� �������̵��� �� ����Ѵ�.

class MyClass10 extends MyAbsClass10 {
	//	���� �� �Լ��� �������̵� �Ϸ��� ������µ�...
	//	�Ǽ��� �Լ� ������ ��Ű�� ���ߴ�.
	//	�� �Լ��� �������̵尡 �ƴϰ� �����ε尡 �Ǿ ������ �ȳ���.	

	//	�ٷ� ��ó�� � �Լ��� Ư���� �����Դϴ�. ��� �˷��־�� 
	//	�ϴ� ��찡 �߻��ϸ�
	//	���⼭�� �� �Լ��� �������̵� �����Դϴ�. ��� �˷��־�� �Ѵ�.
	
	//	�̷��� ������̼��� ����ϰ� �Ǹ� JVM�� �� �Լ��� ������
	//	�˰Եǰ� �˻縦 ������ �ְ� �ȴ�.
	@Override
	void abc() {
		
	}
	@Deprecated
	void xyz() {
		
	}
}










