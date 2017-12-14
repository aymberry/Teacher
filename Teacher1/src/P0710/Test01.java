package P0710;

import		Sample.*;
public class Test01 {
	public static void main(String[] args) {
		System.out.println(MyInter.num);
		//	1.	다른 패키지의 인터페이스 변수를 사용했다는데 대해서
		//		접근 지정자는 public 이구나.
		//	2.	new 시키지 않고도 인터페이스이름을 이용해서 
		//		사용했다는데 대해서 속성은 static 이구나.
//		MyInter.num = 100;
		//	3.	위의 문장이 에러가 나는것을 보면
		//		num 변수는 final 변수이구나.
	}
}




