package P0616;
/*
 * 	���ĺ� ���ڶ�� �����ϰ�
 * 	���� �ϳ��� �Է��� �� �� ���ڰ� �ҹ����̸� �빮�ڷ� �ٲپ
 * 	����ϼ���
 * 	�빮�ڸ� �״�� ����϶�. 
 */
public class Test02 {

	public static void main(String[] args) {
		//	�����ϳ��� �Է��ߴ�.
		char	ch = 'g';
		//	�� ���ڰ� Ȥ�ö� �ҹ����̸�? ������ �����.
		if(ch >= 'a' && ch <= 'z') {
			//	�빮�ڷ� �ٲپ ����ϵ��� �Ѵ�.
			ch = (char) (ch - 32);
		}
		
		System.out.println(ch);
		
	}

}
