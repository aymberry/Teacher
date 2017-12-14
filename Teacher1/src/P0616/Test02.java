package P0616;
/*
 * 	알파벳 문자라고 가정하고
 * 	문자 하나를 입력한 후 그 문자가 소문자이면 대문자로 바꾸어서
 * 	출력하세요
 * 	대문자면 그대로 출력하라. 
 */
public class Test02 {

	public static void main(String[] args) {
		//	문자하나를 입력했다.
		char	ch = 'g';
		//	이 문자가 혹시라도 소문자이면? 문제가 생긴다.
		if(ch >= 'a' && ch <= 'z') {
			//	대문자로 바꾸어서 사용하도록 한다.
			ch = (char) (ch - 32);
		}
		
		System.out.println(ch);
		
	}

}
