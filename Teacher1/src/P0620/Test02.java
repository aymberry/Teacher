package P0620;
/*
 * 	����
 * 		���ڿ��� �ϳ� �Է��� �� ��� �빮�ڷ� �ٲپ ����ϵ��� �Ѵ�.
 * 
 * 		����
 * 			�ѱ��ھ� ������ �װ��� �ҹ����̸� �빮�ڷ� �ٲپ ó���Ѵ�.
 */
public class Test02 {

	public static void main(String[] args) {
		String	str = "Kim Myoung Whan";
		String	result = "";			//	����� ����� ����
		int		len = str.length();
		
		for(int i = 0; i < len; i++) {
			char	ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				//	�ҹ����̸� �빮�ڷ� �ٲپ
				ch = (char)(ch - 32);
				//	�װ��� ��� ������ �����Ѵ�.
				result = result + ch;
				
			}	//	ch >= 'a' && ch <= 'z'		true
			else {
				//	�ƴϸ�(�빮���̰ų�, Ư�������̸�)
				//	�״�� �����ϸ� �ȴ�.
				result = result + ch;
			}	//	ch >= 'a' && ch <= 'z'		false
		}
		System.out.println("��� = " + result);
	}
}



