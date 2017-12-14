package P0727;
/*
 * 	앞에서 저장한 클래스를 불러서 사용해보자.
 */
import		java.io.*;
public class Test06 {
	public Test06() {
		FileInputStream		fin = null;
		ObjectInputStream	oin = null;
		try {
			fin = new FileInputStream("D:\\오브젝트.txt");
			oin = new ObjectInputStream(fin);
			
			Data01		temp1 = (Data01) oin.readObject();
			System.out.println(temp1.name);
			System.out.println(temp1.total);
			
			Data01		temp2 = (Data01) oin.readObject();
			System.out.println(temp2.name);
			System.out.println(temp2.avg);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				oin.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Test06();
	}
}
