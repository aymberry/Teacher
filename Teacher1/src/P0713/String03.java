package P0713;

public class String03 {
	static void change(StringBuffer a) {
		System.out.println("함수전 = " + a);	//	박아지
		
		a = a.append("만세");
		
		System.out.println("함수후 = " + a);	//	박아지 만세
	}
	public static void main(String[] args) {
		StringBuffer	a = new StringBuffer("박아지");
		System.out.println("호출전 = " + a);	//	 박아지
		change(a);	
		System.out.println("호출후 = " + a);	//	박아지 만세

	}

}
