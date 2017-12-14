package P0713;
public class Object01 {
	public static void main(String[] args) {
		//	사용하는 측에서 설명하면
		//	1	클래스를 사용하기 위해서는 new를 시켜서 사용해야 하는데.
		//	new 시키는 방법은 그 클래스가 제공하는 생성자 함수를 보면
		//	알수 있다.
		SamGak	s1 = new SamGak();
		//	2.	new 를 시켰으면... 그 클래스가 제공하는 함수를 이용해서
		//		필요한 작업을 할 수 있다.
		//		나는 밑변을 알려주지 않았으므로 밑변을 알려주고 싶다.
		s1.setBase(5);
		s1.setHeight(7);
		s1.calcArea();
		
		SamGak	s2 = new SamGak(5, 7);
//		SamGak	s3 = new SamGak(5);
		
		if(s1.equals(s2)) {
			//	이 함수는 Object의 함수를 그대로 이용하는 것이다.
			//	근데...	Object의 함수는 주소를 비교하는 것이다.
			System.out.println("같아요");
		}
		else {
			System.out.println("달라요");
		}
		
	}
}
//	나는 삼각형 정보를 관리하기 위한 클래스를 하나 만들어서
//	사용할 예정이다.
class SamGak {
	//	여러분이 관리하고 싶은 목적에 따라서 필요한 변수를 만들어 놓는다.
	public int		base;		//	밑변의 길이를 기억할 변수
	public	int		height;		//	높이의 길이를 기억할 변수
	public	float	area;		//	면적을 기억할 변수
	//	이 클래스를 new 시킬 경우를 대비해서 생성자 함수를 만들어 놓는다.
	//	1.	이 클래스를 new 시킬때 밑변과 높이를 알려주면서 
	//		new 시킬 수 있도록 하고 싶습니다.
	public 	SamGak(int b, int h) {
		//	이목적에 따라서 필요한 조치를 한다.
		base	= b;
		height = h;
		//	그리고 혹시 new 시키는 순간 면적까지 구해주면
		//	사용자가 좀더 편하지 않을까?
		area = base * height / 2.0F;
	}
	//	참고
	//		이처럼 생성자 함수를 만들기 시작하면
	//		JVM은 default를 안만들어주므로 습관적으로 default 부터
	//		만들어 놓는다.
	public		SamGak() {
		
	}

	//	누군가가 이 클래스를 사용할때 좀더 편하게 사용할 수 있는
	//	기능을(함수) 만들어 놓는다.
	//	1.		나는 누군가 내 클래스를 사용할 때 면적 계산을
	//			다시 하고싶을때는 없을까?
	public void calcArea() {
		area = base * height / 2.0F;
	}
	//	2.		혹시 밑변을 다르게 입력하기를 원하지 않을까?
	public void setBase(int b) {
		base = b;
	}
	//	3.		혹시 높이를 다르게 입력하기를 원하지 않을까?
	public void setHeight(int h) {
		height = h;
	}
	//	4.		......

	//	이 안에는 보이지 않지만 Object 클래스의 모든 함수가
	//	복사되어 있습니다.
	//	그 중에 equals 함수도 존재하고 있다.
	//	나는 다른 기능은 다 마음에 드는데.. equals는 마음에 안든다.	
	//	이처럼 상속을 받은 후 마음에 들지 않는 기능은 수정할 수 있다.
	//	이런 경우 사용하는 개념이 바로 오버라이드 이다.
	
	//	상속이라는 개념이 나온 이유는 소프트웨어 개발 속도를 
	//	높이기 위해서 한번 만든 기능은 다시 만들지 말고
	//	복사해서 쓰세요... 라는 개념이다.
	//	그리고 없는 기능만 추가해서 만드세요... 라는 개념이다.

	//	오버라이드 규칙은 함수의 원형을 그대로 복사해서 만드는 것이다.
	public boolean equals(Object obj) {
		//	이 함수가 true를 반환하면 같은 것으로 인정하고
		//	이 함수의 결과과 false를 반환하면 다른 것으로 인정하게 된다.
		//	이 함수는 멤버 함수이고.....
		//	이 함수는 누군가가		s1.equals(s2) 의 형식으로 사용할 
		//								것이므로....
		//	this		s1
		//		멤버 함수를 사용하는 주소가 this에 기억된다.
		//	obj			s2		가 기억될 예정이다.
		
		//	변수는 그 주소의 주인(Heap Type)이 가진 변수를 사용한다.
		//	위에서는 obj 의 Heap Type은 Object 이므로
		//	Object가 가진 area라는 변수를 사용하게 된다.
		//		미안하지만 없어서 에러가 난다
		//		변수의 오버쉐도우 라는 이론에서 설명했다.
		
		//		만약 그 레퍼런스에 변수가 없으면...
		//		변수가 있는 곳으로 형변환해서 사용하세요....
		SamGak temp = (SamGak) obj;
		//	이렇게 하면 변수의 Heap Type이 SamGak이므로
		//	SamGak의 area 변수를 찾게 되고 그 안에 있으므로
		//	에러가 나지 않는다.
		
		if(this.area == temp.area) {
			return true;
		}
		else {
			return false;
		}
	}


}














