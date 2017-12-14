package P0710;
/*
 * 	특정 폴더에 있는 파일의 목록 중에서 원하는 목록만 꺼내서 출력하자.
 * 
 * 	1.	파일의 정보를 얻기 위해서는 java.io.File 클래스를 사용하면 된다.
 */
import		java.io.*;
public class Test06 {

	public static void main(String[] args) {
		//	2.	필요한 클래스를 new 시킨다.
		File		f = new File("D:\\수업설명\\oracle");
		
		//	3.	그 클래스가 가진 함수 중에서 원하는 기능을 수행할 함수를
		//		찾아서 사용한다.
		
		//	5.	인터페이스를 사용할 경우에는 인터페이스는 
		//	직접 new 시키지 못하고 대신 하위 클래스를 new 시켜서
		//	사용한다.
		MyFilter06		temp = new MyFilter06();
		String[]	result = f.list(temp);
		
		//	4.	이 결과를 원하는 목적으로 사용해보자.
		//		(우리는 출력할 예정이다.)
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}

//	인터페이스를 	사용하기 위해서는 
//	1.	그 인터페이스를 상속받은 나만의 클래스를 만드고
//	2.	그 안에 추상 함수를 오버라이드 하세요.

class MyFilter06 implements FilenameFilter {
	public boolean accept(File dir, String name) {
		//	이 함수는 인터페이스 소속 함수이므로 자동 호출 함수입니다.
		//	언제 호출되느냐?
		//		목록을 구하기 위해서 파일을 하나씩 찾을때 마다
		//		이 함수가 실행된다.
		
		//	이때 찾아낸 파일의 폴더 경로는 dir에 기억하고
		//	찾아낸 파일의 이름은 name에 기억하면서 한번씩 자동 호출한다.
		
		//	반환값의 의미는 이 함수가 true를 반환하면 목록에 포함하고
		//	이 함수가  false를 반환하면 목록에서 제외하게 된다.
		
		//	고로 위의 규칙을 이용해서 원하는 필터링 작업을 하면 된다.
		//	우리는		"07"으로 시작하고 확장자가 "txt"인 파일만
		//				목록에 포함시키고 싶으면.....
		
		if(name.startsWith("07") && name.endsWith("txt")) {
			return true;
		}
		else {
			return false;
		}
			
	}
}

























