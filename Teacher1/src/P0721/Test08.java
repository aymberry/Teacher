package P0721;

enum Type {
	WALKING, RUNNING, TRACKING, HIKING
}
public class Test08 {
	public static void main(String[] args) {
		MyShoes08	my = new MyShoes08();
		my.maker = "����Ű";
		my.size = 260;
		my.type = Type.RUNNING;
		//	������ ������ ���������� ǥ���ϹǷ� ���ذ� ����
		//	��ǻ�� ���忡���� ���������� �۾������� �۾��� ���ϴ�.

		System.out.println("�� �Ź��� ");
		System.out.println("����Ŀ =  " + my.maker);
		System.out.println("ũ�� =  " + my.size);
		System.out.println("���� =  " + my.type);
		
		//	����
		//		enum ������ ���� ���� ������(����)�� Ȯ���ϴ� ���
		//		ordinal()�� ����ϸ� �ȴ�.
		System.out.println("���� ������ = " + my.type.ordinal());
		
		
	
	}
}

class MyShoes08 {
	String	maker;
	int		size;
	//	�� �Ź��� ������ ����ϰ� �ʹ�.
	//	�Ź��� ������ �̸� ������ ���ڸ� �̿��ؾ� �� �ʿ䰡 �����.
	//	�׷��� �̸� �Ź��� ������ ���������� ǥ���� enum Ŭ������
	//	�����	�� Ŭ������ ������ ����ϸ� ���ϴ�.
	Type	type;		//	�� �������� �Ź��� ������ ���ȴ�.
}