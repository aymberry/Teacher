package BoChung0704;

public class Test05 {

	public static void main(String[] args) {
		int		num = 24;
		//		나는 24 * 4를 하고 싶다.
		//	방법1
		int		r1 = num * 4;
		//	 내부적으로는 num + num + num + num를 반복하면 결과를 구한다.
		//	방법2
//		int		r1 = num << 2;	//	2의 2승이 4이므로
		//	내부적으로 비트를 옮기기만 하면 되므로....
		//	방법2보다 속도가 빠르다.
		
		//	단점		2의 ?승의 곱하기와 나누기만 가능하다.
		//				2, 4, 8, 16, 32, ...	만 가능하다
		System.out.println(r1);
	}

}
