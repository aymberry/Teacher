package P0705;
/*
 * 	조사 4
 * 		패키지는 비록 다른데 상속받은 클래스에서는 어디까지 사용할 수
 * 		있는지 조사하자.
 */
import	Sample.Test;
public class Test03 extends Test{
//	public			int		pub = 100;
//	protected		int		pro = 200;
//					int		pack = 300;
//	private		int		pri = 400;
	
	void Test() {
		pub = 1000;
		pro = 2000;
//		protected는 	1	같은 패키지 소속이거나
//						2	상속관계에 있는 클래스에서 사용할 수 있다.
		//	2에 만족함으로 사용할 수 있다.
		//	★★★
//		pack = 3000;
		//	같은 패키지가 아니므로 비록 상속을 받았지만 사용할 수 없다.
//		pri = 4000;
	}
}

