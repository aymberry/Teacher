package P0710;
public class Test05 {
	public static void main(String[] args) {
		Son05	s = new Son05();
		if(s instanceof Son05) {
			//	�ǹ� s ������ ���� ������ Son05 Ŭ�����̴�?
			System.out.println("��");
		}
		if(s instanceof Father05) {
//			�ǹ� s ������ ���� ������ Father05 Ŭ�����̴�?
			//	s��  Father05���� ��� �޾����Ƿ�...
			//	s�� Son05 �̸鼭 Father05�� ��Ȱ�� �Ѵ�.
			System.out.println("��2");
		}
		
		if(s instanceof MyInter051) {
			//	�̰͵� �´ٰ� ����Ѵ�.
			//	���� 	�������̽��� ����� �ٸ� Ŭ�����̴�.
			//			�׷��Ƿ� ���� Ŭ������ ��Ȱ�� �Ѵ�.
			System.out.println("��3");
		}
		
		if(s instanceof Object) {
			System.out.println("��4");
		}
		
	}
}

interface MyInter051 {
	
}
interface MyInter052 {
	
}
class Father05 {
	
}
//	Ŭ������ ���鶧
//		extends�� ���� �Ѱ��� ����ϸ�
//		implements �� �������� ����� �� �ִ�.
class Son05 extends Father05 implements MyInter051, MyInter052 {
	
}
