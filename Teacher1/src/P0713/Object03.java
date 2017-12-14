package P0713;
public class Object03 {
	public static void main(String[] args) {
		SaGak03	s = new SaGak03(5, 7);
		System.out.println(s.garo);
		System.out.println(s);
	}
}

class SaGak03 {
	public int		garo;
	public int		sero;
	public int		area;
	public SaGak03() {}
	public SaGak03(int g, int s) {
		garo = g;
		sero = s;
		area = garo * sero;
	}
	//	나는 누군가가 내가 만든 클래스를 출력하기 원하면...
	//		"면적이 ??? 인 사각형입니다." 라고 출력하고 싶다.
	//	toString를 오버라이드 하면 된다.
	public String toString() {
		return "면적이 " + area + "인 사각형입니다.";
	}

}






