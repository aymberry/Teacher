package P0713;

public class String03 {
	static void change(StringBuffer a) {
		System.out.println("�Լ��� = " + a);	//	�ھ���
		
		a = a.append("����");
		
		System.out.println("�Լ��� = " + a);	//	�ھ��� ����
	}
	public static void main(String[] args) {
		StringBuffer	a = new StringBuffer("�ھ���");
		System.out.println("ȣ���� = " + a);	//	 �ھ���
		change(a);	
		System.out.println("ȣ���� = " + a);	//	�ھ��� ����

	}

}
