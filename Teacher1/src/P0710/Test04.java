package P0710;
public class Test04 {
	public static void main(String[] args) {
	}
}

interface MyInter04 {
	void abc();		//	������ �߻� �Լ�
	//	1.8 �������� �߰��� ����
	static void xyz() {
		//	static �Լ��� ������ �� �ְ�
	}
	default void lmn() {
		//	�Ϲ� �Լ��� ������ �� �ִµ�...
		//	�̶��� �ݵ�� default ��� ����� �־�� �Ѵ�.
	}
}

//	�������̽� �����
class MyClass04 implements MyInter04 {
	//	������ �߻� �Լ��� �������̵� �Ǳ� �ʾƼ� ������ ����.
	public void abc() {
		
	}
	//	static, default�� �ʿ��ϸ� �������̵��ϰ� �ʿ����� ������
	//	���ص� ����� ����.
//	public void lmn() {
//		
//	}
}





