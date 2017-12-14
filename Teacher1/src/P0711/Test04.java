package P0711;
public class Test04 {
	public static void main(String[] args) {
	}
}

class Outer04 {
	int		a;
	void abc() {
		System.out.println("바깥 a = " + a);
	}
	
	class Inner04 {
		int		a;
		void abc() {
			System.out.println("안쪽 a = " + a);
		}
		void xyz() {
			a = 10;		//	이것은 안쪽의 변수를 사용하는 것이다.
			//	만약 바깥 변수를 사용하고 싶으면....
			Outer04.this.a = 20;
			abc();		//	안쪽의 abc()를 호출한다.
			Outer04.this.abc();	//	바깥의  abc()를 호출한다.
		}
	}
}

