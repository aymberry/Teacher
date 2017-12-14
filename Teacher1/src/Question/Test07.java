package Question;
/*
 * 	문제
 * 		나는 '0x10'이라는 문자를 정수로 만들고 싶다.
 */
public class Test07 {
	public static void main(String[] args) {
//		String	str = "10";
//		int		num = Integer.parseInt(str, 16);
//		System.out.println(num);

//		int	a = 123;
//		int num = Integer.reverse(a);
//		System.out.println(num);
		
		
		
		int		a = 10;
		String	str = Integer.toBinaryString(a);
		System.out.println(str);
	}

}
