package P0619;
/*
 * 	Hello World를 10번 출력하라.
 */
public class Test03 {

	public static void main(String[] args) {
		for(int count = 0 ; count < 10; count = count + 1/* count++ */ ) {
			System.out.println("Hello World");
		}

		//	운동선수에게 운동장 10바퀴를 돌도록 한다면
		//	1.		카운터 기계를 0으로 세팅해 놓아야 한다.
		//	2.		한바퀴 돌때마다 카운터 기계를 1씩 증가시키면 된다.
		//	3.		카운터 기계가 10보다 작으면 다시 한바퀴를 더 돌라고
		//			시키고 아니면 그만하라고 하면 될 것이다.
		//	★★
		//	int count 의 의미
		//	==>		이 변수는  for 명령을 시작하는 순간 실행되는 문장이다.
		//			그러므로 이 변수는 for {} 안에서만 사용하는 지역변수가
		//			된다.
		
	}
}
