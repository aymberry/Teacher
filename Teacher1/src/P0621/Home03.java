package P0621;
import		java.util.*;
public class Home03 {

	public static void main(String[] args) {
		//	한번만 게임을 하도록 한다.
		Scanner	sc = new Scanner(System.in);
		//	 필요한 변수를 만들자
		int		win = 0;			//	컴퓨터가 이긴 회수를 기억할 변수
		int		draw = 0;			//	비긴 회수를 기억할 변수
		int		lost = 0;			//	컴퓨터가 진 회수를 기억할 변수
		
		for(int i = 0; i < 10; i++) {
			//	컴퓨터가 뭔가를 내도록 한다.
			int		com = (int)(Math.random() * (3 - 1 + 1) + 1);
			//	사용자가 뭔가를 내도록 한다.
			System.out.println("당신 내고싶은 것은 ");
			int		user = sc.nextInt();
			
			int		temp = com - user;
			
//			if(temp == 0) {
//				draw++;
//			}
//			else if(temp == -2 || temp == 1) {
//				lost++;
//			}
//			else {
//				win++;
//			}
			switch(temp) {
			case	0:
				draw++;
				break;
			case	-2:
			case	1:
				lost++;
				break;
			case	-1:
			case	2:
				win++;
				break;
			}
		}
		//	최종 결과를 출력하자.
		System.out.println("컴퓨터 = " + win + " 이기고");
		System.out.println("컴퓨터 = " + lost + " 지고");
		System.out.println("컴퓨터 = " + draw + " 비겼다.");
	}
}



