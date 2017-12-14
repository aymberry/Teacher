package P0725;

public class Test03 {

	public static void main(String[] args) {
		Sam031	s = new Sam031();
		s.abc();
	}
}

class Sam031 {
	Sam032		s2;
	void abc() {
		//	먼저 생성된 클래스에서는 나중에 생성될 클래스를 그냥
		//	new 시킨다.
		
		s2 = new Sam032(this);
		//	상대방을 new 시키면서 자신의 주소를 알려준다.
	}
}
class Sam032 {
	Sam031		s1;
	
	//	상대방은 위에서 나를 new 시킬때 자신의 주소를 알려주면서 
	//	생성하기로 약속했으므로...
	Sam032() {}
	//	상대방 주소를 받을 수 있는 생성자 함수를 준비한다. 
	Sam032(Sam031 temp) {
		//	자신이 준비한 변수에 넘어온 주소를 기억한다.
		s1 = temp;
	}
	
}




