package P0621;
/*
 * 	����
 * 		1~100���� ���� ����϶�
 * 
 * 		�̰��� 100���� �ݵ�� �ݺ��ؾ� ����� ���´ٴ� ������ �ִ�.
 * 		�̷� ������ ������ do~while�ε� ó���� �� �ִ�.
 */
public class Test05 {

	public static void main(String[] args) {
		int	hap = 0;		//	����� ����� ����
		int	num = 0;		//	���� ���ڸ� ����� ����
		
		do {
			num = num + 1;	//	���� ���ڸ� �ϳ��� �����ϸ鼭
			hap = hap + num;	//	1~100���� ���Ѵ�.
		} while(num < 100);
		
		System.out.println("��� = " + hap);
	}
}
