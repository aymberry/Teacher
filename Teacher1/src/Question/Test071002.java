package Question;

public class Test071002 {

	public static void main(String[] args) {
		exam10 e = new exam10();	
		e.abc();
		MyInter10.xyz();	// �������̵� ���� ���� static �Լ� ����
		e.lmn();	// �������̵� ���� ���� default �Լ��� ����
	}

}
interface MyInter10 {
	public abstract void abc(); // �ڵ������� public, abstract �Լ��� �ȴ�.
				    // �߻��Լ� �̹Ƿ� { } ���� �����ؾ� �Ѵ�. 
	static void xyz() {
		System.out.println("xyz ���");
	}	// static �Լ��� ������ �� �ִ�.
	
	default void lmn() {
		System.out.println("lmn ���");
	}	// �Ϲ��Լ��� ������ �� ������..
		// default ��� ����� �־�� �Ѵ�. 
}

class exam10 implements MyInter10 {
	public void abc() {	// ����� �� �߻��Լ��� �������̵� �ؾ� �Ѵ�.
		System.out.println("abc ���");
	}
}