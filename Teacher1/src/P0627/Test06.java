package P0627;

public class Test06 {

	public static void main(String[] args) {
		int[]	ori = {1, 2, 3, 4, 5};
		int[]	copy = {10, 20, 30, 40, 50};
		//m45-951-747
		//	ori 배열을 copy 배열에 깊은 복사를 해보자
		//	나는 ori 배열의 3, 4, 5 데이터만 깊은 복사를 하고싶다면...
		//	나는 copy의 30, 40, 50 대신에 복사받고 싶다면....
		System.arraycopy(ori, 2, copy, 2, 3);
//			?1?		원본 배열의 주소
//			?2?		원본 배열 중에서 복사를 시작할 데이터의 위치
		//			나는 3이라는 데이터부터 복사하고 싶으니까...
		//			위치는 2가 된다.
//			?3?		복사받을 배열의 주소
//			?4?		복사받을 배열에서 복사를 받을 방의 위치
		//		30이 기억된 위치이므로 2번이 된다.
//			?5?		복사받을 데이터의 개수
		
		for(int i = 0; i < 5; i++) {
			System.out.println(copy[i]);
		}
	}

}
