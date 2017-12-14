package P0727;
/*
 * 	data.txt에 저장된 데이터를 읽어서 출력하자.
 * 
 * 	Data 필터의 단점은
 * 		텍스트가 아니므로 확인 불가능하고
 * 		반드시 읽어서 확인해야 하며			
 * 
 * 		읽을때도 입력 순서와 동일하게 읽어야 한다.
 */
import		java.io.*;
public class Test03 {
	public Test03() {
		//	읽을 준비를하자. 데이터를 읽을 대상은 파일이다.
		//	파일에 연결된 스트림을 준비해야 한다.
		FileInputStream		fin = null;
		DataInputStream		din = null;
		try {
			fin = new FileInputStream("D:\\data.txt");
			din = new DataInputStream(fin);
			
			//	하나씩 읽어서 출력하자.
			//		읽을때는 입력한 순서대로 읽어야한다.
			String	irum = din.readUTF();
			System.out.println("이름 : " + irum);
			int		nai = din.readInt();
			System.out.println("나이 : " + nai);
			float	sinjang = din.readFloat();
			System.out.println("신장 : " + sinjang);
			boolean	sung = din.readBoolean();
			System.out.println("성별 : " + sung);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				din.close();
			}
			catch(Exception e){}
		}
		
	}
	public static void main(String[] args) {
		new Test03();
	}
}






