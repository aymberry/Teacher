package P0707;
public class Test03 {
	public static void main(String[] args) {
		Sam03		s;		//	���� ������ ���� �� �ִ�.
//		s = new Sam03();	//	�̷��� ������ ����.
		
		s = new Son03();	//	������ �̿��ؼ� �ν��Ͻ� ���� ����Ѵ�.
	}
}

abstract class Sam03 {
	abstract void abc();
	abstract void xyz();
	void lmn() {
		
	}
}

class Son03 extends Sam03 {
	//	�ݵ�� �߻� Ŭ������ ������ �ִ� ��� �߻� �Լ���
	//	�������̵��Ͽ� ���(��ü)�� ������ �Ѵ�.
	void abc() {};
	void xyz() {};
	//	����	����� �� ����� �־�� �Ѵ�.
}