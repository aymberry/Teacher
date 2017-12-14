package BoChung0704;
/*
 * 	5과목의 학생 점수를 입력 받아서 총점과 평균을 구해서 
 * 	출력하는 프로그램을 작성하세요.
 * 
 * 	단,		입력, 계산(총점, 평균), 출력은 함수를 이용하세요.
 */
public class Test04 {

	static void Input(int[] temp) {
		//	이번에는 주인이(main)이 창고를 먼저 준비한 후
		//	그 창고에 데이터를 채워달라고 할 수도 있다.

		//	이 함수는 메인에게서 창고 주소를 받아야한다.
		for(int i = 0; i < 5; i++) {
			temp[i] = (int)(Math.random() * 100);
		}
	}
	
	
	public static void main(String[] args) {
		int[]	num = new int[6];
		
				

	}

}



