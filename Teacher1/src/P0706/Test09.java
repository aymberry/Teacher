package P0706;
public class Test09 {
	public static void main(String[] args) {
		SamGak09	s = new SamGak09(5, 7);
		//	문제	나는 내가 만든 SamGak09를 출력하면
		//			HashCode 대신에
		//			"면적이 ???? 인 삼각형 입니다."을 출력하고 한다면?
		System.out.println(s);
	}
}

class SamGak09 {
	int		base;
	int		height;
	float	area;
	
	SamGak09() {}
	SamGak09(int b, int h) {
		base = b;
		height = h;
		area = (b * h) / 2.0F;
	}
	//	1.	이 클래스 안에는 toString이 존재한다.
	//		이 클래스는 역활은 아시는 바이다.
	//	2.	나는 그 역활이 마음에 들지 않는다.
	public String toString(/* SamGak08 this*/) {
		//	누군가가 이함수를 원하면....
		//			s.toString()으로 호출할 것이다.
		//		this -> s가 기억될 것이다.
		return "면적이 " + area + " 인 삼각형 입니다.";
	}
}