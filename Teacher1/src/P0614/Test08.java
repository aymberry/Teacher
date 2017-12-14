package P0614;

public class Test08 {

	public static void main(String[] args) {
		int		a = 10;
//		int		b = ++a;
		//	a라는 변수는 ++ 연산과 = 연산에 혼용되어 있다.
		//	이처럼 한 항이 2개의 연산에 포함된 경우
		//	처리 순서를 따지게 된다.
		//	++a는 다른 연산보다 먼저 처리하세요........
		int		b = a++;
		//	이 경우는 다른 연산을 먼저 처리하게 된다.
		//	그러므로 b = a;	먼저실행되고
		//	나중에 a++ 이 실행된다.
		System.out.println(b);
	}
}
