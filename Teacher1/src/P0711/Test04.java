package P0711;
public class Test04 {
	public static void main(String[] args) {
	}
}

class Outer04 {
	int		a;
	void abc() {
		System.out.println("�ٱ� a = " + a);
	}
	
	class Inner04 {
		int		a;
		void abc() {
			System.out.println("���� a = " + a);
		}
		void xyz() {
			a = 10;		//	�̰��� ������ ������ ����ϴ� ���̴�.
			//	���� �ٱ� ������ ����ϰ� ������....
			Outer04.this.a = 20;
			abc();		//	������ abc()�� ȣ���Ѵ�.
			Outer04.this.abc();	//	�ٱ���  abc()�� ȣ���Ѵ�.
		}
	}
}

