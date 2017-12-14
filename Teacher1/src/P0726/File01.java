package P0726;
import		java.io.*;
/*
 * 	특정 폴더를 File로 만든 후 그 폴더의 파일 목록을 알아내자.
 */
public class File01 {
	public File01() {
		File		file = new File("D:\\수업설명\\Java");
		//	오타가 나도 만들어지므로 조심할껏
//		String[]	list = file.list();
		
//		for(int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		
		File[]	list = file.listFiles();
		for(int i = 0; i < list.length; i++) {
			String	name = list[i].getName();
			long	size = list[i].length();
			
			System.out.println(name + " : " + size);
			
		}
	
		/*
		 * file.list();, file.listFiles();의 차이점
		 * 
		 * 
		 * 		file.list()은 파일의 이름만 필요할 때 사용하는 기법이다.
		 * 
		 * 		file.listFiles()은 파일의 정보가 필요할 때 사용하는 기법이다.
		 */
		
		
	}

	public static void main(String[] args) {
		new File01();
	}
}
