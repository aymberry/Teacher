package P0703;
public class Test04 {
	public static void main(String[] args) {
		Sam04		s = new Sam04("홍길동");
	}
}

class Sam04 {
	String		name;
	int			age;
	boolean	gender;
	
	//	데이터를 전혀 모르는 경우
	Sam04() {
		this("무명씨", 0, true);
		System.out.println("나는 데이터를 모르는 생성자다");
//		name = "무명씨";
//		age = 0;
//		gender = true;

	}
	//	이름만 아는 경우
	Sam04(String n) {
		this(n, 0, true);
		System.out.println("나는 이름만 아는 생성자다");
//		name = n;
//		age = 0;
//		gender = true;

	}
	//	이름과 나이만 아는 경우
	Sam04(String n, int a) {
		this(n, a, true);
//		name = n;
//		age = a;
//		gender = true;
		
	}
	//	모든 데이터를 다 아는 경우
	Sam04(String n, int a, boolean g) {
		name = n;
		age = a;
		gender = g;
		System.out.println("나는 마지막 생성자다");
	}
}