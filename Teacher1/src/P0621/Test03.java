package P0621;
/*
 * 	문제
 * 		8848m 산이 있다.
 * 
 * 		한사람은 아래에서 위로 등산을 하고		1초당	0.15m를 진행하고
 * 		다른사람은 위에서 아래로 하산을 한다.		1초당	0.53m를 진행한다.
 *
 * 		과연 몇초뒤에 두사람은 조우를 할까요
 * 
 * 		원리는	2번 문제와 동일하다.
 */
public class Test03 {

	public static void main(String[] args) {
		float	one = 0.0F;		//	첫번째 사람의 현재 위치
		float	two = 8848.0F;	//	두번째 사람의 현재 위치
		int		second = 0;		//	걸린 시간을 기억할 변수
		
		while(one < two) {
			second++;
			one = one + 0.15F;
			two = two - 0.53F;
		}
		
		System.out.println("걸린 시간 = " + second + " 초");
			
	}

}


