package P0711;
/*
 * 	문제
 * 		특정 폴더에 있는 파일의 목록 중에서 원하는 파일만 골라서
 * 		출력하도록 하라.
 */
import		java.io.*;
public class Test07 {
	public static void main(String[] args) {
		File		file = new File("D:\\수업설명\\oracle");
		
		//	함수를 이용해서 원하는 기능을 수행한다.
		String[]	list = file.list(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				if(name.startsWith("06")) {
					return true;
				}
				else {
					return false;
				}
			}
		});

		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
//	왜 이 클래스를 만들었는가?
//		accept()를 오버라이드 해야 하기 때문에.....
//		그래?
//		그러면 굳이 새로운 클래스를 안만들고 할 수는 없나요?
//class MyFilter07 implements FilenameFilter {
//	public boolean accept(File dir, String name) {
//		if(name.startsWith("06")) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
