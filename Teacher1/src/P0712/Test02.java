package P0712;
public class Test02 {
	public static void main(String[] args) {
		int		a = 10;
		int		b = 0;
		int		c;
		try {
			System.out.println("�߻���");
			c = a / b;		//	�� �κ��� ���� �߻� ������ �����Ѵ�.
			System.out.println("�߻���");

		}
		catch(Exception e) {
			c = a / 1;
		}
	
		
		System.out.println("��� = " + c);
		
		System.out.println("���α׷� ����");

	}
}
