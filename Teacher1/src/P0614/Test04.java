package P0614;
/*
 	문제
 		두수를 입력한 후 몫과 나머지를 구하세요
 */
public class Test04 {

	public static void main(String[] args) {
		int		a = 19;
		int		b = 4;
		
		int		mok = a / b;
		//	정수 / 정수 => 정수가 되므로 몫을 구하는 효과가 된다.
		int		na = a % b;

		System.out.println(mok);
		System.out.println(na);
	
	}
}
