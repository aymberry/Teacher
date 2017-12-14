package P0714;
/*
 * 	����
 * 		����ڰ� �ڽ��� ��ȭ��ȣ�� �Է��ߴٰ� �����ϰ�
 * 		�� ��ȣ�� �ùٸ� ���������� �˻�����.
 * 
 * 		��� Ŭ����	Pattern, Matcher �� �ִµ�....
 * 		�̵��� ��� 	java.util.regex ��Ű�� �Ҽ��̴�.
 */
import		java.util.regex.*;
public class Reg02 {
	public static void main(String[] args) {
		//	1.	����ڿ��� ��ȭ��ȣ�� �Է� �޴´�.
		String	tel = "011-1111-2222";
		
		//	2.	��ȭ��ȣ ���Խ� �˻縦 �ϱ� ���ؼ� ������ ����Ѵ�.
		Pattern	p = Pattern.compile("^01[0-9]-[0-9]{4}-[0-9]{4}$");
		//	3.	���Խ� �˻縦 �����ؼ� ����� Matcher���� �˷��ش�.
		Matcher	m = p.matcher(tel);
		//	4.	Matcher�� ������ �̿��ؼ� ����� Ȯ���Ѵ�.
		if(m.matches()) {
			//	����
			System.out.println("�ùٸ� ��ȭ��ȣ �����ؿ�");
		}
		else {
			//	����
			System.out.println("��ȭ��ȣ�� �ٽ� �Է����ּ���");
		}
	}
}
