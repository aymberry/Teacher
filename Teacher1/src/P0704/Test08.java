package P0704;
public class Test08 {
	public static void main(String[] args) {
		Son08 s = new Son08();
		
	}
}

class Father08 {
	//	����Ʈ�� �ȸ���� int �� �ִ� �����ڸ� �������.
	Father08(int a) {
		System.out.println("���� �ƹ���");
	}
}

class Son08 extends Father08 {
	Son08() {	
		super(5);
		//	�������
		//	�������� new Son08()�� �ؼ� �� �����ڸ� ȣ���ϸ�
		//	�̶� ������ �ƹ��� Ŭ������ int�� �޴� �����ڸ� ȣ���Ѵ�.
		System.out.println("���� �Ƶ�");
	}
	Son08(int a) {
		super(5);
	}
	//	�̷��� �ϸ� Father08�� ����� �����ϰ�
	//	�̶� Default�� ����ϴµ� Father08���� ����Ʈ�� �����Ƿ�
	//	���� �����.
	//	�ذ�å
	//		�׷��� ����Ʈ�� �ƴ� �ƹ����� �ٸ� ������ �Լ��� ������
	//		ȣ�� �� �� ������ �ذ�ǰڳ�....
	
}






