package P0703;
public class Test08 {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
	
		Sam08		s = new Sam08();
		System.out.println("��ü ����");
//		System.out.println(s.num);
	}
}

class Sam08 {
	int		num = 10;		//	�������		1������		num = 10�� ����ߴ�.
	static int age;
	//	�ʱ�ȭ ��
	{
		num = 100;		//					2������		num = 100���� �ٲ��
		age = 10;
	}
	
	static {
		age = 24;
//		num = 200;		//	static �ʱ�ȭ ���������� �Ϲ� ������
							//	�ʱ�ȭ �� �� ����.
	}
	
	Sam08() {
		num = 1000;		//					3������		num = 1000���� �ٽ� �ٲ��.
	}
}


