package P0616;

public class Test11 {
	public static void main(String[] args) {
//		String	a = new String("Hong");
//		String	b = new String("Hong");
		
		String	a = "Hong";
		String b = "Hong";
//		m56-441-510
//		if(a == b) {		//	�̷��� ���� ����ϴ�.
		if(a.equals(b)) {
			System.out.println("����.");
		}
		else {
			System.out.println("�ٸ���.");
		}

	}

}
