package P0727;
/*
 * 		Data01 Ŭ������ ����ϴٰ� �� ����� ���Ͽ� ������ ����.
 */
import		java.io.*;
public class Test05 {
	public Test05() {
		//	���� ������ Ŭ������ ����ϴ�ô ����.
		Data01	d1 = new Data01("ȫ�浿", 90, 80, 85);
		Data01	d2 = new Data01("�ھ���", 70, 90, 80);
		
		//	��Ʈ���� �غ�����.
		FileOutputStream		fout = null;
		//	��ü�� ����ȭ�� �ϱ� ���� ���ʹ� �ݵ�� ObjectOutput�̾�� �Ѵ�.
		ObjectOutputStream	oout = null;
		try {
			fout = new FileOutputStream("D:\\������Ʈ.txt");
			oout = new ObjectOutputStream(fout);
			
			//	���� ������� ��ä�� ������ ����.
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
