package P0706;
//	�� �ҽ��� �ǹ��� �ش��ϴ� �ҽ�
public class Test03 {
	public static void main(String[] args) {
		SaGak		s1 = new SaGak(5, 4);
//		SaGak		s2 = new SaGak(5, 4);
		SaGak		s2 = new SaGak(2, 10);
		//	���� �� Ŭ������ �����Ͱ� ������ Ŭ�����̴�.
		//		==	�� �׻� �ּ� �񱳸� �Ѵ�.
		//			�� ���� ������ ���� ���� ���븸 ���Ѵ�.
		
		if(s1.equals(s2)) {
			//	�����
			//		SaGak Ŭ������ �ڵ������� Object�� ��� �޾����Ƿ�
			//		Object�� ����� �� ����� �� �ִ�.
			
			//		Object�� ���� equals()�Լ��� ���� ���ϴ� �Լ��� �ƴϰ�
			//		�ּҸ� ���ϴ� �Լ��̴�.
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
	}
}

class SaGak {
	int		garo;
	int		sero;
	int		area;
	public SaGak() {}
	public SaGak(int g, int s) {
		garo = g;
		sero = s;
		area = g * s;
	}

	//	�������� � Ŭ������ �����
	//	�� Ŭ������ ����ϴ� �������� �������� equals()�� �̿��ؼ�
	//	�����Ͱ� ������ ���Ҷ�� ����� ���̴�.
	//	������ �ٸ��� ��� ����� �����Ƿ�... â���� ���̴�.
	//	�׷� ������� ����� ���ٰ� ����� ������ �� �� ������?
	
	//	Object�� equals �Լ��� ����� ���� ���� �ʴ���....
	//	 ���� ������ ������ ���� Ŭ������ �ϰ� ������...
	//	Object��  equals�� �ּҸ� ���ϹǷ�... ����� �ٲٰ� ���� ���̴�.
	//	�׷� �������̵��ϸ� ����� �ٲ� �� �ְڴ�.
	//	���ٶ��̵��� ��Ģ�� �ƹ��� Ŭ������ �Լ� ������ �����ϰ�
	//	����� ���̴�.
	public boolean equals(/*SaGak this */Object obj) {
		//	�� �Լ��� ���� SaGak Ŭ������ ����� �� ���̴�.
		//	��� �Լ��� JVM�� "Ŭ�����̸� this"�� ���� �غ� �Ѵ�.
		
		//	�� �Լ��� ������		s1.equals(s2)	�� ������� �̿��� ���̴�.
		//		this -> s1
		//		obj -> s2		�� ���� ���̴�.
		SaGak temp = (SaGak) obj;
		//	�츮�� ������ ������ ������ ���������� �����ϱ⸦ ���Ѵ�.
//		if(this.area == temp.area) {
		if(this.garo == temp.garo && this.sero == temp.sero) {
			return true;
		}
		else {
			return false;
		}
	}
	
}









