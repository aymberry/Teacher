package P0721;
import		java.util.*;
public class Test11 {

	public static void main(String[] args) {
		//	제너릭 선언을 하지 않은 경우에 발생하는 경고를
		//	방지 하기 위한 어노테이션이다.
		@SuppressWarnings("rawtypes")
		ArrayList	list = new ArrayList();
		list.add("홍길동");

	}

}
