package P0623;

public class Home02 {

	public static void main(String[] args) {
		int[]	num = new int[10];
		//	10번 반복하면서 랜덤한 숫자를 배열에 기억한다.
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		
		//	라운드 회수만큼 반복을 시킨다.
		for(int i = 0; i < 9; i++) {
		//		각각의 라운드마다 비교회수만큼 반복은 한다.
			
			//	이제 한 라운드의 교환을 시도한다.
			boolean	isSwap = false;		//	스와핑이 없다고 가정하고 출발
			for(int j = 0 ; j < (9 - i); j++) {
		//			if(자신과 > 자신+1) {		num[i] > num[i + 1] 
		//				데이터를 교환하면 된다.
				
				//	데이터 교환이 일어난다.
				if(num[j] > num[j + 1]) {
					int	temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					isSwap = true;		//	스와핑이 일어났다고 변수값을 수정
					//	이 문장을 한번이라도 통과하면 이것은 미완성이다.
				}
			}
			//	이제 한 라운드가 종료되었다.
			//	이 부분에서 소트가 완료되었음을 알수 있는것이 버블
			//	소트의 특징이다.
			//	질문
			//		이제 한라운가 끝난시점에서 스와핑이 일어났는지?
			//		일어나지 않았는지 확인하는 방법은?
			if(isSwap == false) {
				//	이제 소트가 완료되었다.
				//	고로 더이상 다음 라운드를 시도할 필요가 없다.
				break;
			}
		}
//		java.util.Arrays.sort(num);
		//	10개의 데이터를 출력해보자
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "    ");
		}
		System.out.println();
	}
}
