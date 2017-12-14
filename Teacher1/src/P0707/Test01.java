package P0707;
public class Test01 {
	public static void main(String[] args) {
//		Father01	f = new Son01();
//		//	레퍼런스는 Father가 되고 인스턴스는 Son이 된다.
//		Grand01	g = (Grand01) f;
//		//	레퍼런스는 Grand가 되고 인스턴스는 Son이 된다.
//	
//		g.abc();
		//	상위 클래스(Grand)가 실제로 사용하는 인스턴스는 하위(Son)
		//	이므로 아무상관이 없다.
		
		Grand01	g = new Grand01();
		//	레퍼런스도 Grand이고 인스턴스도 Grand이다.
		Father01	f = (Father01) g;
		//	레퍼런스도 Father이고 인스턴스도 Grand이다.
		f.abc();
	}
}

class Grand01 {
	void abc() {
		int	 num = 5;
		this.xyz(num);
	}
	void xyz(int a) {
		
	}
}
class Father01 extends Grand01 {
	void abc() {
		
	}
}
class Son01 extends Father01 {
	void xyz() {
		
	}
}