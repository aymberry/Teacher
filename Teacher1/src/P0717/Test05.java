package P0717;
import		java.text.*;
public class Test05 {

	public static void main(String[] args) {
		//	..	먼가 작업을 하다가 작업 결과가 다음과 같이 나왔다.
//		Object[]	result = {5, 6, 30};
		//	Object는 숫자도 기억할 수 있는데...
		//	이유는		숫자는 주소로 자동 Boxing되기 때문이다.
		//	결론		Object는 자바의 모든것을 다 기억할 수 있다.

		int		garo = 10;
		int		sero = 20;
		int		area = 200;
		//	나는 이것을 
		//	"가로 ??, 세로 ??이며 면적이 ??인 사각형입니다." 라고
		//	출력하고 싶다.
		
		//	이 클래스는 new 시키지 않고 static 함수를 이용하는
		//	좀 특별한 클래스이다.
		String dap = MessageFormat.format(
				"가로 {0}, 세로 {1}이며 면적이 {2}인 사각형입니다.", 
				garo, sero, area);
		System.out.println(dap);

	}

}




