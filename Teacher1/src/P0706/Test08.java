package P0706;

public class Test08 {
	public static void main(String[] args) {
		Sam08		s = new Sam08();
		//	s에는 주소가 기억되어 있다.
		System.out.println(s);
	}
}

class Sam08 {
	
	public String toString() {
		System.out.println("나는  toString 함수입니다.");
		return "방가방가";
	}
}