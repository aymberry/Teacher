package P0711;
public class Test05 {
	public static void main(String[] args) {
		Outer05	out = new Outer05();
//		Outer05.Inner05 in = out.new Inner05();
		//	���� Inner�� �� �Լ� �ȿ����� ����� �� �ִ�.
		//	�ٸ��������� ����� ����� �� ����.
	}
}

class Outer05 {
	void abc() {
		int	a;
		class Inner05 {	//	���� Inner Ŭ������� �Ѵ�.
			
		}
		//	���� �� �Լ� �ȿ����� new ��Ű�� ����� �� �ִ�.
		Inner05	in = new Inner05();
	}
}
