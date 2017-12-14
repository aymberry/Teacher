package P0714;
import		java.util.regex.*;
public class Reg01 {

	public static void main(String[] args) {
		//	먼저 검사 패턴을 등록한다.
		Pattern	p = Pattern.compile("[0-9]{6}-[0-9]{7}");
		//	민증번호를 검사하는 패턴을 등록한다.
		
		String		user = "123o56-1234567";
		//	이따 테스트 할때는 이 민증 번호를 에러가 나도록 
		//	바꾸어 테스트 해야 한다.
		
		//	실제 정규식 검사를 실행한다.
		//	Matcher 는 new 시키지 못하고 직접 검사 결과를 받게 된다.
		//	이 클래스는 지금까지 배운 일반 클래스와 약간은 예외인 것이다.
		//	이런 경우는 어쩔 수 없이 외워주어야 한다.
		Matcher	m = p.matcher(user);
		//	이 안에는 검사 결과가 기억되어 있다.
		if(m.matches()) {
			//	검사 결과가 올바르니?
			System.out.println("올바르다.");
		}
		else {
			//	검사 결과가 바르지 않니?
			System.out.println("다르다.");
		}
		
		
		

	}

}



