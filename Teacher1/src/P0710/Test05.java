package P0710;
public class Test05 {
	public static void main(String[] args) {
		Son05	s = new Son05();
		if(s instanceof Son05) {
			//	의미 s 변수에 기억된 내용이 Son05 클래스이니?
			System.out.println("예");
		}
		if(s instanceof Father05) {
//			의미 s 변수에 기억된 내용이 Father05 클래스이니?
			//	s는  Father05에서 상속 받았으므로...
			//	s는 Son05 이면서 Father05의 역활도 한다.
			System.out.println("예2");
		}
		
		if(s instanceof MyInter051) {
			//	이것도 맞다고 대답한다.
			//	주의 	인터페이스는 모양이 다른 클래스이다.
			//			그러므로 상위 클래스의 역활을 한다.
			System.out.println("예3");
		}
		
		if(s instanceof Object) {
			System.out.println("예4");
		}
		
	}
}

interface MyInter051 {
	
}
interface MyInter052 {
	
}
class Father05 {
	
}
//	클래스를 만들때
//		extends는 오직 한개만 허락하며
//		implements 는 여러개를 사용할 수 있다.
class Son05 extends Father05 implements MyInter051, MyInter052 {
	
}
