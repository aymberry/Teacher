package P0623;

public class Test04 {

	public static void main(String[] args) {
		//	 먼저 3~100사이의 숫자를 배열 변수에 기억해 놓는다.
		//	98개가 필요하므러...
		int[] num = new int[98];
		//	각각의 배열에 3~100사이의 숫자를 입력해 놓는다.
		for(int i = 0; i < num.length; i++) {
//			num[0] = 3;
//			num[1] = 4;
			num[i] = 3 + i;
		}
		//	각각의 배열에 담긴 숫자를 2~절반(50)까지의 배수를 0으로 만든다.
		//	배수인지를 알아보기 위해서는 	2의 배수를 구하고...
		//										3의 배수를 구하고...
		//										50의 배수를 구하고....
		//	구할 배수를 2에서 50까지 반복한다.
		for(int i = 2; i <= 50; i++) {
			//	 배열의 데이터가 각각의 숫자의 배열인지 알아본다.
			for(int j = 0; j < num.length; j++) {
				//	자기 자신은 당연 배수이므로 자기 자신만큼은
				//	계산하면 안된다.
				if(i == num[j]) {
					//	이번 만큼은 계산하면 안된다.
					continue;
				}
				if(num[j] % i == 0) {
					//	그 배열의 데이터가 각각의 수의 배수이다.
					num[j] = 0;
				}
			}
		}
		//	이제 0으로 바뀌지 않은 숫자가 솟수이므로
		//	그놈만 출력한다.
		for(int i = 0; i < num.length; i++) {
			if(num[i] != 0) {
				System.out.println(num[i]);
			}
		}

	}

}
