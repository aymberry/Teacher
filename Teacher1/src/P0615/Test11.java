package P0615;
/*
 * 	문제
 * 		알파벳 문자를 입력한 후
 * 		대문자이면 소문자로 출력하고, 소문자이면 대문자로 출력하라.
 */
public class Test11 {

	public static void main(String[] args) {
		char	ch = '@';

		
		char	b = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : 
					((ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : ch);
		//	대문자가 아니면 소문자가 된다는 보장이 없으므로.....
		//	다시 소문자 인지를 검사해야 한다.
		//	그러므로 다시 조건 연산자를 사용해서 처리해야 한다.
		
		System.out.println(b);
	}

}






