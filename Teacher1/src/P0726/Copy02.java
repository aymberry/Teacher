package P0726;
/*
 * 	문제
 * 		특정 txt 파일을 복사해보자.
 * 
 * 		나는 수업설명 폴더에 있는 특정 파일을 복사할 예정이다.
 * 
 * 		참고	char 단위의 입출력은 주로 문자 데이터 처리에 사용한다.
 * 				텍스트 문서 처리에 사용한다.
 */
import		java.io.*;
public class Copy02 {

	public Copy02() {
		FileReader			fr = null;
		FileWriter			fw = null;
		try {
			fr = new FileReader("D:\\수업설명\\Java\\0703설명.txt");
			fw = new FileWriter("D:\\복사설명.txt");

			while(true) {
				char[]	buff = new char[256];
				int len = fr.read(buff);
				if(len == -1) {
					break;
				}
				fw.write(buff, 0, len);
			}
			//	이미 파일 복사는 끝났다.
			//	혹시라도 버퍼에 남은 내용이 있으면....
			//	그것도 강제로 내보내자.
			fw.flush();			
			boolean temp = true;
			while(temp) {
				//	무한루프 돌렸다 프로그램 안끝난다.
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		new Copy02();
	}
}
