package P0713;
public class Object04 {
	public static void main(String[] args) {
		 Sam04	s = new Sam04(5);
		 Sam04 temp = (Sam04)s.clone();
		 System.out.println(s.num);
		 System.out.println(temp.num);
	
	}
}
//	나는 이제 이 클래스를 사용하는 누군가가 깊은 복사하게 하고싶다.
//	깊은 복사란?
//		데이터도 동일하고 모든 동일한 객체를 한부 더 만드는 것

//	이 클래스는 반드시 Cloneable 를 상속받아야 한다.
class Sam04 implements Cloneable {
	public int		num;
	public Sam04() {}
	public Sam04(int n) {
		num = n;
	}
	
	//	clone 함수가 protected 함수이므로 다른곳에서는
	//	사용을 할 수 없다.
	//	그러므로 사용 가능한 함수로 만들어야 한다.
	//	오버라이드 규칙중 2번 규칙
	public Object clone() {
		//	이렇게 접근 지정을 넓혀줌으로 다른곳에서도 사용할 수 있게 된다.
		
		//	참고
		//		100에 한번정도는 오버라이드 하는 이유가
		//		기능에 마음에 안들어서가가 아니고
		//		접근 지정을 넓히기 위해서 하는 경우가 있다.
		Object	o = null;
		try {
			o = super.clone();
			//	상위의 clone()를 호출하면 깊은 복사를 해줄 것이고
			//	깊은 복사 받은 결과를 마치 내가 만든것 처럼
			//	알려주면 될 것이다.
			
			
			
			//	이 함수를 오버라이드 한 이유는?
			//	기능을 바꾸기 위한것이 아니고 접근 지정을 넓히기
			//	위해서이다.
			//	기능은 원래 기능을 유지하고 싶다.
			
			//	그런데 오버라이드를 하는 순간 아버지의 기능은
			//	없어지게 되고 여러분이 기능을 만들어 주어야 한다.
			
			//	내가 만들 재간은 없는데... 다행이도 아버지 클래스를
			//	그 기능을 알고 있다.
			//	아버지 한테 부탁해서 그 기능을 구현하도록 한다.
			//	이때 사용하는 기능이 바로 super 이다.
		}
		catch(Exception e) {
		}
		return o;
	}
}
