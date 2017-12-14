package P0627;
/*
 * 	소문자를 순서대로 출력하세요.
 */
public class Sam02 {

	public static void main(String[] args) {
		char ch = 'a';
		
		//	26번 반복하는 구나
		for(int i = 1; i <= 26; i++) {
//			System.out.println(ch);
//			ch++;
			//	ch 변수에 0, 1, 2, 3, 4를 더하면 원하는 결과가 나오지 않을까?
			//	i 변수는 1, 2, 3, 4...로 변하더라?
			System.out.println((char)(ch + (i - 1)));
		}

	}

}



