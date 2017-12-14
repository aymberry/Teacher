package P0727;
/*
 * 	�տ��� ������ Ŭ������ �ҷ��� ����غ���.
 */
import		java.io.*;
public class Test06 {
	public Test06() {
		FileInputStream		fin = null;
		ObjectInputStream	oin = null;
		try {
			fin = new FileInputStream("D:\\������Ʈ.txt");
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
