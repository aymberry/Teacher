package P0616;

public class Home03 {
	public static void main(String[] args) {
		int	a = (int) (Math.random() * (100 - 1 + 1) + 1);
		int	b = (int) (Math.random() * (100 - 1 + 1) + 1);
		int	cha;		//	����� ����� ����
		//	ū������ �������� ���� �ϹǷ� ������� ū�� �˾ƺ���.
		if(a > b) {
			//	a�� ũ�ٰ� ���� �����Ƿ�....
			//	a���� b�� ���� �ȴ�.
			
			cha = a - b;
		}	//	a > b 	true
		else {
			//	a > b�� �ƴϿ� �̹Ƿ� b �� ū ����̴�
			//	�׷��Ƿ� b���� a�� ���� �Ѵ�.
			
			cha = b - a;
		}	//	a > b	false
		
		System.out.println("�߻��� �� = " + a + " �� " + b);
		System.out.println("�μ��� ���� = " + cha);
		
	}	//	main �Լ�

}	//	class
