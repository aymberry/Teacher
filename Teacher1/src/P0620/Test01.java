package P0620;
/*
 * 	문제
 * 		String 변수에 적당한 문자열을 입력한 후
 * 		각각의 문자열을 따로 추출해서 출력하세요
 * 
 * 		예>			String	str = "Hong";
 * 					H
 * 					o
 * 					n
 * 					g
 * 
 * 		원리		charAt(위치)	를 사용하여 하나씩 뽑으면 된다.
 */
public class Test01 {

	public static void main(String[] args) {
		String	str = "Kim Myoung Whan";
		//	이것은 15번 반복해야 원하는 결과를 얻을 수 있다.
		//	반복횟수는 문자열의 길이마다 다 다르다.
		//	고로 문자열의 길이를 알아내서 반복 회수를 알아낸다.
		int		len = str.length();
		
		for(int i = 0; i < len; i++) {
			char	ch = str.charAt(i);
			System.out.println(ch);
		}
	}
}
