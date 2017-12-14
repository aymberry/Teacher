package P0619;

public class Home02 {

	public static void main(String[] args) {
		int		dap = 1;
		//	변수의 초기화는 원칙적으로는 아무것이나 해도 된다.
		//	하지만 경우에 따라서는 목적에 따라서
		//	초기화 데이터를 특별한 데이터로 선별할 필요가 있다.
		
		//	여기서는 0으로 초기화하면 0 * ? 을 해도 그 결과가 0이므로....
		//	목적을 달성하기 위해서는 이번에는 1로 초기화하는것이 좋다.
		for(int i = 1; i <= 10; i++) {
			dap = dap * i;
		}
		System.out.println("결과 = " + dap);
	}

}
