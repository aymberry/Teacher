package Sample;
/*
 * 	이 클래스는 내가 만들어서 누군가에게 사용하라고 주는 부품이다.
 */
public class Test {
	//	이 안에는 함수도 사용할 수 있고 변수도 사용할 수 있다.
	
	public			int		pub = 100;
	protected		int		pro = 200;
					int		pack = 300;
	private		int		pri = 400;
	
	//	이 부품을 받은 사람이 이 변수중에서 무엇을 사용할 수 있는지를
	//	조사해보자.
	
	//	조사1.	
	//		같은 클래스 안에서는 어느 변수를 사용할 수 있나요?
	void Test() {
		pub = 1000;
		pro = 2000;
		pack = 3000;
		pri = 4000;
		
		//	내가 만든 클래스에 만든 변수는
		//	접근 지정자에 관계없이 다 사용할 수 있습니다.
	}
	
	
	
	
}
