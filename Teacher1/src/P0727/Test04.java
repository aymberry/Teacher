package P0727;
/*
 * 	문제
 * 		키보드를 이용해서 한줄의 데이터를 읽어서 출력하는 프로그램
 * 
 * 		이때 사용 가능한 필터		BufferedReader
 */
import		java.io.*;
public class Test04 {
	public Test04() {
		//	필요한 스트림 준비
		//	1.	타겟	System.in
		//	2.	필터	BufferedReader	
		BufferedReader		br = null;
		try {
			//	스트림의 크기가 다르므로 연결이 불가능하다.
			//	br = new BufferdReader(System.in);
			//	크기가 다르므로 중간 연결 스트림을 이용해야 한다.
			InputStreamReader temp = 
					new InputStreamReader(System.in);
			br = new BufferedReader(temp);
			
			String	data = br.readLine();
			System.out.println("입력 내용 = " +  data);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				br.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Test04();
	}
}
