package P0629;
public class Test03 {
	public static void main(String[] args) {
//		String	str1 = "Hong";
//		String	str2 = "Hong";
		String	str1 = new String("Hong");
		String	str2 = new String("Hong");
		
//		if(str1 == str2) {
//			System.out.println("���ƿ�");
//		}
//		else {
//			System.out.println("�޶��");
//		}
		
		//	�̷������� �߻��ϹǷ�....
		//	String�� ���ڿ��� ������ ���ϴ� ����� �غ��� ���Ҵ�.
		//	equals()
		if(str1.equals(str2)) {
			System.out.println("���ƿ�");
		}
		else {
			System.out.println("�޶��");
		}
		
		
		
		
	}
}
