package P0713;

public class String02 {

	static void change(String a) {
		System.out.println("�Լ��� = " + a);		//	�ھ���
		
		a = a + "����";
		
		System.out.println("�Լ��� = " + a);		//	�ھ�������
	}
	
	public static void main(String[] args) {
		String	a = "�ھ���";
		System.out.println("ȣ���� = " + a);		//	 �ھ���
		change(a);	
		System.out.println("ȣ���� = " + a);		//	�ھ���
	}
}






