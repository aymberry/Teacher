package P0721;
import		java.util.*;
public class Test07 {

//	static void abc(ArrayList<Father07> temp) {
//		//	�̷��� �ϴ� ���� ��Ģ�̴�.
//	}
	
//	static void abc(ArrayList<? extends Father07> temp) {
//		//	�� ���� temp���� Father07�̳� �� ������ ���ʸ� �Ȱ���
//		//	���� �� �ִ�.
//	}
	
	static void abc(ArrayList<? extends Grand07> temp) {
		//	Father07 �̳� �� ������ ���˸� �Ȱ͸� �޴´�.
	}
	public static void main(String[] args) {
//		ArrayList<Father07>	list = new ArrayList<Father07>();
//		abc(list);

		ArrayList<Father07>	list = new ArrayList<Father07>();
		abc(list);
		
//		ArrayList<Son07>	list = new ArrayList<Son07>();
//		abc(list);
	}
}

class Grand07 {
	
}
class Father07 extends Grand07 {
	
}
class Son07 extends Father07 {
	
}