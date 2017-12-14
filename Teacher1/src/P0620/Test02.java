package P0620;
/*
 * 	문제
 * 		문자열을 하나 입력한 후 모두 대문자로 바꾸어서 출력하도록 한다.
 * 
 * 		원리
 * 			한글자씩 꺼내서 그것이 소문자이면 대문자로 바꾸어서 처리한다.
 */
public class Test02 {

	public static void main(String[] args) {
		String	str = "Kim Myoung Whan";
		String	result = "";			//	결과를 기억할 변수
		int		len = str.length();
		
		for(int i = 0; i < len; i++) {
			char	ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				//	소문자이면 대문자로 바꾸어서
				ch = (char)(ch - 32);
				//	그것을 결과 변수에 누적한다.
				result = result + ch;
				
			}	//	ch >= 'a' && ch <= 'z'		true
			else {
				//	아니면(대문자이거나, 특수문자이면)
				//	그대로 누적하면 된다.
				result = result + ch;
			}	//	ch >= 'a' && ch <= 'z'		false
		}
		System.out.println("결과 = " + result);
	}
}



