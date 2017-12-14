package P0706;
//	매우 중요한 소스이므로 여러번 보고 이해하기 바란다.
public class Test01 {
	public static void main(String[] args) {
		//	형변환을 통해서 클래스를 만들어보자.
		
//		Father01	f = new Son01();
		//	new Son01()	의 Heap Type => Son01
		//	Father01	f	의 Heap Type => Fahter01
		
		//	Up Casting이므로 묵시적으로 허락한다.
//		f.xyz();
		//	Father에서 출발해서 Son 까지 계층추적한 후
		//	마지막 만나는 xyz를 실행하라.	==>		Son

		Grand01	g = new Son01();
		//	Up Casting이다.
//		g.abc();		//	Father의 abc()
		//	★★★★★
//		g.xyz();
		//	이것이 안되는 이유는
		//	Grand 안에 xyz()가 존재하지 않기 때문이다.
		//	그래서 계층 추적을 할 수 없다.

		//	해결방법
		//	==>		원인?
		//			Grand 안에 xyz가 없기 때문에 문제가 발생한다.
		//			만약 Father에서 출발하도록 문제가 되지 않을 것이다.
		Father01	f = (Father01) g;
		//	Father01	f	의 Heap Type		: Fahter01
		//	g				의 Heap Ttpe		: Grand01
		//	 그러면 Instance는 변하지 않고 다만 레퍼런스만 바뀐것이다.
		f.xyz();
		//	고로 이 문장은 Father에서 출발해서 Son까지 계층추적함으로
		//	성공하는 경우이다.
		
//		Father01	f = new Son01();
//		f.lmn();
		//	Grand01에서 상속받은 lmn()이 존재하므로
		//	계층 추적이 되는 것이다.
		
	}
}

class Grand01 {
	void abc() {
		System.out.println("나는 할아버지 abc이다.");
	}
	void lmn() {
		System.out.println("나는 할아버지 lmn이다.");
	}
}
class Father01 extends Grand01 {
	void abc() {
		System.out.println("나는 아버지 abc이다.");
	}
	void xyz() {
		System.out.println("나는 아버지 xyz이다.");
	}
}
class Son01 extends Father01 {
	void xyz() {
		System.out.println("나는 아들 xyz이다.");
	}
	void lmn() {
		System.out.println("나는 아들 lmn이다.");
	}
}
