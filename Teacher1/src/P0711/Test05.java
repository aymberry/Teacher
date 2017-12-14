package P0711;
public class Test05 {
	public static void main(String[] args) {
		Outer05	out = new Outer05();
//		Outer05.Inner05 in = out.new Inner05();
		//	지역 Inner는 그 함수 안에서만 사용할 수 있다.
		//	다른곳에서는 절대로 사용할 수 없다.
	}
}

class Outer05 {
	void abc() {
		int	a;
		class Inner05 {	//	지역 Inner 클래스라고 한다.
			
		}
		//	오직 그 함수 안에서만 new 시키고 사용할 수 있다.
		Inner05	in = new Inner05();
	}
}
