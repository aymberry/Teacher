package P0704;
public class Test04 {
	public static void main(String[] args) {
		Son04	s = new Son04();
		
		s.abc();
		s.xyz(5);
		s.lmn();
	}
}

class Father04 {
	void abc() {
		System.out.println("���� �ƹ����� abc �̴�.");
	}
	
	int xyz(int a) {
		System.out.println("���� �ƹ����� xyz �̴�.");
		return 5;
	}
}

class Son04 extends Father04 {
	//	�߰������� �ʿ��� ����� ���ϸ� �ȴ�.
	void lmn() {
		System.out.println("���� �Ƶ��� lmn �̴�.");
	}
	
	//	���⿡ xyz�Լ��� �����ϰ� �־��......
	
	
	//	���� �ƹ��� Ŭ������ ���� xyz()�� ������ ���� ������.....
	//	Over Ride �� �̿��ϸ� ����� �ٲ� �� �ִ�.
	int xyz(int a) {
		System.out.println("���� �Ƶ��� xyz �̴�.");
		return 10;
	}
	//	���� �ٽ� ������� ������
	//	����� �Լ��� �������� ���̴�.
}
