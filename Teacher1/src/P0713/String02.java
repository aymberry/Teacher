package P0713;

public class String02 {

	static void change(String a) {
		System.out.println("함수전 = " + a);		//	박아지
		
		a = a + "만세";
		
		System.out.println("함수후 = " + a);		//	박아지만세
	}
	
	public static void main(String[] args) {
		String	a = "박아지";
		System.out.println("호출전 = " + a);		//	 박아지
		change(a);	
		System.out.println("호출후 = " + a);		//	박아지
	}
}






