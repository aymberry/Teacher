package P0704;
public class Test05 {
	public static void main(String[] args) {
	}
}

class Father05 {
	void abc() {
		System.out.println("�� �ƹ���");
	}
}

class Son05 extends Father05 {
	//	�� �Լ��� �̹� �����ϰ� �ִ�.
//	void abc() {
//		System.out.println("�� �Ƶ�");
//	}
	//	�̰��� �����ϴ� �Լ��� �Լ� ������ �����ϹǷ�
	//	�̰��� ���� ���̵��̴�.
	void abc() {
		
	}
	//	�� �Լ��� �Ű������� ������ �ٸ��� �ؼ� ���� �Լ��̹Ƿ�
	//	�� �Լ��� �����ε��̴�.
	void abc(int a) {
		System.out.println("�� �Ƶ�");
	}
	//	�� �Լ��� �����ϴ� �Լ��� �Ű������� �����Ƿ� �����ε嵵 �ƴϰ�
	//	�� �Լ��� �����ϴ� �Լ��� �Լ� ������ �ٸ��Ƿ� �������̵嵵 �ƴϴ�.
	//	�Ѵ� �ƴϹǷ� ������ �� ���̴�.
//	int	abc() {
//		return 10;
//	}
	
}









