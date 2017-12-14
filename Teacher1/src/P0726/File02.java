package P0726;
/*
 * 	문제
 * 		나는 특정 폴더에 있는 내용 중에서 확장자가 txt 인것만
 * 		골라서 출력하도록 하자.
 */
import		java.io.*;
public class File02 {

	public File02() {
		File		file = new File("D:\\수업설명\\Java");
		
//		String[] list = file.list(new MyFilter02());
		
//		for(int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		
		File[] list = file.listFiles(new YouFilter02());
		for(int i = 0; i < list.length; i++) {
			String name = list[i].getName();
			long	size = list[i].length();
			
			System.out.println(name + " : " + size);
		}
	}

	public static void main(String[] args) {
		new File02();
	}
}

class MyFilter02 implements FilenameFilter {
	public boolean accept(File dir, String name) {
		//	인터페이스의 함수는 거의 모두 자동 호출함수이다.
		//	호출되는 시점
		//		list에 의해서 특정 폴더의 목록이 하나씩 나타날때마다
		//		실행이된다.
		
		//	파라메터
		//		dir		찾은 파일이 포함된 폴더의 정보
		//		name	찾은 파일의 파일 이름
		
		//	결론
		//		JVM이 알려준 파일을 목록에 포함시키고 싶으면
		//			true를 반환하고
		//		JVM이 알려준 파일을 목록에서 빼고 싶으면
		//			false를 반환하면 된다.
		
		if(name.endsWith("txt")) {
			return true;
		}
		else {
			return false;
		}
	}
}

class YouFilter02 implements FileFilter {
	public boolean accept(File pathname) {
		//	사용법은 동일하다.
		//		여기서는 파일의 이름이 07로 시작하면서
		//		확장자가 .txt인것만 골라내자.
		
		String	name = pathname.getName();
		if(name.startsWith("07") && name.endsWith("txt")) {
			return true;
		}
		else {
			return false;
		}
		
	}
}










