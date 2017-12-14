package P0620;
import		java.util.*;	
public class Home01 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		String		str = sc.nextLine();
		String		result = "";			//	바뀐 결과를 기억할 변수
		
		int		len = str.length();
		for(int i = 0; i < len; i++) {
			char	ch = str.charAt(i);
			
			//	이 문자가 대문자인지 알아보자.
			if(ch >= 'A' && ch <= 'Z') {
				//	소문자로 바꾸어 결과에 넣는다.
				char	temp = (char) (ch + 32);
				result = result + temp;
			}
			//	아니면 소문자인지 알아보자.
			else if(ch >= 'a' && ch <= 'z') {
				//	대문자로 바꾸어 결과에 넣는다.
				char	temp = (char) (ch - 32);
				result = result + temp;
			}
			//	아니면 특수문자이므로 그대로 사용한다.
			else {
				result = result + ch;
			}
		}
		
		System.out.println("결과 = " + result);

	}

}






