package P0629;
/*
 * 	문제	MyClass01을 사용해 보자.
 */
public class Test02 {

	public static void main(String[] args) {
		//	1.	사용할 클래스(설계도)를 부품(Object)로 만든다.
		MyClass01		my1 = new MyClass01();
		//		나는 부품이 2개 필요하다.
		//		비유	나는 문자열 관리를 하는데(String)이 두개 필요하다.
		//				String	str1 = "Hong";
		//				String	str2 = "Park";
		MyClass01		my2 = new MyClass01();
		
		MyClass01[] temp = new MyClass01[5];
		temp[0] = new MyClass01();
		temp[0].num = 1000;
		
		//	2.	목적달성을 위해서 MyClass01이 가지고 있는 num 변수에
		//		500을 기억하고 싶다.
		my1.num = 500;
		my2.num = 700;
		//	3.	이제 목적 달성을 위해서 num을 출력하고 싶은데
		//		이것은 display 함수가 원하는 기능을 대신해준다.
		//		고로 나는 내 목적을 달성하기 위해서 display를 호출하면 된다.
		my1.display();	//	500
		my2.display();	//	700
		temp[0].display();//1000
	}
}

