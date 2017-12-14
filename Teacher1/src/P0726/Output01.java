package P0726;

import		java.io.*;
public class Output01 {

	public Output01() {
		try {
			//		1.	파일에 연결된 타겟 스트림을 만들어야 한다.
			FileOutputStream fout = new FileOutputStream("D:\\Test.txt"); 
			
			//	1.	한 문자만 파일에 기록하자.
//			int		ch = 'A';
//			fout.write(ch);
			
			//	2.	여러 문자를 기록해 보자.
//			String	data = "나보기가 역겨워 가실때에는";
//			byte[] buff = data.getBytes();
//			fout.write(buff);
			
			//	3.	여러 문자를 기록해 보자.
			//		(출력 데이터를 조절한다.)
			String data = "My Name Is Kim Myoung Whan";
			byte[] buff = data.getBytes();
			//	나는 이중에서 이름만 저장하고 싶다.
			fout.write(buff, 11, buff.length - 11);
			
			
		}
		catch(Exception e) {
			
		}
		
	}

	public static void main(String[] args) {
		new Output01();
	}
}



