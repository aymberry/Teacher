package P0615;
/*
 * 	����
 * 		���� �ϳ��� �Է��ϸ� �� ������ ���밪�� ����ϼ���.
 */
public class Test08 {
	public static void main(String[] args) {
		int		num = -10;		//	������ ������ �ٲپ �׽�Ʈ �Ѵ�.
		
		int		abs =	(num > 0)	? num : -num;
		//		num > 0�� ���̸� num �� �����ϰ�
		//		num > 0�� �����̸� -num�� �����϶�.
		System.out.println(abs);
	}
}


