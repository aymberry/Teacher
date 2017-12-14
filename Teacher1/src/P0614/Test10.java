package P0614;

public class Test10 {

	public static void main(String[] args) {
		String	str = "Hello";
		int		num = 10;
		
		String	dap = str + num;
		//	둘중 하나가 문자열이면 +이 가능하다.
		//	이렇게 하면 다른 항은 자동으로 문자열 처리가 되어서
		//	결합 연산이 실행된다.
		System.out.println(dap);
		System.out.println();
		
		String	a1 = false + "A";		//	falseA
		System.out.println(a1);
		String	a2 = "A" + 4 + 5;		//	A45
		System.out.println(a2);
		String	a3 =  4 + 5 + "A";	//	9A	
		System.out.println(a3);
	}

}
