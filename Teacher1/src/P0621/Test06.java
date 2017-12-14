package P0621;
//	게임을 하는 사람이 예측한 수를 입력해 주어야 하므로...
import		java.util.*;
/*
 * 	문제
 * 		컴퓨터에게 1~100사이의 난수를 기억하도록 하고
 * 		여러분이 이 숫자를 맞추는 게임을 만드세요.
 * 
 * 		과연 몇번만에 정답을 맞췄는지를 출력하세요.
 * 
 * 		단	정답이 아닐 경우		좀더 큰 수인지
 * 									좀더 작은 숫자인지의 힌트를 주도록 하세요
 */
public class Test06 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		//	컴퓨터가 난수를 기억하도록 한다.
		int			computer = (int)(Math.random() * (100 - 1 + 1) + 1);
		int			count = 0;		//	시도한 횟수를 기억할 변수
		
		//	최소한 한번은 시도해야 하므로 do~while을 사용하도록 한다.	
		do {
			//	예측 숫자를 입력한다.
			count = count + 1;	//	 count++;
			System.out.print("당신이 예측한 수를 입력하세요 ");
			int		user = sc.nextInt();
			if(computer == user) {
				//	더이상 이 게임을 반복할 필요가 없다.
				break;
			}
			//	이 부분이 실행된다는 의미는 break 당하지 않았다는 의미이다.
			//	이 말은 정답을 맞추지 못했다는 의미이다.
			if(computer > user) {
				System.out.println("좀더 큰 수를 입력하세요");
			}
			else {
				System.out.println("좀더 작은 수를 입력하세요");
			}
			//	언제까지 반복할지 모르고
			//	정답이 되면 do~while을 종료하도록 해 놓았으므로...
		} while(true);

		System.out.println(count + " 번 만에 정답을 맞췄읍니다.");
	}
}


