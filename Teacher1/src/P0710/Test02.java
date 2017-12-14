package P0710;
/*
 * 	문제
 * 		내 컴퓨터의 특정 폴더에 있는 파일의 목록을 출력해보자.
 * 
 * 		이때 특정 파일만 출력하도록 해보자(예 : 확장자가 txt 인 파일만)
 * 
 * 		원리	JVM에게 발견한 파일의 목록을 내가 원하는 파일인지
 * 				검사하도록 부탁하면 된다.
 * 
 * 				검사는 기능이므로 당연히 함수가 있어서 그 안에서
 * 				검사를 해야한다.
 * 				==>		이 검사를 담당하는 함수가	accept() 이다.
 * 						검사를 담당하는 함수는 이미 정해져있다.
 * 
 * 				근데..	내가 원하는 파일이 무엇인지는?	사용자 몫이다.
 */

import		java.io.*;
public class Test02 {
	public static void main(String[] args) {
		File		file = new File("D:\\수업설명\\Java");
		
		String[]	list = file.list(new MyFilter());
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
//	자동 호출함수를 가진 인테페이스를 이용해보자.
class MyFilter implements FilenameFilter {
	public boolean accept(File dir, String name) {
		//	이 함수는 파일을 하나씩 찾을때마다 이 함수에게
		//	검사해 달라고 JVM이 호출하는 함수이다.
		//	이때 찾은 파일의 이름을 매개변수인 String name에
		//	알려준다.
		
		if(name.endsWith("txt")) {
			return true;
		}
		else {
			return false;
		}
	}
}
















