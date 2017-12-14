package P0727;
/*
 * 	파일을 복사해 보도록 하자.
 */
import		java.io.*;
public class Test08 {
	public Test08() {
		//	두개의 타겟 스트림이 필요하다.
		//	입력용은 강력한 필터가 없으므로..
		FileReader			fr =  null;
		BufferedReader	br = null;
		//	출력용은 강력한 필터가 하나 있으므러....
		PrintWriter		pw = null;
		try {
			fr = new FileReader("D:\\수업설명\\Java\\0704설명.txt");
			br = new BufferedReader(fr);
			
			pw = new PrintWriter("D:\\복사본.txt");
			
			//	읽고 쓰기를 반복하자.
			while(true) {
				//	먼저 한줄씩 읽자
				String line = br.readLine();
				//	언젠가 끝내야 한다.	파일을 못읽으묜....
				if(line == null) {
					break;
				}
				pw.println(line);
			}
			//	PrintWriter는 Buffer의 기능을 가지고 있다.
			pw.flush();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				br.close();
				pw.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Test08();
	}
}
