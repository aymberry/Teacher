package P0616;
/*
 * 	문제
 * 		ASCII 코드 65('A')에서 122('z')까지의 랜덤한 문자를 발생한다.
 * 		그리고 이 문자가 대문자인지? 소문자인지? 특수문자인지를
 *		판단하는 프로그램을 작성하세요
 *
 *		65 ~ 90	까지는 대문자
 *		97 ~122	까지는 소문자이다.
 *
 * 		고로 91~96까지의 문자는 특수문자이다.		
 */
public class Test06 {

	public static void main(String[] args) {
		char	ch = (char)(Math.random() * ('z' - 'A' + 1) + 'A');
		String	result;		//	판단 결과를 기억할 변수
		//	대문자인지 질문
		if(ch >= 'A' && ch <= 'Z') {
			result = "대문자 입니다.";
		}
		//	아니면 소문자일 수 있고, 특수 문자일 수 있으므로...
		//	다시 질문한다.
		else if(ch >= 'a' && ch <= 'z') {
			result = "소문자 입니다.";
		}
		else {
			result = "기타 문자 입니다.";
		}
		
		System.out.println(ch + " 는 " + result);
	}

}




