package Question;
import		java.util.*;
public class Test071401 {

	public static void main(String[] args) {
		//	1.	Object�� equals �Լ��� �� ��ü�� ������ ���ϴ� �Լ��̴�.
		//		����
		//			�迭�� �񱳸� �� �� ����.
		//	�� ������ �ذ��ϱ� ���ؼ� ���� �Լ��� deepEquals()�Լ��̴�.
		int		a = 10;
		int		b = 10;
//		int[]	a = {10};
//		int[]	b = {10};
		if(Objects.deepEquals(a, b)) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}

	}

}
