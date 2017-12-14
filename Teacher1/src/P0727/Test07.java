package P0727;
import		java.io.*;
public class Test07 {
	public Test07() {
		//	특정 파일을 삭제하자.
		//	1.	삭제할 파일을 생성한다.
//		File		file = new File("D:\\sam.txt");
		//	2.	delete()를 이용해서 삭제한다.
//		file.delete();
		
		//	강제로 폴더 하나를 만들자.
		//	1.	만들 폴더 이름을 이용해서 File를 생성한다.
//		File		file = new File("D:\\홍길동");
		//	2.	mkdir()를 이용해서 폴더를 만든다.
//		file.mkdir();
		
		//	강제로 폴더를 하나 만들자(계층구조로 만들자)
		//	1.	만들 폴더 이름을 이용해서 File를 생성한다.
//		File		file = new File("D:\\박아지\\장독대\\이기자");
		//	2.	계층구조 폴더(여러개를 동시에)를 만들고 싶으면
		//		mkdirs()를 사용하세요.
//		file.mkdirs();

		//	특정 파일의 이름을 다른 이름으로 변경하세요
		//	1.	변경전 파일과 변경후 파일을 모두 File 로 만드세요.
		File		oriFile = new File("D:\\1차_영타대회.zip");
		File		reFile = new File("D:\\Fisrt_Typing.zip");
		//	2.	renameTo를 이용해서 이름을 변경한다.
		oriFile.renameTo(reFile);
		
	}

	public static void main(String[] args) {
		new Test07();

	}

}
