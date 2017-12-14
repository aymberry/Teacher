package P0613;

public class Test12 {

	public static void main(String[] args) {
//		float	num = 3.14;
		//	에러이유
		//		3.14가 리터럴 풀에 담길때 8바이트에 담긴다.
		//		이것을 4바이트 메모리(float)에 담기가 안되기 때문에
		//		에러가 발생한다.
		
		//	해결책
		//		리터럴풀에 담길때 4바이트에 담으면 될 것이다.
		float	num = 3.14F	;
	}
}
