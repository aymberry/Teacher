package P0613;

public class Test13 {

	public static void main(String[] args) {
//		long	a = 10000000000;
		//	에러 이유
		//		100억은 4바이트에 담길 수 없다.
		//		하지만 리터럴 풀은 정수는 4바이트에 담는것을 기본을 한다.
		//		그래서 리터럴 풀에 담길 수 없는것이다.
		
		//	해결책
		//		리터럴 풀의 크기를 8바이트로 늘려서 기억하도록 한다.
		long	num = 10000000000L;

	}

}
