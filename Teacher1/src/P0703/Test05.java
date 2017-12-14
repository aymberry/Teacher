package P0703;

public class Test05 {

	public static void main(String[] args) {
		int			r = 10;		//	반지름을 입력한다.
		
		//	PI변수는 static변수이므로 new 시키지 않아도 사용할 수 있다.
		double		area = r * r * Math.PI;

		System.out.println(area);
	}
}
