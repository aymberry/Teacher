package P0703;
public class Test07 {
	public static void main(String[] args) {
	}
}

class Sam07 {
	int		num;
	static int	age;
	
	void abc() {		//	일반함수
		num = 10;
		age = 100;
	}
	static void xyz() {	//	static 함수
		age = 200;
	//	num = 100;		//	주소를 사용하지 못해서 에러가 난다.
	}
}




