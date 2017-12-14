package P0621;
/*
 * 	티코와 소나타가 자동차 경주를 한다.
 * 	티코는 	1초에 5.21m를 가고
 * 	소나타는 	1초에 7.42m를 간다.
 * 
 * 	티코는 1000m 앞에서 출발하도록 한다.
 * 
 * 	문제
 * 		몇초가 지나면 소나타가 티코를 앞지를 수 있을까요?
 * 
 * 		원리	1초마다 티코의 위치와 소나타의 위치를 계산해서
 * 				비교(노킹)하면 된다.	
 */
public class Test02 {
	public static void main(String[] args) {
		float	tico = 1000.0F;		//	티코의 현재 위치
		float	sonata = 0.0F;			//	소나타의 현재 위치
		int		second = 0;			//	걸린시간을 기억할 변수

		while(sonata < tico) {
			second++;	
			tico = tico + 5.21F;
			sonata = sonata + 7.42F;
		}
		
		System.out.println("걸린 시간 = " + second + " 초");
	}

}


