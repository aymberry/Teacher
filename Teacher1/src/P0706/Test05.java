package P0706;
/*
 * 	����	������ ���� ����� �� ���ڰ� ¦���̸� ù° �Ƶ��� ����ϰ�
 * 			Ȧ���̸� ��° �Ƶ��� ����϶�.
 */
public class Test05 {
	public static void main(String[] args) {
		int		temp = (int)(Math.random() * 100);
		
		Father05	f;
		
		if(temp % 2 == 0) {
			f = new Son051();
		}
		else {
			f = new Son052();
		}
		
		f.abc();
		
		
	}
}

class Father05 {
	void abc() {
		System.out.println("���� �ƹ���");
	}
}
class Son051 extends Father05 {
	void abc() {
		System.out.println("���� ù° �Ƶ�");
	}
}
class Son052 extends Father05 {
	void abc() {
		System.out.println("���� ��° �Ƶ�");
	}
}
