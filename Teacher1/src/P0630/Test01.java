/*
 * 	원래는 하나의 파일에는 한개의 클래스를 만드는것이 원칙이다.
 * 
 * 	우리는 OOP를 연습하다보니 클래스가 만이 만들 필요가 있고
 *	그러므로 간단한 테스트를 위해서 한개의 파일에
 *	여러개의 클래스를 만들어서 사용할 예정이다. 
 */
package P0630;
//	그 클래스를 사용해서 원하는 목적을 달성하기위한
//	나만의 프로그램이다.
public class Test01 {
	public static void main(String[] args) {
		//	아래 클래스를 사용해보자.
		//	1.	클래스를 Object로 만들어야 한다.
		Sam01	s = new Sam01();
		//	2.	그 클래스가 가지고 있는 변수나 함수를 이용해서
		//		목적을 달성하도록 하자.
		s.display();				//	1번
		
		s.display(3.14);		//	4번
		
		s.display(4, 3.14F);	//	6번
		
		//	만약 준비된 함수의 필요한 데이터와 다른 형태의 데이터가
		//	들어가면 그런 함수는 준비되지 않았으므로... 에러가 발생한다.
//		s.display(4, 5, 6);
		
		s.display((byte) 5);		//	누가 실행되는가
		//	크기 순서대로 나열해서 가장 가까운 묵시적 형변환이
		//	가능한 형태를 이용해서 실행된다.
	}
}
//	이 클래스는 누군가가 나한테 만들어서 제공한 클래스이다.
class Sam01 {
	//	이처럼 같은 이름의 함수를 같은 클래스안에 만들었으므로
	//	이것을 우리는 오버로드 라고 말한다.
	void display(double a) {
		System.out.println("4번");
	}
	void display(float a) {
		System.out.println("3번");
	}

	void display() {
		System.out.println("1번");
	}
	void display(int a) {
		System.out.println("2번");
	}
	void display(int a, int b) {
		System.out.println("5번");
	}
	void display(int a, float b) {
		System.out.println("6번");
	}
}




