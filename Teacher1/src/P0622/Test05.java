package P0622;
/*
 * 문제
 * 		0~9사이의 숫자를 100번 발생시킨다.
 * 		각각의 숫자가 몇번 발생했는지를 알아보자.
 * 
 * 	원리
 * 		0이 발생한 수를 기억할 장소
 * 		1이 발생한 수를 기억할 장소
 * 		...
 * 		9가 발생한 수를 기억할 장소		를 미리 준비한다.
 * 		==>		같은 int 형태가 10개 필요하므로 배열로 준비한다.
 * 
 *  	숫자가 발생하면	발생한 숫자가		0 이면 [0] 을 증가시키고
 *  											1 이면 [1] 을 증가시키고
 *  											....
 *  											9 이면 [9] 을 증가시키고
 */
public class Test05 {
	public static void main(String[] args) {
		int[]	count = new int[10];
		
		//	이제 랜덤한 숫자를 100번 발생해보자.
		for(int i = 0; i < 100; i++) {
			int	temp = (int)(Math.random() * (9 - 0 + 1) + 0);
			//	이제 발생한 숫자가 몇번 발생했는지를 알아야 한다.
			//		temp = 0		count[0]을 증가
			//		temp = 1		count[1]을 증가
			//		...
			//		temp = 9		count[9]을 증가
			count[temp]++;
		}
		
		//	최종 결과를 출력하자.(각각의 방의 데이터를 출력하면 된다.)
		for(int i = 0; i < count.length; i++) {
			System.out.println("[" + i + "] 발생수 = " + count[i]);
		}
	}
}








