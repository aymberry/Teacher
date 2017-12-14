package P0614;

public class Test16 {

	public static void main(String[] args) {
		int		a = 10;
		int		b = 20;
		int		c = 30;
//		boolean	result = ++a > ++b && ++a > ++c;
		//	이 경우에는 절삭 연산을 행한다.
		//	고로 앞의 결과가 false이므로 더이상 연산을
		//	하지 않는다.		a = 11
		boolean	result = ++a > ++b & ++a > ++c;
		//	이 경우에는 절삭 연산을 하지 않는다.
		//	고로 앞의 결과가 false가 나왔지만 마지막 연산까지
		//	다 실행하므로			a = 12
		System.out.println("A = " + a);
	}
}
