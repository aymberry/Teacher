package BoChung0705;
/*	
 * Call By Value로 함수를 호출할 때 상태를 보자.
 */
public class Test01 {

	static void swap(int a, int b) {	//	int a = a, int b = b
		//	이 함수는 매개변수를 Call By Value형태로 받고 있다.
		//		a변수와 b 변수에 기억되는 내용은 실제 데이터이다.
		//	
		//	특징
		//	Call By Value는 값을 다른 메모리에 복사를 받기 때문에
		//	함수안에서 데이터가 바뀌더라도 main의 데이터는
		//	바뀌지 않는다.
		
		//	이 함수는 두개의 변수값을 교환하는 기능을 하는 함수이다.
		System.out.println("함수안에서 교환전");
		System.out.println("A = " + a + ", B = " + b);
		
		int		temp = a;
		a = b;
		b = temp;
		System.out.println("함수안에서 교환후");
		System.out.println("A = " + a + ", B = " + b);
	}
	public static void main(String[] args) {
		int		a = 10, b = 20;
		System.out.println("main안에서 교환전");
		System.out.println("A = " + a + ", B = " + b);
		
		swap(a, b);
		
		System.out.println("main안에서 교환후");
		System.out.println("A = " + a + ", B = " + b);
	}
}







