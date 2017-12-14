package P0621;
import		java.util.*;
public class Home02 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		int		computer = (int)(Math.random() * (100 - 1 + 1) + 1);
		int		count = 0;		//	시도 회수를 기억할 변수 
		while(true) {
			//	일단 유저에게 예측 숫자를 입력 받는다.
			System.out.print("당신이 예측한 수 = " );
			int		user = sc.nextInt();
			//	한번 시도가 된것이다.
			count++;
			//	1.	정답이니?
			if(computer == user) {
				System.out.println(count + "번 만에 정답을 맞췄다.");
				break;
			}
			//	2.	시도 회수가 10번이 되었니?
			if(count == 10) {
				System.out.println("10번 시도해도 정답이 아니므로 게임을 종료한다.");
				break;
			}
			if(computer > user) {
				//	3.	보다 크니?
				System.out.println("좀더 쓰세요");
			}
			else {
			//	4.	보다 작니?
				System.out.println("좀더 낮추세요");
			}
		}
	}
}
