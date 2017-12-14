package P0622;
/*
 *	문제
 *		20개의 정수를 기억할 공간을 배열로 만들고
 *		각각의 공간에 랜덤한 숫자(0~100)를 기억한 후 그대로 출력하자.
 */
public class Test01 {
	public static void main(String[] args) {
		// 	배열로 만들면 Heap 영역에 만들어지므로 주소를 기억해야
		//	사용할 수 있다.
		//	주소를 기억할 변수를 준비한다.
		int[]	num;
		//	데이터가 들어갈 공간을 만든 후
		//	그 공간의 시작 주소를 변수에 기억해서 사용가능하도록 한다.
		num = 	new int[20];
		
		for(int i = 0; i < num.length; i++) {
			//	이때 5의 의미는 준비된 배열의 개수가 5개 이므로
			//	5라고 쓴 것이다.
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 1);
		}
//		num[1] = (int)(Math.random() * (100 - 0 + 1) + 1);
//		num[2] = (int)(Math.random() * (100 - 0 + 1) + 1);
//		num[3] = (int)(Math.random() * (100 - 0 + 1) + 1);
//		num[4] = (int)(Math.random() * (100 - 0 + 1) + 1);
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
		
		
		
		
	}

}





