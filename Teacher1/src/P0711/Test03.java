package P0711;
/*
 * 	문제
 * 		윈폼 안에 단추를 하나 만들고 단추를 누르면 윈폼의 색상이
 * 		변경되도록 해보자.
 */
//	윈폼을 사용하기 위해서는 java.awt.* 패키지가 필요하고
import		java.awt.*;
//	이벤트 처리를 하기 위해서는 java.awt.event.*  패키지가 필요하다.
import		java.awt.event.*;
//	참고
//		import 시킬때 주의사항
//		import 시킬때는 하위 폴더에 있는 클래스는 대상에서 제외된다.
//			오직 지정한 폴더의 클래스만 사용할 수 있게 된다.
//		그래서 만약 하위 폴더도 필요하다면 다시 선언해 주어야 한다.
public class Test03 {
	//	사용할 부품을 전역변수로 준비한다.
	//	그래야 필요한 곳에서 이용할 수 있을 것이다.
	Frame		f;
	Button		b;
	//	this를 사용하기 위해서 만든 함수
	Test03() {
		/*	나중에 다시 설명하겠지만
		 * 	실무 코딩에서는 main에서 뭔가 작업하는 경우는 거의 없다.
		 * 	왜냐하면 main은 static 이므로.... 사용하는데 있어서
		 * 	많은 제약을 받는다.
		 * 
		 * 	그래서 실무에서는 생성자 함수를 하나 만들고
		 * 	(그러면 일반 함수이므로 static 보다는 좀더 다양하게 일을 할 수 있고)
		 * 	main에서는 new 만 시킴으로써
		 * 	좀더 파워있는 코딩을 할 수 있도록 하는 기법을 많이 사용한다.
		*/
		//	필요한 부품을 만들자
		f = new Frame("내가 만든 윈폼");
		b = new Button("눌러봐 단추");
		//	단추에 아래에서 만든 이벤트 클래스를 등록한다.
		b.addActionListener(new MyEvent());
		//	이제 부품이 가지고 있는 함수를 이용해서 원하는 기능을
		//	구현한다.
		f.add(b);	//	윈폼에 단추를 포함한다.
		f.setLayout(new FlowLayout());
		//	단추가 윈폼에 포함되는 방식을 설정한다.
		
		f.setSize(400, 400);
		//	윈폼의 크기를 정한다.
		f.setVisible(true);
		//	화면에 출력한다.	
	}
	
	public static void main(String[] args) {
		//	static 함수에서는 this를 사용할 수 없으므로
		//	일반 멤버를 사용할 수 없다.
//		f = new Frame();
		//	해결 방법	
		//		this가 존재하는 함수를 만들고 강제로 호출하자.
		new Test03();
	}
	class MyEvent implements ActionListener {
		//	2.	추상 함수를 오버라이드한다.
		public void actionPerformed(ActionEvent e) {
			//	할일
			//		단추가 눌려지면(이 함수가 실행되면)
			//		윈폼(f)의 색상을 바꾸어야 한다.
			
			//	그러면  f 변수를 사용해야 하는데...
			//	이 변수는 다른 클래스 변수이더라.. 사용이 안된다.
			//	팁
			//		자바는 RGB 컬러를 이용해서 색상을 정한다.
			//		각각의 색상은 0 ~ 255사이의 값으로 정한다.
			int	red = (int)(Math.random() * (255 - 0 + 1) + 0);
			int	green = (int)(Math.random() * (255 - 0 + 1) + 0);
			int	blue = (int)(Math.random() * (255 - 0 + 1) + 0);
			Color	c = new Color(red, green, blue);
			
			f.setBackground(c);
			//	해결 방법
			//		힌트	내가 만든 클래스가 다른 클래스의 멤버를
			//				아무런 제약없이 사용할 수 있으면 참 좋으련만...
			//	결론
			//	이런 경우
			//		클래스를 만들긴 만들어야 하는데
			//		메인 클래스하고 연결이 유지되도록 하고 싶은 경우
			//	이때는 메인 클래스의 내부 클래스로 만들면
			//	자연스럽게 연결된다.
		}
	}
}
/*
 * 	단추를 클릭하면 JVM은 actionPerforem라는 함수를 호출하게 된다.
 * 	이 함수는 ActionListener 라는 인터페이스 안에 포함된 함수이다.
 * 
 * 	즉	ActionListener라는 인터페이스를 이용해서 이벤트 처리를 해야한다.
 * 
 * 	인터페이스 사용방법
 * 	1.	하위 클래스 만든다.
 */
















