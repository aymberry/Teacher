package P0703;
public class Test02 {
	public static void main(String[] args) {
		Sam02		s = new Sam02();
		
		s.setNum(10);
		
		s.display();
	}
}

class Sam02 {
	int		num;
	
	void setNum(int num) {
		//	�Ű������� int num�� ���������̴�.
		//	�Ѱ��� ���		���������� ���������� ���� �̸���
		//						����ص� �����ϴ�.
		this.num/*(1)*/ = num/*(2)*/;
		//	(2)		���������� �� ���̴�.
		//	(1)		���� �̸��� ������ �ǹǷ� �Լ� ���忡����
		//			�ڽŰ� ���� ����� �� ������ ���������̴�.
		
		//	���	���� ������ ������� ���� �����̴�.
		//	�̶� ���� ������ ����ϱ� ���ؼ��� ������
		//	�� ������ ��� �������� ������ �ϴ� ��찡 �߻��Ѵ�.
	}
	
	void display() {
		System.out.println(num);
	}
}


