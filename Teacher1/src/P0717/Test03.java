package P0717;
import		java.text.*;
public class Test03 {

	public static void main(String[] args) {
		//	..	������ �۾��ϴٰ� ���� ����� ���Դ�.
		int	score = 67;
		
		//	�� ����� ���ϴ� ���ڿ��� ��ȯ�ؼ� ����ϰ� �ʹ�.
		//	1.	��ȯ ������ double �迭�� �غ��Ѵ�.
		double[]	s1 = {0, 60, 70, 80, 90};
		//	2.	������ ��ȯ���ؿ� ���� ��ȯ �����͸� �غ��Ѵ�.
		String[]	s2 = {"F����", "D����", "C����", "B����", "A����"};
		ChoiceFormat	form = new ChoiceFormat(s1, s2);
		
		String	dap = form.format(score);
		System.out.println(dap);
		
	}

}
