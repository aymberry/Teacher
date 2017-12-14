package P0703;
public class Test02 {
	public static void main(String[] args) {
		Sam02		s = new Sam02();
		
		s.setNum(10);
		
		s.display();
	}
}

class Sam02 {
	int		num;
	
	void setNum(int num) {
		//	매개변수인 int num은 지역변수이다.
		//	한가지 사실		지역변수와 전역변수는 같은 이름을
		//						사용해도 무방하다.
		this.num/*(1)*/ = num/*(2)*/;
		//	(2)		지역변수가 될 것이다.
		//	(1)		같은 이름의 변수가 되므로 함수 입장에서는
		//			자신과 가장 가까운 이 변수도 지역변수이다.
		
		//	결론	전역 변수는 사용하지 못한 상태이다.
		//	이때 전역 변수를 사용하기 위해서는 강제로
		//	이 변수는 멤버 변수임을 밝혀야 하는 경우가 발생한다.
	}
	
	void display() {
		System.out.println(num);
	}
}


