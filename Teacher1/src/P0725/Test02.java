package P0725;

public class Test02 {
	public static void main(String[] args) {
		Sam021	s = new Sam021();
		s.abc();
	}
}
//	�� �� Ŭ������ ���� ������ ������ �� �ֵ��� �غ���. 
class Sam021 {
	Sam022		s2;		//	Sam022�� ����� �� �ֵ��� �ּҸ�
							//	����� ����
	void abc() {
		//	���⼭ �Ʒ����� Ŭ������ ����ϱ� ���ؼ� new ��Ų��.
		s2 = new Sam022();
		s2.abc();
	}
}

class Sam022 {
	Sam021		s1;		//	Sam021�� ����� �� �ֵ��� �ּҸ�
							//	����� ����
	void abc() {
		s1 = new Sam021();
		//	�̰� �߸��� ����
	}
}
