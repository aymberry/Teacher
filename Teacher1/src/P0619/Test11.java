package P0619;
/*
 * 			#####
 * 			#####
 * 			#####
 * 			#####
 * 			#####
 * 
 * 			의 모양을 출력하세요 
 * 
 * 			단 한번에 #은 한개씩만 출력한다.
 * 		
 * 		원리	한줄을 출력하는 과정을 5번 반복하면 된다.
 */
public class Test11 {

	public static void main(String[] args) {

		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {	//	5번 반복시키는 명령
				System.out.print("#");
			}
			//	드디어 한줄의 출력이 종료되었다.
			System.out.println();
		}
		//	이처럼 중첩 for의 안쪽 for는 그 전체를 다시
		//	바깥 for 회수만큼 반복하는 효과를 가지게 된다.
	}
}


