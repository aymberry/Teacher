package BoChung0704;
/*
 * 	5과목의 학생 점수를 입력 받아서 총점과 평균을 구해서 
 * 	출력하는 프로그램을 작성하세요.
 * 
 * 	단,		입력, 계산(총점, 평균), 출력은 함수를 이용하세요.
 */
public class Test03 {
	
	static int[] Input() {
		int[]	temp = new int[5];
		for(int i = 0; i < 5; i++) {
			temp[i] = (int)(Math.random() * 100);
		}
		return temp;
	}
	
	static int calcTotal(int[] temp) {
		int	hap = 0;	//	합계를 구하는 변수는 따로 만들고
		for(int i = 0; i < 5; i++) {
			hap = hap + temp[i];
		}
		return hap;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
