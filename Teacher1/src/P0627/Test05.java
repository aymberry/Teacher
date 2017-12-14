package P0627;

public class Test05 {

	public static void main(String[] args) {
		int[]	ori = {1, 2, 3, 4, 5};
		
		//	이제 얕은 복사를 시도하자.
		//	앝은 복사란 주소만 다른 변수에 복사해주는 방법을 말한다.
		int[]	copy = ori;
		
		System.out.println("복사받는 데이터 = " + copy[0]);
		ori[0] = 100;
		System.out.println("복사받는 데이터 = " + copy[0]);
	}
}
