package P0621;
/*
 * 	Ƽ�ڿ� �ҳ�Ÿ�� �ڵ��� ���ָ� �Ѵ�.
 * 	Ƽ�ڴ� 	1�ʿ� 5.21m�� ����
 * 	�ҳ�Ÿ�� 	1�ʿ� 7.42m�� ����.
 * 
 * 	Ƽ�ڴ� 1000m �տ��� ����ϵ��� �Ѵ�.
 * 
 * 	����
 * 		���ʰ� ������ �ҳ�Ÿ�� Ƽ�ڸ� ������ �� �������?
 * 
 * 		����	1�ʸ��� Ƽ���� ��ġ�� �ҳ�Ÿ�� ��ġ�� ����ؼ�
 * 				��(��ŷ)�ϸ� �ȴ�.	
 */
public class Test02 {
	public static void main(String[] args) {
		float	tico = 1000.0F;		//	Ƽ���� ���� ��ġ
		float	sonata = 0.0F;			//	�ҳ�Ÿ�� ���� ��ġ
		int		second = 0;			//	�ɸ��ð��� ����� ����

		while(sonata < tico) {
			second++;	
			tico = tico + 5.21F;
			sonata = sonata + 7.42F;
		}
		
		System.out.println("�ɸ� �ð� = " + second + " ��");
	}

}


