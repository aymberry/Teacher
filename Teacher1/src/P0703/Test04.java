package P0703;
public class Test04 {
	public static void main(String[] args) {
		Sam04		s = new Sam04("ȫ�浿");
	}
}

class Sam04 {
	String		name;
	int			age;
	boolean	gender;
	
	//	�����͸� ���� �𸣴� ���
	Sam04() {
		this("����", 0, true);
		System.out.println("���� �����͸� �𸣴� �����ڴ�");
//		name = "����";
//		age = 0;
//		gender = true;

	}
	//	�̸��� �ƴ� ���
	Sam04(String n) {
		this(n, 0, true);
		System.out.println("���� �̸��� �ƴ� �����ڴ�");
//		name = n;
//		age = 0;
//		gender = true;

	}
	//	�̸��� ���̸� �ƴ� ���
	Sam04(String n, int a) {
		this(n, a, true);
//		name = n;
//		age = a;
//		gender = true;
		
	}
	//	��� �����͸� �� �ƴ� ���
	Sam04(String n, int a, boolean g) {
		name = n;
		age = a;
		gender = g;
		System.out.println("���� ������ �����ڴ�");
	}
}