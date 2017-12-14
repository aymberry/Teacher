package P0726;
/*
 * 	아이유 사진 파일을 복사해보자.
 * 
 * 	원리		원본 파일의 내용을 읽어서
 * 				복사본 파일에 내용을 그대로 기록하면 된다.
 * 
 * 		문제	스트림은 단방향이다. 
 * 				즉 스트림 하나는 데이터를 한쪽 방향으로만 흘러가게된다.
 * 			
 * 				그러므로 스트림이 2개 필요하다.
 */
import		java.io.*;
public class Copy01 {
	public Copy01() {
		//	타겟 스트림 2개를 준비한다.
		FileInputStream	fin = null;
		FileOutputStream	fout = null;
		try {
			//	원본 파일에서는 읽기를 위한 스트림을 준비하고
			fin = new FileInputStream("D:\\iyou.jpg");
			//	복사본 파일에서는 쓰기를 위한 스트림을 준비한다.
			fout = new FileOutputStream("D:\\아이유.jpg");
			
			//	한쪽에서 읽어서 쓰기를 처리한다.
			//	그런데 얼만큼 읽어야 될지는 파일의 크기에 따라서 달라진다.
			//	그러므러 몇번 읽고 쓸지를 모른다. 무한루프 돌린다.
			while(true) {
				//	읽고
				byte[]	buff = new byte[256];
				int	len = fin.read(buff);
				//	무한루프를 빠져 나와야 한다.
				//	빠져나오는 시점은 파일을 더이상 읽을 수 없을때이다.
				if(len == -1) {
					break;
				}
				//	쓰자
				fout.write(buff, 0, len);
			}
		}
		catch(Exception e) {
			//	외부장치를 이용하는 경우이므로...
			//	외부장치의 문제로 인해서 예외가 발생할 수 있다.
			//	그러므로 혹시 문제가 생기면 어떤 문제인지를 파악하기 
			//	위해서 예외 정보를 출력해 보자.
			System.out.println(e);
			//	외부장치를 이용하는 경우에는 에러의 이유를 파악할 필요가 있다.
		}
		
		
	}
	public static void main(String[] args) {
		new Copy01();
	}
}




