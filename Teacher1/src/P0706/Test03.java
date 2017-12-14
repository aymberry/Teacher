package P0706;
//	이 소스는 실무에 해당하는 소스
public class Test03 {
	public static void main(String[] args) {
		SaGak		s1 = new SaGak(5, 4);
//		SaGak		s2 = new SaGak(5, 4);
		SaGak		s2 = new SaGak(2, 10);
		//	위의 두 클래스는 데이터가 동일한 클래스이다.
		//		==	은 항상 주소 비교만 한다.
		//			즉 원래 개념은 변수 안의 내용만 비교한다.
		
		if(s1.equals(s2)) {
			//	참고로
			//		SaGak 클래스는 자동적으로 Object를 상속 받았으므로
			//		Object의 기능을 다 사용할 수 있다.
			
			//		Object가 가진 equals()함수는 값을 비교하는 함수가 아니고
			//		주소를 비교하는 함수이다.
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
	}
}

class SaGak {
	int		garo;
	int		sero;
	int		area;
	public SaGak() {}
	public SaGak(int g, int s) {
		garo = g;
		sero = s;
		area = g * s;
	}

	//	여러분이 어떤 클래스를 만들면
	//	그 클래스를 사용하는 누군가는 보나마나 equals()를 이용해서
	//	데이터가 같은지 비교할라고 노력할 것이다.
	//	하지만 다르다 라고 대답이 나오므로... 창피할 것이다.
	//	그럼 사용자의 기대대로 같다고 대답이 나오게 할 수 없을까?
	
	//	Object의 equals 함수의 기능이 맘에 들지 않더라....
	//	 나는 면적이 같으면 같은 클래스로 하고 싶은데...
	//	Object의  equals는 주소만 비교하므로... 기능을 바꾸고 싶은 것이다.
	//	그럼 오버라이드하면 기능을 바꿀 수 있겠다.
	//	오바라이드의 규칙은 아버지 클래스의 함수 원형과 동일하게
	//	만드는 것이다.
	public boolean equals(/*SaGak this */Object obj) {
		//	이 함수는 이제 SaGak 클래스의 멤버가 된 것이다.
		//	멤버 함수는 JVM이 "클래스이름 this"를 받을 준비를 한다.
		
		//	이 함수는 누군가		s1.equals(s2)	의 방식으로 이용할 것이다.
		//		this -> s1
		//		obj -> s2		가 기억될 것이다.
		SaGak temp = (SaGak) obj;
		//	우리의 목적은 면적이 같으면 같은것으로 판정하기를 원한다.
//		if(this.area == temp.area) {
		if(this.garo == temp.garo && this.sero == temp.sero) {
			return true;
		}
		else {
			return false;
		}
	}
	
}









