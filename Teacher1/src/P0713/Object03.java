package P0713;
public class Object03 {
	public static void main(String[] args) {
		SaGak03	s = new SaGak03(5, 7);
		System.out.println(s.garo);
		System.out.println(s);
	}
}

class SaGak03 {
	public int		garo;
	public int		sero;
	public int		area;
	public SaGak03() {}
	public SaGak03(int g, int s) {
		garo = g;
		sero = s;
		area = garo * sero;
	}
	//	���� �������� ���� ���� Ŭ������ ����ϱ� ���ϸ�...
	//		"������ ??? �� �簢���Դϴ�." ��� ����ϰ� �ʹ�.
	//	toString�� �������̵� �ϸ� �ȴ�.
	public String toString() {
		return "������ " + area + "�� �簢���Դϴ�.";
	}

}






