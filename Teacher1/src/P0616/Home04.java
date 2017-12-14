package P0616;

public class Home04 {
	public static void main(String[] args) {
		char	ch = (char) (Math.random() * (256 - 0 + 1) + 0);
		String	result;
		//	4가지 경우 중에서 대문자인지 물어보자
		if(ch >= 'A' && ch <= 'a') {
			result = "대문자";
		}
		//	대문자가 아니면 다시 3가지 경우가 있으므로
		//	이번에는 소문자인지를 물어보자
		else if(ch >= 'a' && ch <= 'z') {
			result = "소문자";
		}
		//	소문자도 아니면 다시 2가지 경우가 남는다.
		//	그러므로 이번에는 숫자인지를 물어보자
		else if(ch >= '0' && ch <= '9') {
			result = "숫자";
		}
		//	숫자 마저도 아니라면 남는것은 특수문자 뿐이다.
		//	그러므로 물어볼 필요도 없이 특수문자가 될 것이다.
		else {
			result = "특수문자";
		}	
		
		System.out.println("발생한 문자 = " + ch);
		System.out.println("그 문자는 = " + result);
	}	//	main 함수
	
}	//	class
