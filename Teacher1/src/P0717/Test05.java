package P0717;
import		java.text.*;
public class Test05 {

	public static void main(String[] args) {
		//	..	�հ� �۾��� �ϴٰ� �۾� ����� ������ ���� ���Դ�.
//		Object[]	result = {5, 6, 30};
		//	Object�� ���ڵ� ����� �� �ִµ�...
		//	������		���ڴ� �ּҷ� �ڵ� Boxing�Ǳ� �����̴�.
		//	���		Object�� �ڹ��� ������ �� ����� �� �ִ�.

		int		garo = 10;
		int		sero = 20;
		int		area = 200;
		//	���� �̰��� 
		//	"���� ??, ���� ??�̸� ������ ??�� �簢���Դϴ�." ���
		//	����ϰ� �ʹ�.
		
		//	�� Ŭ������ new ��Ű�� �ʰ� static �Լ��� �̿��ϴ�
		//	�� Ư���� Ŭ�����̴�.
		String dap = MessageFormat.format(
				"���� {0}, ���� {1}�̸� ������ {2}�� �簢���Դϴ�.", 
				garo, sero, area);
		System.out.println(dap);

	}

}




