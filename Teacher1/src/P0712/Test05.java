package P0712;

public class Test05 {

	static void div() {
		int		a = 10;
		int		b = 0;
		int		c;
		try {
			System.out.println("�Լ� ó�� ����");
			c = a / b;
			//	�̺κп� ������ �����ϰ�.....
		}
		catch(Exception e) {
			System.out.println("���� �߻�");
			return;
		}
		finally {
			System.out.println("�� finally");
			//	���� �ݱ�
		}
		//	�� �κп��� ������ ����ϵ��� �ϴ� ������ �ִٰ� ��������.
		System.out.println("�� �Ϲݱ���");
		//	����� ���� ������ �ݾ��ش�.
	}
	public static void main(String[] args) {
		div();
	}

}
