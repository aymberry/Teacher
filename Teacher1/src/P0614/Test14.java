package P0614;
/*
 * 	영문자 대문자를 입력한 후 소문자로 바꾸어 출력하세요
 */
public class Test14 {
	public static void main(String[] args) {
		char	ch = 'F';
		char	small = (char) (ch + 32);
		//	소문자는 거기에 해당하는 대문자보다 32 많은
		//	숫자로 기억된다.
		System.out.println(small);
	}
}
