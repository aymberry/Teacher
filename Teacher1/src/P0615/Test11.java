package P0615;
/*
 * 	����
 * 		���ĺ� ���ڸ� �Է��� ��
 * 		�빮���̸� �ҹ��ڷ� ����ϰ�, �ҹ����̸� �빮�ڷ� ����϶�.
 */
public class Test11 {

	public static void main(String[] args) {
		char	ch = '@';

		
		char	b = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : 
					((ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : ch);
		//	�빮�ڰ� �ƴϸ� �ҹ��ڰ� �ȴٴ� ������ �����Ƿ�.....
		//	�ٽ� �ҹ��� ������ �˻��ؾ� �Ѵ�.
		//	�׷��Ƿ� �ٽ� ���� �����ڸ� ����ؼ� ó���ؾ� �Ѵ�.
		
		System.out.println(b);
	}

}






