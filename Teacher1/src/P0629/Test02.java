package P0629;
/*
 * 	����	MyClass01�� ����� ����.
 */
public class Test02 {

	public static void main(String[] args) {
		//	1.	����� Ŭ����(���赵)�� ��ǰ(Object)�� �����.
		MyClass01		my1 = new MyClass01();
		//		���� ��ǰ�� 2�� �ʿ��ϴ�.
		//		����	���� ���ڿ� ������ �ϴµ�(String)�� �ΰ� �ʿ��ϴ�.
		//				String	str1 = "Hong";
		//				String	str2 = "Park";
		MyClass01		my2 = new MyClass01();
		
		MyClass01[] temp = new MyClass01[5];
		temp[0] = new MyClass01();
		temp[0].num = 1000;
		
		//	2.	�����޼��� ���ؼ� MyClass01�� ������ �ִ� num ������
		//		500�� ����ϰ� �ʹ�.
		my1.num = 500;
		my2.num = 700;
		//	3.	���� ���� �޼��� ���ؼ� num�� ����ϰ� ������
		//		�̰��� display �Լ��� ���ϴ� ����� ������ش�.
		//		��� ���� �� ������ �޼��ϱ� ���ؼ� display�� ȣ���ϸ� �ȴ�.
		my1.display();	//	500
		my2.display();	//	700
		temp[0].display();//1000
	}
}

