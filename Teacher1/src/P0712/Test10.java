package P0712;
import		java.io.*;
import		java.net.*;
public class Test10 {
	public static void main(String[] args) {
	}
}

class Father10 {
	void abc() throws FileNotFoundException, EOFException {
		
	}
}
class Son01 extends Father10 {
	//	성공
//	void abc() throws FileNotFoundException, EOFException {
		
//	}
	//	성공
	//		던지는 예외가 줄어들어도 상관이 없다.
//	void abc() throws FileNotFoundException {
	
//	}
	//	실패
	//		던지는 예외가 많아지만 오버라이드가 되지 않는다.
//	void abc() throws FileNotFoundException, EOFException, SyncFailedException {
		
//	}
	//	실패
	//		상위가 던지지 않은 예외를 새롭게 던지면 안된다.
//	void abc() throws BindException {
		
//	}
}







