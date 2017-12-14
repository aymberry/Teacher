package P0621;
/*
 * 	문제
 * 		첫날은 1원을 저금한다.
 * 		다음날부터는 전날의 2배를 저금할 예정이다.
 * 
 * 		과연 몇일이 지나면 총 저금 액수가 1억원이 넘을까요?
 * 
 * 		원리	하루에 필요한 저금을 계속해 나가면서
 * 				1억이 넘을때까지 반복해서 저금해 보면....
 */
public class Test01 {
	public static void main(String[] args) {
		int		now = 1;	//	하루에 저금할 금액
		int		total = 0;	//	총 저금 액수를 기억할 변수
		int		day = 0;	//	걸린 날수를 기억할 변수

		while(total < 100000000) {	//	1억이 안되었으면 계속 반복해야 한다.
										//	1억이 넘으면 반복을 중단해야 한다.
			day = day + 1;			//	하루가 지나면
			total = total + now;		//	그날 필요한 저금을 한다.
			now = now * 2;			//	다음날 저금할 금액을 만들어 놓는다.
		}

		System.out.println("걸린 날수 = " + day);
		System.out.println("총 저금 액수 = " + total);
	}
}







