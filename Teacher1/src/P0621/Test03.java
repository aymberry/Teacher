package P0621;
/*
 * 	����
 * 		8848m ���� �ִ�.
 * 
 * 		�ѻ���� �Ʒ����� ���� ����� �ϰ�		1�ʴ�	0.15m�� �����ϰ�
 * 		�ٸ������ ������ �Ʒ��� �ϻ��� �Ѵ�.		1�ʴ�	0.53m�� �����Ѵ�.
 *
 * 		���� ���ʵڿ� �λ���� ���츦 �ұ��
 * 
 * 		������	2�� ������ �����ϴ�.
 */
public class Test03 {

	public static void main(String[] args) {
		float	one = 0.0F;		//	ù��° ����� ���� ��ġ
		float	two = 8848.0F;	//	�ι�° ����� ���� ��ġ
		int		second = 0;		//	�ɸ� �ð��� ����� ����
		
		while(one < two) {
			second++;
			one = one + 0.15F;
			two = two - 0.53F;
		}
		
		System.out.println("�ɸ� �ð� = " + second + " ��");
			
	}

}


