package P0712;
/*
 * 	문제
 * 		특정 파일을 선택한 후 그 파일의 내용을 읽어서
 * 		화면에 출력하자.
 */
import		java.io.*;
public class Test06 {
	public static void main(String[] args) /*throws Exception*/ {
		FileReader		fr = null;
		try {
			fr = new FileReader("D:\\수업설명\\Java\\070설명.txt");
			//	이 생성자 함수는 예외를 던지는 생성자 함수이므로
			//	반드시 이 생성자 함수를 사용하는 곳(new 시키는곳)에서
			//	try 처리를 해주어야 한다.
			while(true) {
				char[]	buff = new char[256];
				int	len = fr.read(buff);
				if(len < 0) {
					break;
				}
				String temp = new String(buff, 0, len);
				System.out.print(temp);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
