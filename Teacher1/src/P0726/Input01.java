package P0726;
/*
 * 	문제	키보드를 이용해서 데이터를 입력받은 후 출력해보자.
 */
import		java.io.*;
import		java.util.*;
public class Input01 {
	public Input01() {
		try {
			FileInputStream fin = new FileInputStream("src/P0726/test.txt");
			
			//	1.	한 글자(byte)만 입력 받는 방법
//			char	ch = (char) System.in.read();
//			System.out.println("당신이 입력한 문자 = " + ch);
			
			//	2.	여러 글자를 동시에 입력 받는 방법
			//	방법
			//		1.	입력받을 데이터를 기억할 배열 변수를 준비한다.
			//		2.	int read(byte[] buff)를 이용해서 데이터를 입력 받는다.
			//			함수의 의미
			//				byte[]의 의미는 입력받은 데이터를 기억할 장소를
			//				지정한다.
			//				반환값의 의미는 실제 입력받은 데이터의 크기(byte 수)
			//				를 알려준다.
			
//			byte[]	buff = new byte[256];
			//	256의 의미는 한번에 입력 가능한 최대 바이트수를 지정한다.
			//	고로	시스템의 사양이나 프로그램의 특징이 따라서
			//			최대 입력 가능한 크기를 조절해서 사용하면 된다.
//			int	len = System.in.read(buff);
			
			//	입력받은 데이터를 보기좋게 출력하고 싶다.
			//	그러면 String으로 출력하는 것이 좋겠다.
//			String str = new String(buff, 0, len);	
			//	출력 결과가 이상하게 나오는 이유?
			//		new String(buff);의 의미는 byte[]의 모든 데이터를
			//		문자로 변환하라는 의미이다.
			//		배열을 Heap 영역에 만들어지므로
			//		입력되지 않은 장소에는 자동 초기화가 되었으므로 0이
			//		입력된 상태이다.
			//		그래서 결과가 이상하게 나온것이다.
			
			
//			System.out.println("입력 바이트 수 = " + len);
//			System.out.println("입력 데이터 = " + str);

			//	3.	여러 글자를 동시에 입력하는 방법
			//		(입력 장소를 조절하면서 입력하는 방법)
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte)'A');
			//	배열에 A라는 글자로 채우세요.
			int	len = fin.read(buff, 10, 50);
			//	파라메터 설명
			//	1.	입력받을 데이터를 기억할 변수
			//	2.	입력받을 변수에서 실제 입력 받을 시작 위치
			//	3.	입력받을 최대 크기
			//	반환값 설명
			//		실제로 입력 받은 데이터 크기
			
			//	보기좋게 출력하기 위해서.....
			String str = new String(buff, 0, len + 10);
			System.out.println(str);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		new Input01();
	}
}
