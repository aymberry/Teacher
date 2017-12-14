package P0621;
/*
 * 	문제
 * 		100m 전봇대가 있다.
 * 
 * 		달팽이가 이 전봇대를 올라간다.
 * 		아침부터 저녁까지는 2.56m를 올라간다.
 * 		밤이 되면 1.27m를 미끄러져 내려온다.
 * 
 * 		과연 몇일이 지나면 달팽이는 전봇대 꼭대기에서 편안한 잠을 잘수 있을까?
 * 
 * 		단	꼭대기에 올라가면 미끄럼이 없다.
 * 
 */
public class Test04 {
	public static void main(String[] args) {
		float	dal = 0.0F;		//	달팽이의 현재 위치
		int		day = 0;		//	걸린 날수
		
		while(true) {
			day++;
			dal = dal + 2.56F;		//	만약 올라간 위치가 100을 넘으면
									//	다음 계산은 하지 말아야 한다.
			//	그러므로 while을 탈출할 조건을 제시해서 나머지 처리를
			//	하지 못하게 조치할 필요가 있다.
			if(dal > 100.0F) {
				break;
			}
			dal = dal - 1.27F;
		}
		System.out.println(day + " 일 뒤에 꼭대기 도착");
	}

}







