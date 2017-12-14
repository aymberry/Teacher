package P0627;
/*
 * 	10명 학생 이름과 한과목 점수를 입력한 후
 * 	점수순서대로 정렬하여 출력하세요.
 * 
 * 	학생이름은 문자열이므로 String[]로 준비하고
 * 	점수는 정수이므로 int[]로 준비한다.
 */
public class Test03 {

	public static void main(String[] args) {

		String[] name = {"한효주", "강수연", "최지우", "김하늘", "아이유", "강동건", "소지섭", "장동건", "강호동", "유재석"};
		int[] 	score = {65, 75, 34, 87, 23, 75, 83, 28, 16, 66};
		
		//	일단 먼저 출력해보자.
		//	10명을 출력해야 하므로....
//		for(int i = 0; i < 10; i++) {
//			System.out.println(name[i] + "    " + score[i]);
//		}
		
		//	이제 정렬해보자(정렬은 셀렉션 소트를 이용해서 처리하자.)
		//	총 라운드 수는 9라운드이다.
		for(int i = 0; i < 9; i++) {
			//	비교는 자신의 다음 수부터 마지막 수까지 비교하면 된다.
			for(int j = (i + 1); j < 10; j++) {
				if(score[i] < score[j]) {
					//	두 위치를 바꾸어야 한다.
					//	점수도 바꿔줘야 하고...
					int	temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					
					//	이름도 같이 바꿔주어야 한다.
					String	temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
					
					//	나중에 출력할 경우에는 0번 방부터 순서대로
					//	출력하므로 점수만 바꾸면 0번 방에 있는
					//	사람의 이름은 원래 상태로 나오게 되므로....
					//	학생 이름이 잘못 나오게 된다.
					//	그러므로 학생 이름도 바꿔놓아야 한다.
				}
			}
		}
		//		10명을 출력해야 하므로....
		for(int i = 0; i < 10; i++) {
			System.out.println(name[i] + "    " + score[i]);
		}
	}
}






