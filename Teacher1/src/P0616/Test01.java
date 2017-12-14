package P0616;
/*
 * 	문제
 * 		두수를 입력한 후 두 수 중에서 큰수만 출력하도록 하자.
 * 
 * 		단 숫자는 1~100사이의 숫자로 입력하도록 한다.
 */
public class Test01 {

	public static void main(String[] args) {
		int		a = (int)(Math.random() * (100 - 1 + 1) + 1);
		int		b = (int)(Math.random() * (100 - 1 + 1) + 1);
		//	일단 a가 크다고 가정하고 a를 기억한다.
		int		max = a;
		//	혹시 b가 클수도 있으므로.....
		if(a < b) {
			//	b가 더 크면 b로 바꿔치기 한다.
			max = b;
		}
		System.out.println("두수 = " + a + "   " + b);
		System.out.println("큰수 = " + max);
	}

}




