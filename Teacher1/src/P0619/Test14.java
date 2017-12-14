package P0619;
/*
 * 	랜덤한 두수를 입력한 후(2~50사이의 숫자)
 * 	두수의 최소공배수를 구하세요.
 * 
 * 	원리
 * 		두 수중 큰수부터 1씩 증가하면서
 * 		그 수를 두 수로 나누어 모두 떨어지면 최소공배수가 된다.
 * 
 * 			25	30의 최소 공배수를 구하고자 하면
 * 
 * 			30 % 25		30 % 30
 * 			31 	% 25		31 % 30
 * 			32 	% 25		32 % 30
 * 			.....
 * 			로 나누어서 그 결과가 둘 다 0인 경우가 최소 공배수이다.
 */
public class Test14 {
	public static void main(String[] args) {
		int		num1 = (int) (Math.random() * (50 - 2 + 1) + 2);
		int		num2 = (int) (Math.random() * (50 - 2 + 1) + 2);

		//	큰수부터 계산해 보아야 하므러....
		//	둘중에 누가 큰지 알아보자.
		int		max = (num1 > num2) ? num1 : num2;
		//	만약 어디까지 반복할 지 모르면 굳이 조건식을 쓰지 않아도
		//	된다.
		//	생략하면 무한 루프가 된다.
		//	대신에 break  명령을 이용해서 적당한 시점에 for 명령이
		//	종료되도록 제어해 주면 된다.
		for(int i = max;/*	생략해도 가능하다. */ ; i++) {
			int		temp1 = i % num1;
			int		temp2 = i % num2;
			
			if(temp1 == 0 && temp2 == 0) {
				//	이때 i값이 최소공배수가 된다.
				System.out.println(num1 + "과 " + num2);
				System.out.println("최소공배수 = " + i);
				//	이제 원하는 결과를 얻었으므로.... 더이상 반복할
				//	필요가 없다.
				
				break;
			}
		}
	}

}




