package P0704;

public class Test06 {
	public static void main(String[] args) {
		Sam06		s = new Sam06();
		
		s.num1 = 200;			//	�Ϲ� ������ �󸶵��� ���� ������ �� �ִ�.
//		s.num2 = 300;			//	final ������ ���� ������ �� ����.
	}
}

class Sam06 {
	int		num1 = 10;		//	�Ϲ� �����̴�.
	final	int num2 = 100;	//	final �����̴�.
	
}