package P0704;
public class Test07 {
	public static void main(String[] args) {
	}
}

class Father07 {
	void abc() {		//	�Ϲ� �Լ�
		
	}
	final void xyz() {		//	final �Լ�
		
	}
}

class Son07 extends Father07 {
	void abc() {		//	�Ϲ� �Լ��� �󸶵��� �������̵尡 �����ϴ�.
		
	}
//	void xyz() {		//	final �Լ��� �������̵尡 ����� �Ұ����ϴ�.
//		
//	}
}





