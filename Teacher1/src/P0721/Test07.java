package P0721;
import		java.util.*;
public class Test07 {

//	static void abc(ArrayList<Father07> temp) {
//		//	이렇게 하는 것이 원칙이다.
//	}
	
//	static void abc(ArrayList<? extends Father07> temp) {
//		//	이 말은 temp에는 Father07이나 그 하위로 제너릭 된것은
//		//	받을 수 있다.
//	}
	
	static void abc(ArrayList<? extends Grand07> temp) {
		//	Father07 이나 그 상위로 제넉릭 된것만 받는다.
	}
	public static void main(String[] args) {
//		ArrayList<Father07>	list = new ArrayList<Father07>();
//		abc(list);

		ArrayList<Father07>	list = new ArrayList<Father07>();
		abc(list);
		
//		ArrayList<Son07>	list = new ArrayList<Son07>();
//		abc(list);
	}
}

class Grand07 {
	
}
class Father07 extends Grand07 {
	
}
class Son07 extends Father07 {
	
}