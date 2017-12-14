package P0714;
/*
 * 	문제
 * 		사용자가 자신의 전화번호를 입력했다고 가정하고
 * 		이 번호가 올바른 패턴인지를 검사하자.
 * 
 * 		사용 클래스	Pattern, Matcher 가 있는데....
 * 		이들은 모두 	java.util.regex 패키지 소속이다.
 */
import		java.util.regex.*;
public class Reg02 {
	public static void main(String[] args) {
		//	1.	사용자에게 전화번호를 입력 받는다.
		String	tel = "011-1111-2222";
		
		//	2.	전화번호 정규식 검사를 하기 위해서 패턴을 등록한다.
		Pattern	p = Pattern.compile("^01[0-9]-[0-9]{4}-[0-9]{4}$");
		//	3.	정규식 검사를 진행해서 결과를 Matcher에게 알려준다.
		Matcher	m = p.matcher(tel);
		//	4.	Matcher의 정보를 이용해서 결과를 확인한다.
		if(m.matches()) {
			//	성공
			System.out.println("올바른 전화번호 감사해요");
		}
		else {
			//	실패
			System.out.println("전화번호를 다시 입력해주세요");
		}
	}
}
