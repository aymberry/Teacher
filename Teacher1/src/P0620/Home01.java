package P0620;
import		java.util.*;	
public class Home01 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		String		str = sc.nextLine();
		String		result = "";			//	�ٲ� ����� ����� ����
		
		int		len = str.length();
		for(int i = 0; i < len; i++) {
			char	ch = str.charAt(i);
			
			//	�� ���ڰ� �빮������ �˾ƺ���.
			if(ch >= 'A' && ch <= 'Z') {
				//	�ҹ��ڷ� �ٲپ� ����� �ִ´�.
				char	temp = (char) (ch + 32);
				result = result + temp;
			}
			//	�ƴϸ� �ҹ������� �˾ƺ���.
			else if(ch >= 'a' && ch <= 'z') {
				//	�빮�ڷ� �ٲپ� ����� �ִ´�.
				char	temp = (char) (ch - 32);
				result = result + temp;
			}
			//	�ƴϸ� Ư�������̹Ƿ� �״�� ����Ѵ�.
			else {
				result = result + ch;
			}
		}
		
		System.out.println("��� = " + result);

	}

}






