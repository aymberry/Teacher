package P0714;
import		java.util.regex.*;
public class Reg01 {

	public static void main(String[] args) {
		//	���� �˻� ������ ����Ѵ�.
		Pattern	p = Pattern.compile("[0-9]{6}-[0-9]{7}");
		//	������ȣ�� �˻��ϴ� ������ ����Ѵ�.
		
		String		user = "123o56-1234567";
		//	�̵� �׽�Ʈ �Ҷ��� �� ���� ��ȣ�� ������ ������ 
		//	�ٲپ� �׽�Ʈ �ؾ� �Ѵ�.
		
		//	���� ���Խ� �˻縦 �����Ѵ�.
		//	Matcher �� new ��Ű�� ���ϰ� ���� �˻� ����� �ް� �ȴ�.
		//	�� Ŭ������ ���ݱ��� ��� �Ϲ� Ŭ������ �ణ�� ������ ���̴�.
		//	�̷� ���� ��¿ �� ���� �ܿ��־�� �Ѵ�.
		Matcher	m = p.matcher(user);
		//	�� �ȿ��� �˻� ����� ���Ǿ� �ִ�.
		if(m.matches()) {
			//	�˻� ����� �ùٸ���?
			System.out.println("�ùٸ���.");
		}
		else {
			//	�˻� ����� �ٸ��� �ʴ�?
			System.out.println("�ٸ���.");
		}
		
		
		

	}

}



