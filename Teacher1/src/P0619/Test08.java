package P0619;
/*
 * 	어느 농장에서 닭과 개를 사육한다.
 * 		모두 	세어보니	52마리이더라
 * 		근데	다리수는	144개 이더라
 * 
 * 		과연 닭과 개는 각각 몇마리 일까요?
 * 
 * 		원리
 * 			컴퓨터는 방정식을 풀 수 없다.
 * 			단순한 계산을 반복해서 원하는 답이 나올때 까지 단순한 계산을
 * 			반복하는 기계이다.
 * 			(이것을 노킹 기법이라고 한다.)
 * 
 */
public class Test08 {

	public static void main(String[] args) {
		int		dak = 0, gae = 0;		//	적당한 값으로 초기화 한다.
		
		//	경우의 수를 모두 대입해서 한번씩 계산하도록 조치한다.
		for(dak = 0; dak <= 52; dak++) {
			gae = 52 - dak;
			
			int	dari = dak * 2 + gae * 4;
			//	노킹한다.
			if(dari == 144) {
				System.out.println("닭 = " + dak);
				System.out.println("개 = " + gae);
			}
		}
	}
}


