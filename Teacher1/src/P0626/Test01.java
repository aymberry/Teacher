package P0626;
/*
 * 	지그제그형 2차 배열을 만들어 보자.
 */
public class Test01 {
	public static void main(String[] args) {
		//	1.	전체 주소(배열의 배열주소)를 관리할 변수를 준비한다.
		int[][]		num;
		//	2.	1차 배열의 주소를 관리할 공간을 만든다.
		num = new int[3][];
		//	3.	각각의 배열에 실제 데이터가 들어갈 공간을 만든다.
		num[0] = new int[5];
		num[1] = new int[3];
		num[2] = new int[4];
		
		System.out.println(num.length);
		//	==>		1차 배열의 개수(학생수)
		System.out.println(num[0].length);
		//	==>		각각의 배열의 개수(과목수)
		
		//	Heap Type에 따른 기억 방식
		int[][] temp1 = num;
		//		==>		Heap Type이 둘다 int[][]	이기때문이다.
		//	int[]	temp2 = num;
		//		==>		temp2의 Heap Type은 int[]이고
		//				num의 Heap Type은 int[][]이므로 에러이다.
	}
}
