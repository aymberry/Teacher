package P0616;

public class Home04 {
	public static void main(String[] args) {
		char	ch = (char) (Math.random() * (256 - 0 + 1) + 0);
		String	result;
		//	4���� ��� �߿��� �빮������ �����
		if(ch >= 'A' && ch <= 'a') {
			result = "�빮��";
		}
		//	�빮�ڰ� �ƴϸ� �ٽ� 3���� ��찡 �����Ƿ�
		//	�̹����� �ҹ��������� �����
		else if(ch >= 'a' && ch <= 'z') {
			result = "�ҹ���";
		}
		//	�ҹ��ڵ� �ƴϸ� �ٽ� 2���� ��찡 ���´�.
		//	�׷��Ƿ� �̹����� ���������� �����
		else if(ch >= '0' && ch <= '9') {
			result = "����";
		}
		//	���� ������ �ƴ϶�� ���°��� Ư������ ���̴�.
		//	�׷��Ƿ� ��� �ʿ䵵 ���� Ư�����ڰ� �� ���̴�.
		else {
			result = "Ư������";
		}	
		
		System.out.println("�߻��� ���� = " + ch);
		System.out.println("�� ���ڴ� = " + result);
	}	//	main �Լ�
	
}	//	class
