package P0619;
/*
 * 			#
 * 			##
 * 			###
 * 			####
 * 			#####		모양을 출력하라.
 * 
 * 		원리	앞의 문제와 동일하게 한줄을 출력하는 과정을 5번 반복하면 된다.
 * 				단,	매 줄은 반복회수가 달라진다.
 */
public class Test13 {

	public static void main(String[] args) {
		//	m72-850-737
		for(int j = 0; j < 5; j++) {		//	5줄을 출력한다.
			for(int i = 0; i < (j + 1); i++) {	//	한줄을 출력하는 부분
				//	위의 반복 제어 부분을 고쳐서
				//	1, 2, 3... 순서대로 반복회수를 조절해야 한다.
				System.out.print("#");
			}
			System.out.println();
		}
		
	}

}


