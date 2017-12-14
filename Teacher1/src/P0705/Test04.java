package P0705;
//	이번에는 다른 패키지 소속의 클래스에서 사용해보자.
import		Sample.*;
public class Test04 {
	void abc() {
		Test02		t1 = new Test02();
	//	Sample.Test03		t2 = new Sample.Test03();
		//	클래스앞에 접근지정을 생략하면
		//	다른 패키지에서는 new  시킬 수 없다.
	}
}
