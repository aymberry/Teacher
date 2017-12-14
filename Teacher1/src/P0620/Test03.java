package P0620;
/*
 * 	숫자로 구성된 문자열을 입력한 후
 * 	각각의 숫자의 합을 계산해서 출력하세요
 * 
 * 	예>		String	str = "12345";
 * 
 * 			1 + 2 + 3 + 4 + 5	의 합을 구하세요
 * 
 * 	원리
 * 		각각의 자리에 있는 문자(숫자)를 꺼낸 후
 * 		그것을 	'1'이면 	1로 변환하고
 * 					'2' 이면 	2로 변환하여		더해주면 된다.
 * 
 * 		힌트		'0'		48 	'1'		49, ......
 * 
 * 					'0' -> 0으로 만들고 싶으면		'0' - 48을 하면 된다.
 * 					'1' -> 1로 만들고 싶으면			'1' - 48을 하면 된다.
 */
public class Test03 {

	public static void main(String[] args) {
		String	str = "74742568";
		int		dap = 0;		//	더한 결과를 기억할 변수
		
		int		len = str.length();
		for(int i = 0; i < len; i++) {
			char	ch = str.charAt(i);
			//	이제 꺼낸 문자(숫자처럼보이는)에 해당하는 실제 숫자를
			//	알아낸다.
			int		temp = ch - 48;
			dap = dap + temp;
		}
		System.out.println("결과 = " + dap);
	}

}
