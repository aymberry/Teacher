package P0706;
public class Test09 {
	public static void main(String[] args) {
		SamGak09	s = new SamGak09(5, 7);
		//	����	���� ���� ���� SamGak09�� ����ϸ�
		//			HashCode ��ſ�
		//			"������ ???? �� �ﰢ�� �Դϴ�."�� ����ϰ� �Ѵٸ�?
		System.out.println(s);
	}
}

class SamGak09 {
	int		base;
	int		height;
	float	area;
	
	SamGak09() {}
	SamGak09(int b, int h) {
		base = b;
		height = h;
		area = (b * h) / 2.0F;
	}
	//	1.	�� Ŭ���� �ȿ��� toString�� �����Ѵ�.
	//		�� Ŭ������ ��Ȱ�� �ƽô� ���̴�.
	//	2.	���� �� ��Ȱ�� ������ ���� �ʴ´�.
	public String toString(/* SamGak08 this*/) {
		//	�������� ���Լ��� ���ϸ�....
		//			s.toString()���� ȣ���� ���̴�.
		//		this -> s�� ���� ���̴�.
		return "������ " + area + " �� �ﰢ�� �Դϴ�.";
	}
}