package P0630;
public class Test04 {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		System.out.println("�ּ� ���� �����");
		Sam04		s;
		System.out.println("Instance �����");
		s = new Sam04();
		System.out.println("���α׷� ��");
	}
}

class Sam04 {
	Sam04() {
		System.out.println("���� ������ �Լ��̴�. 1");
	}
	Sam04(int a) {
		System.out.println("���� ������ �Լ��̴�. 2");
	}
}

