package P0704;
public class Test02 {
	public static void main(String[] args) {
		Son02		s = new Son02(5);
	}
}

class Father02 {
//	Father02() {
//		System.out.println("���� �ƹ��� Ŭ���� ������");
//	}
	//	�ƹ����� Default �����ڰ� ������ �� Ŭ������
	//	�ٸ� Ŭ������ ��Ģ�����δ� ����� �Ұ����ϴ�.
//	Father02(int a) {
//		System.out.println("���� �ƹ��� Ŭ���� int ������");
//	}
	
}

class Son02 extends Father02 {
	Son02() {
		System.out.println("���� �Ƶ� Ŭ���� ������");
	}
	Son02(int a) {
		System.out.println("���� �Ƶ� Ŭ���� int ������");
	}
}





