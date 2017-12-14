package P0713;

public class Wrapper01 {

	public static void main(String[] args) {
		int		a = 10;
		Object	o;
		o = a;	
		//	이것을 우리는 자동 Boxing 되었다.
		//	이렇게 하면 JVM이 자동으로 a 변수를 주소 변수로 바꾸어서
		//	주소 변수에 기억을 해주게 된다.

		Object		temp = 5;
		int		num = (int) temp;
		//	이것을 우리는 Unboxing 한다고 표현한다.
		//	즉 주소를 데이터로 변환해서 기억해 주게 된다.
		
		
	}

}

