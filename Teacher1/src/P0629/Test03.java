package P0629;
public class Test03 {
	public static void main(String[] args) {
//		String	str1 = "Hong";
//		String	str2 = "Hong";
		String	str1 = new String("Hong");
		String	str2 = new String("Hong");
		
//		if(str1 == str2) {
//			System.out.println("같아요");
//		}
//		else {
//			System.out.println("달라요");
//		}
		
		//	이런문제가 발생하므로....
		//	String은 문자열의 내용을 비교하는 기능을 준비해 놓았다.
		//	equals()
		if(str1.equals(str2)) {
			System.out.println("같아요");
		}
		else {
			System.out.println("달라요");
		}
		
		
		
		
	}
}
