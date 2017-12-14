package P0616;

public class Test11 {
	public static void main(String[] args) {
//		String	a = new String("Hong");
//		String	b = new String("Hong");
		
		String	a = "Hong";
		String b = "Hong";
//		m56-441-510
//		if(a == b) {		//	이렇게 쓰면 곤란하다.
		if(a.equals(b)) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다.");
		}

	}

}
