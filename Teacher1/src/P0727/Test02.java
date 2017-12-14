package P0727;
/*
 * 	문제
 * 		친구의 이름, 나이, 키, 성별을 파일에 저장해 보자.
 */
import		java.io.*;
public class Test02 {
	public Test02() {
		//	저장할 데이터를 준비해 놓자.
		String		name = "홍길동";
		int			age = 24;
		float		height = 187.6F;
		boolean	gender = false;
		
		//	스트림을 준비하자.
		//	1.	타겟
		FileOutputStream		fout = null;
		//	2.	필터
		DataOutputStream	dout = null;
		try {
			//	타겟부터 출발
			fout = new FileOutputStream("D:\\data.txt");
			//	필요하면 필터를 연결한다.
			dout = new DataOutputStream(fout);
			
			//	이것이 Data 필터의 특징으로
			//	사용하던 자바 데이터를 그대로 byte[] 변환없이
			//	사용할 수 있다.
			dout.writeUTF(name);		//	이름이 그대로 출력된 것이다.
			dout.writeInt(age);
			dout.writeFloat(height);
			dout.writeBoolean(gender);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				dout.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Test02();
	}
}
