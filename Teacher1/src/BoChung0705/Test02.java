package BoChung0705;

public class Test02 {
	static void swap(int[] a) {		//	int[] a = a; 
		//	이번에는 매개변수로 주소를 받고 있다.
		//	Call  By Reference 를 하고 있다.
		
		//	특징
		//		Call By Reference 는 주소를 받는다는 것이다.
		//		이 의미는 사용하는 실제 데이터 공간은 같다는 의미이다.
		//		한쪽에서 바꾸면 다른 곳에서도 바뀐다.
		
		System.out.println("함수안에서 교환	전");
		System.out.println("A = " + a[0] + ", B = " + a[1]);
		
		int		temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		System.out.println("함수안에서 교환후");
		System.out.println("A = " + a[0] + ", B = " + a[1]);
	}
	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 10;
		a[1] = 20;
		System.out.println("main안에서 교환전");
		System.out.println("A = " + a[0] + ", B = " + a[1]);
		
		swap(a);
		
		System.out.println("main안에서 교환후");
		System.out.println("A = " + a[0] + ", B = " + a[1]);
	}

}
