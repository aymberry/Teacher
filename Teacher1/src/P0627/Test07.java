package P0627;

public class Test07 {
	public static void main(String[] args) {
		int[]	ori = {1, 2, 3, 4, 5};
		//	ori의 데이터 전체를 깊은복사 해보자.
		//	1.	깊은 복사를 받을 배열을 준비한다.
		int[]	copy = new int[5];
		//	2.	명령을 이용해서 깊은 복사를 진행한다.
		System.arraycopy(ori, 0, copy, 0, 5);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(copy[i]);
		}
		
		ori[0] = 100;
		System.out.println(copy[0]);
	}

}

