package P0620;
/*
 * 	����
 * 		String ������ ������ ���ڿ��� �Է��� ��
 * 		������ ���ڿ��� ���� �����ؼ� ����ϼ���
 * 
 * 		��>			String	str = "Hong";
 * 					H
 * 					o
 * 					n
 * 					g
 * 
 * 		����		charAt(��ġ)	�� ����Ͽ� �ϳ��� ������ �ȴ�.
 */
public class Test01 {

	public static void main(String[] args) {
		String	str = "Kim Myoung Whan";
		//	�̰��� 15�� �ݺ��ؾ� ���ϴ� ����� ���� �� �ִ�.
		//	�ݺ�Ƚ���� ���ڿ��� ���̸��� �� �ٸ���.
		//	��� ���ڿ��� ���̸� �˾Ƴ��� �ݺ� ȸ���� �˾Ƴ���.
		int		len = str.length();
		
		for(int i = 0; i < len; i++) {
			char	ch = str.charAt(i);
			System.out.println(ch);
		}
	}
}
