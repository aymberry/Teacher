package P0727;
/*
 * 		Data01 클래스를 사용하다가 그 결과를 파일에 저장해 보자.
 */
import		java.io.*;
public class Test05 {
	public Test05() {
		//	먼저 저장할 클래스를 사용하는척 하자.
		Data01	d1 = new Data01("홍길동", 90, 80, 85);
		Data01	d2 = new Data01("박아지", 70, 90, 80);
		
		//	스트림을 준비하자.
		FileOutputStream		fout = null;
		//	객체의 직렬화를 하기 위한 필터는 반드시 ObjectOutput이어야 한다.
		ObjectOutputStream	oout = null;
		try {
			fout = new FileOutputStream("D:\\오브젝트.txt");
			oout = new ObjectOutputStream(fout);
			
			//	최종 결과물을 통채로 저장해 보자.
			oout.writeObject(d1);
			oout.writeObject(d2);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				oout.close();
			}
			catch(Exception e) {}
		}
		
		
	}
	public static void main(String[] args) {
		new Test05();
	}
}
