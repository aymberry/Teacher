package P0707;
import		java.util.*;
public class Test04 {
	public static void main(String[] args) {
		Calendar		car;
//		car = new Calendar();		//	����
		car = Calendar.getInstance();
		
		int		year = car.get(Calendar.YEAR);		//	�⵵�� �˾Ƴ��� ���̴�.
		int		month = car.get(Calendar.MONTH) + 1;	//	���� �˷��ش�.
		//	����
		//	==>		���� 1������ �����ϴµ� �ڹٴ� 0���� ����ϴ� ����̹Ƿ�
		//			1���� 0�̶�� �˷��ش�.
		//			�׷��� �����Ұ� ���� �ݵ�� +1�� �ؾ߸� ��Ȯ��
		//			���� ���´�.
		System.out.println(year);
		System.out.println(month);
	}

}
